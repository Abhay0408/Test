//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int a=5;
        int total=0;
        for(int j = 1; j <= 5; j++) {
            total += a;
        }
        System.out.println(total);
        System.out.println(total+a);
        System.out.println(a);
        System.out.println(a+5);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 5; j++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
                System.out.println("Hello World");
                System.out.println(j);
            }
        }
    }
}