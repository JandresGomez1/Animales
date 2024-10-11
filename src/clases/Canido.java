
package clases;

public class Canido extends Animal {
    
   public Canido(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        super(sonidos, alimentos, habitat, nombreCientifico);
        
    }

     @Override
    public void getNombreCientifico(){
         System.out.println(nombreCientifico);
    }
    
     @Override
    public  void getSonido(){
         System.out.println("Sonido: " + sonidos);
    }
    
    @Override
    public  void getAlimentos(){
        System.out.println("Alimentos: " + alimentos);
    }
    
    @Override
    public void getHabitat(){
        System.out.println("Hábitat: " + habitat);
    }
    
}




