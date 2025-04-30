package Q24873;

<<<<<<< HEAD
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            ReconMission mission = new ReconMission("M001", "Sky Watch", new Date(), new Date(System.currentTimeMillis() + 86400000));

            Personnel p1 = new Personnel("P001", "Alice", "Scout");
            Personnel p2 = new Personnel("P002", "Bob", "Technician");

            mission.assignPersonnel(p1);
            mission.assignPersonnel(p2);

            Resource drone = new Resource("R001", "Drone", 2, "Equipment");
            mission.addResource(drone);

            mission.allocateResources();
            mission.assignTask();
            mission.trackMissionProgress();
            mission.generateMissionReport();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
=======
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Land> lands = new ArrayList<>();

        // Sample registration date
        Date today = new Date();

        // Create different land types
        Land commercialLand = new CommercialLand(
                "CL001",
                "Alice Johnson",
                "Plot 45B, Commercial Zone, Kigali",
                2.5,
                today,
                "In Use"
        );

        Land industrialLand = new IndustrialLand(
                "IL001",
                "Bob Smith",
                "Zone 12, Industrial Park, Kigali",
                4.0,
                today,
                "Under Development",
                true // has environmental clearance
        );

        Land agriculturalLand = new AgriculturalLand(
                "AG001",
                "Clara Kent",
                "Green Belt, Farming Zone",
                3.0,
                today,
                "Vacant"
        );

        Land residentialLand = new ResidentialLand(
                "RL001",
                "David Ntwali",
                "Sunshine Estate, Kigali",
                1.5,
                today,
                "In Use",
                2 // units per acre
        );

        // Add all lands to registry
        lands.add(commercialLand);
        lands.add(industrialLand);
        lands.add(agriculturalLand);
        lands.add(residentialLand);

        // Print reports for each land
        for (Land land : lands) {
            System.out.println(land.generateLandReport());
            System.out.println("-----------------------------------");
>>>>>>> 5a9823c (second question)
        }
    }
}

