package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GoToDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-03T10:14:46.605Z[GMT]")

public class GoToDetail   {
  @JsonProperty("detail")
  private String detail;

  @JsonProperty("requiredTime")
  private String requiredTime;

  public GoToDetail detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public GoToDetail requiredTime(String requiredTime) {
    this.requiredTime = requiredTime;
    return this;
  }

  /**
   * Get requiredTime
   * @return requiredTime
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRequiredTime() {
    return requiredTime;
  }

  public void setRequiredTime(String requiredTime) {
    this.requiredTime = requiredTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoToDetail goToDetail = (GoToDetail) o;
    return Objects.equals(this.detail, goToDetail.detail) &&
        Objects.equals(this.requiredTime, goToDetail.requiredTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, requiredTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoToDetail {\n");
    
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    requiredTime: ").append(toIndentedString(requiredTime)).append("\n");
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

