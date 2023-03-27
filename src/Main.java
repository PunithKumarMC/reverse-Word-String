//Write a Java Program to Reverse Each Word of a String .
public class Main {
    public static void main(String[] args) {
        String sent = "Welcome to Mr.MC Code";
        String[] sen = sent.split(" ");
        String reverseSen = "";
        for (String word:sen) {
            StringBuilder sb = new StringBuilder(word);
            reverseSen += sb.reverse() +" ";
            System.out.println("Reversed Sentence "+reverseSen);
        }
    }
}