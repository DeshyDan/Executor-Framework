import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        Quote quote1 = new Quote("Site1", 108);
        Quote quote2 = new Quote("Site2", 109);
        Quote quote3 = new Quote("Site3", 105);

        var all = CompletableFuture.allOf(quote1.getQuote(), quote2.getQuote(), quote3.getQuote());
        all.thenRun(() -> {
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("It is done");
        });

    }
}
