public class HelloWorld2 {
    public static void main(String[] args) {
        if(args.length == 0)
            System.out.println("No args shared.");
        else if (args.length > 0)
            System.out.println("You shared : " + args.length + " args.");
    }
}
