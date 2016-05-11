using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace YazilimMuhendisligiOdev.Controllers
{
    public class AppController : Controller
    {
        // GET: App
        public ActionResult Index()
        {
            return View();
        }
        public ActionResult Download(string fileName)
        {
            string path = null;
            path = Path.Combine(Server.MapPath("~/App_Data"), fileName);
            return File(path, "application/force-download", fileName);

        }

        [HttpPost]
        public JsonResult Kontrol(HttpPostedFileBase formData)
        {
            string path = null;
            if (formData != null && formData.ContentLength > 0)
            {
                var fileName = Path.GetFileName(formData.FileName);
                var name = fileName.Trim().Replace(" ", string.Empty);
                path = Path.Combine(Server.MapPath("~/App_Data"), name);
                ViewBag.Path = path;
                formData.SaveAs(path);
            }
            return Json("sumeyyesucces", JsonRequestBehavior.AllowGet);
        }

        public ActionResult Chat()
        {
            return View();
        }
    }
}