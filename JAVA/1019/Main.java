import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);	
	
        int s, m, h;
        
        s = Integer.parseInt(in.readLine());
        
        h = s/3600;
        s = s - h*3600;
        m = s/60;
        s = s - m*60;       
        
        System.out.printf("%d:%d:%d\n", h, m, s);
    }
}