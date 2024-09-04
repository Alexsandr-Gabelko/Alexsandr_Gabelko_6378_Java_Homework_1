import java.util.ArrayList;
import java.util.List;

//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int
//температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
//        соответствующий имени, объему и температуре

public class Main {
    public static void main(String[] args) {

        HotDrink coffee = new HotDrink("Кофе", 25, 200, 80);
        HotDrink tea = new HotDrink("Чай", 15, 300, 60);
        HotDrink compote = new HotDrink("Компот", 5, 250, 50);

        System.out.println(coffee);
        System.out.println(tea);
        System.out.println(compote);

        List  products = new ArrayList<>();

        products.add(coffee);
        products.add(tea);
        products.add(compote);

        HotDrinksVendingMachine hotDrinks = new HotDrinksVendingMachine(products);


        System.out.println("-------------------------------") ;
        System.out.println("Состав продуктов в 'Автомате горячих напитков' :") ;
        System.out.println(products + "\n");
        System.out.println("-------------------------------") ;
        System.out.println(hotDrinks.getProduct("Кофе")) ;
        System.out.println(hotDrinks.getProduct("Кофе", 200, 80)) ;
        System.out.println(hotDrinks.getProduct("Кофе", 200, 50)) ;
        System.out.println(hotDrinks.getProduct("Чай", 300, 60)) ;
        System.out.println(hotDrinks.getProduct("Ликёр"));


    }


}