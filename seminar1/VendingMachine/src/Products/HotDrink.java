package Products;

public class HotDrink extends Product {
    private int volume; 
    private double temperature;   

    public HotDrink(String name, double price, int volume, double temperature){
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
        if ((temperature<=0) || (temperature>=100)){
            throw new IllegalArgumentException("Некорректная температура!");                 
        }  
    }
    /** получаем объем продукта */
    public int getVolume()
    {
        return volume;    
    }
     /** получаем температуру продукта */
    public double getTemperature() 
    {
        return temperature;
    }
    /** поменять метод так чтобы не добавляли температуру меньше нуля и больше 100 */
    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
/* переопределяем метод toString() именно для этого класса, т.к. добавились новые поля для продуктов */
@Override
    public String toString(){

        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume +
        ", temperature=" + temperature +
        "C}";
    }
}
