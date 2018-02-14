import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);
		
	String nome = in.readLine();
		
	Double sal = Double.parseDouble( in.readLine() );
        Double total = Double.parseDouble ( in.readLine() );
        
        System.out.printf("TOTAL = R$ %.2f\n", sal + (total * 0.15));
        
	}
}