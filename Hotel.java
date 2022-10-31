public class Hotel {

   private final String name;
   private final Status status;
   private Room[] rooms; 
     
   
   /** build an Hotel with given name, status and number of rooms
    * @param name this hotel's name
    * @param status this hotel' status
    * @param numberOfRooms number of rooms of this hotel
    */
   public Hotel(String name, Status status, int numberOfRooms) {
      this.name = name;
      this.status = status;
       this.rooms = new Room[numberOfRooms];
       for (int i=0; i < rooms.length ; i++) {
            rooms[i] = new Room(i+1);
       }
   }
   
   public String getName() {
      return this.name;
   }
   
   public Status getStatus() {
      return this.status;
   }

   /**  return the number of rooms for this hotel
    * @return the number of rooms for this hotel
    */
   public int numberOfRooms() {
      return rooms.length;
   }
   
   /** provide the room corresponding to given number, first room has number 1, 
    * number must not be greater than <code>this.numberOfRooms()</code>
    * @param number number of the room, from 1 to this.numberOfRooms()
    * @return the room with given number
    */
   public Room getRoom(int number) {
      return this.rooms[number-1];
   }
   
   /**  allows to rent a room in the hotel. 
    * @param number the number of the room to rent
    * @return rented room when possible, null if the requested room is already rented or if the room number is not valid
    */
   public Room rentRoom(int number) {
      if( number < 1 || number > numberOfRooms() || getRoom(number).isRent()) {
         return null;
      }
      getRoom(number).rent();
         return getRoom(number);
   }
   
   /** 
    * leave a rented room
    * @param number the number of the rented room if it's rented
    */
   public void leaveRoom(int number) {
       if (this.getRoom(number).isRent()) {
          this.getRoom(number).free() ;        
       }
   }
   
   /** 
    * return the number of free rooms
    * @return the number of free rooms
    */
   public int numberOfFreeRooms() {   
      int count =0;
      for(Room room : rooms) {
         if(!room.isRent()) {
            count++;
         }
      }
      return count;
    }
   
   /** 
    * return the smallest number of free room or 0 if none of the rooms are free
    * @return int the smallest number of free room or 0 if of the rooms are free
    */
   public int firstFreeNumber() {
      for (Room room : rooms) {
         if (!room.isRent()) {
            return room.getNumber();
         }
      }
      return 0;
   }

}
   
