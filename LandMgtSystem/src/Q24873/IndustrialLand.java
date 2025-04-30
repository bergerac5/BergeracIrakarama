package Q24873;

import java.util.Date;

public class IndustrialLand extends Land {
    private boolean hasEnvironmentalClearance;

    public IndustrialLand(String landId, String ownerName, String location, double sizeInAcres, Date registrationDate, String landUseStatus, boolean hasEnvironmentalClearance) {
        super(landId, ownerName, location, sizeInAcres, registrationDate, landUseStatus);
        this.hasEnvironmentalClearance = hasEnvironmentalClearance;
    }

    @Override
    public boolean validateOwnership() {
        return ownerName != null && !ownerName.trim().isEmpty();
    }

    @Override
    public boolean checkZoningCompliance() {
        // For simplicity, assume zoning is valid if clearance is given and location has 'industrial'
        return hasEnvironmentalClearance && location.toLowerCase().contains("industrial");
    }

    @Override
    public double calculateTax() {
        double landValue = 12000 * sizeInAcres;
        return landValue * 0.03; // 3% tax
    }

    @Override
    public String generateLandReport() {
        return String.format("""
                === Industrial Land Report ===
                ID: %s
                Owner: %s
                Location: %s
                Size: %.2f acres
                Use Status: %s
                Environmental Clearance: %s
                Ownership Valid: %b
                Zoning Compliant: %b
                Tax Owed: $%.2f
                """,
                landId, ownerName, location, sizeInAcres, landUseStatus,
                hasEnvironmentalClearance ? "YES" : "NO",
                validateOwnership(), checkZoningCompliance(), calculateTax());
    }
}
