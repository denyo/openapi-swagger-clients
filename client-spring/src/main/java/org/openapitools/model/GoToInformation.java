package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GoToDetail;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GoToInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-03T10:14:46.605Z[GMT]")

public class GoToInformation   {
  @JsonProperty("byBike")
  private GoToDetail byBike = null;

  @JsonProperty("byLocalTransport")
  private GoToDetail byLocalTransport = null;

  @JsonProperty("byTaxi")
  private GoToDetail byTaxi = null;

  @JsonProperty("byWalk")
  private GoToDetail byWalk = null;

  public GoToInformation byBike(GoToDetail byBike) {
    this.byBike = byBike;
    return this;
  }

  /**
   * Get byBike
   * @return byBike
  */
  @ApiModelProperty(value = "")

  @Valid

  public GoToDetail getByBike() {
    return byBike;
  }

  public void setByBike(GoToDetail byBike) {
    this.byBike = byBike;
  }

  public GoToInformation byLocalTransport(GoToDetail byLocalTransport) {
    this.byLocalTransport = byLocalTransport;
    return this;
  }

  /**
   * Get byLocalTransport
   * @return byLocalTransport
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GoToDetail getByLocalTransport() {
    return byLocalTransport;
  }

  public void setByLocalTransport(GoToDetail byLocalTransport) {
    this.byLocalTransport = byLocalTransport;
  }

  public GoToInformation byTaxi(GoToDetail byTaxi) {
    this.byTaxi = byTaxi;
    return this;
  }

  /**
   * Get byTaxi
   * @return byTaxi
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GoToDetail getByTaxi() {
    return byTaxi;
  }

  public void setByTaxi(GoToDetail byTaxi) {
    this.byTaxi = byTaxi;
  }

  public GoToInformation byWalk(GoToDetail byWalk) {
    this.byWalk = byWalk;
    return this;
  }

  /**
   * Get byWalk
   * @return byWalk
  */
  @ApiModelProperty(value = "")

  @Valid

  public GoToDetail getByWalk() {
    return byWalk;
  }

  public void setByWalk(GoToDetail byWalk) {
    this.byWalk = byWalk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoToInformation goToInformation = (GoToInformation) o;
    return Objects.equals(this.byBike, goToInformation.byBike) &&
        Objects.equals(this.byLocalTransport, goToInformation.byLocalTransport) &&
        Objects.equals(this.byTaxi, goToInformation.byTaxi) &&
        Objects.equals(this.byWalk, goToInformation.byWalk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byBike, byLocalTransport, byTaxi, byWalk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoToInformation {\n");
    
    sb.append("    byBike: ").append(toIndentedString(byBike)).append("\n");
    sb.append("    byLocalTransport: ").append(toIndentedString(byLocalTransport)).append("\n");
    sb.append("    byTaxi: ").append(toIndentedString(byTaxi)).append("\n");
    sb.append("    byWalk: ").append(toIndentedString(byWalk)).append("\n");
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

