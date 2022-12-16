package lesson4.products;

import java.math.BigDecimal;

public interface Furniture {
    BigDecimal getPrice();
    String getTitle();
    MaterialType getMaterial();
}
