//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    byte c;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean b;
    char ch;

    //Reference Type
    String str;

    public void printDefaultValues(){
        System.out.println(c); // 0
        System.out.println(s); // 0
        System.out.println(i); // 0
        System.out.println(l); // 0l
        System.out.println(f); // 0.0f
        System.out.println(d); // 0.0
        System.out.println(b); // false
        System.out.println(ch); // '\u0000'
        System.out.println(str); // null
    }


    public static void main(String[] args) {
        Main m = new Main();
        m.printDefaultValues();
    }
}