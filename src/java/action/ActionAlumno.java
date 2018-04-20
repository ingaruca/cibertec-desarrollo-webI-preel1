/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ingarukal11
 */
public class ActionAlumno extends ActionSupport{
    
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String correo;
    
    @Override
    public String execute(){       
        
        return "ok";
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public void validate(){
        if(nombres == null || nombres.trim().equals(""))
            addFieldError("nombres", "Se debe ingresar un nombre");
        
        if(apellidos == null || apellidos.trim().equals(""))
            addFieldError("apellidos", "Se debe ingresar un apellido");
        
        Pattern patronFecha = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
        Matcher matchFecha = patronFecha.matcher(fechaNacimiento);        
        if(fechaNacimiento == null || fechaNacimiento.trim().equals("")){
            addFieldError("fechaNacimiento", "Se debe ingresar una fecha");
        }else{
                if(!matchFecha.matches()){
                addFieldError("fechaNacimiento", "La fecha debe tener formato dd-mm-yyyy");
            }
        }
        
        Pattern patronCorreo = Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$");
        Matcher matchCorreo = patronCorreo.matcher(correo);
        
        if(correo == null || correo.trim().equals("")){
            addFieldError("correo", "Se debe ingresar un correo");
        }else{
                if(!matchCorreo.matches()){
                addFieldError("correo", "Formato de correo incorrecto (ejem. luis@gmail.com)");
            }
        }
    }
    
}
