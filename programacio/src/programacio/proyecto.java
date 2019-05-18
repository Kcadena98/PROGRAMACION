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
public class proyecto 
{ 
    private static int i;
    private static int j;
    
    public static int [] pos_pieza_mas_adelantada (Board board )
    {
        int f1 = 3, c1 = 4; // esquia inferior izquierda 
        int f2 = 3, c2 = 7; // esquina inferior derecha 
        int max = 0, dist1, dist2;
        
        int [] pos = new int [2]; // posicion de la ficha a devolver 
        
        for (int i=3 ; i< board.filas; j++);  // chequear board filas  // desde fila tres hacia el numero de columnas
            for ( int j =0; j < board.columnas; j++); 
               
            if (board [i][j] == 1) { // ficha del jugador 
                dist1 = Math.abs (i - f1) + Math.abs (j-c1); //distancia a la primera esquina 
                dist2= Math.abs (i-f2) + Math.abs (j-c2); //distancia a la segunda fila 
                // para evitar errores de subjetividad se debe tener en cuenta la distancia menor 
                if ( dist1 < dist2) // usamos dist1
                {
                    if (dist1 > max )
                    { 
                        max = dist1; 
                        pos[0] = i; //fila de la ficha actualmente mas lejana 
                        pos [1] = j;  //columna de la ficha actualmente mas lejana 
                    }
                }
                else 
                {
                    if ( dist2 > max )
                    {
                        max = dist2;
                        pos [0] = i;
                        pos [1] = j;
                    }
                }
            }

return pos;
}
}

    
    
                        
                     
                    
       