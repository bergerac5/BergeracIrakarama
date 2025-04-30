package Q24873;

import java.util.Date;

public class ReconMission extends Mission {

    public ReconMission(String id, String name, Date start, Date end) {
        super(id, name, start, end);
    }

    @Override
    public void assignTask() {
        if (assignedPersonnel.size() < 2) {
            throw new IllegalStateException("ReconMission requires at least 2 personnel.");
        }
        System.out.println("Recon tasks assigned: Surveillance, Intelligence Gathering");
    }

    @Override
    public void allocateResources() {
        Resource drone = findResource("Drone");
        if (drone != null && drone.isAvailable()) {
            drone.allocate(1);
            System.out.println("Drone allocated to ReconMission.");
        } else {
            throw new IllegalStateException("Recon equipment unavailable.");
        }
    }

    @Override
    public void trackMissionProgress() {
        status = "IN_PROGRESS";
        System.out.println("Recon progress updated.");
    }

    @Override
    public void generateMissionReport() {
        System.out.println("Mission: " + missionName);
        System.out.println("Status: " + status);
        System.out.println("Personnel assigned: " + assignedPersonnel.size());
        for (Resource r : resources) {
            System.out.println("Resource: " + r.getResourceName() + " | Remaining: " + r.getQuantity());
        }
    }
}

