package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param counter 
 * @param departureTime 
 * @param destination 
 * @param flightNo 
 * @param gate 
 * @param status 
 * @param terminal 
 */
data class FlightDto (

        @get:NotNull 
        @JsonProperty("counter") val counter: String,

        @get:NotNull 
        @JsonProperty("departureTime") val departureTime: java.time.OffsetDateTime,

        @get:NotNull 
        @JsonProperty("destination") val destination: String,

        @get:NotNull 
        @JsonProperty("flightNo") val flightNo: String,

        @get:NotNull 
        @JsonProperty("gate") val gate: String,

        @get:NotNull 
        @JsonProperty("status") val status: String,

        @get:NotNull 
        @JsonProperty("terminal") val terminal: String
) {

}

