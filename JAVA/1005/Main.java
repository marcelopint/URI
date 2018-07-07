import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        double a, b;
        
        a = Double.parseDouble(in.readLine());
        b = Double.parseDouble(in.readLine());        
        
        System.out.printf("MEDIA = %.5f\n", (((a*3.5) + (b*7.5))/11));        
    }    
}