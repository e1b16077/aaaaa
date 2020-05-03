## メソッドの定義の方法
```
import java.util.Scanner;

public class work31 {
  public static void main(String[] args) {
    // System.out.println("Hello World!");
    Scanner scan = new Scanner(System.in);
    int val = scan.nextInt();
    val_print(val);
  }

  // 入力されたものを整数と結合して出力するメソッド
  static void val_print(int size) {
    System.out.println("入力は" + size + "です");
  }
}
```

### 入力
```
6
```
### 出力
```
入力は6です
```
