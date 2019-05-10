/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author general
 */
public class JavaApplication4 
{
    public static int mayor_entre_3 ( int number1, int number2, int number3) 
        
{
        int mayor = 0;
        
        if(number1 > number2)
        {
            if (number1 > number3 )
            {
                // number1 > number2 y number1> number3 
                mayor = number1; 
             
            }
            else 
            { 
                // number1 > number2 y number3 > number1 
                mayor = number3;
                
            }  
        }
        else
        { 
            //number2 > number1
            if ( number2> number3)
            {  
                // number2 > number1 y number2 > number3
                mayor = number2;
            }
            else
            { 
               // number1 > number2 y number 3 > number1 
                mayor = number3; 
            }  
        }
        return mayor; 
    }
        
         
    public static double promedio_entre_5( int n1, int n2, int n3, int n4, int n5 )
    {
        double promedio;
        promedio = ( n1 + n2 + n3 + n4 + n5) / 5.0; 
        
        return promedio;
        
    }
    
    public static void main (String []args)
    { 
        System.out.println ( mayor_entre_3 (15,12,9));
        System.out.println ( mayor_entre_3 (15,21,9));
        System.out.println ( mayor_entre_3 (5,12,9));
        System.out.println ( mayor_entre_3 (3,4,9));
        
        System.out.println ( promedio_entre_5 (5,5,5,5,5));
        System.out.println ( promedio_entre_5 (5,3,2,1,0));
        System.out.println ( promedio_entre_5 (1,2,3,4,5));
        
    }   
}

    

