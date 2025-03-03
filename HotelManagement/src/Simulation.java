import java.util.Random;

public class Simulation {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Grand City Hotel");
        Random random = new Random();

        for (int i = 1; i <= 20; i++) {
            // Create a random visitor
            Visitor visitor = new Visitor("Visitor " + i, "Address " + i, "Grand City Hotel");

            // Check in the visitor
            Room assignedRoom = hotel.checkIn(visitor);
            if (assignedRoom != null) {
                System.out.println(visitor.getName() + " checked into Room " + assignedRoom.getRoomNumber() +
                        " on Floor " + assignedRoom.getFloorNumber());
            }

            // Simulate check out after some operations
            if (assignedRoom != null && random.nextBoolean()) { // Randomly decide to check out
                hotel.checkOut(assignedRoom);
            }
        }
    }
}
