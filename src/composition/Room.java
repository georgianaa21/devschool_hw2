package composition;

import java.util.*;

public class Room {
    private float surface;
    private float height;
    private int floor;
    private List<Furniture> furniture = new ArrayList<Furniture>();
    private Address address;

    public Room(float surface, float height, int floor, Address address) {
        this.surface = surface;
        this.height = height;
        this.floor = floor;
        this.address = address;
    }

    public void addFurniture(Furniture object) {
        this.furniture.add(object);
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public List<Furniture> getFurniture() {
        return furniture;
    }

    public void setFurniture(List<Furniture> furniture) {
        this.furniture = furniture;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String out = "Room{" +
                "surface=" + surface +
                ", height=" + height +
                ", floor=" + floor + "\n" +
                address.toString() + "\n";
        for(Furniture piece : furniture) {
            out += piece.toString() + "\n";
        }
        return out;
    }

    public Furniture getPiece(int index) {
        if(index >= 0 && index < furniture.size()){
            return furniture.get(index);
        }
        else {
            System.out.println("Index out of bounds!");
            return null;
        }
    }

    public String getPieceName(int index){
        if(index >= 0 && index < furniture.size()){
            return furniture.get(index).getPiece();
        }
        else {
            System.out.println("Index out of bounds!");
            return null;
        }
    }

    public String getPieceProducer(int index){
        if(index >= 0 && index < furniture.size()){
            return furniture.get(index).getProducer();
        }
        else {
            System.out.println("Index out of bounds!");
            return null;
        }
    }

    public float getPiecePrice(int index) {
        if(index >= 0 && index < furniture.size()){
            return furniture.get(index).getPrice();
        }
        else {
            System.out.println("Index out of bounds!");
            return -1;
        }
    }

    public String getStreet() {
        return this.address.getStreet();
    }

    public String getCity() {
        return this.address.getCity();
    }
}
