package com.fp;


import java.util.List;

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
import com.fp.entity.Peminjaman;
import com.fp.service.PenggunaService;
import com.fp.service.PeminjamanService;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;
	
	//@Autowired
	//private SellerService sellerService;
	
	@Autowired
	private PenggunaService penggunaService;
	
	@RequestMapping(value="/")
	public String home(Model theModel) {
		Pengguna thePengguna = new Pengguna();
		
		theModel.addAttribute("pengguna", thePengguna);
		return "index";
	}
	
	@RequestMapping(value="/inputBarang")
	public String inputBarang(Model theModel) {
		Products theProducts = new Products();
		
		theModel.addAttribute("product", theProducts);
		return "form";
	}
	
	@GetMapping(value="/debug1")
	public String product(Model theModel) {
		List<Products> theProducts = productService.getProducts();
		
		theModel.addAttribute("products", theProducts);
		return "listBarang";
	}
	
	@GetMapping(value="/listBarang")
	public String product1(Model theModel) {
		List<Products> theProducts = productService.getProducts();
		
		theModel.addAttribute("products", theProducts);
		return "listBarang";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("pengguna") Pengguna thePengguna, HttpSession webSession,Model theModel) {
		
		String result = penggunaService.checkPengguna(thePengguna);
		if (result.equals("accepted")) {
			webSession.setAttribute("username",thePengguna.getPenggunaUsername());
			List<Products> theProducts = productService.getProducts();
			
			theModel.addAttribute("products", theProducts);
			return "listBarang";
		}
		else {
			return "index";
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
List<Products> theProducts = productService.getProducts();
		
		theModel.addAttribute("products", theProducts);
		
		return "listBarang";
	}
	//@RequestMapping(value="/shop")
	//public String shop(Model theModel) {
	//	List<Seller> theSellers = sellerService.getSellers();
	//	theModel.addAttribute("sellers", theSellers);
		
	//	return "shop";
	//}
	
	//@RequestMapping(value="/shop-detail")
	//public String shopdetail() {
	//	return "shop-detail";
	//}
	
//	@GetMapping(value="/product-detail")
//	public String productdetail(@RequestParam("productId") int theId, Model theModel) {
//		
//		Products theProduct = productService.getProduct(theId);
//		
//		theModel.addAttribute("product", theProduct);
//		
//		return "product-detail";
//	}
	
//	@RequestMapping(value="/contact")
//	public String contact() {
//		return "contact";
//	}
}
