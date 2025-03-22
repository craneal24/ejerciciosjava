public class Permiso2 {
    public static void main(String[] args) {
        int edad=13;
        boolean tieneliciencia=false;
        boolean tomadoalcohol=true;
        if(edad>18 && tieneliciencia==true && tomadoalcohol==false ){
        System.out.println("puede conducir");
    }
    if(edad<18 && tieneliciencia== false){
        System.out.println("no puede conducir");
        
    }

    }
 }