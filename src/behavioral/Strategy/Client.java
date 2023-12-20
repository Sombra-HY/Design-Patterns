package behavioral.Strategy;
//Strategy é um padrão de projeto comportamental que tem
//a intenção de definir uma família de algoritmos,
//encapsular cada uma delas e torná-las intercambiáveis.
//Strategy permite que o algorítmo varie independentemente
//dos clientes que o utilizam.
//
//Princípio do aberto/fechado (Open/closed principle)
//Entidades devem ser abertas para extensão, mas fechadas para modificação
public class Client {

    BlackFriday disocuntBlackFriday = new BlackFriday();
    EmployeeDiscount discountEmployee = new EmployeeDiscount();

    Order myorder = new Order(49.56f,disocuntBlackFriday);
}



class Order{
    private float total;
    private DiscountStartegy discount;
    Order(float total, DiscountStartegy discount){
        this.total = total;
        this.discount = discount;
    }

    public float getTotal() {
        return total;
    }
    public float totalWithDiscount() {
        return  discount.calculate(total) ;
    }
}

