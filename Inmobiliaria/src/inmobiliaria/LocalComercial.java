
package inmobiliaria;

public class LocalComercial extends InmuebleSimple {
    
    public LocalComercial (double Area, double Price){
        super(Area, Price);
        
    }
    
    @Override
    public double getPriceByArea(){
        return Area*Price;
    }
    
}
