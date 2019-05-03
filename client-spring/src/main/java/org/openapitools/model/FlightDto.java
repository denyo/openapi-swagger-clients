package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-03T10:14:46.605Z[GMT]")

public class FlightDto   {
  @JsonProperty("counter")
  private String counter;

  @JsonProperty("departureTime")
  private OffsetDateTime departureTime;

  @JsonProperty("destination")
  private String destination;

  @JsonProperty("flightNo")
  private String flightNo;

  @JsonProperty("gate")
  private String gate;

  @JsonProperty("status")
  private String status;

  @JsonProperty("terminal")
  private String terminal;

  public FlightDto counter(String counter) {
    this.counter = counter;
    return this;
  }

  /**
   * Get counter
   * @return counter
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCounter() {
    return counter;
  }

  public void setCounter(String counter) {
    this.counter = counter;
  }

  public FlightDto departureTime(OffsetDateTime departureTime) {
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

  public FlightDto destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public FlightDto flightNo(String flightNo) {
    this.flightNo = flightNo;
    return this;
  }

  /**
   * Get flightNo
   * @return flightNo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFlightNo() {
    return flightNo;
  }

  public void setFlightNo(String flightNo) {
    this.flightNo = flightNo;
  }

  public FlightDto gate(String gate) {
    this.gate = gate;
    return this;
  }

  /**
   * Get gate
   * @return gate
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getGate() {
    return gate;
  }

  public void setGate(String gate) {
    this.gate = gate;
  }

  public FlightDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FlightDto terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }

  /**
   * Get terminal
   * @return terminal
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTerminal() {
    return terminal;
  }

  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightDto flightDto = (FlightDto) o;
    return Objects.equals(this.counter, flightDto.counter) &&
        Objects.equals(this.departureTime, flightDto.departureTime) &&
        Objects.equals(this.destination, flightDto.destination) &&
        Objects.equals(this.flightNo, flightDto.flightNo) &&
        Objects.equals(this.gate, flightDto.gate) &&
        Objects.equals(this.status, flightDto.status) &&
        Objects.equals(this.terminal, flightDto.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counter, departureTime, destination, flightNo, gate, status, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightDto {\n");
    
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    flightNo: ").append(toIndentedString(flightNo)).append("\n");
    sb.append("    gate: ").append(toIndentedString(gate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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

