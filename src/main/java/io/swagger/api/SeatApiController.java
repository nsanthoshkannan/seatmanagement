package io.swagger.api;

import io.swagger.model.Floor;
import io.swagger.model.Seat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-28T13:19:30.258Z")

@Controller
public class SeatApiController implements SeatApi {

    private static final Logger log = LoggerFactory.getLogger(SeatApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SeatApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addSeat(@ApiParam(value = "Seat details that needs to be added to a Floor" ,required=true )  @Valid @RequestBody Seat body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteSeat(@ApiParam(value = "Floor id to delete",required=true) @PathVariable("seatId") Long seatId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Floor> getSeatById(@ApiParam(value = "ID of Seat to return",required=true) @PathVariable("seatId") Long seatId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Floor>(objectMapper.readValue("<null>  <id>123456789</id>  <name>First FLoor</name>  <description>aeiou</description>  <updatedtime>2000-01-23T04:56:07.000Z</updatedtime></null>", Floor.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Floor>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Floor>(objectMapper.readValue("{  \"updatedtime\" : \"2000-01-23T04:56:07.000+00:00\",  \"name\" : \"First FLoor\",  \"description\" : \"description\",  \"id\" : 0}", Floor.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Floor>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Floor>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateSeat(@ApiParam(value = "Seat details that needs to be added to a Floor" ,required=true )  @Valid @RequestBody Seat body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
