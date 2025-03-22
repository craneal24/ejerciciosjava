public class Precio {
    public static void main(String[] args) {
        int Precio = 67;
        if (Precio ==5){
            System.out.println("entrada gratuita");
        }
        if (Precio >=5){
            if (Precio<=17){
                System.out.println("el boleto cuesta 5 pesos");
            }
        }
        if (Precio >=18){
            if(Precio>=60){
                System.out.println("el boleto cuesta 10 pesos");
            }
        }
        if (Precio>60){
            System.out.println("el boleto cuesta 7 pesos aplica descuento para adultos mayores");
        }
    }
}
