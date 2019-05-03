package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TripDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-03T10:14:46.605Z[GMT]")

public class TripDto   {
  @JsonProperty("cancelled")
  private Boolean cancelled;

  @JsonProperty("delay")
  private Integer delay;

  @JsonProperty("departureTime")
  private OffsetDateTime departureTime;

  @JsonProperty("direction")
  private String direction;

  @JsonProperty("directionToDisplay")
  private String directionToDisplay;

  @JsonProperty("platform")
  private String platform;

  @JsonProperty("trainIdentifier")
  private String trainIdentifier;

  @JsonProperty("vehicleType")
  private String vehicleType;

  @JsonProperty("via")
  @Valid
  private List<String> via = new ArrayList<>();

  @JsonProperty("viaToDisplay")
  private String viaToDisplay;

  public TripDto cancelled(Boolean cancelled) {
    this.cancelled = cancelled;
    return this;
  }

  /**
   * Get cancelled
   * @return cancelled
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean getCancelled() {
    return cancelled;
  }

  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  public TripDto delay(Integer delay) {
    this.delay = delay;
    return this;
  }

  /**
   * Get delay
   * @return delay
  */
  @ApiModelProperty(value = "")


  public Integer getDelay() {
    return delay;
  }

  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  public TripDto departureTime(OffsetDateTime departureTime) {
    this.departureTime = departureTime;
    return this;
  }

  /**
   * Get departureTime
   * @return departureTime
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(OffsetDateTime departureTime) {
    this.departureTime = departureTime;
  }

  public TripDto direction(String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public TripDto directionToDisplay(String directionToDisplay) {
    this.directionToDisplay = directionToDisplay;
    return this;
  }

  /**
   * Get directionToDisplay
   * @return directionToDisplay
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDirectionToDisplay() {
    return directionToDisplay;
  }

  public void setDirectionToDisplay(String directionToDisplay) {
    this.directionToDisplay = directionToDisplay;
  }

  public TripDto platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @ApiModelProperty(value = "")


  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public TripDto trainIdentifier(String trainIdentifier) {
    this.trainIdentifier = trainIdentifier;
    return this;
  }

  /**
   * Get trainIdentifier
   * @return trainIdentifier
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTrainIdentifier() {
    return trainIdentifier;
  }

  public void setTrainIdentifier(String trainIdentifier) {
    this.trainIdentifier = trainIdentifier;
  }

  public TripDto vehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

  /**
   * Get vehicleType
   * @return vehicleType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public TripDto via(List<String> via) {
    this.via = via;
    return this;
  }

  public TripDto addViaItem(String viaItem) {
    this.via.add(viaItem);
    return this;
  }

  /**
   * Get via
   * @return via
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getVia() {
    return via;
  }

  public void setVia(List<String> via) {
    this.via = via;
  }

  public TripDto viaToDisplay(String viaToDisplay) {
    this.viaToDisplay = viaToDisplay;
    return this;
  }

  /**
   * Get viaToDisplay
   * @return viaToDisplay
  */
  @ApiModelProperty(value = "")


  public String getViaToDisplay() {
    return viaToDisplay;
  }

  public void setViaToDisplay(String viaToDisplay) {
    this.viaToDisplay = viaToDisplay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripDto tripDto = (TripDto) o;
    return Objects.equals(this.cancelled, tripDto.cancelled) &&
        Objects.equals(this.delay, tripDto.delay) &&
        Objects.equals(this.departureTime, tripDto.departureTime) &&
        Objects.equals(this.direction, tripDto.direction) &&
        Objects.equals(this.directionToDisplay, tripDto.directionToDisplay) &&
        Objects.equals(this.platform, tripDto.platform) &&
        Objects.equals(this.trainIdentifier, tripDto.trainIdentifier) &&
        Objects.equals(this.vehicleType, tripDto.vehicleType) &&
        Objects.equals(this.via, tripDto.via) &&
        Objects.equals(this.viaToDisplay, tripDto.viaToDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelled, delay, departureTime, direction, directionToDisplay, platform, trainIdentifier, vehicleType, via, viaToDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripDto {\n");
    
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    directionToDisplay: ").append(toIndentedString(directionToDisplay)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    trainIdentifier: ").append(toIndentedString(trainIdentifier)).append("\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
    sb.append("    via: ").append(toIndentedString(via)).append("\n");
    sb.append("    viaToDisplay: ").append(toIndentedString(viaToDisplay)).append("\n");
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

