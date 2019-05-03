# org.openapitools.client - Kotlin client library for Api Documentation

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://backend:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DashboardDataControllerApi* | [**getDashboardDataUsingGET**](docs/DashboardDataControllerApi.md#getdashboarddatausingget) | **GET** /api/dashboard-data | getDashboardData


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.CarsharingData](docs/CarsharingData.md)
 - [org.openapitools.client.models.DashboardData](docs/DashboardData.md)
 - [org.openapitools.client.models.FlightData](docs/FlightData.md)
 - [org.openapitools.client.models.FlightDto](docs/FlightDto.md)
 - [org.openapitools.client.models.GoToDetail](docs/GoToDetail.md)
 - [org.openapitools.client.models.GoToInformation](docs/GoToInformation.md)
 - [org.openapitools.client.models.TrainData](docs/TrainData.md)
 - [org.openapitools.client.models.TripDto](docs/TripDto.md)
 - [org.openapitools.client.models.WeatherData](docs/WeatherData.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
