package players;

import application.Board;
import application.Move;

public class Rookie implements Player {

private static double distancia;

// Este método no debe ser modificado. Al implementar los dos métodos
// solicitados, este
// método genera un movimiento válido de manera automática.
	public Move move(Board board) {
		int[] pos_pieza = pos_pieza_mas_adelantada(board);
		int[] nueva_pos = posicion_vecina_libre(pos_pieza[0], pos_pieza[1], board);
		if (nueva_pos == null) // RENUNCIÓ!
			return null;
		return new Move(pos_pieza[0], pos_pieza[1], nueva_pos[0], nueva_pos[1]);
	}

// Retorna un arreglo de dos valores: la fila y la columna (en ese orden) de la
// pieza del jugador 1 que más lejos se encuentre de su casa.

	static int[] pos_pieza_mas_adelantada(Board board) {

		// casa
		int casa_f = 0;   // se establecen variables para fila y columnas 
		int casa_c = 4;
		int counter = 0;
		while (counter < 10) {
			counter = counter + 1;
			System.out.println(counter);

		
			int pos[] = new int[2];	 // Se crea el arreglo para devolver las dos 
			                           //posiciones (fila y columna)

			
			for (int f = 0; f < 17; f++) { // Se realiza el recorrido de las posiciones 
				                           // del tablero empezando por las filas
				
				for (int c = 0; c < 17; c++) { // Se realiza el recorrido de 
					                           //las posiciones del tablero por las columnas
					
					int color = board.get_cell_color(f, c); // Se obtiene el color de la celda del tablero
					
					if (color == 1) { // Se valida que el color sea 1
						
						pos[0] = f; // Se guarda la posicion de la fila
						
						pos[1] = c; // Se guarda la posicion de la columna

						// Distancia
						setDistancia(Math.sqrt(Math.pow(casa_f - f, 2) + Math.pow(casa_c - c, 2)));
						// Se realiza la validacion de la cantidad de fichas que sean < 10

					}
				}
			}
			// Se valida que haya encontrado una posicion y se devulve de lo contratrio se
			// devuelve null
			return pos;
		}
		return null;

	}

// Retorna una arreglo de dos valores: la fila y la columna (en ese orden) de
// una casilla
// adyacente a la casilla (f, c) que no se encuentre ocupada por otra pieza ni
// pertenezca a
// una casa distinta a su destino. En caso de existir más de una casilla libre,
// cualquiera
// de estas casillas es aceptada. En caso de no existir ninguna casilla libre,
// debe retornar null.
	static int[] posicion_vecina_libre(int f, int c, Board board) {

		int[] posicion = new int[2];

		if (board.get_cell_color(f + 1, c + 1) == 0) { // se validan cada una de los movimientos
			                                           // que realiza la ficha del jugador amarillo 1 
			posicion [0] = f + 1;                      // en las casillas que encuentre libres 
		    posicion [1] = c + 1;
			return posicion;
		}
		if (board.get_cell_color(f + 1, c) == 0) {
			posicion [0] = f + 1;
			posicion [1] = c;
			return posicion;
		}
		if (board.get_cell_color(f, c + 1) == 0) {
			posicion [0] = f;
			posicion[1] = c + 1;
			return posicion;
		}
		if (board.get_cell_color(f, c - 1) == 0) {
			posicion[0] = f;
			posicion[1] = c - 1;
			return posicion;
		}
		if (board.get_cell_color(f - 1, c) == 0) {
			posicion[0] = f - 1;
			posicion[1] = c;
			return posicion;
		}
		if (board.get_cell_color(f - 1, c - 1) == 0) {
			posicion[0] = f - 1;
			posicion[1] = c - 1;
			return  posicion;
		}

		return null;
	}

	/**
	 * @return the distancia
	 */
	public static double getDistancia() {
		return distancia;
	}

	/**
	 * @param distancia the distancia to set
	 */
	public static void setDistancia(double distancia) {
		Rookie.distancia = distancia;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

