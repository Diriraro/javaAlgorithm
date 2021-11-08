import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n4344 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int c = Integer.parseInt(br.readLine());
    
    for(int i=0; i<c; i++){
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      double sadArr = 0;
      int[] student = new int[n];
      for(int j=0; j<n; j++){
        student[j] = Integer.parseInt(st.nextToken());
        sadArr += student[j];
      }
      sadArr = sadArr/n;
      // System.out.println("sadArr "+sadArr);
      double upPeople=0;
      for(int j=0; j<n; j++){
        if(student[j]>sadArr){
          upPeople += 1;
        }
      }
      // System.out.println("upPeople "+upPeople);
      double sadAnswer = upPeople/n*100.0;
      // System.out.println("sadAnswer "+sadAnswer);
      sb.append(String.format("%.3f", sadAnswer)).append("%").append("\n");
      // sb.append(Math.round(sadAnswer*1000)/1000.0).append("%").append("\n");
    }
    System.out.print(sb);
  }
}
