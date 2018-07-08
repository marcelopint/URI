import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);	
	
        int x;
        
        x = Integer.parseInt(in.readLine());        
        
        System.out.printf("%d\n", x);
        System.out.printf("%d nota(s) de R$ 100,00\n", x/100);
        x = x - ((x/100)*100);
        System.out.printf("%d nota(s) de R$ 50,00\n", x/50);
        x = x - ((x/50)*50);
        System.out.printf("%d nota(s) de R$ 20,00\n", x/20);
        x = x - ((x/20)*20);
        System.out.printf("%d nota(s) de R$ 10,00\n", x/10);
        x = x - ((x/10)*10);
        System.out.printf("%d nota(s) de R$ 5,00\n", x/5);
        x = x - ((x/5)*5);
        System.out.printf("%d nota(s) de R$ 2,00\n", x/2);
        x = x - ((x/2)*2);
        System.out.printf("%d nota(s) de R$ 1,00\n", x);   
        
    }
}