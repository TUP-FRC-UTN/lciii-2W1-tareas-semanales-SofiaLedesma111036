using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class UsuarioController : Controller
    {
        // GET: Usuario
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult InicioSesion() {
            return View();
        }
        [HttpPost]
        public ActionResult InicioSesion(Usuario usuario)
        {

            return View();
        }

    }
}