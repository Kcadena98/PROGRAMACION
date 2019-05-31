

	import application.Board;
	import application.Move;

	public class ROCKIE implements player {
		
		// Este método no debe ser modificado. Al implementar los dos métodos
		// solicitados, este
		// método genera un movimiento válido de manera automática.
	 
		public Move move(Board board) {
			
			int[] pos_pieza = pos_pieza_mas_adelantada1(board);
			
			int[] nueva_pos = posicion_vecina_libre1(pos_pieza[0], pos_pieza[1], board);
			
			if (nueva_pos == null);	 // RENUNCIÓ!
			 
			           return null;
			           
			return new Move(pos_pieza[0], pos_pieza[1], nueva_pos[0], nueva_pos[1]);
		}	
		
		
		//Retorna un arreglo de dos valores: la fila y la columna (en ese orden) de la pieza del 
		//jugador 1 que más lejos se encuentre de su casa. En caso de empate, cualquiera de estas
		//es aceptada.
		
		static int[] pos_pieza_mas_adelantada1(Board board) {
			
		}
			// Retorna un arreglo de dos valores: la fila y la columna (en ese orden) de la
			// pieza del
			// jugador 1 que más lejos se encuentre de su casa. En caso de empate,
			// cualquiera de estas es aceptada.

		static int[] pos_pieza_mas_adelantada11(Board board) {
			
			
			// Se crea el arreglo para devolver las dos posiciones (fila y columna)
			
			int pos[] = new int[2];
			int f1 = 3, c1=4; // esquina inferior izquierda 
			int f2 = 3, c2=7; //esquina inferior derecha
			int max = 0, dist1,dist2;
			
			
						
			for (int f = 0; f < 17; f++) { // Se realiza el recorrido de las posiciones del tablero empezando por las filas
				
				
				for (int c = 0; c < 17; c++) {// Se realiza el recorrido de las posiciones del tablero por las columnas
					
					int color = board.get_cell_color(f, c); //para saber el color de la celda en el tablero
					if (color == 1) { 
						
						pos [0] = f; //guardo la posicion de la fila 
						pos [0] = c; //guardo la posicion de la columna
						
					   }
                }
				
                else  //si no //calculo las distancias entre las filas y columnas y determino cual es mayor 
                	
                {
                    if ( dist2 > max )
                    {
                        max = dist2;
                        pos [0] = f;
                       	pos [1] = c1; // valida que encuentre una posicion si no retorna a nueva posicion
                       	
                       	
					}
                    
                    return pos;
            		
				} 
			
                return null;
				
			
		}
	
			// Retorna una arreglo de dos valores: la fila y la columna (en ese orden) de una casilla
			// adyacente a la casilla (f, c) que no se encuentre ocupada por otra pieza ni
			// pertenezca a una casa distinta a su destino. En caso de existir más de una casilla libre,
			// cualquiera de estas casillas es aceptada
			
			static int[] posicion_vecina_libre1(int f, int c, Board board) {
				
				// se realiza el arreglo para saber cual es la posicion de la casilla vecina libre 
				
				  int [] posicion  = new posicion [2];
				  
				  if (board f-1 >= 0 &&  c-1] == 0) { //Se verifica la primera posición habilitada sumando en filas y columnas confirmando que se encuentre libre (0)
					  
				  }
					  if (board.get_cell_color(f -1 , c -1) == 0) { // se verifica la primera posicion habilitada
						  posicion [0] = f-c;
				            posicion [1] = c-1;
				      return posicion;    // se validan las posiciones de la fila y columna,retorna la posicion
				      
				      
				      
				  }
					  
					  if(f-1>=0 && c+1<=17){    // se ubica la segu
							
							if (board.get_cell_color(f -1 , c +1) == 0) {
						
								posicion [0] = f - 1;
						
								posicion [1] = c + 1;
							
								return posicion;
								
								
				  
			}
							else    //sino 
					        { 
					            if (board.get_cell_color( f-1 ==0  && c ==0) // si la f-1 es igual a 0 y la columna es igual a 0
					           
					            		{
					                posicion[0] = f-1;// ubique la posicion 0 en f-1
					                posicion [1] = c;  //posicion 1 en columna c 
					                return posicion;  // retorne la posicion 
				
				
			}
					            if(f+1<=17 && c-1>=0){       // si f+1 <= numero de piezas y c-1 >= al numero inicial 
					    			
					        		if (board.get_cell_color(f +1 , c -1) == 0) {  //
					        		
					        		posicion [0] = f + 1;
					        			
					        		posicion [1] = c - 1;
					        		
					        		return posicion;
					        		}
					            }
					        }
					  }
			}
			
		}
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

