import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1110 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int i = 0;
    int temp = 0;

    if(n == 0) {
      System.out.println(1);
    }else {
      while (n != temp){
        if(i == 0) temp = n;
        i++;
        int a=0;
        int b=0;
        if(temp >= 10) a = temp/10;
        b = temp%10;
        
        temp = a+b;
        temp = temp%10;
        String kk = b+""+temp;
        temp = Integer.parseInt(kk);
      }
      System.out.println(i);
    }

  }
}
