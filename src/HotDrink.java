/** Это класс Горячих напитков,
 *  созданный от абстрактного класса Продукт
 */
public class HotDrink extends BottleOfWater{

    int temperature;

    public HotDrink(String name, double cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink {" +
                " name='" + super.getName() + '\'' +
                ", volume='" + super.getVolume() + '\'' +
                ", temperature=" + this.getTemperature() +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrink)) {
            return false;
        }

        HotDrink that = (HotDrink) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getTemperature() == that.getTemperature();
    }


}
