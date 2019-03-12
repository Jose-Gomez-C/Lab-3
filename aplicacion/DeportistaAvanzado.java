package aplicacion;

import java.awt.Color;
/**
 * Write a description of class DeportistaAvanzado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeportistaAvanzado extends Deportista{

    private int x;
    
    /**
     * Constructor for objects of class DeportistaAvanzado
     */
    public DeportistaAvanzado(Salon salon,String nombre,int posicionx, int posiciony){
        super(salon,nombre,posicionx,posiciony);
        color=Color.ORANGE;
    }
}
