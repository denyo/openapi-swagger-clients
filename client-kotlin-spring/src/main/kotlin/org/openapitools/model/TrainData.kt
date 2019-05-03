package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GoToInformation
import org.openapitools.model.TripDto
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param goToInformation 
 * @param station 
 * @param trips 
 */
data class TrainData (

        @get:NotNull 
        @JsonProperty("goToInformation") val goToInformation: GoToInformation,

        @get:NotNull 
        @JsonProperty("station") val station: String,

        @get:NotNull 
        @JsonProperty("trips") val trips: List<TripDto>
) {

}

