/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.restful;

import com.demo.bean.Persona;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author mmendez
 */
@Path("/")
public class WebService {

    @GET
    @Path("/datosPersona")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona getDatosPersona() {
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Manuel");
        persona.setEdad(31);
        return persona;
    }

    
    
    
    @POST
    @Path("/enviarDatos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Persona setDatosPersona(
            Persona persona
    ) {
        persona.setNombre("modificacion");
        return persona;
    }

}
