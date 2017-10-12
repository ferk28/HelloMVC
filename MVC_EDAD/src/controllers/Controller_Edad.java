package controllers;

import views.View_Edad;
import models.Model_Edad;


public class Controller_Edad {
    View_Edad view_edad;
    Model_Edad model_edad;
    
    public Controller_Edad(View_Edad view_edad, Model_Edad model_edad){
        this.view_edad = view_edad;
        this.model_edad = model_edad;
        initView();
    }
    public void initView(){
        view_edad.jtf_Año_nac.setText(String.valueOf(model_edad.getAño_nac()));
        view_edad.jl_Mensaje.setText(String.valueOf(model_edad.getMensaje()));
        view_edad.setVisible(true);
        view_edad.jbtn_Verificar.addActionListener(e->jbtn_Verificarclick());
    }
    
    public void jbtn_Verificarclick(){
        model_edad.setAño_nac(Integer.parseInt(view_edad.jtf_Año_nac.getText()));
        model_edad.setMensaje(Integer.parseInt(view_edad.jl_Mensaje.getText()));
        model_edad.Verificar();
        view_edad.jl_Mensaje.setText(String.valueOf(model_edad.getMensaje()));
    }


    
}