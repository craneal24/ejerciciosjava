public class Suscripcion {
    public static void main(String[] args) {
        
        String  suscripcion = "hola";
        
        
        if (suscripcion == "gratis"){
            System.out.println("Tienes acceso a contenido gratuito.");
        }
        else if (suscripcion ==  "basico"){
            System.out.println("Tienes acceso a funciones limitadas.");
        }
        else if (suscripcion == "premium"){
            System.out.println("Tienes acceso a todas las funciones");
        }
        else {
            System.out.println("Tienes acceso a todas las funciones");
        }       
    }
}

