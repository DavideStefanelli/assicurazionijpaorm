/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilis;

/**
 *
 * @author web4e
 */
public class Util {
    
    public static String printDefault(Object value, String defaultValue){
        if(value != null){
            return (String)value;
        }else{
            return defaultValue;
        }
    }
    
}
