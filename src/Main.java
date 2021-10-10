public class Main {
    public static void main (String[] args) {
        CreditPaymentService service= new CreditPaymentService();

        int creditAmount = 1_000_000;
        double annualRate = 9.99;
        double monthlyRate = annualRate/(100*12);

        long monthlyPayment1=service.calculate(creditAmount, monthlyRate, 12);
        System.out.println(monthlyPayment1);

        long monthlyPayment2=service.calculate(creditAmount, monthlyRate, 24);
        System.out.println(monthlyPayment2);

        long monthlyPayment3=service.calculate(creditAmount, monthlyRate, 36);
        System.out.println(monthlyPayment3);
    }
}