public class Geo {
    private double latitude;
    private double longitude;

    public Geo(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return String.format("[%8s] [%8s] ",
                latitude,
                longitude);
    }
}
