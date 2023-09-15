public class RoomManagement {

    RoomManagement() {
        ComputerRoom room = new ComputerRoom("Raum211", 10, true, 20);

        System.out.println("ComputerRoom: "+room.getName()+ " - "+room.getSeatCount()+ " - "+room.getSeatCount()+ " - "+room.getComputerCount());
    }
}