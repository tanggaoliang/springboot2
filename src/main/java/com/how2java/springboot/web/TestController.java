package com.how2java.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.how2java.springboot.pojo.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(Model model) {
        String htmlContent = "<p style='color:red'>红色文字</p>";
        Product product = new Product();
        Date now=new Date();
        product.setId(1);
        product.setName("e");
        product.setPrice(99);
        boolean testBoolean=true;
        List<Product>ps=new ArrayList<>();
        for(int i=1;i<=5;i++){
            ps.add(new Product(i,"product"+i,50*i));
        }
//        System.out.println(ps);

        model.addAttribute("htmlContent",htmlContent);
        model.addAttribute("product",product);
        model.addAttribute("testBoolean",testBoolean);
        model.addAttribute("ps",ps);
        model.addAttribute("now",now);
        return "test";
    }
}
