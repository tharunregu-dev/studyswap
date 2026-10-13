# Architecture

The application separates a React/Vite client from a Spring Boot REST API. Listing rules belong to the service layer, are backed by database constraints, and never trust client-side pricing. Storage, payments, and email should be connected through provider interfaces so development mocks can be replaced without changing workflow services.
