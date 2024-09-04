import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private final List<Product> products;

    public HotDrinksVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
         //throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
        System.out.printf("Продукт c названием '%s' не найден.", name);
        System.out.println(" Можем Ваи предложить :");
        return products.get(0);
    }


        public Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                if ((product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getVolume() == volume) &&
                     ((HotDrink) product).getTemperature() == temperature)

                    {
                    return (HotDrink) product; }
                }

        }
        // throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
        System.out.printf("Продукт c названием '%s' или '%s' c указанной температурой или объемом не найден.", name, name );
        // return null;
        System.out.println(" Можем Ваи предложить : ");
        return     (HotDrink) products.get(0);
    }

}

