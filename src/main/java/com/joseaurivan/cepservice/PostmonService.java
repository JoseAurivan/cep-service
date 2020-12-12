/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseaurivan.cepservice;

import javax.enterprise.context.Dependent;


public class PostmonService extends AbstractCepService {
    private static final String DOMINIO = "https://api.postmon.com.br/";

    public PostmonService(String dominio) {
        super(DOMINIO);
    }

    @Override
    protected String buildPath(String cep) {
        return "v1/cep/" + cep;
    }
    
}
