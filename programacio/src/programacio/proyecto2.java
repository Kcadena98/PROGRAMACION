/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacio;

/**
 *
 * @author general
 */
public class proyecto2 
{
    public static int [] posicion_vecina_libre (int f, int c, Board board ){
        int posicion [] = new posicion [2];
        if (board [f-1][c-1] == 0)
        {
            posicion [0] = f-c;
            posicion [1] = c-1;
            return posicion;
        } 
        else 
        { 
            if (board [f-1][c] ==0)
            {
                posicion[0] = f-1;
                posicion [1] = c; 
                return posicion; 
            }
        }
        return null;
    }
}

            
     
