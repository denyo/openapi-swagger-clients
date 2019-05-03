package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param detail 
 * @param requiredTime 
 */
data class GoToDetail (

        @get:NotNull 
        @JsonProperty("detail") val detail: String,

        @get:NotNull 
        @JsonProperty("requiredTime") val requiredTime: String
) {

}

