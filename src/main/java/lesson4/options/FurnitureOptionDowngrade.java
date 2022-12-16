package lesson4.options;

import lesson4.products.Furniture;

import java.math.BigDecimal;


public class FurnitureOptionDowngrade extends FurnitureOption{
    public FurnitureOptionDowngrade(Furniture furniture) {
        super(furniture, new BigDecimal("-100.00"), "Downgrade", OptionType.DOWNGRADE);
    }
}
