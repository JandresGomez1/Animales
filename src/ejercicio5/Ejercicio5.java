package ejercicio5;

import clases.Animal;
import clases.Perros;
import clases.Gato;
import clases.Leon;
import clases.Lobos;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Animal[] animales = new Animal[4];
        animales[0] = new Gato("Maullido", "Ratones", "Doméstico", "Felis silvestriscatus");  
        animales[1] = new Perros("Ladrido", "Carnívora", "Doméstico", "Canis lupus familiaris");  
        animales[2] = new Lobos("Aullido", "Carnívora", "Bosque", "Canis lupus");   
        animales[3] = new Leon("Rugido", "Carnívora", "Pradera", "Panthera leo");
        
        for(Animal animal : animales){
            animal.getNombreCientifico();
            animal.getSonido();
            animal.getAlimentos();
            animal.getHabitat();
            System.out.println("");
        
        }
         
    }
    
}
