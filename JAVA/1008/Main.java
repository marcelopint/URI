import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int a, b;
        double c;
        
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());
        c = Double.parseDouble(in.readLine());        
        
        System.out.printf("NUMBER = %d\n", a);
        System.out.printf("SALARY = U$ %.2f\n", (b * c));
    }
}