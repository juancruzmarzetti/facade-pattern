import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        Cuenta cuenta1 = new Cuenta(12, "123", 10.00);
        cuentas.add(cuenta1);
        RetirarDineroService retirarDineroService = new RetirarDineroService();
        retirarDineroService.retirarDinero(12, "123", 5.00, cuentas);
    }
}