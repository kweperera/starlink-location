package satellite_location.satellite_location.service_interface;

import satellite_location.satellite_location.model.Location;

import java.util.List;
import java.util.Optional;

public interface LocationInterface {

    // To save new location
    public Location saveLocation(Location location);

    // To update location
    public Location updateLocation(Location catalog);

    // To fetch all location from database
    public List<Location> findAllLocation();

    // To get location details by id
    public Optional<Location> getLocationDataById(long id);

    // To delete location
    public void deleteLocation(long id);
}
