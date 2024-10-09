Wikimedia Real-time Event Streaming and Analytics


This project demonstrates a real-world application of Apache Kafka for processing and analyzing real-time data streams from Wikimedia. It consists of a Spring Boot-based microservices architecture that ingests, processes, and visualizes recent changes to Wikimedia pages.

Key Features:

Real-time data ingestion from Wikimedia EventStreams API
Apache Kafka integration for reliable and scalable message queuing
Spring Boot microservices architecture (Producer and Consumer)
Data persistence using MySQL and Spring Data JPA
Web-based dashboard for visualizing Wikimedia changes
Modular design for easy extensibility and maintenance

Technology Stack:

Java 17+
Spring Boot 3.x
Apache Kafka
MySQL
Spring Data JPA
Maven
Thymeleaf (for web UI)

Project Structure:

The project is divided into two main modules:
kafka-producer-wikimedia: Responsible for consuming the Wikimedia EventStreams API and producing messages to a Kafka topic.
kafka-consumer-database: Consumes messages from the Kafka topic, persists data to MySQL, and serves a web UI for data visualization.


Future Enhancements:

Implement real-time updates using WebSocket for the dashboard
Add data analytics and aggregation features
Integrate with a time-series database for improved performance on large datasets
Implement data validation and error handling for improved reliability
