import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {
    private String name;
    private List<Room> rooms;

    // Constructor
    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        // Initialize 50 rooms in the hotel
        for (int i = 1; i <= 50; i++) {
            rooms.add(new Room(i, (i - 1) / 10 + 1)); // 10 rooms per floor
        }
    }

    // Method to check in a visitor
    public Room checkIn(Visitor visitor) {
        Random random = new Random();
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        if (!availableRooms.isEmpty()) {
            Room assignedRoom = availableRooms.get(random.nextInt(availableRooms.size()));
            assignedRoom.setAvailable(false);
            assignedRoom.setOccupant(visitor);
            return assignedRoom;
        } else {
            System.out.println("No available rooms!");
            return null;
        }
    }

    // Method to check out a visitor
    public void checkOut(Room room) {
        if (room != null) {
            room.clearRoom();
            System.out.println("Room " + room.getRoomNumber() + " is now available.");
        }
    }
}
