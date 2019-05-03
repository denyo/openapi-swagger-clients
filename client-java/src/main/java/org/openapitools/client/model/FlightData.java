/*
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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.FlightDto;
import org.openapitools.client.model.GoToInformation;

/**
 * FlightData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-03T10:14:12.734Z[GMT]")
public class FlightData {
  public static final String SERIALIZED_NAME_DEPARTURES = "departures";
  @SerializedName(SERIALIZED_NAME_DEPARTURES)
  private List<FlightDto> departures = new ArrayList<FlightDto>();

  public static final String SERIALIZED_NAME_GO_TO_INFORMATION = "goToInformation";
  @SerializedName(SERIALIZED_NAME_GO_TO_INFORMATION)
  private GoToInformation goToInformation = null;

  public FlightData departures(List<FlightDto> departures) {
    this.departures = departures;
    return this;
  }

  public FlightData addDeparturesItem(FlightDto departuresItem) {
    this.departures.add(departuresItem);
    return this;
  }

   /**
   * Get departures
   * @return departures
  **/
  @ApiModelProperty(required = true, value = "")
  public List<FlightDto> getDepartures() {
    return departures;
  }

  public void setDepartures(List<FlightDto> departures) {
    this.departures = departures;
  }

  public FlightData goToInformation(GoToInformation goToInformation) {
    this.goToInformation = goToInformation;
    return this;
  }

   /**
   * Get goToInformation
   * @return goToInformation
  **/
  @ApiModelProperty(required = true, value = "")
  public GoToInformation getGoToInformation() {
    return goToInformation;
  }

  public void setGoToInformation(GoToInformation goToInformation) {
    this.goToInformation = goToInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightData flightData = (FlightData) o;
    return Objects.equals(this.departures, flightData.departures) &&
        Objects.equals(this.goToInformation, flightData.goToInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departures, goToInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightData {\n");
    sb.append("    departures: ").append(toIndentedString(departures)).append("\n");
    sb.append("    goToInformation: ").append(toIndentedString(goToInformation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

