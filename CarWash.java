public class CarWash
{
   private double priceDiamond;
   private double priceGold;
   private double priceSilver;
   private double priceBronze;
   private String washDiamond;
   private String washGold;
   private String washSilver;
   private String washBronze;
   
   
   //empty constructor that set values for all variables. (values can be changed via set method) 
   public CarWash()
   {
      this.priceDiamond = 500.0;
      this.priceGold = 400.0;
      this.priceSilver = 300.0;
      this.priceBronze = 200.0;
      
      this.washDiamond = "Diamond wash";
      this.washGold = "Gold wash";
      this.washSilver = "Silver wash";
      this.washBronze = "Bronze wash";
      
   }
   
   
   // get- and set methods to all variables (wash programs)
   
   public double getPriceDiamond()
   {
      return priceDiamond;
   }
   public void setPriceDiamond(double priceDiamond)
   {
      this.priceDiamond = priceDiamond;
   }

   public double getPriceGold()
   {
      return priceGold;
   } 
   public void setPriceGold(double priceGold)
   {
      this.priceGold = priceGold;
   }
   
   public double getPriceSilver()
   {
      return priceSilver;  
   }
   public void setPriceSilver(double priceSilver)
   {
      this.priceSilver = priceSilver;
   }
   
   public double getPriceBronze()
   {
      return priceBronze;
   }
   public void setPriceBronze(double priceBronze)
   {
      this.priceBronze = priceBronze;
   }
   
      
   //get and set String values
   public String getWashDiamond()
   {
      return washDiamond;
   }
   public void setWashDiamond(String washDiamond)
   {
      this.washDiamond = washDiamond;
   }

   
   public String getWashGold()
   {
      return washGold;
   } 
   public void setWashGold(String washGold)
   {
      this.washGold = washGold;
   }
   
   
   public String getWashSilver()
   {
      return washSilver;  
   }
   public void setWashSilver(String washSilver)
   {
      this.washSilver = washSilver;
   }
   
   
   public String getWashBronze()
   {
      return washBronze;
   }
   public void setWashBronze(String washBronze)
   {
      this.washBronze = washBronze;
   }

   //end get- and set methods-----------------------------
   
   
   //buy a wash 
   public String buyWash(String washType, Washcard card)
   {
     if (washType.equals(washDiamond))
     {
      if (card.enoughFunds(priceDiamond))
      {
         card.deductMoney(priceDiamond);
         return "You have now purchased the Diamond Super Shine Fabulous Wash.";
      }
      else 
      {
         return "You don't have enough money on your card. Please recharge your card.";
      }  
     }  
      else if (washType.equals(washGold))
      {
        if (card.enoughFunds(priceGold))
        {
         card.deductMoney(priceGold);
         return "You have now purchased the Gold Super Shine Fabulous Wash.";
        }
         else 
         {
            return "You don't have enough money on your card. Please recharge your card.";
         }  

      }
       else if (washType.equals(washSilver))
      {
         if (card.enoughFunds(priceSilver))
         {
            card.deductMoney(priceSilver);
            return "You have now purchased the Silver Super Shine Fine Wash.";
         }
         else 
         {
            return "You don't have enough money on your card. Please recharge your card.";
         }  

      }
         else if (washType.equals(washBronze))
         {
            if (card.enoughFunds(priceBronze))
            {
               card.deductMoney(priceBronze);
               return "You have now purchased the Bronze Super Shine Wash.";
            }
            else 
            {
               return "You don't have enough money on your card. Please recharge your card.";
            } 
            
            }
               return "Sorry, we don't have " + washType + " please choose another alternative.";
  
   }
   
   /*public double maxRecharge (double balance, Washcard card)
   {
      if (balance + recharg >= 1000)
   }*/
   
   //method for telling which car is done washing
   public void doneWashing(String carColor, String carModel, String regNo)
  {
      System.out.println("I have washed a " + carColor + " " + carModel + ", registration number: " + regNo);
  }

   
}