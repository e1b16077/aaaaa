### 1. キーボードから入力をint型で受け取る方法
```
import java.util.Scanner;

class work31{
  public static void main(String args[]){

    Scanner scan = new Scanner(System.in);
    int val = scan.nextInt();
    System.out.println("入力された値は" + val + "です");
  }
}
```
##### 入力
```
5
```
##### 出力
```
入力された値は5です
```
### 2. 商、余りを求める方法
```
class work31 {
  public static void main(String args[]) {
    // 500を6で割った商を求める
    System.out.println(500 / 6);

    // 500を6で割った余りを求める
    System.out.println(500 % 6);
  }
}
```
出力
```
83
2
```