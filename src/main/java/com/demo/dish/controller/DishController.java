package com.demo.dish.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.dish.model.Project;
import com.demo.dish.service.DeveloperService;
import com.demo.dish.service.ProjectService;
import com.demo.dish.service.TechnologyService;

/**
 * Controller para manejar las peticiones de las paginas
 * @author Victor Cruz
 *
 */
@Controller
public class DishController {

	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private TechnologyService technologyService;
	
	@Autowired
	private DeveloperService developerService;
	
	/**
	 * Request para la pagina de inicio
	 * @return Redireccion a la pagina inicial
	 */
	@GetMapping("/")
	public String root() {
		return "redirect:/hello";
	}
	
	/**
	 * Request para la pagina de inicio
	 * @return Redireccion a la pagina inicial
	 */
	@GetMapping("/home")
	public String rootHome() {
		return "redirect:/hello";
	}
	
	/**
	 * Pagina con la tabla de proyecto
	 * @param model Atributos de la pagina 
	 * @return Nombre de la ruta que cargara
	 */
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("projects", projectService.getAll());
		return "hello";
	}
	
	/**
	 * Pagina para editar el proyecto
	 * @param model Atributos de la pagina
	 * @param id Identificador del proyecto
	 * @return Nombre de la ruta que cargara
	 */
	@GetMapping("edit/{id}")
	public String edit(Model model, @PathVariable Long id) {
		System.out.println("edit " + id);
		model.addAttribute("title", "Editar Proyecto");
		model.addAttribute("allTech",technologyService.getAll());
		model.addAttribute("allDevs",developerService.getAll());
		model.addAttribute("project", projectService.findById(id));
		return "edit";
	}
	
	/**
	 * Pagina para crear el proyecto
	 * @param model Atributos de la pagina
	 * @return Nombre de la ruta que cargara
	 */
	@GetMapping("create")
	public String create(Model model) {
		Project dto = new Project();
		dto.setTechnologies(new ArrayList<>());
		dto.setDevelopers(new ArrayList<>());
		model.addAttribute("title", "Nuevo Proyecto");
		model.addAttribute("allTech",technologyService.getAll());
		model.addAttribute("allDevs",developerService.getAll());
		model.addAttribute("project", dto);
		return "edit";
	}
	
	/**
	 * Borrar un proyecto
	 * @param id Identificador del proyecto
	 * @return Redireccion a la pagina inicial
	 */
	@GetMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		projectService.deleteById(id);
		return "redirect:/hello";
	}
	
	/**
	 * Pagina de usuario para visualizar los datos
	 * @param model Atributos de la pagina
	 * @param id Identificador del proyecto
	 * @return Nombre de la ruta que cargara
	 */
	@GetMapping("view/{id}")
	public String view(Model model, @PathVariable Long id) {
		System.out.println("view " + id);
		model.addAttribute("project", projectService.findById(id));
		return "view";
	}
	
	/**
	 * Guardar/Actualizar el proyecto
	 * @param project Datos del proyecto
	 * @return Nombre de la ruta que cargara
	 */
	@PostMapping("save")
	public String save(@ModelAttribute("project") Project project) {
		if(project.getProjectId()==null)
			projectService.save(project);
		else
			projectService.update(project);
		
		return "redirect:/hello";
	}
	
}
