public class Car
{
   private String model;
   private String color;
   private String regNo;
      
   public Car (String model, String color, String regNo)
   {
      this.model = model;
      this.color = color;
      this.regNo = regNo;
   }

// get and set methods for all variables
   public String getModel()
   {
      return model;
   }
   public void setModel(String model)
   {
      this.model = model;
   }
   
   public String getColor()
   {
      return color;
   }
   public void setColor(String color)
   {
      this.color = color;
   }
   
   public String getRegNo()
   {
      return regNo;
   }
   public void setRegNo(String regNo)
   {
      this.regNo = regNo;
   }
   
//end get and set methods-------------------





}