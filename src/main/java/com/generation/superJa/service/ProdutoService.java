package com.generation.superJa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.superJa.model.Produto;
import com.generation.superJa.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	

public double calcularDesconto(Produto produto) {
    double preco = produto.getPreco();

    if (preco > 50.00) {
        preco = preco * 0.90; 
        produto.setPreco(preco); 
    }
    return preco; 
}

}


