import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2439 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String star = "*";
    String space = " ";

    for(int i=1; i<=n; i++){
      for(int j=n; j>0; j--){
        if(j <= i){
          System.out.print(star);
        } else {
          System.out.print(space);
        }
      }
      System.out.println();
    }

  }
}
