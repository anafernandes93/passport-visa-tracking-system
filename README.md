# passport-visa-tracking-system
Core Java console application for tracking passport visa holders, entry and exit movements, and identifying illegal overstays using PostgreSQL and AWS services.

# Key Features

- Create and manage passport holder records
- Issue and manage visa details
- Record ENTRY and EXIT movements
- Validate movement sequences
- Run compliance checks against visa expiry dates
- Identify illegal overstays
- Generate a CSV compliance report
- Upload reports to AWS S3
- Send notifications using AWS SNS
- Send messages to AWS SQS

# Technologies Used

- Java (Core Java)
- PostgreSQL for relational data storage
- JDBC for database connectivity
- JUnit for unit testing
- AWS S3, SNS, and SQS for reporting and notifications


# Application Structure
The project follows a simple, layered structure:

model – Entity classes such as Person, Visa, and Movement
dao – Database access logic using JDBC
service – Business logic including compliance calculation
util – Utility classes for CSV generation and AWS integration
exception – Custom exceptions for validation and business rules
test – Unit tests for business logic and data access


# Core Domain Entities

Person – Represents a passport holder.    
Visa – Stores visa details including expiry date.   
Movement – Represents ENTRY and EXIT movements linked to a passport.


# Compliance Logic
The system calculates compliance by:

- Evaluating visa expiry dates
- Analysing the last recorded ENTRY and EXIT movements
- Identifying cases where a visa holder remains in the country after visa expiry

Identified cases are included in a daily CSV report and processed through AWS services.

# Testing
Unit tests are written using JUnit

Multiple test cases cover:

- Compliant scenarios
- Non‑compliant (illegal stay) scenarios
- Edge cases


Tests validate both business logic and data handling.
Test coverage is used to ensure key logic paths are exercised.


# Assumptions

- Each person is uniquely identified by a passport number
- A person holds one active visa at a time
- Entry and exit movements are recorded in chronological order
- The application is console‑based, with no graphical user interface


# How to Run

- Clone the repository
- Set up a local PostgreSQL database
- Configure database and AWS settings in application.properties
- Run the Main class from the console


# Learning Outcomes
This project demonstrates:

- Object‑oriented design in Java
- Relational data modelling
- JDBC usage
- Unit testing practices
- Application of Agile and requirements‑gathering concepts
- Structured planning and implementation of a mini case study

