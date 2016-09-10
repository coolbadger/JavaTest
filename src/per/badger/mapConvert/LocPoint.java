package per.badger.mapConvert;

/**
 * Created by Badger on 16/9/10.
 */
public class LocPoint {
    private String lat; //经度
    private String lng; //维度

    public LocPoint(String lat,String lng){
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
