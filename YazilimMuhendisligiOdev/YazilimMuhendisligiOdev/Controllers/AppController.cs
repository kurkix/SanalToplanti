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
        [Authorize]
        public ActionResult Index()
        {
            return View();
        }
        
    }
}