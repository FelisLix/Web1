package web.web_lab1.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Product {
    private int ID;
    private String name;
    private double price;
    private String imageURL;
}
