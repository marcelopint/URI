import java.io.*;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static final String[] ALFABETO = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        int count;
        String s;
        while (n-- > 0) {
            count = 0;
            s = in.readLine();
            for (String letter : ALFABETO) {
                if (s.contains(letter)) {
                    count++;
                }
            }
            if (count == 26) {
                System.out.println("frase completa");
            } else if (count > 12) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }
    }
}