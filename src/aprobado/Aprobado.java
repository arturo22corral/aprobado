/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprobado;

/**
 *
 * @author 34633
 */
public class Aprobado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var nota = 8;
        var mensaje = "";
        
        if(nota <5){
            mensaje = "suspenso";
        }else{
            mensaje = "aprobado";
        }
         alert(mensaje);
        //OPERADOR TERNARIO
        //sustituye a la condicional
        var otroMensaje = (nota < 5) ? 'suspenso' : 'aprobado';
    }
    
    
}
