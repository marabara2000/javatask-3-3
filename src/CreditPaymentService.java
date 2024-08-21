public class CreditPaymentService {

    public int calculate (double loanAmount,int loanTerm, double interest) {

        return (int) (loanAmount * (interest / (100*12) / (1 - Math.pow((1 + interest / (100*12)), -loanTerm*12))));
    }
}
