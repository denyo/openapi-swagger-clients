package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GoToDetail
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param byBike 
 * @param byLocalTransport 
 * @param byTaxi 
 * @param byWalk 
 */
data class GoToInformation (

        @get:NotNull 
        @JsonProperty("byLocalTransport") val byLocalTransport: GoToDetail,

        @get:NotNull 
        @JsonProperty("byTaxi") val byTaxi: GoToDetail,

        @JsonProperty("byBike") val byBike: GoToDetail? = null,

        @JsonProperty("byWalk") val byWalk: GoToDetail? = null
) {

}

