package web.web_lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.web_lab1.models.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {



    @GetMapping("/products")
    public String showProducts(Model model){
        List<Product> productsList = List.of(
                new Product(1, "LeafySeadragon", 1485.50, "/images/LeafySeadragon.jpg"),
                new Product(2, "NeonStylophora", 560.50, "/images/NeonStylophora.jpg"),
                new Product(3, "ClownTriggerfish", 143.90, "/images/ClownTriggerfish.jpg"),
                new Product(4, "AmazonSwordPlant", 50.50, "/images/AmazonSwordPlant.jpg"),
                new Product(5, "CopperbandButterflyfish", 95.80, "/images/CopperbandButterflyfish.jpg")
        );
        model.addAttribute("products", productsList);
        return "products";
    }


    @GetMapping("/main")
    public String showMain(Model model){
        return "index";
    }

    @GetMapping("/contacts")
    public String showContacts(Model model){
        return "contacts";
    }
}
