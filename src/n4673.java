public class n4673 {
  static boolean[] allArr = new boolean[10001];
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) {
    // 다른분이 사용한 방법
    for(int i=1; i<10001; i++){
      int n = getSelfNum(i);

      if(n < 10001){	
				allArr[n] = true;
			}
    }

    for(int j=1; j<10001; j++){
      if(!allArr[j]) sb.append(j).append("\n");
    }
  
    System.out.print(sb);
  }

  static int getSelfNum(int number){
		int sum = number;
    
		while(number != 0){
			sum = sum + (number % 10); 
			number = number/10;	
		}

    return sum;
  }
}

// public static void main(String[] args) {
//   // true 면 셀프 넘버가 아님
//   allArr[0] = true;
//   int i =1;
//   while( i != 10001){
//     getSelfNum(i);
//     i++;
//   }

//   for(int j=0; j<10001; j++){
//     if(!allArr[j]) sb.append(j).append("\n");
//   }

//   System.out.print(sb);
// }

// static void getSelfNum(int n){
//   if(n < 10){
//     int k = n + n;
//     allArr[k] = true;
//   }else {
//     String numTemp = n+"";
//     String[] temp = numTemp.split("");
//     int splitNum = 0;
//     for(String tt : temp){
//       splitNum += Integer.parseInt(tt);
//     }
//     int k = splitNum + n;
//     if(k > 10000) return;
//     allArr[k] = true;
//   }
// }
// }
