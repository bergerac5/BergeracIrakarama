package Q24873;

import java.util.Date;

public class ResidentialLand extends Land {
    private int numberOfUnits;

    public ResidentialLand(String landId, String ownerName, String location, double sizeInAcres, Date registrationDate, String landUseStatus, int numberOfUnits) {
        super(landId, ownerName, location, sizeInAcres, registrationDate, landUseStatus);
        this.numberOfUnits = numberOfUnits;
    }

    @Override
    public boolean validateOwnership() {
        return ownerName != null && !ownerName.trim().isEmpty();
    }

    @Override
    public boolean checkZoningCompliance() {
        return numberOfUnits <= (2 * sizeInAcres);
    }

    @Override
    public double calculateTax() {
        double landValue = 8000 * sizeInAcres;
        return landValue * 0.015;
    }

    @Override
    public String generateLandReport() {
        return String.format("""
                === Residential Land Report ===
                ID: %s
                Owner: %s
                Location: %s
                Size: %.2f acres
                Units: %d
                Use Status: %s
                Ownership Valid: %b
                Zoning Compliant: %b
                Tax Owed: $%.2f
                """,
                landId, ownerName, location, sizeInAcres, numberOfUnits, landUseStatus,
                validateOwnership(), checkZoningCompliance(), calculateTax());
    }
}

