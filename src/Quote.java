import java.util.concurrent.CompletableFuture;

public class Quote {
    private final String name;
    private final int price;


    public Quote(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public CompletableFuture<Void> getQuote() {
        return CompletableFuture.runAsync(() -> {

            try {
                Thread.sleep((int) (Math.random() * 10) + 1);

                System.out.println(this);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }


    @Override
    public String toString() {
        return "Quote{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
