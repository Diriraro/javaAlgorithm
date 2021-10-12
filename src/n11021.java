import java.io.*;
import java.util.StringTokenizer;


public class n11021 {
  public static void main(String[] args)throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(br.readLine());

    for(int i=1; i<=t; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
    }
    System.out.print(sb);

    // for(int i=1; i<=t; i++){
    //   StringTokenizer st = new StringTokenizer(br.readLine());
    //   bw.write("Case #" + i + ": " + ( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ) + "\n");
    // }
    
    // bw.flush();
    // bw.close();
  }
}
