public class AutenticationService {
    public boolean validarUsuarioYContrasenia(Integer userId, String password, Cuenta cuenta){
        return cuenta.getPassword().equals(password) && cuenta.getUserId().equals(userId);
    };
}
