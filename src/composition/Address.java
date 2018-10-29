package composition;

public class Address {
    private String street;
    private int number;
    private String city;
    private String county;
    private String country;

    public Address(String street, int number, String city, String county, String country) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.county = county;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }
}
