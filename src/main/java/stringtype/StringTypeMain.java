package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name + 444;
        boolean b = (message.equals("Hello John Doe"));
        boolean c = (message.equals("Hello John Doe444"));
        String conkat = "" + "";
        System.out.println(conkat.length());

        System.out.println("abcde".length());
    }
}
