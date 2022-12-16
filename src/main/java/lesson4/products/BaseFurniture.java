package lesson4.products;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@AllArgsConstructor
public class BaseFurniture implements Furniture {

    private BigDecimal price;
    private String title;
    private MaterialType material;

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public MaterialType getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "BaseFurniture{" +
                "price=" + price +
                ", title='" + title + '\'' +
                ", material=" + material +
                '}';
    }
}
