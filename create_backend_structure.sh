#!/bin/bash

# Go to the current directory (assumed to be Springboot_scalable_Railwayapp)
BASE_DIR="backend/src/main/java/com/ticketxpress"
RESOURCES_DIR="backend/src/main/resources"

# Create directories
mkdir -p $BASE_DIR/{controller,model,repository,service,config}
mkdir -p "$RESOURCES_DIR/static"

# Create Java class files
touch $BASE_DIR/controller/{AuthController.java,BookingController.java}
touch $BASE_DIR/model/{User.java,Booking.java}
touch $BASE_DIR/repository/{UserRepository.java,BookingRepository.java}
touch $BASE_DIR/service/{UserService.java,BookingService.java}
touch $BASE_DIR/config/SecurityConfig.java
touch $BASE_DIR/TicketxpressApplication.java

# Create resource files
touch "$RESOURCES_DIR/application.properties"

# Create pom.xml at the root of backend/
touch backend/pom.xml

echo "✅ Backend project structure created under 'Springboot_scalable_Railwayapp/backend'"

