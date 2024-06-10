package mailService;

import java.util.concurrent.CompletableFuture;

public class MailService {

    public void send() {
        System.out.println("Started sending the email");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The email has been sent");
    }

    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(this::send);
    }
}
