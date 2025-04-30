package Q24873;

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
        }
    }
}

