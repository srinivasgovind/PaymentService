package dev.srinivas.PaymentService.controlllers;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import dev.srinivas.PaymentService.dtos.InitiatePaymentRequestDto;
import dev.srinivas.PaymentService.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/payments")
@RestController
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) throws StripeException, RazorpayException {

        return paymentService.initiatePayment(requestDto.getOrderId(), requestDto.getAmount(),
                requestDto.getPhoneNumber(), requestDto.getEmail());
    }

}
