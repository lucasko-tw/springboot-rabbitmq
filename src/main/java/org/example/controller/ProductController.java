package org.example.controller;


import org.example.domain.Product;
import org.example.service.ProducerService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;


@RestController
@RequestMapping("/api")
public class ProductController {
 

	@Autowired
	ProducerService  PRODUCER_SERVICE ;

	@GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public String hi() {
		 return "hi";
	}
	
	@PostMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product save(@RequestBody Product product) {
		 
		String productname = product.getProduct();
		System.out.println("productname="+productname);
		PRODUCER_SERVICE.sendProductMessage(productname);
		return product;
	}
//
//	@PutMapping("/user/{id}")
//	User replaceEmployee(@RequestBody User newUser, @PathVariable Long id) {
//
//		User user = USER_REPOSITORY.findById(id)
//				.orElseThrow(() -> new UserNotFoundException(id));
//
//		user.setFirstname(newUser.getFirstname());
//		user.setLastname(newUser.getLastname());
//		return user;
//	
//	}
//
//	@DeleteMapping("/user/{id}")
//	void deleteEmployee(@PathVariable Long id) {
//		USER_REPOSITORY.deleteById(id);
//	}
// 
	
 
}