public class Numpar {
    public static void main(String[] args) {
        int Numpar = 13;
        if ((Numpar %2==0)&& (Numpar>50)){
        
                System.out.println("El numero es par y mayor que 50");
            }

        if ((Numpar %2==0)&&(Numpar <50)){
            
                System.out.println("El numero es par, pero no es mayor que 50");
            }
        
        if (Numpar %2!=0){
            System.out.println("El numero no es par");
        }
    }
}
