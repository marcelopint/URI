import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);	
        
        String linha;
        
        String[] val;
        
        Double a, b, c;
        
        linha = in.readLine();
        
        val = linha.split(" ");
        
        a = Double.parseDouble(val[0]);
        b = Double.parseDouble(val[1]);
        c = Double.parseDouble(val[2]);        
        
        System.out.printf("TRIANGULO: %.3f\n", (a*c)/2 );
        System.out.printf("CIRCULO: %.3f\n", 3.14159 * Math.pow(c,2) );
        System.out.printf("TRAPEZIO: %.3f\n", ((a+b)*c)/2 );
        System.out.printf("QUADRADO: %.3f\n", b*b );
        System.out.printf("RETANGULO: %.3f\n", a*b );        
    }
}