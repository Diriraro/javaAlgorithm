import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n3052 {
  public static void main(String[] args)throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] kk = new String[10];
    for(int i=0; i<10; i++){
      kk[i] = (Integer.parseInt(br.readLine())%42)+"";
    }

    String[] resultArr = Arrays.stream(kk).distinct().toArray(String[]::new);

    System.out.println(resultArr.length);

  }
}
