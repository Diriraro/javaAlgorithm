import java.io.*;
import java.util.StringTokenizer;


public class n11022 {
  public static void main(String[] args)throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(br.readLine());

    for(int i=1; i<=t; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = a+b;
      sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(c).append("\n");
    }
    System.out.print(sb);

  }
}
