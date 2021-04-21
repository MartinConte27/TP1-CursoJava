package Logica;

import IGU.AgendaElectronica;

/**
 *
 * @author Martin Conte
 */
public class AgendaLogica{
    
    public static void main(String[] args) {
         
        //Llamo a la clase AgendaElectronica, la hago visible y la acomodo en relacion a la pantalla.
        AgendaElectronica agenda = new AgendaElectronica(); 
        agenda.setVisible(true);
        agenda.setLocationRelativeTo(null);
    }  
    
    
}
  