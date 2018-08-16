package Collection;

/**
 * Created by madhu on 5/25/2017.
 */
public class Messanger {
    public static void main(String[] args) {
        String message = "";

        try {
            Messanger.sendMessage(message);
        } catch (EmptyMessageException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sendMessage(String message)
        throws EmptyMessageException {
            if (message == null || message.equals("")) {
                throw new EmptyMessageException("sorry");
            } else {
                System.out.println("success");
            }
        }

    }


