package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param temperature 
 * @param weatherMainDescription 
 * @param willRainToday 
 */
data class WeatherData (

        @get:NotNull 
        @JsonProperty("temperature") val temperature: Int,

        @get:NotNull 
        @JsonProperty("weatherMainDescription") val weatherMainDescription: WeatherData.WeatherMainDescription,

        @JsonProperty("willRainToday") val willRainToday: Boolean? = null
) {

    /**
    * 
    * Values: cLEARSKY,fEWCLOUDS,sCATTEREDCLOUDS,bROKENCLOUDS,sHOWERRAIN,rAIN,tHUNDERSTORM,sNOW,mIST
    */
    enum class WeatherMainDescription(val value: String) {
    
        @JsonProperty("CLEAR_SKY") cLEARSKY("CLEAR_SKY"),
    
        @JsonProperty("FEW_CLOUDS") fEWCLOUDS("FEW_CLOUDS"),
    
        @JsonProperty("SCATTERED_CLOUDS") sCATTEREDCLOUDS("SCATTERED_CLOUDS"),
    
        @JsonProperty("BROKEN_CLOUDS") bROKENCLOUDS("BROKEN_CLOUDS"),
    
        @JsonProperty("SHOWER_RAIN") sHOWERRAIN("SHOWER_RAIN"),
    
        @JsonProperty("RAIN") rAIN("RAIN"),
    
        @JsonProperty("THUNDERSTORM") tHUNDERSTORM("THUNDERSTORM"),
    
        @JsonProperty("SNOW") sNOW("SNOW"),
    
        @JsonProperty("MIST") mIST("MIST");
    
    }

}

