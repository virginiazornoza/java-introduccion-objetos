package dawentornos;

public class nuevaCuenta {

    public static void main(String[] args) {
        Cuenta cuentaPrimera = new Cuenta();
        // cuentaPrimera.saldo = 200;
        cuentaPrimera.deposita(200);
        System.out.println(cuentaPrimera.getSaldo());

        // cuentaPrimera.saldo += 100;
        cuentaPrimera.deposita(100);
        System.out.println(cuentaPrimera.getSaldo());

        Cuenta segundaCuenta = new Cuenta();
        // segundaCuenta.saldo = 50;
        segundaCuenta.deposita(50);

        System.out.println("primera Cuenta tiene " + cuentaPrimera.getSaldo());
        System.out.println("segunda Cuenta tiene " + segundaCuenta.getSaldo());

        System.out.println(cuentaPrimera.getAgencia());
        System.out.println(cuentaPrimera.getNumero());

        System.out.println(segundaCuenta.getAgencia());

        // segundaCuenta.agencia = 146;
        segundaCuenta.setAgencia(146);
        System.out.println("Ahora la segunda cuenta esta en la agencia " + segundaCuenta.getAgencia());

        if(cuentaPrimera == segundaCuenta) {
            System.out.println("misma cuenta");
        } else {
            System.out.println("cuentas diferentes");
        }

        System.out.println(cuentaPrimera);
        System.out.println(segundaCuenta);
    }

}
