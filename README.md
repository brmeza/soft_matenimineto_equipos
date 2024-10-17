
# Equipment Maintenance

This project is a web application designed to manage **equipment maintenance**. The system allows for the registration of equipment, management of preventive and corrective maintenance, and tracking the maintenance history for each device.

## Features

- Register and manage **equipment**.
- Plan and track **preventive maintenance**.
- Record **corrective maintenance**.
- Complete **maintenance history** for each device.
- **Reports** generation.
- User-friendly interface and API documentation with Swagger.

## Prerequisites

Make sure you have the following installed:

- **Java 11** or higher.
- **Maven** for dependency management.
- **PostgreSQL** as the database.
- An HTTP client such as **Postman** for testing the API.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/brmeza/soft_matenimineto_equipos.git
   cd soft_matenimineto_equipos
   ```

2. Configure the **PostgreSQL** connection:  
   Update the `application.properties` file in `src/main/resources/` with your database credentials:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/maintenance
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Usage

Once the application is running, you can access the API documentation at:  
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### Main Endpoints

1. **Equipment**:
   - **GET /api/equipos**: List all equipment.
   - **POST /api/equipos**: Register a new piece of equipment.
   - **PUT /api/equipos/{id}**: Update an equipment's information.
   - **DELETE /api/equipos/{id}**: Delete an equipment entry.

2. **Preventive Maintenance**:
   - **GET /api/preventivos**: View all preventive maintenance entries.
   - **POST /api/preventivos**: Schedule preventive maintenance.
   - **PUT /api/preventivos/{id}**: Update preventive maintenance.
   - **DELETE /api/preventivos/{id}**: Delete preventive maintenance.

3. **Corrective Maintenance**:
   - **GET /api/correctivos**: View all corrective maintenance entries.
   - **POST /api/correctivos**: Register corrective maintenance.
   - **PUT /api/correctivos/{id}**: Update corrective maintenance.
   - **DELETE /api/correctivos/{id}**: Delete corrective maintenance.

## Data Model

- **Equipment**: ID, name, description, acquisition date, and status.
- **Preventive Maintenance**: ID, associated equipment, scheduled date, and job description.
- **Corrective Maintenance**: ID, affected equipment, incident date, description, and applied solution.

## Testing

You can use **Postman** or another HTTP client to test the following API examples.

### Example: Register Equipment
```json
POST /api/equipos
{
  "name": "Compressor A",
  "description": "Industrial air compressor",
  "acquisitionDate": "2022-05-10",
  "status": "Operational"
}
```

### Example: Schedule Preventive Maintenance
```json
POST /api/preventivos
{
  "equipmentId": 1,
  "scheduledDate": "2024-12-01",
  "description": "Filter replacement and general inspection"
}
```

### Example: Register Corrective Maintenance
```json
POST /api/correctivos
{
  "equipmentId": 1,
  "incidentDate": "2024-10-15",
  "description": "Electrical system failure",
  "solution": "Replacement of the main fuse"
}
```

## Contributions

Contributions are welcome. If you would like to collaborate, open an *issue* or submit a *pull request* with your changes.
