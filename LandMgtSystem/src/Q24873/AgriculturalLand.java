package Q24873;

import java.util.Date;

public class AgriculturalLand extends Land {

    public AgriculturalLand(String landId, String ownerName, String location, double sizeInAcres, Date registrationDate, String landUseStatus) {
        super(landId, ownerName, location, sizeInAcres, registrationDate, landUseStatus);
    }

    @Override
    public boolean validateOwnership() {
        return ownerName != null && !ownerName.trim().isEmpty();
    }

    @Override
    public boolean checkZoningCompliance() {
        return location.toLowerCase().contains("farming"); // dummy check for farming zone
    }

    @Override
    public double calculateTax() {
        double landValue = 5000 * sizeInAcres;
        return landValue * 0.01;
    }

    @Override
    public String generateLandReport() {
        return String.format("""
                === Agricultural Land Report ===
                ID: %s
                Owner: %s
                Location: %s
                Size: %.2f acres
                Use Status: %s
                Ownership Valid: %b
                Zoning Compliant: %b
                Tax Owed: $%.2f
                """,
                landId, ownerName, location, sizeInAcres, landUseStatus,
                validateOwnership(), checkZoningCompliance(), calculateTax());
    }
}
