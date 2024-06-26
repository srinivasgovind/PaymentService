package dev.srinivas.PaymentService.services;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.stripe.param.TopupListParams;
import dev.srinivas.PaymentService.paymentgateway.PaymentGateway;
import dev.srinivas.PaymentService.paymentgateway.RazorpayPaymentGateway;
import org.hibernate.query.Order;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(String orderId, Long amount, String phoneNumber, String email) throws RazorpayException, StripeException {

        // Ideal case
//        Order order = orderService.getOrderDetails(orderId);
//        int amount = order.getAmount();
//        String productName = order.getProductName();

            //Long amount = 198767L; // 1987.67
            //Long amount = 10000L; //100.00

            //TODO Generate the payment link.
            return paymentGateway.generatePaymentLink(orderId, amount, phoneNumber, email);
    }
}
