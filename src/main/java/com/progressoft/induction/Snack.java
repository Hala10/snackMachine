package com.progressoft.induction;

import java.math.BigDecimal;

public class Snack {
    public static final int DEFAULT_QUANTITY = 7;
    public int chewingGumsQuantity = DEFAULT_QUANTITY;
    public int chipsQuantity = DEFAULT_QUANTITY;
    public int chocolatesQuantity = DEFAULT_QUANTITY;
    public static int quantity = 0;

    private BigDecimal chewingGumsPrice = BigDecimal.valueOf(0.5);
    private BigDecimal chipsPrice = BigDecimal.valueOf(1);
    private BigDecimal chocolatesPrice = BigDecimal.valueOf(2);

    public Snack chewingGums() {
        setQuantity(chewingGumsQuantity);
        return new Snack();
    }

    public Snack chips() {
        setQuantity(chipsQuantity);
        return new Snack();
    }

    public Snack chocolates() {
        setQuantity(chocolatesQuantity);
        return new Snack();
    }
    public int quantity() {
        return quantity;
    }

   public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getChewingGumsPrice() {
        return chewingGumsPrice;
    }

    public BigDecimal getChipsPrice() {
        return chipsPrice;
    }

    public BigDecimal getChocolatesPrice() {
        return chocolatesPrice;
    }

}
