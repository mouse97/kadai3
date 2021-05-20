package kadai3;

public class kadai3 {
  public static void main(String[] args) {
	/*九九のの左側の数値を1から9まで行えるようにleft+1を繰り返し行えるようにする*/
    for ( int left=1;left< 9;left++) {
      /*九九のの右側の数値を1から9まで行えるように+1を繰り返し行えるようにする*/
	  for ( int right=1;right<= 9;right++) {
	    /*rightの出力とleftの出力をかけてanswerに結果を出力出来るようにする*/
	    int answer=left*right;
	      /*文字列を３桁にし計算結果で出力された数値の位を整える*/
	      System.out.print(String.format("%3d",answer));
	  }
	      /*1から９まで繰り返しが終了時改行させる*/
          System.out.println();
          System.out.println("git");
    }
  }
}