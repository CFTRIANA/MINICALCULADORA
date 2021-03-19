
import javax.swing.JOptionPane;
import sun.font.EAttribute;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erika
 */
public class Minijuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        calculadora();

    }
    
    public static void calculadora() {
        
    
   
      JOptionPane.showMessageDialog(null, "CALCULADORA PREDEFINIDA", "TALLER #9", JOptionPane.INFORMATION_MESSAGE);
        
    int i = Integer.parseInt(JOptionPane.showInputDialog(null,"1.NUMEROS PARES DEL 0 A (#cliente).\n2..RAIZ CUADRADA DE #cliente.\n3.POTENCIA DE UN NUMERO  x A LA  y.\n4.POTENCIA NUMERO EULER A LA #cliente.\n5.LOGARITMO NATURAL DE #cliente\n6.NUMEROS PRIMOS DE 2 A #cliente. " , "MENU" ,JOptionPane.INFORMATION_MESSAGE));                                  

      
        if (i<=6) {
            
            switch (i) 
        {
            case 1: 
             
                //NUMERO PARES 
                
                 int u = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO LIMITE PARA LOS #PARES "));
                
                  System.out.println(" NUMEROS PARES DE 0  A  "+u);
                 
                  for(int x=0; x<=u; x=x+2){

                      
            System.out.println(" #: " + x);
            
        }
         break;
               
         
            case 2: 
                              
                //raiz cuadrada de numero x
           int h = Integer.parseInt(JOptionPane.showInputDialog(null, " RAIZ CUADRADA DE NUMERO (X): "));
                
                   System.out.println("La raíz cuadrada de " + h + " es " + Math.sqrt(h));
                
                
       break;
                   
       
            case 3: 
             
             //potencia de un numero x a la y
                   int x = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO (X) BASE DE LA POTENCIA "));
                   
                         int y = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO(Y) EXPONENTE DE LA POTENCIA "));
             
            System.out.println("potencia de ("+x+","+y+") es " +  Math.pow(x,y));
            
                break;
         case 4:
             
                 //esponente de e a la un numero
            
                  int E = Integer.parseInt(JOptionPane.showInputDialog(null, "EXPONENTE (X) A NUMERO EULER "));
                 
      System.out.println("exp("+E+"1.0) es " +  Math.exp(E));
 
            break;
            
             case 5:
                //logaritmo natural
                     
               int l = Integer.parseInt(JOptionPane.showInputDialog(null, "EL LOGARITMO NATURAL DE NUMERO (X)"));
                         
                      System.out.println("log("+l+") es " + Math.log(l));
                     
           break;
            
           case 6:
               //primos
          int fin = Integer.parseInt(JOptionPane.showInputDialog(null, " NUMERO LIMITE PARA LOS  #PRIMOS "));
         int desde = 2;
        boolean esPrimo;

        int inicio = 2;

        boolean esprimo;

        for (int d = desde; d <= fin; d++) {
            esprimo = true;

            for (int j = 2; j <= Math.sqrt(d) && esprimo; j++) {
                if (d % j == 0) {
                    esprimo = false;
                }
            }

            if (esprimo) {
                System.out.println(d);
            }
        }
                     
               
          break;
    
                     
          
        }
      
    

        } else {
            
           JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO", "ERROR PROGRAMA", JOptionPane.WARNING_MESSAGE);
            
            
  
        }
      

}
      
}      
    

               
   
    
  





