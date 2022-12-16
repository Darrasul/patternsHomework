package lesson4;

import lesson4.options.FurnitureOptionOne;
import lesson4.options.FurnitureOptionDowngrade;
import lesson4.options.FurnitureOptionTwo;
import lesson4.products.BaseFurniture;
import lesson4.products.Furniture;
import lesson4.products.MaterialType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FacadeInit {
    public static void main(String[] args) {
        Furniture firstProduct = new BaseFurniture(new BigDecimal("455.00"), "First product", MaterialType.BASIC);
        Furniture secondProduct = new BaseFurniture(new BigDecimal("240.00"), "Second product", MaterialType.CHEAP);

        Furniture firstEditedProduct = new BaseFurniture(new BigDecimal("1400"), "First edited product", MaterialType.EXPENSIVE);
        Furniture downgradedFirstEditedProduct = new FurnitureOptionDowngrade(firstEditedProduct);
        Furniture firstOptionFirstEditedProduct = new FurnitureOptionOne(firstEditedProduct);
        Furniture secondOptionNewProduct = new FurnitureOptionTwo(
                new BaseFurniture(new BigDecimal("565.00"), "New product", MaterialType.CUSTOM));

        List<Furniture> productsToBuild = new ArrayList<>();
        productsToBuild.add(firstProduct);
        productsToBuild.add(secondProduct);
        productsToBuild.add(downgradedFirstEditedProduct);
        productsToBuild.add(firstOptionFirstEditedProduct);
        productsToBuild.add(secondOptionNewProduct);

        for (Furniture furniture : productsToBuild) {
            System.out.println(furniture);
        }
    }
}
