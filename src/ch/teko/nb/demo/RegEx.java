package src.ch.teko.nb.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        test_group();

    }

    static private void test_group() {
        final String regex = "(^[a-zA-Z]{3})\\s(\\d{4})";
        final String search = "Jan 1987 \nMay 1969 \nAug 2022";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(search);

        while (matcher.find()) {
            System.out.println("full match: " + matcher.group(0));
            for (int idx = 1; idx <= matcher.groupCount(); idx++) {
                System.out.println("group number " + idx + ": " + matcher.group(idx));
            }
        }
    }

    static private void demo() {
        //1st way5
        Pattern p = Pattern.compile(".{3}\\."); //. represents single character
        Matcher m = p.matcher("cat.");
        boolean b = m.matches();
        System.out.println(b ? "match" : "no match");

        //2nd way
        boolean b2 = Pattern.compile("[cmf]..").matcher("can").matches();

        //3rd way
        boolean b3 = Pattern.matches("...", "as");
        System.out.println(b + " " + b2 + " " + b3);
    }
}
