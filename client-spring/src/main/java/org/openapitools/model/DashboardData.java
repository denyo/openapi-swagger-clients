package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CarsharingData;
import org.openapitools.model.FlightData;
import org.openapitools.model.TrainData;
import org.openapitools.model.WeatherData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DashboardData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-03T10:14:46.605Z[GMT]")

public class DashboardData   {
  @JsonProperty("airport")
  private FlightData airport = null;

  @JsonProperty("carsharingData")
  @Valid
  private List<CarsharingData> carsharingData = new ArrayList<>();

  @JsonProperty("trainData")
  @Valid
  private List<TrainData> trainData = new ArrayList<>();

  @JsonProperty("weatherData")
  private WeatherData weatherData = null;

  public DashboardData airport(FlightData airport) {
    this.airport = airport;
    return this;
  }

  /**
   * Get airport
   * @return airport
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public FlightData getAirport() {
    return airport;
  }

  public void setAirport(FlightData airport) {
    this.airport = airport;
  }

  public DashboardData carsharingData(List<CarsharingData> carsharingData) {
    this.carsharingData = carsharingData;
    return this;
  }

  public DashboardData addCarsharingDataItem(CarsharingData carsharingDataItem) {
    this.carsharingData.add(carsharingDataItem);
    return this;
  }

  /**
   * Get carsharingData
   * @return carsharingData
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<CarsharingData> getCarsharingData() {
    return carsharingData;
  }

  public void setCarsharingData(List<CarsharingData> carsharingData) {
    this.carsharingData = carsharingData;
  }

  public DashboardData trainData(List<TrainData> trainData) {
    this.trainData = trainData;
    return this;
  }

  public DashboardData addTrainDataItem(TrainData trainDataItem) {
    this.trainData.add(trainDataItem);
    return this;
  }

  /**
   * Get trainData
   * @return trainData
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<TrainData> getTrainData() {
    return trainData;
  }

  public void setTrainData(List<TrainData> trainData) {
    this.trainData = trainData;
  }

  public DashboardData weatherData(WeatherData weatherData) {
    this.weatherData = weatherData;
    return this;
  }

  /**
   * Get weatherData
   * @return weatherData
  */
  @ApiModelProperty(value = "")

  @Valid

  public WeatherData getWeatherData() {
    return weatherData;
  }

  public void setWeatherData(WeatherData weatherData) {
    this.weatherData = weatherData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardData dashboardData = (DashboardData) o;
    return Objects.equals(this.airport, dashboardData.airport) &&
        Objects.equals(this.carsharingData, dashboardData.carsharingData) &&
        Objects.equals(this.trainData, dashboardData.trainData) &&
        Objects.equals(this.weatherData, dashboardData.weatherData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airport, carsharingData, trainData, weatherData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardData {\n");
    
    sb.append("    airport: ").append(toIndentedString(airport)).append("\n");
    sb.append("    carsharingData: ").append(toIndentedString(carsharingData)).append("\n");
    sb.append("    trainData: ").append(toIndentedString(trainData)).append("\n");
    sb.append("    weatherData: ").append(toIndentedString(weatherData)).append("\n");
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

