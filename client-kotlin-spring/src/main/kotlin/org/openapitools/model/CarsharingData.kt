package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id 
 * @param lat 
 * @param lon 
 * @param type 
 */
data class CarsharingData (

        @get:NotNull 
        @JsonProperty("id") val id: String,

        @get:NotNull 
        @JsonProperty("lat") val lat: Float,

        @get:NotNull 
        @JsonProperty("lon") val lon: Float,

        @get:NotNull 
        @JsonProperty("type") val type: CarsharingData.Type
) {

    /**
    * 
    * Values: wESHARE,dRIVENOW,cAR2GO,jUMP
    */
    enum class Type(val value: String) {
    
        @JsonProperty("WESHARE") wESHARE("WESHARE"),
    
        @JsonProperty("DRIVENOW") dRIVENOW("DRIVENOW"),
    
        @JsonProperty("CAR2GO") cAR2GO("CAR2GO"),
    
        @JsonProperty("JUMP") jUMP("JUMP");
    
    }

}

