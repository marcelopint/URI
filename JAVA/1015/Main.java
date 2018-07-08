import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);	
	
        float x1, x2, y1, y2;
        Double result;  
        
        String linha;
        String[] val;
        
        linha = in.readLine();
        
        val = linha.split(" ");
        
        x1 = Float.parseFloat(val[0]);
        y1 = Float.parseFloat(val[1]);
        
        linha = in.readLine();
        
        val = linha.split(" ");
        
        x2 = Float.parseFloat(val[0]);
        y2 = Float.parseFloat(val[1]);        
        
        result = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        
        System.out.printf("%.4f\n", result);
    }
}