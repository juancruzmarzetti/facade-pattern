import java.util.ArrayList;

public interface IRetirarDineroService {
    public void retirarDinero(Integer userId, String password, double MontoARetirar, ArrayList<Cuenta> cuentas);
}
