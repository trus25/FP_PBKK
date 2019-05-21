package com.fp;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fp.entity.Pengguna;
import com.fp.entity.Products;
import com.fp.service.ProductService;

import javassist.compiler.ast.NewExpr;

import com.fp.entity.Peminjaman;
import com.fp.service.PenggunaService;
import com.fp.service.PeminjamanService;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;
	
	@Autowired
	private PeminjamanService peminjamanService;
	
	@Autowired
	private PenggunaService penggunaService;
	
	@RequestMapping(value="/")
	public String home(Model theModel) {
		Pengguna thePengguna = new Pengguna();
		
		theModel.addAttribute("pengguna", thePengguna);
		return "index";
	}
	
	@GetMapping(value="/inputBarang")
	public String inputBarang(Model theModel) {
		Products theProducts = new Products();
		
		theModel.addAttribute("products", theProducts);
		return "formAddBarang";
	}
	
/*	@GetMapping(value="/debug1")
	public String product(Model theModel) {
		List<Products> theProducts = productService.getProducts();
		
		theModel.addAttribute("products", theProducts);
		return "listBarang";
	}*/
	
	@GetMapping(value="/tampilBarang")
	public String product1(Model theModel) {
		List<Products> theProducts = productService.getProducts();
		
		theModel.addAttribute("products", theProducts);
		return "tampilBarang";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("pengguna") Pengguna thePengguna, HttpSession webSession,Model theModel) {
		String result = penggunaService.checkPengguna(thePengguna);
		if (result.equals("accepted")) {
			webSession.setAttribute("username",thePengguna.getPenggunaUsername());
			
			return "redirect:/tampilBarang";
		}
		else {
			return "redirect:/";
		}
	}
	@GetMapping("/formbarang")
	public String formbarang(Model theModel) {
		Products theProduct = new Products();
		
		theModel.addAttribute("products", theProduct);
		
		return "form";
	}
	@PostMapping("/savebarang")
	public String saveProduct(@ModelAttribute("products") Products theProduct,Model theModel) {
		productService.saveProduct(theProduct);	
		return "redirect:/tampilBarang";
	}
	
	@GetMapping(value="/detailBarang")
	public String productdetail(@RequestParam("productId") int theId, Model theModel) {
		
		Products theProduct = productService.getProduct(theId);
		
		theModel.addAttribute("product", theProduct);
		
		return "detailBarang";
	}
	
	@GetMapping("/formpeminjaman")
	public String formbarang(@RequestParam("idBarang") int theId, Model theModel, HttpSession https) {
		Products theProduct = productService.getProduct(theId);
		
		theModel.addAttribute("product", theProduct);
		
		Peminjaman thePeminjaman = new Peminjaman();
		theModel.addAttribute("peminjaman",thePeminjaman);
		return "formPeminjaman";
	}
	
	@PostMapping(value="/pinjamBarang")
	public String pinjambarang(@RequestParam("namaBarang") String theNama,
							   @RequestParam("pinjamWaktupinjam") String thePinjam,
							   @RequestParam("pinjamWaktukembali") String theBalik,
							   Model theModel, HttpServletRequest req) {
		String sesi = req.getAttribute("username").toString();
		System.out.println(theNama +"," + thePinjam + "," + theBalik +","+ sesi);
		peminjamanService.savePeminjaman(theNama, sesi, thePinjam, theBalik);
		
		
		
		return "detailBarang";
	}
	
	
	
	
	
	
}
