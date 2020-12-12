package com.joseaurivan.rest;

import com.joseaurivan.cepservice.CepService;
import com.joseaurivan.model.Endereco;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/endereco")
@RequestScoped
public class CepResource {
    @Inject
    CepService service;

    @GET
    @Path("{cep}")
    @Produces(MediaType.APPLICATION_JSON)
    public Endereco getEndereco(@PathParam("cep") String cep){
        return service.buscaEndereco(cep);
    }
}