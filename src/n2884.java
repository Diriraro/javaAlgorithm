import java.io.*;
import java.util.*;

public class n2884 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int hh, mm;
    hh = h;
    mm = m - 45;

    if(mm < 0){
      hh--;
      if(hh < 0){
        hh += 24;
      }
      mm += 60;
    }

    System.out.println(hh + " " + mm);

    // if(m >= 45){
    //   System.out.println( h + " " + (m-45) );
    // }else {
    //   if( h > 0 ) {
    //     System.out.println((h-1) + " " + (60-(45-m)));
    //   } else {
    //     System.out.println( "23 " + (60-(45-m)) );
    //   }
    // }
  }
}
