public class RunCarwash
{

   public static void main(String[] args)
   {      
      Customer customer1 = new Customer(10000); 

      Car car1 = new Car ("Volvo", "blue", "ABC 359");
      Car car2 = new Car ("Saab", "yellow", "ÅSA 321");
      
      Washcard washcard1 = new Washcard ("CWAW-2397", 1000);
      
      CarWash carWash1 = new CarWash ();
      
      //method to use for different cars
      carWash1.doneWashing(car1.getColor(), car1.getModel(), car1.getRegNo());      
      carWash1.doneWashing(car2.getColor(), car2.getModel(), car2.getRegNo());
      
      //test if it's enough funds on wash card
      boolean enough = washcard1.enoughFunds(300);
      System.out.println(enough);
      enough = washcard1.enoughFunds(3200);
      System.out.println(enough);

      // test balance after recharge
      System.out.println(washcard1.rechargeMoney(100));
      System.out.println(washcard1.getBalance());

      
      // test balance after purchase
      System.out.println(washcard1.deductMoney(100));
      System.out.println(washcard1.getBalance());
      
      //test wash purchase
      System.out.println("You have: " + washcard1.getBalance() + " on your wash card");
      System.out.println(carWash1.buyWash("Diamond wash", washcard1));
      System.out.println("Now you have: " + washcard1.getBalance() + " on your wash card");
   
   }
  
    
  
}