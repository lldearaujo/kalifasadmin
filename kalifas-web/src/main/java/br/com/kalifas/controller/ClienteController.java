package br.com.kalifas.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.kalifas.dao.ClienteDAO;
import br.com.kalifas.models.Cliente;

@Controller
@Transactional
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteDAO clienteDAO;

	@RequestMapping(method = RequestMethod.POST)
	// Define a url que quando for requisitada chamará o metodo
	public ModelAndView save(@Valid Cliente cliente, BindingResult result) {

		if (result.hasErrors()) {
			return form();
		}
		clienteDAO.save(cliente);

		return new ModelAndView("redirect:/clientes");
	}

	@RequestMapping("/form")
	public ModelAndView form() {// ModelAndView permite adicionar objetos que
								// serão disponibilizados na view
		ModelAndView modelAndView = new ModelAndView("clientes/form");
		// modelAndView.addObject("types", BookType.values());
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("clientes/list");
		modelAndView.addObject("clientes", clienteDAO.list());
		return modelAndView;
	}

	@RequestMapping("/remove/{id}")
	public ModelAndView remove(@PathVariable("id") int id) {
		clienteDAO.remove(id);
		return new ModelAndView("redirect:/clientes");
	}

	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id, Model model) {
		model.addAttribute("cliente", clienteDAO.buscarPorId(id));
		return "/clientes/form";
	}

}
