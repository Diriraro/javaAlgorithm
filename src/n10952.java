import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10952 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    while (a != 0 && b != 0) {
      sb.append(a + b).append("\n");
      st = new StringTokenizer(br.readLine());
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
    }
    
    System.out.print(sb);
  }
}
