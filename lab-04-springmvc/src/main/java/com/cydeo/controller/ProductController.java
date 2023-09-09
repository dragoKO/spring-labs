package com.cydeo.controller;

import com.cydeo.model.Product;
import com.cydeo.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/search-product")
public class ProductController {

    @RequestMapping("/{xbox}")
    public String searchProduct(Model model, @PathVariable String xbox) {
        ProductServiceImpl productService = new ProductServiceImpl();
        List<Product> productList = productService.searchProduct(xbox);
        model.addAttribute("productList", productList); // Correct the attribute name
        return "product/product-list";
    }

}
