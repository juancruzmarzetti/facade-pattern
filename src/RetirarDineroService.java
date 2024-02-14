import java.util.ArrayList;

public class RetirarDineroService implements IRetirarDineroService{
    private CuentaService cuentaService;
    private AutenticationService autenticationService;
    private CajaService cajaService;
    public RetirarDineroService(){
        this.cuentaService = new CuentaService();
        this.autenticationService = new AutenticationService();
        this.cajaService = new CajaService();
    }
    @Override
    public void retirarDinero(Integer userId, String password, double montoARetirar, ArrayList<Cuenta> cuentas){
        cuentaService.setCuentas(cuentas);
        Cuenta cuenta = cuentaService.getCuenta(userId);
        if(autenticationService.validarUsuarioYContrasenia(userId, password, cuenta)){
            cajaService.entregarDinero(montoARetirar, cuenta);
            System.out.println("El dinero se ha entregado con éxito!");
        }else{
            System.out.println("La cuenta no se ha verificado con éxito");
        }
    }
}
