package az.developia.bookshopping.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import az.developia.bookshopping.config.MySession;
import az.developia.bookshopping.dao.OrderDAO;
import az.developia.bookshopping.model.BasketBook;
import az.developia.bookshopping.model.Customer;
import az.developia.bookshopping.model.Order;

@Controller
public class OrderController {
	@Autowired
	private MySession mySession;
	
	@Autowired
	private OrderDAO orderDAO;
	
	

	@GetMapping(path ="/orders")
	public String showOrdersPage(Model model) {
        model.addAttribute("orders",orderDAO.findAllByUsername(mySession.getUsername()));
		return "orders";

	}
	
	@GetMapping(path ="/confirm-order")
	public String showConfirmOrderPage(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer",customer);

		return "confirm-order";

	}
	@GetMapping(path ="/order-confirmation-message")
	public String showOrderConfirmationPage() {
		return "order-confirmation-message";

	}
	
	@GetMapping(path ="/confirm-order-process")
	public String ConfirmOrderProcess(@Valid @ModelAttribute(name="customer")Customer customer,BindingResult result) {
         if(result.hasErrors()) {
        	 return "confirm-order";
         }
        List<BasketBook> basketBooks= mySession.getBasketBooks();
        Order order = new Order();
        order.setCustomer(customer);
        order.setBasketBooks(basketBooks);
        order.setNote(customer.getNote());
        
        System.out.println(order);
        
		return "redirect:/";
		
		

	}
	
}
