import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);	
	
    int a;
	float b;  
        
        a = Integer.parseInt(in.readLine());
        b = Float.parseFloat(in.readLine());        
        
        System.out.printf("%.3f km/l\n", (a/b));
    }
}