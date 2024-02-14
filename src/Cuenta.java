public class Cuenta {
    private Integer userId;
    private String password;
    private double saldo;

    public Cuenta(Integer userId, String password, double saldo) {
        this.userId = userId;
        this.password = password;
        this.saldo = saldo;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
