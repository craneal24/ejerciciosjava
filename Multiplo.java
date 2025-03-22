public class Multiplo {
    public static void main(String[] args) {
        int Multiplo = 14;
        if (Multiplo %3==0){
            if (Multiplo %5==0){
                System.out.println("es multiplo de 3 y 5");
            }
        }
        if (Multiplo %3!=0){
            if(Multiplo %5!=0){
                System.out.println("no es multiplo de 3 y 5");
            }
        }
        if(Multiplo %3==0){
            if(Multiplo %5!=0){
                System.out.println("es multiplo de 3");
            }
        }
        if (Multiplo %3!=0){
            if (Multiplo %5==0)
            System.out.println("es multiplo de 5");
        }


    }
    
}
