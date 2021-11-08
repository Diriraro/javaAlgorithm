import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2577 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    String k = a*b*c+"";
    String[] tempArr = k.split("");
    int[] ans = new int[10];

    for(int i=0; i<tempArr.length; i++) {
      switch (tempArr[i]) {
        case "0":
          ans[0]++;
          break;
        case "1":
          ans[1]++;
          break;
        case "2":
          ans[2]++;
          break;
        case "3":
          ans[3]++;
          break;
        case "4":
          ans[4]++;
          break;
        case "5":
          ans[5]++;
          break;
        case "6":
          ans[6]++;
          break;
        case "7":
          ans[7]++;
          break;
        case "8":
          ans[8]++;
          break;
        case "9":
          ans[9]++;
          break;
      }
    }

    for (int i : ans) {
      System.out.println(i);
    }

  }
}
