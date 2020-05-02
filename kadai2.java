class kadai2{
   public static void main(String[] args){

     int[] numbers = {21,54,19,68,49,37,3,15,34,6};

      int min = numbers[0];
      for(int i = 1; i < numbers.length; i++){
        if(min > numbers[i]){
           min = numbers[i];
        }
      }
      System.out.println(min);
   }
}
