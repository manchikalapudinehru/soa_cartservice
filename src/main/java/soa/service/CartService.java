package soa.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import soa.model.Cart;
import soa.repository.CartRepository;

@Service
public class CartService {

	CartRepository CR;
	
	public CartService(CartRepository CR)
	{
		this.CR = CR;
	}
	
	//Get all Cart data
	public Object getAllCartItems()
	{
		Map<String, Object> response = new HashMap<>();
		try
		{
			List<Cart> carts = CR.findAll(); //READ
			response.put("carts", carts);
		}catch(Exception e)
		{
			response.put("message", e.getMessage());
		}
		return response;
	}
}
