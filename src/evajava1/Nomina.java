/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;

/**
 *
 * @author ceduc
 */
public class Nomina 
{ 
   public static void main(String []args) 
   {
      float sueldo;
      float hora;
      float valor;
     
      valor= Float.parseFloat(JOptionPane.showInputDialog("Dijite su Valor"));
      hora=  Float.parseFloat(JOptionPane.showInputDialog("Dijite su hora"));
       
      sueldo= valor*hora;
      
      JOptionPane.showMessageDialog(null,"sueldo"+sueldo);
    
      
      
      
      
      
      
   }
    
}
