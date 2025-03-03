public class Room {
    private int roomNumber;
    private int floorNumber;
    private boolean isAvailable;
    private Visitor occupant;

    // Constructor
    public Room(int roomNumber, int floorNumber) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.isAvailable = true; // Initially, all rooms are available.
    }

    // Getter and Setter for isAvailable
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Getter and Setter for occupant
    public Visitor getOccupant() {
        return occupant;
    }

    public void setOccupant(Visitor occupant) {
        this.occupant = occupant;
    }

    // Getter for roomNumber
    public int getRoomNumber() {
        return roomNumber;
    }

    // Getter for floorNumber
    public int getFloorNumber() {
        return floorNumber;
    }

    // Method to clear room when a visitor checks out
    public void clearRoom() {
        this.isAvailable = true;
        this.occupant = null;
    }
}

