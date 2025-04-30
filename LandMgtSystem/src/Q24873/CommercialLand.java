package Q24873;

import java.util.Date;

public class CommercialLand extends Land {

    public CommercialLand(String landId, String ownerName, String location, double sizeInAcres, Date registrationDate, String landUseStatus) {
        super(landId, ownerName, location, sizeInAcres, registrationDate, landUseStatus);
    }

    @Override
    public boolean validateOwnership() {
        return ownerName != null && !ownerName.trim().isEmpty();
    }

    @Override
    public boolean checkZoningCompliance() {
        // Assume zoning is compliant if location contains a keyword like "commercial zone"
        return location.toLowerCase().contains("commercial");
    }

    @Override
    public double calculateTax() {
        double landValue = 10000 * sizeInAcres;
        return landValue * 0.025; // 2.5% tax
    }

    @Override
    public String generateLandReport() {
        return String.format("""
                === Commercial Land Report ===
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

