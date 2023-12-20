package behavioral.Strategy;

interface DiscountStartegy {
    float calculate(float value);
}


class BlackFriday implements DiscountStartegy {
    /**
     * Implementa um desconto de 1%
     */
    public float calculate(float value) {
        return value * 0.99f;
    }
}

class EmployeeDiscount implements DiscountStartegy {
    /**
     * Implementa um desconto de 25%, se for um funcionario (nao existe verificao, supondo )
     */
    public float calculate(float value) {
        return value * 0.75f;
    }
}