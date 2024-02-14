import java.util.ArrayList;

public class CuentaService {
    private ArrayList<Cuenta> cuentas;
    public void setCuentas(ArrayList<Cuenta> cuentas){
        this.cuentas = cuentas;
    }

    public Cuenta getCuenta(Integer userId){
        Cuenta cuenta = null;
        for(Cuenta c: this.cuentas){
            if(c.getUserId().equals(userId)){
                cuenta = c;
            }
        }
        return cuenta;
    }
}
