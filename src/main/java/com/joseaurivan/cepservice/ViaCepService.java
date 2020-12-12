/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseaurivan.cepservice;

import javax.enterprise.context.Dependent;

@Dependent
public class ViaCepService extends AbstractCepService {
    private static final String DOMINIO = "https://viacep.com.br/";
    public ViaCepService() {
        super(DOMINIO);
    }

    @Override
    protected String buildPath(String cep) {
        return "ws/" + cep + "/json";
    }
    
}
