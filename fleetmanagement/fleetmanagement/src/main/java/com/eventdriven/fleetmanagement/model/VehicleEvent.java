package com.eventdriven.fleetmanagement.model;

public class VehicleEvent {

	private String vehicleId;
	private double batteryLevel;
	private String location;
	private String status; 
	private String timestamp;

	// Getters and Setters
	public VehicleEvent() {}

	public VehicleEvent(String vehicleId, double batteryLevel, String location, String status, String timestamp) {
		this.vehicleId = vehicleId;
		this.batteryLevel = batteryLevel;
		this.location = location;
		this.status = status;
		this.timestamp = timestamp;
	}

	public String getVehicleId() { return vehicleId; }
	public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }

	public double getBatteryLevel() { return batteryLevel; }
	public void setBatteryLevel(double batteryLevel) { this.batteryLevel = batteryLevel; }

	public String getLocation() { return location; }
	public void setLocation(String location) { this.location = location; }

	public String getStatus() { return status; }
	public void setStatus(String status) { this.status = status; }

	public String getTimestamp() { return timestamp; }
	public void setTimestamp(String timestamp) { this.timestamp = timestamp; }

	@Override
	public String toString() {
		return "VehicleEvent{" +
				"vehicleId='" + vehicleId + '\'' +
				", batteryLevel=" + batteryLevel +
				", location='" + location + '\'' +
				", status='" + status + '\'' +
				", timestamp='" + timestamp + '\'' +
				'}';
	}
}