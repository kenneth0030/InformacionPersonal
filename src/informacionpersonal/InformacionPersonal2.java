
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "kenneth alfonso",
           apellido_paterno = "pegueros",
           apellido_materno = "mendoza";
    int edad = 22;
    String fecha_nacimiento = "27/mayo/2000";
    String hobbies = "videojuegos";
    
    String nombre_del_alumno = "kenneth alfonso pegeuros mendoza";
    String numero_de_cuenta = "2271088";
    String semestre_que_cursa = "segundo semestre";
    String Materias_que_toma = "calculo,circuitos electicos,programacion,teoria de sistemas,teoria de algoritmos";
    String horario = "7:00am - 2:30pm";
            
    
    
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su edad es: " + edad +" años ");
        System.out.println("Su fecha de nacimiento es: " + fecha_nacimiento);
        System.out.println("Su pasatiempo es: " + hobbies);
        System.out.println("el nombre del alumno es: " + nombre_del_alumno);
        System.out.println("el numero de cuenta es: " + numero_de_cuenta);
        System.out.println("el semestre que cursa es: " + semestre_que_cursa);
        System.out.println("las materias que toma: " + Materias_que_toma);
        System.out.println("el horario es: " + horario);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
