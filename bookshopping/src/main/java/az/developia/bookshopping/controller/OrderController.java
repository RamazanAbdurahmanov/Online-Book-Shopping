package az.developia.bookshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import az.developia.bookshopping.dao.OrderDAO;

@Controller
public class OrderController {
	@Autowired
	private OrderDAO orderDAO;

	@GetMapping(path ="/orders")
	public String showOrdersPage(Model model) {
        model.addAttribute("orders",orderDAO.findAll());
		return "orders";

	}
	
	@GetMapping(path ="/confirm-order")
	public String showConfirmOrderPage() {

		return "confirm-order";

	}

}
