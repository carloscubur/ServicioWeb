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

import com.demo.queue.QueueUtil;

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
    public Persona setDatosPersona(Persona persona)
    {
        persona.setNombre("modificacion");
        return persona;
    }

    @POST
    @Path("/enviarMensaje")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Persona enviarMensaje(Persona persona)
    {
        //Envia a cola
        String nombreCola = "queue.so1.demo";
        String nombreServicio = "EjemploCola";
        String serverLocation = "failover:(tcp://localhost:61616)?timeout=3000";

        String message = " {"
                + " \"platformOrigin\":\"" + "1" + "\","
                + " \"platformDestiny\":\"" + "2" + "\""
                + "}";
        try {
            QueueUtil.send(nombreCola, true, true, 0, nombreServicio, message, serverLocation);

            System.out.println("Enviando mensaje....");
            //Thread.sleep(500);

        } catch (Exception e) {
            System.out.println("Error....");
            e.printStackTrace();
        }
        return persona;
    }

}
