package com.fp.mvc;

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
import com.fp.entity.Barang;
import com.fp.entity.Peminjaman;
import com.fp.service.PenggunaService;
import com.fp.service.BarangService;
import com.fp.service.PeminjamanService;

@Controller
public class HomeController {

//	@Autowired
	private BarangService barangService;
	
	//@Autowired
	//private SellerService sellerService;
	
	//@Autowired
	private PenggunaService penggunaService;
	
	@RequestMapping(value="/")
	public String home() {
		return "index";
	}
	
	@GetMapping(value="/listBarang")
	public String product(Model theModel) {
		List<Barang> theBarang = barangService.getBarangs();
		
		theModel.addAttribute("barang", theBarang);
		return "result";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("pengguna") Pengguna thePengguna, HttpSession webSession) {
		String result = penggunaService.checkPengguna(thePengguna);
		if (result.equals("accepted")) {
			webSession.setAttribute("username",thePengguna.getPenggunaUsername());
			return "listBarang";
		}
		else {
			return "index";
		}
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
