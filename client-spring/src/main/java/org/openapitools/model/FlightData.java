package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FlightDto;
import org.openapitools.model.GoToInformation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-03T10:14:46.605Z[GMT]")

public class FlightData   {
  @JsonProperty("departures")
  @Valid
  private List<FlightDto> departures = new ArrayList<>();

  @JsonProperty("goToInformation")
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
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

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
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

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

