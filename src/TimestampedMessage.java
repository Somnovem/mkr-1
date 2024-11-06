import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampedMessage extends MessageDecorator {

    public TimestampedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {

        return addTimestamp() + message.getContent();

    }

    private String addTimestamp() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentTimestamp = sdf.format(new Date());
        return "(" + currentTimestamp + ") ";

    }
}
