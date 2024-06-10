package mailService;

public class Mailing {


    public static void main(String[] args) {
        var service = new MailService();

        service.sendAsync();

        System.out.println("Hello world");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
