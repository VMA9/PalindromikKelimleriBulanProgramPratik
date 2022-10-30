import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Palindromik Kelimeleri Bulan Program");
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String str = input.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " kelimesi bir palindromik kelimedir.");
        } else
            System.out.println(str + " kelimesi bir palindromik kelime değildir.");
        System.out.println("Program bitti ! ");
    }
}