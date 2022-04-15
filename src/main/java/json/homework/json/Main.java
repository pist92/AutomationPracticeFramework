package json.homework.json;

public class Main {

    public static void main(String[] args) {

        JSONSimplerParser parser = new JSONSimplerParser();
        Root root = parser.parse();
        System.out.println("Root " + root.toString());
    }
}
