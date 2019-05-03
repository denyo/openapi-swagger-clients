package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.GoToInformation;
import org.openapitools.model.TripDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TrainData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-03T10:14:46.605Z[GMT]")

public class TrainData   {
  @JsonProperty("goToInformation")
  private GoToInformation goToInformation = null;

  @JsonProperty("station")
  private String station;

  @JsonProperty("trips")
  @Valid
  private List<TripDto> trips = new ArrayList<>();

  public TrainData goToInformation(GoToInformation goToInformation) {
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

  public TrainData station(String station) {
    this.station = station;
    return this;
  }

  /**
   * Get station
   * @return station
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStation() {
    return station;
  }

  public void setStation(String station) {
    this.station = station;
  }

  public TrainData trips(List<TripDto> trips) {
    this.trips = trips;
    return this;
  }

  public TrainData addTripsItem(TripDto tripsItem) {
    this.trips.add(tripsItem);
    return this;
  }

  /**
   * Get trips
   * @return trips
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<TripDto> getTrips() {
    return trips;
  }

  public void setTrips(List<TripDto> trips) {
    this.trips = trips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainData trainData = (TrainData) o;
    return Objects.equals(this.goToInformation, trainData.goToInformation) &&
        Objects.equals(this.station, trainData.station) &&
        Objects.equals(this.trips, trainData.trips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goToInformation, station, trips);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainData {\n");
    
    sb.append("    goToInformation: ").append(toIndentedString(goToInformation)).append("\n");
    sb.append("    station: ").append(toIndentedString(station)).append("\n");
    sb.append("    trips: ").append(toIndentedString(trips)).append("\n");
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

