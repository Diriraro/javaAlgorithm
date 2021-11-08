import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10818 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];

    st = new StringTokenizer(br.readLine());
    int min = 0;
    int max = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      if(i==0) {
        min = arr[i];
        max = arr[i];
      }
      else {
        if(arr[i] < min) min = arr[i];
        if(arr[i] > max) max = arr[i];
      }
    }
    System.out.println(min+" "+max);


  }
}
