package practica;

public class Test {
    public static void main(String[] arg){
        Account a = new Account();
        a.deposit(1500);
        a.withdraw(1200);

        Account a2 = new Account();
        a2.deposit(1500);
        a2.withdraw(1700);

        Customer c=new Customer("Ramiro","Fryda");
        c.setAccount(a);
        Customer c2=new Customer("Leandro","Trillo");
        c2.setAccount(a2);

        System.out.println("Mi nombre completo es: "+c.getNombre()+" "+c.getApellido());
        System.out.println("Mi balance es: "+c.getAccount().getBalance());

        System.out.println("Mi nombre completo es: "+c2.getNombre()+" "+c2.getApellido());
        System.out.println("Mi nombre completo es: "+c2.getAccount().getBalance());
    }
}
