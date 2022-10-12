import java.util.Scanner;


public class Main {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word1 = scan.nextLine();
        int word1Length = word1.length();
        System.out.println("\nThe length of your string is " + word1Length);
        int index = word1Length/2;
        System.out.println("The first half of your string is: "+ word1.substring(0,index));
        System.out.println("The second half of your string is: " + word1.substring(index));

        System.out.println("Enter a second string");
        String word2 = scan.nextLine();
        int word2Length = word2.length();

        if (word1Length > word2Length){
            System.out.println(word1 + " is longer.");
        } else if (word2Length > word1Length){
            System.out.println(word2 + " is longer.");
        } else {
            System.out.println("They are the same length.");
        }

        if (word1.equals(word2)){
            System.out.println("These words are the same.");
        } else if (word1.compareTo(word2)<0){
            System.out.println(word1 + " is first alphabetically.");
        } else {
            System.out.println(word2 + " is first alphabetically.");
        }

        int index1 = word1.indexOf(word2);
        if (index1 != -1){
            System.out.println(word2 + " is found in " + word1 + " at index " + index1);
        } else {
            System.out.println(word2 + " was not found in " + word1);
        }
    }
}
