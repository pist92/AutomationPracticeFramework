package secondLengthString;

public class lengthString {

    public static void main(String[] args) {

        String[] words = {"Длинное слово", "Еще длиннее слово", "Самое длинное слово"};
        String[] longestWord = {"",""};

        for (int i=0;i<words.length;i++) {
            if (longestWord[0].equals("") || words[i].length() > longestWord[0].length()) {
                longestWord[1] = longestWord[0];
                longestWord[0] = words[i];
            }
            else if (longestWord[1].equals("") || words[i].length() > longestWord[1].length()) {
                longestWord[1] = words[i];
            }
        }
        System.out.println("Второе самое длинное слово в списке " + longestWord[1]);
    }
}
