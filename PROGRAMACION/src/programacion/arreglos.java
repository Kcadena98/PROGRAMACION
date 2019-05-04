
package javaapplication8;
import java.io.*;


public class arreglos {
    
    public static void main(String [] args) {
       BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
       BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter (System. out)); 
       try 
       {
           int estudiantes = Integer.parseInt(br.readLine()); 
           double [] notas = new double [estudiantes]; 
           double min = 5.0, max =0.0, promedio = 0.0;
           
           
           //recibir notas
           for(int i = 0; i < estudiantes; i++) {
               notas[i] = Double.parseDouble(br.readLine()); //arreglos para que en una sola variable se guarde mucha informacion 
           }
            for(int i = 0; i < estudiantes; i++) {
                if (notas [i] < min ) {
                    min = notas [i]; 
                }
                if (notas [i] > max ){
                   max = notas [i];
                }
                promedio = promedio + notas [i];
            }
            promedio = promedio / estudiantes; 
            
             bw.write ( "la nota maxima es " + max + 
                        " la nota minima es " + min + 
                        " el promedio es " + promedio);
           
                bw.flush();
            }
            catch (Exception ex){}
         
                                                     
          
       
    } 
}
          
    
    

    
    

