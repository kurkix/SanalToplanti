using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using YazilimMuhendisligiOdev.Models;
using Microsoft.AspNet.Identity;

namespace YazilimMuhendisligiOdev.Controllers
{
    public class AppController : Controller
    {
        ApplicationDbContext db = new ApplicationDbContext();
        // GET: App
        [Authorize]
        public ActionResult Index(string isim)
        {
            ViewBag.kullaniciadi = User.Identity.GetUserName();
            ViewBag.kullanicilar = db.KullaniciTablosu.ToList();
            foreach(var item in db.OdaTablosu.ToList())
            {
                if(item.Odaismi== isim)
                {
                    ViewBag.odaid = item.OdaID;
                    foreach(var k in db.KullaniciTablosu.ToList())
                    {
                        if(k.KullaniciAdi==User.Identity.GetUserName() && k.OdaId == item.OdaID)
                        {
                            ViewBag.kullanicirol = k.KullaniciRol;
                        }
                    }
                }
            }
            return View();
        }
        [Authorize]
        public ActionResult Room()
        {
            return View();
        }

        [HttpGet]
        [Authorize]
        public ActionResult Create()
        {
            return View();
        }
        [HttpPost]
        [ValidateAntiForgeryToken]
        [Authorize]
        public ActionResult Create(OdaAcViewModel model)
        {
            if (!ModelState.IsValid)
            {
                return View(model);
            }
            
            foreach(var item in db.OdaTablosu.ToList())
            {
                if (item.Odaismi == model.isim)
                {
                    return RedirectToAction("Fail");
                }
            }
            Oda oda = new Oda();
            oda.OdaID= Guid.NewGuid().ToString();
            oda.Odaismi = model.isim;
            oda.KullaniciSayisi = 1;
            db.OdaTablosu.Add(oda);
            Kullanici user = new Kullanici();
            user.KullaniciAdi = User.Identity.GetUserName();
            user.OdaId = oda.OdaID;
            user.KullaniciRol = "Admin";
            db.KullaniciTablosu.Add(user);
            db.SaveChanges();
            return RedirectToAction("Index","App",new { isim=model.isim });
        }

        [HttpGet]
        [Authorize]
        public ActionResult Enter()
        {
            return View();

        }
        [HttpPost]
        [Authorize]
        public ActionResult Enter(OdayaGirViewModel model)
        {
            
            foreach(var item in db.OdaTablosu.ToList())
            {
                if (item.Odaismi == model.isim)
                {
                    Kullanici user = new Kullanici();
                    user.KullaniciAdi = User.Identity.GetUserName();
                    user.OdaId = item.OdaID;
                    user.KullaniciRol = "Normal";
                    db.KullaniciTablosu.Add(user);
                    Oda oda = db.OdaTablosu.Find(item.OdaID);
                    oda.KullaniciSayisi = oda.KullaniciSayisi + 1;
                    db.OdaTablosu.Attach(oda);
                    db.Entry(oda).State= System.Data.Entity.EntityState.Modified;
                    db.SaveChanges();
                    return RedirectToAction("Index", new { isim =model.isim });
                    
                }
            }
            
            return RedirectToAction("Fail");


        }

        [Authorize]
        public ActionResult Fail()
        {
            return View();
        }
        [Authorize]
        public ActionResult OdayiKapat(string odaid)
        {
            Oda oda = db.OdaTablosu.Find(odaid);
            db.OdaTablosu.Remove(oda);
            foreach (var item in db.KullaniciTablosu.ToList())
            {
                if (item.KullaniciAdi == User.Identity.GetUserName())
                {
                    Kullanici kullanici = db.KullaniciTablosu.Find(item.KullaniciID);
                    db.KullaniciTablosu.Remove(kullanici);
                    db.SaveChanges();
                }
            }

            db.SaveChanges();
            return RedirectToAction("OdaKapandi", "App");
        }
        [Authorize]
        public ActionResult OdaKapandi()
        {
            return View();
        }
        [Authorize]
        public ActionResult OdadanCik()
        {
            foreach (var item in db.KullaniciTablosu.ToList())
            {
                if (item.KullaniciAdi == User.Identity.GetUserName())
                {
                    Kullanici kullanici = db.KullaniciTablosu.Find(item.KullaniciID);
                    db.KullaniciTablosu.Remove(kullanici);
                    db.SaveChanges();
                }
            }
            return RedirectToAction("Index", "Home");
        }


    }
}