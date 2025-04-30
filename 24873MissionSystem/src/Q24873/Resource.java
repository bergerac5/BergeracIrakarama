package Q24873;

public class Resource {
    private String resourceId;
    private String resourceName;
    private int quantity;
    private String resourceType;

    public Resource(String resourceId, String resourceName, int quantity, String resourceType) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.quantity = quantity;
        this.resourceType = resourceType;
    }

    public boolean isAvailable() {
        return quantity > 0;
    }

    public void allocate(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient resources: " + resourceName);
        }
    }

    // Getters...
    public String getResourceName() {
        return resourceName;
    }

    public int getQuantity() {
        return quantity;
    }
}
