import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {


       
       //  Atin, Vivek, Veer, Ajay, Karan
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please provide the name as comma separated");
//        String str4 = scanner.nextLine();
//        String[] names = str4.split(",");
//
//        for(int i = 0 ; i< names.length ; i ++) {
//            System.out.println(greet(names[i]));
//        }


        String str5 =  "Hello Himanshu";
        System.out.println(StringUtils.reverse(str5));

        String str6 =  "        hello   how are you   ";
        String str7 = null;
        System.out.println(StringUtils.trim(str7));


    }
    public static String greet(String name){
        return  String.format("Hello %s, How are you doing today", name);
    }

    public String firstTwo(String str) {
        if(str.length()>2){
            return str.substring(0,2);
        }
        return str;
    }



}
