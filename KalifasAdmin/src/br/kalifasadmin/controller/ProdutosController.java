package br.kalifasadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import br.dao.ProdutoDAO;
import br.kalifasadmin.models.Produto;

@Controller
@Transactional
public class ProdutosController {

	@Autowired
	private ProdutoDAO produtoDAO;

	@RequestMapping("/produtos") // Diz o nome do caminho mapeado
	public String save(Produto produto) {
		produtoDAO.save(produto);
		return "index"; // local/diretorio/nome do arquivo que deve ser
								// mapeado.
	}

	@RequestMapping("/produtos/form")
	public String form() {
		return "produtos/form";
	}

}