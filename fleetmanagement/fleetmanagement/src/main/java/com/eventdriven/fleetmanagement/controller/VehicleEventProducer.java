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
        kafkaTemplate.send(TOPIC, vehicleEvent);
        return "Vehicle Event Sent!";
    }
}