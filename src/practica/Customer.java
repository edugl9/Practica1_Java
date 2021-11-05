package practica;

public class Customer {
    private String nombre;
    private String apellido;
    private Account account;

    public Customer(String nom, String ap){
        this.nombre=nom;
        this.apellido=ap;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
