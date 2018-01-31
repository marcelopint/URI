import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        double a, b, c;
        
        a = Double.parseDouble(in.readLine());
        b = Double.parseDouble(in.readLine());
        c = Double.parseDouble(in.readLine());
        
        System.out.printf("MEDIA = %.1f\n", (((a*2.0) + (b*3.0) + (c*5.0))/10));        
    }    
}