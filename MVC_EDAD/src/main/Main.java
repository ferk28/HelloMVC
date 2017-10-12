package main;

import models.Model_Edad;
import views.View_Edad;
import controllers.Controller_Edad;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String jagb[]){
        Model_Edad model_edad = new Model_Edad();
        View_Edad view_edad = new View_Edad();
        Controller_Edad controller_edad = new Controller_Edad(view_edad, model_edad);
        
    }
    
}