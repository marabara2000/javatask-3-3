public class Main {

    public static void main(String[] args) {
    CreditPaymentService service = new CreditPaymentService ();


        System.out.println("Аннуитентный ежемесячный платеж равен " + service.calculate(1000000,1,9.99) + " рублей.");
        System.out.println("Аннуитентный ежемесячный платеж равен " + service.calculate(1000000,2,9.99) + " рублей.");
        System.out.println("Аннуитентный ежемесячный платеж равен " + service.calculate(1000000,3,9.99) + " рублей.");
    }
}
