package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    static void main() {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
        example8();
        example9();
        example10();
        example11();
        example12();
        example13();
        example14();
        example15();
        example16();
        example17();
        example18();
        example19();
        example20();
        example21();
        example22();
        example23();
        example24();
        example25();



    }



    private static void example1() {
        System.out.println("----example1----");
        String message = "cat bat rat mat";
        String regex = "cat|bat";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example2() {
        System.out.println("----example2----");
        String message = "cat bat rat mat";
        String regex = ".at";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example3() {
        System.out.println("----example3----");
        String message = "apple ape april";
        String regex = "ap";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example4() {
        System.out.println("----example4----");
        String message = "abc123xyz45hello9";
        String regex = "\\d"; // or [0-9]
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example5() {
        System.out.println("----example5----");
        String message = "abc123xyz45hello9";
        String regex = "\\d+"; // or [0-9]
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }

    private static void example6() {
        System.out.println("----example6----");
        String message = "hello world_123 @java regex99";
        String regex = "\\w";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example7() {
        System.out.println("----example7----");
        String message = "hello world_123 @java regex99";
        String regex = "\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example8() {
        System.out.println("----example8----");
        String message = "hello   world    java";
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example9() {
        System.out.println("----example9----");
        String message = "hello   world    java";
        String regex = "\\S";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example10() {
        System.out.println("----example10----");
        String message = "hello   world    java";
        String regex = "\\S+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private  static void example11() {
        System.out.println("----example11----");
        String message = "hello regex java";
        String regex = "[aeiou]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example12() {
        System.out.println("----example12----");
        String message = "a1b2c3@9";
        String regex = "[^0-9]"; //inside [] character class it is not
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example13() {
        System.out.println("----example13----");
        String message = "12 456 89 7 9991";

        String regex1 = "[0-9]{2}";
        String regex2 = "[0-9]{3,4}"; // it represent min to max size and also this is greedy
                                        // [0-9]{3,4}? ---- for lazy min size

        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);

        Matcher matcher1 = pattern1.matcher(message);
        Matcher matcher2 = pattern2.matcher(message);

        while(matcher1.find()) {
            System.out.println(matcher1.group());
        }

        while(matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }

    private static void example14() {
        System.out.println("----example14----");
        String message = "a aa aaa b aaaa";
        String regex1 = "a+"; // these 3 regex are also called as greedy checks for max possibility
        String regex2 = "a*";
        String regex3 = "a?";

       /* String regex1 = "a+?";
        String regex2 = "a*?"; // this is lazy
        String regex3 = "a+?";*/

        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Pattern pattern3 = Pattern.compile(regex3);

        Matcher matcher1 = pattern1.matcher(message);
        Matcher matcher2 = pattern2.matcher(message);
        Matcher matcher3 = pattern3.matcher(message);


        while(matcher1.find()) {
            System.out.println(matcher1.group());
        }

        while(matcher2.find()) {
            System.out.println(matcher2.group());
        }

        while(matcher3.find()) {
            System.out.println(matcher3.group());
        }

    }

    private static void example15() {
        System.out.println("----example15----");
        String message = "color colour colouur";
        String regex = "colou?r";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example16() {
        System.out.println("----example16----");
        String message = "<tag>Hello</tag><tag>World</tag>"; // this is greedy
        //String regex = "<tag>.*</tag>";
        String regex = "<tag>.*?</tag>"; // for lazy
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }

    private static void example17() {
        System.out.println("----example17----");
        String message = "Hello World";
        String regex = "^H.*d$"; // must start and end with H and d
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example18() {
        System.out.println("----example18----");
        String message = "cat cats concatenate bobcat";
        String regex = "\\bcat\\b"; // only matches cat word only before and after only space so we use \\b on both side

        /*
            \\bcat\\b --  (cat only be the word)
            \\bcat    --  (cat at start of the word)
            cat\\b    --  (cat at end of the word)

            \\Bcat\\B -- (cat is neither begin nor end)
            \\Bcat    -- cat should not on beginning
            cat\\B    -- cat should not be on end

       */

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example19() {
        System.out.println("----example19----");
        String message = "abc-123";
        String regex = "([a-z]+)-(?<digit>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group("digit"));
        }
    }

    private static void example20() {
        System.out.println("----example20----");
        String message = "abc123";
        String regex = "((abc)(123))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }

    private static void example21() {
        System.out.println("----example21----");
        String message = "hello hello hello this is is nithiesh";
        String regex = "(\\w+)\\s+\\1"; // it says match the first group once
        // if you use \\2 that means repeat second group so you need group 2 also
        // like if hello hello hello --- hello is group 1 and hello is matched ------- and 3 rd hello is second iteration group 1 and no match

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
        }

        //group(0) have matched word
        //group(1) have captured word
        // initially group(1) captured hello then finally whole regex matched was stored on group(0)
    }

    private static void example22() {
        System.out.println("----example22----");
        //positive lookahead
        String message = "50kg 20kg 99m 75kg";
        // ?=
        String regex = "\\d+(?=kg)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private  static void example23() {
        System.out.println("----example23----");
        //negative lookahead
        String message = "100$ 200₹ 300$";
        // ?!
        String regex = "\\b\\d+(?!\\$)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example24() {
        System.out.println("----example24----");
        //positive look behind
        // ?<=
        String message = "$100 ₹200 $500";
        String regex = "(?<=\\$)\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void example25() {
        System.out.println("----example25----");
        //negative look behind
        // ?<!
        String message = "$100 ₹200 $500";
        String regex = "\\b(?<!\\$)\\d+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }



}