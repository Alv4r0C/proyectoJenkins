/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema1.actividad13;

/**
 *
 * @author acast
 */
public class Actividad13 {
    
public static boolean dia_laboral(String dia) {
        switch(dia) {
        case "Lunes":
        return true;
        case "Martes":
        return true;
        case "Miercoles":
        return true;
        case "Jueves":
        return true;
        case "Viernes":
        return true;
        case "Sabado":
        return false;
        case "Domingo":
        return false;
        default:
        return false;
        }
    }
}
