package brayanzuritavargas_evaluacionnice02;

import java.util.ArrayList;
import java.util.List;

public class BrayanZuritaVargas_EvaluacionNICE02 {

    public static void main(String[] args) {
        invertirTexto();
        
    }
    
    
    
    ///pregunta 5: invertir texto
    private static void invertirTexto(){
        //prueba
        String texto = "pedro domingo sabio es el mas sabio";
        
        String[] textoDividido= texto.split(" ");
        String resultado = "";
        for(int i = 0 ; i<textoDividido.length;i++){
             if(textoDividido[i].length()>4){
                 resultado += invertirFragmentoTexto(textoDividido[i])+" ";
             }else{
                resultado += textoDividido[i]+" ";
             }
        }
        System.out.println(resultado);
    }
    
    private static String invertirFragmentoTexto(String texto){
        List<String> caracteresList = new ArrayList<>();
        String[] caracteres=texto.split("");
        for(int i = caracteres.length-1; i >= 0;i--){
            caracteresList.add(caracteres[i]);
        }
        return String.join("",caracteresList);
    }
}
