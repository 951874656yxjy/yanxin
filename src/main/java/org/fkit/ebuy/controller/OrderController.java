package org.fkit.ebuy.controller;

import java.util.List;

import org.fkit.ebuy.domain.Order;
import org.fkit.ebuy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 处理图书请求控制器
 * */
@Controller
public class OrderController {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/order")
	 public String order(Model model,
			 String username){
		// 获得所有图书集合
		List<Order> order_list = orderService.getAll(username);
		// 将图书集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到main页面
		return "order";
	}
	@RequestMapping(value="/submitorder")
	 public ModelAndView submitorder(String oid,
			 String username,
				String totalprice, 
				String phone, 
				String address,
				String status,
				String good_name,
				String good_id,
				String good_picture,
			   ModelAndView mv ){
		Order insertorder = orderService.insertorder(oid,username, totalprice,phone,address,status,good_name,good_id,good_picture);
		mv.setViewName("ordersuccess");
		return mv;
	}
}
