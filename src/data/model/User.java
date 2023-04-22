package data.model;

public class User {
   private int id;
   private String firstName;
   private String lastName;
   private String userName;
   private String passWord;
   private int menstrualCycleRange;
   private int firstPeriodDay;
   private int numberOfDays;


   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getPassWord() {
      return passWord;
   }

   public void setPassWord(String passWord) {
      this.passWord = passWord;

   }

   public int getFirstPeriodDay() {
      return firstPeriodDay;
   }

   public int getMenstrualCycleRange() {
      return menstrualCycleRange;
   }

   public void setMenstrualCycleRange(int menstrualCycleRange) {
      this.menstrualCycleRange = menstrualCycleRange;

   }

   public int getNumberOfDays() {
      return numberOfDays;
   }

   public void setNumberOfDays(int numberOfDays) {
      this.numberOfDays = numberOfDays;
   }

   public void setFirstPeriodDay(int firstPeriodDay) {
      this.firstPeriodDay = firstPeriodDay;
   }


}
