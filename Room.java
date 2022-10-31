public class Room {

   private static final String LABEL = "Room ";
   
   private final int number;
   private boolean rent;
   
   public Room(int number) {
      this.number = number;
      this.rent = false;
   }

   public int getNumber() {
      return this.number;
   }
  
   public boolean isRent() {
      return this.rent;
   }
   
   public void rent() {
      this.rent = true;
   }
   
   public void free() {
      this.rent = false;
   }
   
   public String toString() {
      return Room.LABEL + this.number;
   }
   
   public boolean equals(Object o) {
      if (! (o instanceof Room))
         return false;
      Room other = (Room) o;
      return other.number == this.number;
   }
}
