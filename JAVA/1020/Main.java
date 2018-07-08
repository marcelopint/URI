import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);	
	
        int a, m, d;
        
        d = Integer.parseInt(in.readLine());
        
        a = d/365;
        d = d - a*365;
        m = d/30;
        d = d - m*30;       
        
        System.out.printf("%d ano(s)\n", a);
        System.out.printf("%d mes(es)\n", m);
        System.out.printf("%d dia(s)\n", d);
    }
}