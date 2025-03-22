public class Saldo {
    public static void main(String[] args) {
        int Saldo = 100;
        int disponible=5000;
        int retiro=50;
        if (retiro>5000){
    System.out.println("Fondos insuficientes");

        }
        if (retiro>1000){
            System.out.println("limite de transaccion $100");
        }
        if (Saldo<disponible){
            if(Saldo<1000){
                System.out.println("Retiro exitoso.su saldo actual es nuevo saldo");
                retiro=disponible-Saldo;
                System.out.println("resultado");
            }
        }


    }
}
