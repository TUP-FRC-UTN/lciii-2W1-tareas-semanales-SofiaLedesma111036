using Microsoft.Ajax.Utilities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using WebApplication1.AccesoDeDatos;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class PersonaController : Controller
    {
        // GET: Persona
        public ActionResult AltaPersona()
        {
            return View();
        }
        [HttpPost]
        public ActionResult AltaPersona(Persona model)
        {
            if (ModelState.IsValid)
            {
               bool resultado= AD_Persona.InsertaNuevaPersona(model);
                if (resultado)
                {
                   return RedirectToAction("ListadoDePersonas", "Persona");
                }
                else {
                    return View(model);
                }
            }
            else {
                return View(model);
            }
            
        }

        public ActionResult ListadoDePersonas()
        {
            List<Persona> lista = AD_Persona.ObtenerListaPersonas();
            return View(lista);
        }
    }
}