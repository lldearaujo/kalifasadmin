package br.com.kalifas.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.kalifas.dao.ClienteDAO;
import br.com.kalifas.models.Cliente;
import br.com.kalifas.validation.ClienteValidator;

@Controller
@Transactional
@RequestMapping("/clientes")
public class ClienteController {

	@InitBinder
	// indica qual validador deve ser chamado para validar objetos Product
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new ClienteValidator());
	}

	@Autowired
	private ClienteDAO clienteDAO;

	@RequestMapping(method = RequestMethod.POST)
	// Define a url que quando for requisitada chamará o metodo
	public ModelAndView save(@Valid Cliente cliente,
			BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			return form();
		}
		clienteDAO.save(cliente);
		redirectAttributes.addFlashAttribute("sucesso",
				"Cliente cadastrado com sucesso");
		return new ModelAndView("redirect:clientes");
	}

	@RequestMapping("/clienteform")
	public ModelAndView form() {// ModelAndView permite adicionar objetos que
								// serão disponibilizados na view
		ModelAndView modelAndView = new ModelAndView("clientes/form");
//		modelAndView.addObject("types", BookType.values());
		return modelAndView;
	}

//	@RequestMapping(method = RequestMethod.GET)
//	public ModelAndView list() {
//		ModelAndView modelAndView = new ModelAndView("clientes/list");
//		modelAndView.addObject("products", productDAO.list());
//		return modelAndView;
//	}

}
