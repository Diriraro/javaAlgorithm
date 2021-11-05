import java.util.Scanner;

public class n10951 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNext()){
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a + b);
    };

    sc.close();
  }
}

// import java.io.*;
// import java.util.*;
// public class Main {
//     public static void main(String args[]) throws IOException {
        
//     	StringBuilder sb = new StringBuilder();
//     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st;
//         String str;
    	
//     	while((str=br.readLine()) != null) {
//             st = new StringTokenizer(str, " ");
//     		int a = Integer.parseInt(st.nextToken());
//         	int b = Integer.parseInt(st.nextToken());	
        
//         	sb.append((a+b)+"\n");
        	
//     	}
//     	System.out.print(sb);
        
// 	}
// }
