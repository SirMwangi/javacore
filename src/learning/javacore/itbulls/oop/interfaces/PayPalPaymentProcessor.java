package learning.javacore.itbulls.oop.interfaces;

//in this particular case, the class implements the interface

public class PayPalPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(PaymentData payment) {
        /* PayPalForm paymentForm = PayPalApi.getPaymentFormByAppId(APP_ID);
         * fillPaymentForm(paymentForm, payment);
         * paymentForm.submit();
         * ...
         */

    }
}
