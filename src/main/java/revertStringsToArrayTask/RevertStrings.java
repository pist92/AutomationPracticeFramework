package revertStringsToArrayTask;
public class RevertStrings {
    public static void main(String[] args) {

        String word = "TOPOR";
        String reversedWord = "";
        char ch;
        System.out.print("Original word: ");
        for (int i = 0; i < word.length(); i++)
        {
            ch= word.charAt(i);
            reversedWord= ch + reversedWord;
        }
        System.out.println("Reversed word: " + reversedWord);
    }
}