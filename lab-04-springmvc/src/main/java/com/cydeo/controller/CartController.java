package com.cydeo.controller;

import com.cydeo.model.CartItem;
import com.cydeo.service.impl.CartServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/cart-list")
public class CartController {
    CartServiceImpl cartService = new CartServiceImpl();

    @RequestMapping("")
    public String carts(Model model) {

        model.addAttribute("cartList", this.cartService.retrieveCartList());

        return "cart/cart-list";
    }

    @RequestMapping("/{cartId}")
    public String cartDetail(@PathVariable UUID cartId, Model model){
        List<CartItem> cartItemList = cartService.retrieveCartDetail(cartId);
        model.addAttribute("cartItemList",cartItemList);


        return "cart/cart-detail";
    }
}
