public class Visitor {
    private String name;
    private String address;
    private String favoriteHotel;

    // Constructor
    public Visitor(String name, String address, String favoriteHotel) {
        this.name = name;
        this.address = address;
        this.favoriteHotel = favoriteHotel;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for favoriteHotel
    public String getFavoriteHotel() {
        return favoriteHotel;
    }
}
