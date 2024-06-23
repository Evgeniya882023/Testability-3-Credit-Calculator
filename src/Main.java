public class Main {
    public static void main(String[] args) {
        CreditCalculator service = new CreditCalculator();
        double sum = 1000000;
        double percent = 9.99;
        double month = 12;
        double monthPayment = service.calculate(percent, sum, month);
        int monthPaymentResult = (int) monthPayment;
        // при кредите 1 млн должно получиться 87911 при взятии кредита на год, 46140 - на два года, 32262 - на три года
        System.out.println(monthPaymentResult);
    }
}

//monthPayment – разовый платеж, monthPaymentResult - преобразованный в целое число
//sum  - сумма платежа
//percent  - процентная ставка в %
//percentRate – процентная ставка по формуле = percent/12/100
//month – срок кредита
