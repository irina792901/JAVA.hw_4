import java.util.Stack;

/**
 * Написать программу, определяющую правильность расстановки
 * скобок в выражении.
 * <p>
 * a+(d*3) - истина
 * \[a+(1*3) - ложь
 * \[6+(3*3)] - истина
 * {a}\[+\]{(d*3)} - истина
 * <{a}+{(d*3)}> - истина
 * {a+]}{(d*3)} - ложь
 */
public class Checking_brackets {
    public static void main(String[] args) {
        check_brackets("a+(d*3)");
        check_brackets("\\[a+(1*3)");
        check_brackets("[6+(3*3)]");
        check_brackets("{a}\\[+\\]{(d*3)}");
        check_brackets("<{a}+{(d*3)}>");
        check_brackets("{a+]}{(d*3)}");
    }

    private static void check_brackets(String s) {
        String result = "истина";
        String coll_brakets = "[](){}<>";
        Stack<Character> pocket = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < coll_brakets.length(); j++) {
                if (s.charAt(i) == (coll_brakets.charAt(j))) {
                    if (j % 2 == 0) pocket.push(coll_brakets.charAt(j + 1));
                    else {
                        if (!pocket.isEmpty() && s.charAt(i) != pocket.pop()) result = "ложь";
                        break;
                    }
                }
            }
        }
        if (!pocket.isEmpty()) result = "ложь";
        System.out.println(s + "- " + result);
    }
}