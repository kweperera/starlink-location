package satellite_location.satellite_location.model;

import javax.persistence.*;

@Entity
@Table(name = "satellite_location",catalog = "locationdb")
public class Location {

    @Id
    private long satelliteId;
    private String satelliteName;
    private long elevationMask;
    private long ISLbandwith;
    private long latitudeThreshold;

    public Location(){ super(); }

    public Location(long satelliteId, String satelliteName, long elevationMask,
                    long ISLbandwith, long latitudeThreshold) {
        this.satelliteId = satelliteId;
        this.satelliteName = satelliteName;
        this.elevationMask = elevationMask;
        this.ISLbandwith = ISLbandwith;
        this.latitudeThreshold = latitudeThreshold;
    }

    public long getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(long satelliteId) {
        this.satelliteId = satelliteId;
    }

    public String getSatelliteName() {
        return satelliteName;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public long getElevationMask() {
        return elevationMask;
    }

    public void setElevationMask(long elevationMask) {
        this.elevationMask = elevationMask;
    }

    public long getISLbandwith() {
        return ISLbandwith;
    }

    public void setISLbandwith(long ISLbandwith) {
        this.ISLbandwith = ISLbandwith;
    }

    public long getLatitudeThreshold() {
        return latitudeThreshold;
    }

    public void setLatitudeThreshold(long latitudeThreshold) {
        this.latitudeThreshold = latitudeThreshold;
    }
}
