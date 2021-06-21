
package inmobiliaria;

public class Edificio {
    
    private InmuebleSimple[] inmuebleSimple;
    private String name;
    private int cont;
    
    public Edificio(String name){
        this.inmuebleSimple = new InmuebleSimple[100];
        this.name = name;
        cont = 0;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public double getArea(){
        double area =0.0;
        for (int i=0; i<cont; i++){
            area+=inmuebleSimple[i].getPrice();
        }
        
        return area;
    }
    
    
    @Override
    public double getPrice(){
        double price = 0.0;
        for (int i=0, i<cont; i++){
            price += inmuebleSimple[i].getPrice();
        }
        return price;
    }
    
    public void add(InmuebleSimple inmuebleSimple2) {
        if(cont<=100){
            this.inmuebleSimple[cont] = inmuebleSimple;
            cont ++;
        }
        
    }
    
     public void remove(String name) {
         for (int i=0; i<cont; i++){
             if (inmuebleSimple[i].getName().equalsIgnoreCase(name)){
                 inmuebleSimple[i] = null;
                 for (int j=i; j<cont-1; j++){
                     inmuebleSimple[j] = inmuebleSimple[j+1];
                 }
                 cont --;
             }
         } 
    }
     
    @Override
    public void setName(String name){
        this.name=name;
    }
     public InmuebleSimple [] getInmuebleSimple() {
        return inmuebleSimple;
    }

    public int getCont(){
        return cont;
    }
    
    @Override
    public double getPriceByArea() {
        double result = 0.0;
        for (int i=0;i<cont;i++){
            result +=inmuebleSimple[i].getPriceByArea();
        }
        return result;
    }
    
}
