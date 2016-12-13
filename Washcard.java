public class Washcard
{
   private String serialId;
   private double balance;
   
   public Washcard(String serialId, double balance)
   {
      this.serialId = serialId;
      this.balance = balance;   
   }
   
      
   //methods to get and set variables
   public String getSerialId()
   {
      return serialId;
   }
   public void setSerialId(String serialId)
   {
      this.serialId = serialId;
   }
   
     
   public double getBalance()
   {
      return balance;
   } 
   public void setBalance(double balance)
   {
      this.balance = balance;
   }
   //end get and set methods---------------------  
      
   //method to check if funds are enough
   public boolean enoughFunds(double price)
   {
      return balance >= price;
   }
   
   //method to recharge washcard
   public double rechargeMoney(double amount)
   {
      return balance = balance + amount;
   }

   //method to withdraw money from washcard
   public double deductMoney(double amount)
   {
      return balance = balance - amount;
   }




}