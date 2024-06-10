import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        var service = new FlightService();

        service.getQuotes()
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //
        Quote quote1 = new Quote("Site1", 108);
        quote1.getQuote();
        Thread.sleep(10000);
        //                Quote quote2 = new Quote("Site2", 109);
        //                Quote quote3 = new Quote("Site3", 105);
        //
        //                var all = CompletableFuture.allOf(quote1.getQuote(), quote2.getQuote(), quote3.getQuote());
        //                all.thenRun(() -> {
        //                    try {
        //                        Thread.sleep(15000);
        //                    } catch (InterruptedException e) {
        //                        throw new RuntimeException(e);
        //                    }
        //                    System.out.println("It is done");
        //                });
        //
        //                all.join();

    }
}
