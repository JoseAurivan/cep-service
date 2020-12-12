/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseaurivan.cepservice;

import com.joseaurivan.model.Endereco;

/**
 *
 * @author auriv
 */
public interface CepService {
    Endereco buscaEndereco(String endereco);
}
