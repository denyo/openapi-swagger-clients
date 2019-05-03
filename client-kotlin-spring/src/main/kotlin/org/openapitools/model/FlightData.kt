package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.FlightDto
import org.openapitools.model.GoToInformation
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param departures 
 * @param goToInformation 
 */
data class FlightData (

        @get:NotNull 
        @JsonProperty("departures") val departures: List<FlightDto>,

        @get:NotNull 
        @JsonProperty("goToInformation") val goToInformation: GoToInformation
) {

}

