## bool型のメソッドの定義
```
import java.util.Scanner;

public class work31 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int val = scan.nextInt();
    if (judge(val)) {
      System.out.println("偶数です");
    } else {
      System.out.println("奇数です");
    }

  }

  // 偶数奇数判定を行うbool型のメソッドの定義
  static boolean judge(int num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
```
### 入力
```
3
```
### 出力
```
奇数です
```