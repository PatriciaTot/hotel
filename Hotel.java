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
