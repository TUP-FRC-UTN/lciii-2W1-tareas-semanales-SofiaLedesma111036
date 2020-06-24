using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using WebApplication1.Models;

namespace WebApplication1.AccesoDeDatos
{
    public class AD_Persona
    {
        public static bool InsertaNuevaPersona(Persona per) 
        {
            bool resultado = false;

            String cadenaConexion = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection cn = new SqlConnection(cadenaConexion);

            try
            {
                SqlCommand cmd = new SqlCommand();
                String consulta = "INSERT INTO personas VALUES(@nombre, @edad, @telefono)";
                cmd.Parameters.Clear();
                cmd.Parameters.AddWithValue("@nombre", per.Nombre);
                cmd.Parameters.AddWithValue("@edad", per.Edad);
                cmd.Parameters.AddWithValue("@telefono", per.Telefono);

                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = consulta;

                cn.Open();
                cmd.Connection = cn;
                cmd.ExecuteNonQuery();
                resultado = true;

            }
            catch (Exception)
            {

                throw;
            }
            finally
            {
                cn.Close();
            
            }



            return resultado;
        }
        public static List<Persona> ObtenerListaPersonas()
        {
            List<Persona> resultado = new List<Persona>();

            String cadenaConexion = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection cn = new SqlConnection(cadenaConexion);

            try
            {
                SqlCommand cmd = new SqlCommand();
                String consulta = "Select * FROM personas";
                cmd.Parameters.Clear();


                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = consulta;

                cn.Open();
                cmd.Connection = cn;

                SqlDataReader dr = cmd.ExecuteReader();
                if (dr != null)
                {

                    while (dr.Read())
                    {
                        Persona aux = new Persona();

                        aux.id = int.Parse(dr["id"].ToString());
                        aux.Nombre = (dr["Nombre"].ToString());
                        aux.Edad = int.Parse(dr["Edad"].ToString());
                        aux.Telefono = (dr["Telefono"].ToString());

                        resultado.Add(aux);


                    }

                }




            }
            catch (Exception)
            {

                throw;
            }
            finally
            {
                cn.Close();

            }



            return resultado;
        }

    }
}



    
