import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);	
	
        int x;        
        
        x = Integer.parseInt(in.readLine());       
        
        
        System.out.printf("%d minutos\n", x*2);
    }
}