/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseaurivan.cepservice;

import com.joseaurivan.model.Endereco;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import static org.apache.commons.io.FilenameUtils.getFullPath;


public abstract class AbstractCepService implements CepService {

    private static final Logger LOG = Logger.getLogger(AbstractCepService.class.getName());
    
    private String dominio;
    private final WebTarget target;

    public AbstractCepService(String dominio) {
        this.dominio = insertTrailingSlash(dominio);
        Client client = ClientBuilder.newClient();
        this.target = client.target(dominio);
    }
    
    
    protected final String insertTrailingSlash(String path){
        return path.endsWith("/") ? path : path + "/";
    }
    protected abstract String buildPath(String cep);
    
    protected String getFullpath(String cep){
        return this.dominio + buildPath(cep);
    }
    
    @Override
    public Endereco buscaEndereco(String endereco) {
        
        LOG.info(String.format("Enviando requisição para %s", dominio));
        return target.path(buildPath(endereco)).request().get(Endereco.class);
    }
    
}
