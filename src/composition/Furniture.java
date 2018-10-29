package composition;

public class Furniture {
    private String piece;
    private String producer;
    private float price;

    public Furniture(String piece, String producer, float price) {
        this.piece = piece;
        this.producer = producer;
        this.price = price;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "piece='" + piece + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }
}
