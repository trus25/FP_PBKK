package com.fp.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	/////////////////////////
	public class Barang {
	    private String name;
	    private long id;
	    private String harga;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getHarga() {
			return harga;
		}
		public void setHarga(String harga) {
			this.harga = harga;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
	}
	/////////////////////////////
	@RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("form", "barang", new Barang());
    }

	@RequestMapping("/addBarang")
	public String showForm(HttpServletRequest request, Model model) {

		String harga = request.getParameter("harga");
		String name = request.getParameter("name");
		long id = Integer.parseInt(request.getParameter("id"));
		
	
		
		
		model.addAttribute("harga", harga);
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		
		return "result";
	}
 
	
}