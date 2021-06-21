
package inmobiliaria;

public abstract class InmuebleSimple implements Inmueble {
    protected double Area;
    protected double Price;
    protected String name;
    
    public InmueblesSimples(double Area, double Price){
        this.Area = Area;
        this.Price = Price;
    }
    
    @Override
    public abstract double getPriceByArea();
    
    @Override
    public double getArea(){
        return Area;
    }
    
    @Override
    public double getPrice(){
        return Price;
    }
    
    public void setPriceByArea(double area, double price){
        this.Area = area;
        this.Price = price;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
}
