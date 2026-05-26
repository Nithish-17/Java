package regex;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Split {


    /*
    there are 3 types of split on a string in java
    1.StringTokenizer
    2.String.split()
    3.Pattern.split()
    */



    static void main() {
        String sentence = "http:www.google.com";


        //1.String Tokenizer -- old without regex

        StringTokenizer st1 = new StringTokenizer(sentence); // has 3 constructor single parameter default delimiter is space
        StringTokenizer st2 = new StringTokenizer(sentence, "."); //specify the delimiter
        StringTokenizer st3 = new StringTokenizer(sentence, ".",true); // includes the delimiter also

        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
        // disadvantage only one delimiter possible




        //2.String split --- using regex without compiling slow for repeated split

        String[] messages = sentence.split("\\.|:");
        System.out.println(Arrays.toString(messages));
        //can have multiple delimiter



        //3. Pattern split -- using compiled regex faster
        //same we can split using pattern with compiled regex with faster
        Pattern pattern = Pattern.compile("\\.|:");
        String[] patternMatches = pattern.split(sentence);
        System.out.println(Arrays.toString(patternMatches));

    }
}
