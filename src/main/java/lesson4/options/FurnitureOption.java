package lesson4.options;

import lesson4.products.Furniture;
import lesson4.products.MaterialType;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
public class FurnitureOption implements Furniture {

    private Furniture furniture;
    private BigDecimal price;
    private String title;
    private MaterialType material;
    private OptionType option;

    public FurnitureOption(Furniture furniture, BigDecimal price, String title, OptionType option) {
        this.furniture = furniture;
        this.price = price;
        this.title = title;
        this.option = option;
        this.material = furniture.getMaterial();
    }

    @Override
    public BigDecimal getPrice() {
        return furniture.getPrice().add(price);
    }

    @Override
    public String getTitle() {
        return furniture.getTitle() + " with " + title;
    }

    @Override
    public MaterialType getMaterial() {
        return material;
    }

    public OptionType getOption() {
        return option;
    }

    @Override
    public String toString() {
        return "title-'" + furniture.getTitle() + " with " + title + '\'' +
                ", price=" + furniture.getPrice().add(price) +
                ", material-" + material +
                ", with next option: " + option +
                '}';
    }
}
