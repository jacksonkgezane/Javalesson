import java.util.Scanner;

public class javalessons {
    
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Strings");
        String Word1 = sc.nextLine();
        String Temp = "";
        String subString2 = Word1.substring(Word1.length() - 4 );
        String substring1 = Word1.substring(0 , Word1.length() - 4);
        String results = "";
        
      

        //subString(beginIndex,endIndex):

       System.out.println(Word1.substring(4 , 9)); 

       //subString(bedinIndex)

       System.out.println(Word1.substring(8));

       //My Password is Jackson1992: ########1992

       for (int i = 0; i < substring1.length(); i++) {

        Temp += "#";

       }


       results = Temp + subString2;

       System.out.println("The password is: "+results);
       






        
    }
    
}
