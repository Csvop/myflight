public class Geo {
    private double latitude;
    private double longitude;
    private String cod;

    public Geo(String cod, double latitude, double longitude) {
        this.cod=cod;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getCod() {
        return cod;
    }

    public static double distancia(Geo pontoA, Geo pontoB){
        double latA=Math.toRadians(pontoA.latitude);
        double latB=Math.toRadians(pontoB.latitude);
        double lonA=Math.toRadians(pontoA.longitude);
        double lonB=Math.toRadians(pontoB.longitude);
        double dLat = (latA-latB); //diferença das latitudes dos pontos em radianos
        double dLon = (lonA-lonB); //diferença das longitudes dos pontos em radianos
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.cos(latA) * Math.cos(latB) * Math.sin(dLon/2) * Math.sin(dLon/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return 6371 * c;
    }

    @Override
    public String toString() {
        return String.format("[%8s] [%8s] ",
                latitude,
                longitude);
    }
}
