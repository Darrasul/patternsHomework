package lesson4.options;

import lesson4.products.Furniture;

import java.math.BigDecimal;

public class FurnitureOptionTwo extends FurnitureOption{
    public FurnitureOptionTwo(Furniture furniture) {
        super(furniture, new BigDecimal("320.00"), "Second option", OptionType.SECOND_OPTION);
    }
}
