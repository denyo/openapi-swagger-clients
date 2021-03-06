/**
* Api Documentation
* Api Documentation
*
* OpenAPI spec version: 1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.GoToDetail

/**
 * 
 * @param byBike 
 * @param byLocalTransport 
 * @param byTaxi 
 * @param byWalk 
 */
data class GoToInformation (
    val byLocalTransport: GoToDetail,
    val byTaxi: GoToDetail,
    val byBike: GoToDetail? = null,
    val byWalk: GoToDetail? = null
) {

}

