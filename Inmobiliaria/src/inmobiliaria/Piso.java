
package inmobiliaria;

public class Piso extends InmuebleSimple{
    
    private double garagePlace;
    
    public Piso (double Area, double Price){
        super(Area, Price);
        this.garagePlace = 0.0;
    }
    
    @Override
    public double getPriceByArea(){
        return (Area*Price) + garagePlace;
        
    }
    
    public void setGaragePlace(double garagePlace){
        this.garagePlace = garagePlace;
    }
    
    
}
