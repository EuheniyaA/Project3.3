public class CreditPaymentService {

    public long calculate (int creditAmount, double monthlyRate, int period) {

        long monthlyPayment = Math.round (creditAmount * (monthlyRate/(1-(Math.pow(1+monthlyRate,-period)))));

        return monthlyPayment;

    }
}
