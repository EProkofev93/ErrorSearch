import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String text = "WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";
        int num = 0;
        String[] a = text.split(" ");
        for (String s : a) {


            if (Pattern.matches(".*?Error", s)) {
                num++;

                System.out.println(num+ ") " + s);
            }
        }
    }
}