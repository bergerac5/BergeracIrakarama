package Q24873;

import java.util.ArrayList;
import java.util.List;

public class LandRegistry {
    private List<Land> registeredLands = new ArrayList<>();

    public void registerLand(Land land) {
        registeredLands.add(land);
    }

    public List<Land> searchByOwner(String ownerName) {
        return registeredLands.stream()
                .filter(land -> land.ownerName.equalsIgnoreCase(ownerName))
                .toList();
    }

    public List<Land> filterByLocation(String location) {
        return registeredLands.stream()
                .filter(land -> land.location.contains(location))
                .toList();
    }

    public void generateAllReports() {
        for (Land land : registeredLands) {
            System.out.println(land.generateLandReport());
        }
    }
}

