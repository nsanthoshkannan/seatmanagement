package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Floor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-28T13:19:30.258Z")




public class Floor   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("updatedtime")
  private OffsetDateTime updatedtime = null;

  public Floor id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Floor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "First FLoor", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Floor description(String description) {
    this.description = description;
    return this;
  }

  /**
   * More info on the floor
   * @return description
  **/
  @ApiModelProperty(value = "More info on the floor")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Floor updatedtime(OffsetDateTime updatedtime) {
    this.updatedtime = updatedtime;
    return this;
  }

  /**
   * Get updatedtime
   * @return updatedtime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getUpdatedtime() {
    return updatedtime;
  }

  public void setUpdatedtime(OffsetDateTime updatedtime) {
    this.updatedtime = updatedtime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Floor floor = (Floor) o;
    return Objects.equals(this.id, floor.id) &&
        Objects.equals(this.name, floor.name) &&
        Objects.equals(this.description, floor.description) &&
        Objects.equals(this.updatedtime, floor.updatedtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, updatedtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Floor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    updatedtime: ").append(toIndentedString(updatedtime)).append("\n");
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

