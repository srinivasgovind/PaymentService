# PaymentService
APIs for transactions utilizing Razorypay and Stripe Payment Gateways

---
## Steps to Install this Project Locally

1. Clone the project to your local machine.
2. Create your Razorpay credentials on the official site and add your key ID and secret in the properties file.
3. Create your Stripe credentials on the official site and replace the placeholders with your key ID and secret in the `application.properties` file.
4. Run `mvn clean install`.
5. You should now be able to run this project successfully.

## What is this Project?

Payment Service is one of the microservices used in building an e-commerce web application. This service is crucial for handling transactions in the e-commerce application. Financial transactions flow through this service.

The service generates payment links by communicating with Razorpay or Stripe Payment Gateways. Razorpay and Stripe are well-known third-party payment gateways. Their APIs are implemented using the Adapter Design Pattern.

---
