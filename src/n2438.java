import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2438 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    for(int i=1; i<=n; i++){
      sb.append("*");
      System.out.println(sb);
    }

    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // StringBuilder sb1 = new StringBuilder();
		// StringBuilder sb2 = new StringBuilder();

    // int n = Integer.parseInt(br.readLine());
    
		// for(int i = 0; i < n; i++){
		// 	sb1.append("*");
		// 	sb2.append(sb1+"\n");
		// }
		// System.out.println(sb2);

  }
}
