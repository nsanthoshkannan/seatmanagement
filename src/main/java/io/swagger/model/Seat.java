package io.swagger.model;

import java.util.Date;
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
 * Seat
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-03-03T07:11:12.073Z")




public class Seat   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("floorid")
  private Long floorid = null;

  @JsonProperty("seatnumber")
  private Long seatnumber = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("updatedtime")
  private Date updatedtime = null;

  public Seat id(Long id) {
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

  public Seat floorid(Long floorid) {
    this.floorid = floorid;
    return this;
  }

  /**
   * Get floorid
   * @return floorid
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getFloorid() {
    return floorid;
  }

  public void setFloorid(Long floorid) {
    this.floorid = floorid;
  }

  public Seat seatnumber(Long seatnumber) {
    this.seatnumber = seatnumber;
    return this;
  }

  /**
   * Get seatnumber
   * @return seatnumber
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getSeatnumber() {
    return seatnumber;
  }

  public void setSeatnumber(Long seatnumber) {
    this.seatnumber = seatnumber;
  }

  public Seat description(String description) {
    this.description = description;
    return this;
  }

  /**
   * More info on the Seat
   * @return description
  **/
  @ApiModelProperty(value = "More info on the Seat")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Seat status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the Seat
   * @return status
  **/
  @ApiModelProperty(value = "Status of the Seat")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Seat updatedtime(Date updatedtime) {
    this.updatedtime = updatedtime;
    return this;
  }

  /**
   * Get updatedtime
   * @return updatedtime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Date getUpdatedtime() {
    return updatedtime;
  }

  public void setUpdatedtime(Date updatedtime) {
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
    Seat seat = (Seat) o;
    return Objects.equals(this.id, seat.id) &&
        Objects.equals(this.floorid, seat.floorid) &&
        Objects.equals(this.seatnumber, seat.seatnumber) &&
        Objects.equals(this.description, seat.description) &&
        Objects.equals(this.status, seat.status) &&
        Objects.equals(this.updatedtime, seat.updatedtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, floorid, seatnumber, description, status, updatedtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seat {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    floorid: ").append(toIndentedString(floorid)).append("\n");
    sb.append("    seatnumber: ").append(toIndentedString(seatnumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

