package learning.javacore.itbulls.spring;

public record TransactionRequest(

        String accountID,
        double amount,
        String merchantCategory
) {
}
