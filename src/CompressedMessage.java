public class CompressedMessage extends MessageDecorator {

    public CompressedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return compressText(message.getContent());
    }

    private String compressText(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
}
