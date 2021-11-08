import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1546 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    double bigTemp = 0;
    // int bigTemp = 0;
    // int sumTemp = 0;
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
      if (bigTemp < arr[i]) bigTemp = arr[i];
      // sumTemp += arr[i];
    }
    // System.out.println(sumTemp*100.0/bigTemp/n);

    double sumTemp = 0;
    for(int i=0; i<n; i++) {
      double tt = (arr[i]/bigTemp*100);
      sumTemp = sumTemp + tt;
    }

    System.out.println(sumTemp/n);

  }
}
