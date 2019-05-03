package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param cancelled 
 * @param delay 
 * @param departureTime 
 * @param direction 
 * @param directionToDisplay 
 * @param platform 
 * @param trainIdentifier 
 * @param vehicleType 
 * @param via 
 * @param viaToDisplay 
 */
data class TripDto (

        @get:NotNull 
        @JsonProperty("cancelled") val cancelled: Boolean,

        @get:NotNull 
        @JsonProperty("departureTime") val departureTime: java.time.OffsetDateTime,

        @get:NotNull 
        @JsonProperty("direction") val direction: String,

        @get:NotNull 
        @JsonProperty("directionToDisplay") val directionToDisplay: String,

        @get:NotNull 
        @JsonProperty("trainIdentifier") val trainIdentifier: String,

        @get:NotNull 
        @JsonProperty("vehicleType") val vehicleType: String,

        @get:NotNull 
        @JsonProperty("via") val via: List<String>,

        @JsonProperty("delay") val delay: Int? = null,

        @JsonProperty("platform") val platform: String? = null,

        @JsonProperty("viaToDisplay") val viaToDisplay: String? = null
) {

}

