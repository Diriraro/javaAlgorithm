
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;
import java.util.*;

public class n2588 {
  public static void main(String[] args) throws Exception{
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer st = new StringTokenizer(br.readLine());
    Scanner sc = new Scanner(System.in);

    // int a = Integer.parseInt(st.nextToken());
    // int b = Integer.parseInt(st.nextToken());

    // int a = Integer.parseInt(br.readLine());
    // int b = Integer.parseInt(br.readLine());

    int a = sc.nextInt();
    int b = sc.nextInt();

    int b1    = b%10;
    int b10   = (b-b1)%100/10;
    int b100  = b/100;

    System.out.println(a*b1);
    System.out.println(a*b10);
    System.out.println(a*b100);
    System.out.println( (a*b1) + (a*b10*10) + (a*b100*100) );

    sc.close();
    
  }
}
