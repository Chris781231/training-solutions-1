package finalmodifier;

public class Gentleman {
    public final String MESSAGE_PREFIX = "Hello ";

    public String sayHello(String name) {
        return MESSAGE_PREFIX + name;
    }
}
