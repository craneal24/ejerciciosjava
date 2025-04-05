public class triangulo{
    public static void main(String[] args) {
        int triangulo1=2;
        int triangulo2=2;
        int triangulo3=2;

        if ( triangulo1==2 & triangulo2==2 & triangulo3==2){
            System.out.println("triangulo equilateros");
        }
        if (triangulo1==3 & triangulo2==2 & triangulo3==2){
            System.out.println("triangulo isoceles");
        }
        if (triangulo1==3 & triangulo2==2 & triangulo3==1){
            System.out.println("triangulo escaleno");
        }
    }
}