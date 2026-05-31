# Outreach Engine

A campaign based outreach platform built with Spring Boot.

## Overview

Outreach Engine is designed to manage and execute outreach campaigns at scale. The project focuses on reliable email delivery, campaign tracking, template management and asynchronous processing.

The project will support:

- Campaign creation
- Bulk email delivery
- Dynamic email templates using Freemarker
- Campaign status tracking
- Recipient validation and deduplication

Future enhancements may include:

- Retry mechanisms
- Delivery analytics
- Scheduling
- Multiple communication channels (SMS, WhatsApp, etc.)
- Rate limiting and throttling

## Tech Stack

- Java 21
- Spring Boot 3.x
- Maven
- Freemarker
- JUnit 5

## Project Structure

```text
com.outreachengine
├── campaign
├── communication
│   └── email
├── common
├── config
└── OutreachEngineApplication
```

## Getting Started

```bash
./mvnw spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

## Roadmap

- [x] Project bootstrap
- [ ] Campaign creation API
- [ ] Email template rendering
- [ ] Email dispatch service
- [ ] Campaign persistence
- [ ] Delivery tracking
- [ ] Analytics dashboard