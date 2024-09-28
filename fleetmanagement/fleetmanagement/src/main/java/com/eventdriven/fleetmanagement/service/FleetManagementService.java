package com.eventdriven.fleetmanagement.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class FleetManagementService {

    @KafkaListener(topics = "vehicle_events", groupId = "vehicle_group")
    public void manageVehicle(VehicleEvent vehicleEvent) {
        System.out.println("Received Vehicle Event: " + vehicleEvent);

        // Check for battery status
        if (vehicleEvent.getBatteryLevel() < 20.0) {
            System.out.println("Low battery for vehicle " + vehicleEvent.getVehicleId() + ". Rerouting to charging station...");
            // Implement logic to reroute vehicle to charging station
        }

        // Check if vehicle needs maintenance
        if ("NEEDS_MAINTENANCE".equals(vehicleEvent.getStatus())) {
            System.out.println("Vehicle " + vehicleEvent.getVehicleId() + " needs maintenance. Sending to service...");
            // Implement logic for maintenance actions
        }
    }
}
