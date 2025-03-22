public class Temperatura {
    public static void main(String[] args) {
        int Temperatura = 45;
        if (Temperatura <10){
            System.out.println("el dia esta muy frio");
        }
        if (Temperatura>10){
            if(Temperatura<=20){
                System.out.println("dia fresco");
            }
        }
        if (Temperatura>=21){
            if(Temperatura<=30){
                System.out.println("dia calido");
            }
        }
        if (Temperatura>30){
            System.out.println("dia muy caluroso");
        }

    }
}
