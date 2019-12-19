import java.util.ArrayList;
import java.util.List;

class Result {

    private Station startStation;
    private Station endStation;
    private int distance;
    private List<Station> passStations = new ArrayList<>();

    Station getStartStation() {
        return startStation;
    }
    void setStartStation(Station startStation) {
        this.startStation = startStation;
    }
    Station getEndStation() {
        return endStation;
    }
    void setEndStation(Station endStation) {
        this.endStation = endStation;
    }
    int getDistance() {
        return distance;
    }
    void setDistance(int distance) {
        this.distance = distance;
    }
    List<Station> getPassStations() {
        return passStations;
    }
    public void setPassStations(List<Station> passStations) {
        this.passStations = passStations;
    }

}