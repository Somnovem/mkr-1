public class Main {
    public static void main(String[] args) {

        Message message = new TextMessage("Lorem ipsum dolor sit amet    ");
        System.out.println("Original Message: " + message.getContent());

        message = new CompressedMessage(message);
        System.out.println("Compressed Message: " + message.getContent());

        message = new TimestampedMessage(message);
        System.out.println("Timestamped Message: " + message.getContent());

        message = new AuthorMessage(message);
        System.out.println("Author Message: " + message.getContent());

        message = new EncryptedMessage(message);
        System.out.println("Encrypted Message: " + message.getContent());
    }
}