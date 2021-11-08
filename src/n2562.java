import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2562 {
  public static void main(String[] args)throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringBuilder sb = new StringBuilder();

    int[] arr = new int[9];
    int ans = 0;
    int temp = 0;

    for (int i = 0; i < 9; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      if(i == 0){
        temp = arr[i];
      } else if (temp < arr[i]) {
        ans = i;
        temp = arr[i];
      }
    }

    System.out.println(temp);
    System.out.println(ans+1);

  }
}
