import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);	
        		
        Double volume, raio;
        
        raio = Double.parseDouble(in.readLine());
        
        volume = ( 4.00/3 ) * 3.14159 * Math.pow(raio, 3);
	
        System.out.printf("VOLUME = %.3f\n", volume );
        
	}
}