import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
						
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> p = new Stack<Integer>();
		
		String linha;
		String[] info;		
		int n, k, c, s, lt,x;
		int[] i = new int[1000010];
		int[] o = new int[1000010];		
				
		while (true) {
			linha = in.readLine();
			info = linha.split(" ");
			n = Integer.parseInt(info[0]);
			k = Integer.parseInt(info[1]);
			c = 0;
			s = 0;
			lt = 0;
			Arrays.fill(i, 0);
			Arrays.fill(o, 0);
			
			if (n == 0 && k == 0) {
                break;
            }
			
			for (x=1;x<=n;x++){
				linha = in.readLine();
				info = linha.split(" ");
				c = Integer.parseInt(info[0]);
				s = Integer.parseInt(info[1]);
				i[c] = x;
				o[s] = x;
				lt = Math.max(lt, s+1);			
			}		
			
			while (!p.empty()){
				p.pop();
			}
			
			for (x = 1; x < lt; x++){				
				if(o[x] > 0){
					if((p.empty()) || (p.peek() != o[x])) break;
					else p.pop();
				}				
				if(i[x] > 0){
					if((int)p.size() < k) p.push(i[x]);
					else break;
				}
			}
			
			if (x == lt) 
				System.out.println("Sim");
			else 
				System.out.println("Nao");				
		}
	}
}