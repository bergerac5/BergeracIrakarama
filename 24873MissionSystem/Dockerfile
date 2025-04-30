# Use Java 21
FROM eclipse-temurin:21-jdk

# Set project ID
ENV PROJECT_ID=Q24873

# Create app directory
WORKDIR /app

# Copy compiled Java classes into the container
COPY ./out/production/24873MissionSystem/Q24873/ ./Q24873/

# Create a text file with project info
RUN echo "Project ID: ${PROJECT_ID}" > /app/mission_system.txt

# Set the entry point
ENTRYPOINT ["java", "Q24873.Main"]
