
package clases;

abstract public class Animal {

    
    
    protected String sonidos,alimentos, habitat, nombreCientifico;

    public Animal(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }
    
    
    
    public abstract void getNombreCientifico();
    public abstract void getSonido();
    public abstract void getAlimentos();
    public abstract void getHabitat();
  
    
}
