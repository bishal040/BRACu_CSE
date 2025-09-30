public class StackAppTester {
    public static void main(String[] args) {

        String s = "[3+{2+(6-10*(3+4)}]";
        System.out.println("Checking: "+s);
        StackApps.parenthesisChecker(s);
        s = "3+{2+(6-10*(3+4)}]";
        System.out.println("Checking: "+s);
        StackApps.parenthesisChecker(s);
        s = "[3+{2+(6-10*3+4}]";
        System.out.println("Checking: "+s);
        StackApps.parenthesisChecker(s);
        s = "[3+{2*(3+4)}]";
        System.out.println("Checking: "+s);
        StackApps.parenthesisChecker(s);

    }
}
