class UndergroundSystem {

    class Passenger {
        int id, time;
        String stationName;
        Passenger(int id, String stationName, int time) {
            this.id = id;
            this.stationName = stationName;
            this.time = time;
        }
    }

    class Route {
        int count, time;
        void update(int difference) {
            count++;
            time += difference;
        }
        double getAvgerage() {
            return (double) time / count;
        }
    }

    HashMap<Integer, Passenger> arrivalPassenger;
    HashMap<String, Route> route;

    public UndergroundSystem() {
        arrivalPassenger = new HashMap<>();
        route = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        arrivalPassenger.put(id, new Passenger(id, stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Passenger ap = arrivalPassenger.get(id);
        arrivalPassenger.remove(id);
        int diff = t - ap.time;
        String key = ap.stationName + "->" + stationName;
        Route r = route.containsKey(key) ? route.get(key) : new Route();
        r.update(diff);
        route.put(key, r);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "->" + endStation;
        return route.get(key).getAvgerage();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */