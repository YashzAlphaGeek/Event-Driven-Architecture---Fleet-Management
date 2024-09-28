# Autonomous Vehicle Fleet Management Using Event-Driven Architecture

## Event-Driven Architecture: Making Software Smarter and More Responsive

Event-Driven Architecture (EDA) is a way of designing software where the program's actions are based on events. An "event" is a change in state or an important occurrence, often caused by user actions, system alerts, or other applications. In an EDA system, different parts of the program create events and respond to them without waiting for one another. This leads to a system that is more flexible and easier to change.

![image](https://github.com/user-attachments/assets/4be32f32-202c-43ff-a389-df8e49b9de4f)


In this example, Autonomous Vehicle Fleet Management will use Event-Driven Architecture (EDA) to dynamically respond to real-world events like:

+ Traffic congestion or accidents on the route
+ Battery level or vehicle health
+ Customer ride requests
+ Real-time weather conditions affecting driving decisions

<b>Event Producers: Autonomous vehicles, IoT sensors, traffic systems, weather APIs.</b>

<b>Event Consumers: Fleet management system, autonomous vehicle routing service, customer ride allocation service.</b>

<b>Event Channels: Apache Kafka will act as the event backbone, handling real-time streaming of events from various producers to consumers.</b>

<b>Real-time Processing: Using Kafka Streams for processing events such as traffic rerouting, vehicle assignment, and battery optimization.</b>


![image](https://github.com/user-attachments/assets/47e3ca54-38bb-4a34-ac56-360a5463c4fe)


<img width="481" alt="image" src="https://github.com/user-attachments/assets/ce5d3e70-27f1-4cc2-bfcd-b40e2e650bbf">


