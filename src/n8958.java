import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n8958 {
  public static void main(String[] args)throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    String[] ans = new String[n];

    for(int i=0; i<n; i++){
      ans[i] = br.readLine();
      String[] tempArr = ans[i].split("");
      int tempAns = 0;
      int kk = 0;
      for(int j=0; j<tempArr.length; j++){
        if(tempArr[j].equals("O")){
          tempAns += 1;
        }else {
          tempAns = 0;
        }
        kk += tempAns;
      }
      sb.append(kk).append("\n");
    }

    System.out.print(sb);

  }
}
