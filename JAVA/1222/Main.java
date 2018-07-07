import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
				
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String linha;
		
		int numPalavras, linhas, paginas, caracs, i;
		short maxLinhas, maxCarac;
		String[] palavra;
		String[] info;
		
		while ((linha = in.readLine()) != null) {
			linhas = 0;
			paginas = 0;
			caracs = 0;
			info = linha.split(" ");
			numPalavras = Integer.parseInt(info[0]);
			maxLinhas   = Short.parseShort(info[1]);
			maxCarac    = Short.parseShort(info[2]);

			linha = in.readLine();
			info = linha.split(" ");
			for (i = 0;i<numPalavras;i++){

				caracs += info[i].length();
				
				if (caracs == maxCarac){
					caracs = 0;
					linhas++;
				}
				else if (caracs > maxCarac){
					caracs = info[i].length() + 1;
					linhas ++;
				}
				else if (i < numPalavras){
					caracs++;
					if (caracs == maxCarac){
						caracs = 0;
						linhas++;
					}
				}
			
				if (linhas == maxLinhas){
					linhas = 0;
					paginas++;
				}
			}
		
			if ((linhas > 0) || (caracs>0)){
				paginas++;
			}		
			System.out.println(paginas);
		}
	}
}