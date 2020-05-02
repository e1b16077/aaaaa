import java.util.Scanner;


class kadai1{
   public static void main(String[] args){

     Scanner scan = new Scanner(System.in);

    int entry_amount = scan.nextInt();

     System.out.println("投入金額は" + entry_amount + "円です");

      if(entry_amount == 160){
         System.out.println("ドリンクが購入できました【お釣りなし】");
      }else if(entry_amount > 160){
         System.out.println("ドリンクが購入できました【お釣りあり】");
         int change = entry_amount - 160;
         System.out.println("お釣りは" + change + "円です");
         System.out.println("500円硬貨：" + (change / 500) + "枚");
         change = change % 500;
         System.out.println("100円硬貨：" + (change / 100) + "枚");
         change = change % 100;
         System.out.println(" 50円硬貨：" + (change /  50) + "枚");
         change = change % 50;
         System.out.println(" 10円硬貨：" + (change /  10) + "枚");
      }else{
         System.out.println("金額が足りません");
      }

   }
}
