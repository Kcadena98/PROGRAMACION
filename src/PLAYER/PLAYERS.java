package PLAYER;


import application.Board;
import application.Move;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class PLAYERS {

	  //Este m�todo no debe ser modificado. Al implementar los dos m�todos solicitados, este
	  //m�todo genera un movimiento v�lido de manera autom�tica.
	  public Move move(Board board)
	  {

	    int[] pos_pieza = pos_pieza_mas_adelantada(board);
	    log(Arrays.toString(pos_pieza));
	    int[] nueva_pos = posicion_vecina_libre(pos_pieza[0], pos_pieza[1], board);
	    if (nueva_pos == null) //RENUNCIÓ!
	    {
	      return null;
	    }
	    return new Move();
	  }

	  public static void log(String message)
	  {
	    try (PrintStream out = new PrintStream(new FileOutputStream("deibi.txt", true))) {
	      out.println(message);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }

	  //Retorna un arreglo de dos valores: la fila y la columna (en ese orden) de la pieza del 
	  //jugador 1 que m�s lejos se encuentre de su casa. En caso de empate, cualquiera de estas
	  //es aceptada.
	  static int[] pos_pieza_mas_adelantada(Board board)
	  {
	    //Se crea el arreglo para devolver las dos posiciones (fila y columna)
	    int pos[] = new int[2];
	    
	    //Se realiza el recorrido de las posiciones del tablero empezando por las filas
	    for (int i = 0; i < 17; i++) {//Se recorren las filas del tablero
	      //Se realiza el recorrido de las posiciones del tablero empezando por las columnas
	      for (int j = 0; j < 17; j++) { //Se recorren las columnas del tablero
	        //Se obitiene el color de la celda del tablero
	        int color = board.get_cell_color(i, j);
	        //Se valida que el color sea 1
	        if (color == 1 ) {
	          //Se guarda la posición de la ficha
	          pos[0] = i;
	          //Se guarda la posición de la columna
	          pos[1] = j;
	          
	        }
	      }
	    }
	    //Se valida que haya encontrado una posición y se devulve de lo contratrio se devuelve null
	    return pos;
	  }

	  //Retorna una arreglo de dos valores: la fila y la columna (en ese orden) de una casilla
	  //adyacente a la casilla (f, c) que no se encuentre ocupada por otra pieza ni pertenezca a 
	  //una casa distinta a su destino. En caso de existir m�s de una casilla libre, cualquiera
	  //de estas casillas es aceptada. En caso de no existir ninguna casilla libre, debe retornar null.
	  static int[] posicion_vecina_libre(int f, int c, Board board)
	  {
	    if (f + 1 < 17 && board.get_cell_color(f + 1, c) == 0) {
	      return new int[]{f + 1, c};
	    }
	    return null;

	  }

	}


