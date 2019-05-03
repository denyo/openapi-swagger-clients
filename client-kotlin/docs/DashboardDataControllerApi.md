# DashboardDataControllerApi

All URIs are relative to *http://backend:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDashboardDataUsingGET**](DashboardDataControllerApi.md#getDashboardDataUsingGET) | **GET** /api/dashboard-data | getDashboardData


<a name="getDashboardDataUsingGET"></a>
# **getDashboardDataUsingGET**
> DashboardData getDashboardDataUsingGET()

getDashboardData

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardDataControllerApi()
try {
    val result : DashboardData = apiInstance.getDashboardDataUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardDataControllerApi#getDashboardDataUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardDataControllerApi#getDashboardDataUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DashboardData**](DashboardData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

