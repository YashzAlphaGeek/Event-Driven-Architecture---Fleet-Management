package com.eventdriven.fleetmanagement.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import com.eventdriven.fleetmanagement.model.VehicleEvent;

@RestController
@RequestMapping("/vehicle")
public class VehicleEventProducer {

    private final KafkaTemplate<String, VehicleEvent> kafkaTemplate;
    private static final String TOPIC = "vehicle_events";

    public VehicleEventProducer(KafkaTemplate<String, VehicleEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/sendEvent")
    public String sendVehicleEvent(@RequestBody VehicleEvent vehicleEvent) {
        try {
            kafkaTemplate.send(TOPIC, vehicleEvent).get(); // Use get() to ensure it's synchronous and catches errors
            return "Vehicle Event Sent!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to send event: " + e.getMessage();
        }
    }
}
