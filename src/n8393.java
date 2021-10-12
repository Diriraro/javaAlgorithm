import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n8393 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int sum = 0;
    for(int i=n; i>=0; i--){
      sum += i;
    }

    System.out.println(sum);
  }
  
}
