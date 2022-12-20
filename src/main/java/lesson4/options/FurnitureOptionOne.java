package lesson4.options;

import lesson4.products.Furniture;

import java.math.BigDecimal;


public class FurnitureOptionOne extends FurnitureOption{
    public FurnitureOptionOne(Furniture furniture) {
        super(furniture, new BigDecimal("250.00"), "First option", OptionType.FIRST_OPTION);
    }
}
