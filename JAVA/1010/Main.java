import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);
		
	String linha = in.readLine();
        
        String peca[] = linha.split(" ");     
        		
        Double valor = 0.00;
        
        valor = Double.parseDouble(peca[1]) * Double.parseDouble(peca[2]);
        
        //in.readLine();
        
        linha = in.readLine();
        
        peca = linha.split(" ");        
        
       valor = valor + Double.parseDouble(peca[1]) * Double.parseDouble(peca[2]);
	
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor );
        
	}
}