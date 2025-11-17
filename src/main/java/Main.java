import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        // Инициализация продуктов:
        // Мясо 5 кг по 100 руб.
        Food meat = new Meat(5, 100);

        // Красные яблоки 10 кг по 50 руб.
        Food redApples = new Apple(10, 50, Colour.RED);

        // Зелёные яблоки 8 кг по 60 руб.
        Food greenApples = new Apple(8, 60, Colour.GREEN);

        // Массив продуктов
        Food[] products = { meat, redApples, greenApples };

        // Создаём корзину
        ShoppingCart cart = new ShoppingCart(products);

        // Выводим:
        // 1) общую сумму без скидки
        System.out.println(cart.getTotalWithoutDiscount());
        // 2) общую сумму со скидкой
        System.out.println(cart.getTotalWithDiscount());
        // 3) сумму всех вегетарианских продуктов без скидки
        System.out.println(cart.getVegetarianTotalWithoutDiscount());
    }
}
