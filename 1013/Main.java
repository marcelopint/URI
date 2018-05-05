import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);	
        
        String linha;
        
        String[] val;
        
        int a, b, c, MaiorAB;
        
        linha = in.readLine();
        
        val = linha.split(" ");
        
        a = Integer.parseInt(val[0]);
        b = Integer.parseInt(val[1]);
        c = Integer.parseInt(val[2]);
        
        MaiorAB = (a + b + Math.abs(a-b))/2;
        
        MaiorAB = (MaiorAB + c + Math.abs(MaiorAB-c))/2;
        
        System.out.printf("%d eh o maior\n", MaiorAB);
    }
}