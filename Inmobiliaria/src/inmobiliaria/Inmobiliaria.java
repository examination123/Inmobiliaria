
package inmobiliaria;

public class Inmobiliaria {

    public static void main(String[] args) {
        Piso piso = new Piso(80,100);
        InmuebleSimple inmuebleSimple1;
        InmuebleSimple inmuebleSimple2;
        InmuebleSimple inmuebleSimple3;
        
        inmuebleSimple1 = new Piso(80,1000);
        inmuebleSimple2 = new LocalComercial(65,700);
        inmuebleSimple3 = new Piso(120,1000);
        Edificio edificio = new Edificio("Wasi");
        
        System.out.println("El piso vale: " +inmuebleSimple1.getPriceByArea());
        System.out.println("El local vale: " + inmuebleSimple2.getPriceByArea());
        
        piso.setGaragePlace(100,0);
        System.out.println("El piso vale: "+piso.getPriceByArea());
        
        inmuebleSimple1.setName("piso 1A");
        inmuebleSimple2.setName("local 1 B");
        inmuebleSimple3.setName("Mi casa 1A");
        edificio.add(inmuebleSimple1);
        edificio.add(inmuebleSimple2);
        edificio.add(inmuebleSimple3);
        
        System.out.println(edificio.getCont());
        for (int i=0; i<edificio.getCont(); i++){
            System.out.println(edificio.getInmuebleSimple()[i].getName());
        }
        
        System.out.println("");
        System.out.println("Elementos que quedan son: ");
        edificio.remove("Piso 1A");
        edificio.remove("mi casa n387162");
        
        for (int i=0; i< edificio.getCont(); i++){
            System.out.println(edificio.getInmuebleSimple()[i].getName());
        }
        
        System.out.println("El precio del edifio es: " + edificio.getPriceByArea());
    }
    
}
