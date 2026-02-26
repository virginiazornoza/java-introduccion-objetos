package dawentornos;

public class AñadirCuenta {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        // cuenta1.saldo = 200;
        cuenta1.deposita(200);
        System.out.println(cuenta1.getSaldo());

        // cuenta1.saldo += 100;
        cuenta1.deposita(100);
        System.out.println(cuenta1.getSaldo());

        Cuenta segundaCuenta = new Cuenta();
        // segundaCuenta.saldo = 50;
        segundaCuenta.deposita(50);

        System.out.println("primera Cuenta tiene " + cuenta1.getSaldo());
        System.out.println("segunda Cuenta tiene " + segundaCuenta.getSaldo());

        System.out.println(cuenta1.getAgencia());
        System.out.println(cuenta1.getNumero());

        System.out.println(segundaCuenta.getAgencia());

        // segundaCuenta.agencia = 146;
        segundaCuenta.setAgencia(146);
        System.out.println("Ahora la segunda cuenta esta en la agencia " + segundaCuenta.getAgencia());

        if(cuenta1 == segundaCuenta) {
            System.out.println("misma cuenta");
        } else {
            System.out.println("cuentas diferentes");
        }

        System.out.println(cuenta1);
        System.out.println(segundaCuenta);
    }

}
