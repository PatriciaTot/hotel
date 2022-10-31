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
