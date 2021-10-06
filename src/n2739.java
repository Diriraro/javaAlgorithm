

import java.io.*;

public class n2739 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for(int i=1; i<10; i++){
      System.out.println(n + " * " + i + " = " + n*i);
    }
  }
}
