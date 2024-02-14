public class CajaService {
    public boolean entregarDinero(double montoARetirar, Cuenta cuenta){
        boolean respuesta = false;
        if(cuenta.getSaldo() >= montoARetirar){
            respuesta = true;
            cuenta.setSaldo(cuenta.getSaldo() - montoARetirar);
        }
        return respuesta;
    }
}
