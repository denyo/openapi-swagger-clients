package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CarsharingData
import org.openapitools.model.FlightData
import org.openapitools.model.TrainData
import org.openapitools.model.WeatherData
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param airport 
 * @param carsharingData 
 * @param trainData 
 * @param weatherData 
 */
data class DashboardData (

        @get:NotNull 
        @JsonProperty("airport") val airport: FlightData,

        @get:NotNull 
        @JsonProperty("carsharingData") val carsharingData: List<CarsharingData>,

        @get:NotNull 
        @JsonProperty("trainData") val trainData: List<TrainData>,

        @JsonProperty("weatherData") val weatherData: WeatherData? = null
) {

}

