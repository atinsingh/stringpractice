import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
       int hour = 01;
       int minute = 01;
       int seconds = 50;
       String str2 = String.format("Time is %04d : %02d :%02d", hour, minute, seconds);
       String name =  "Himanshu";
       double balance = 5.0;
       String str3 = String.format("Dear %s , Your montly balance is $ %02f , your email is %s", name,balance,name );
       System.out.println(str3);

       if(str3.contains("Himanshu")) {
           System.out.println("Himanshu is in the string");
       }else {
           System.out.println("Not in string");
       }

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



}
