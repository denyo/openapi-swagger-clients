package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WeatherData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-03T10:14:46.605Z[GMT]")

public class WeatherData   {
  @JsonProperty("temperature")
  private Integer temperature;

  /**
   * Gets or Sets weatherMainDescription
   */
  public enum WeatherMainDescriptionEnum {
    CLEAR_SKY("CLEAR_SKY"),
    
    FEW_CLOUDS("FEW_CLOUDS"),
    
    SCATTERED_CLOUDS("SCATTERED_CLOUDS"),
    
    BROKEN_CLOUDS("BROKEN_CLOUDS"),
    
    SHOWER_RAIN("SHOWER_RAIN"),
    
    RAIN("RAIN"),
    
    THUNDERSTORM("THUNDERSTORM"),
    
    SNOW("SNOW"),
    
    MIST("MIST");

    private String value;

    WeatherMainDescriptionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WeatherMainDescriptionEnum fromValue(String text) {
      for (WeatherMainDescriptionEnum b : WeatherMainDescriptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("weatherMainDescription")
  private WeatherMainDescriptionEnum weatherMainDescription;

  @JsonProperty("willRainToday")
  private Boolean willRainToday;

  public WeatherData temperature(Integer temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * @return temperature
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getTemperature() {
    return temperature;
  }

  public void setTemperature(Integer temperature) {
    this.temperature = temperature;
  }

  public WeatherData weatherMainDescription(WeatherMainDescriptionEnum weatherMainDescription) {
    this.weatherMainDescription = weatherMainDescription;
    return this;
  }

  /**
   * Get weatherMainDescription
   * @return weatherMainDescription
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public WeatherMainDescriptionEnum getWeatherMainDescription() {
    return weatherMainDescription;
  }

  public void setWeatherMainDescription(WeatherMainDescriptionEnum weatherMainDescription) {
    this.weatherMainDescription = weatherMainDescription;
  }

  public WeatherData willRainToday(Boolean willRainToday) {
    this.willRainToday = willRainToday;
    return this;
  }

  /**
   * Get willRainToday
   * @return willRainToday
  */
  @ApiModelProperty(value = "")


  public Boolean getWillRainToday() {
    return willRainToday;
  }

  public void setWillRainToday(Boolean willRainToday) {
    this.willRainToday = willRainToday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeatherData weatherData = (WeatherData) o;
    return Objects.equals(this.temperature, weatherData.temperature) &&
        Objects.equals(this.weatherMainDescription, weatherData.weatherMainDescription) &&
        Objects.equals(this.willRainToday, weatherData.willRainToday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temperature, weatherMainDescription, willRainToday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeatherData {\n");
    
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    weatherMainDescription: ").append(toIndentedString(weatherMainDescription)).append("\n");
    sb.append("    willRainToday: ").append(toIndentedString(willRainToday)).append("\n");
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

