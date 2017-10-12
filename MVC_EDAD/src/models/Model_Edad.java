
package models;

import javax.swing.JOptionPane;


public class Model_Edad {
    int Año_nac = 1995;
    int mensaje = 9;
    public int getAño_nac(){
        return Año_nac;
    }
    public void setAño_nac(int Año_nac){
        this.Año_nac = Año_nac;
    }
    public void Verificar(){
        mensaje = Año_nac - 2017;
        if(mensaje >18)
            JOptionPane.showMessageDialog(null,"usted es mayor de edad","", JOptionPane.INFORMATION_MESSAGE);
        else{
    JOptionPane.showMessageDialog(null,"usted no es mayor de edad","",JOptionPane.WARNING_MESSAGE);
    }   
   }
}

