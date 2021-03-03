package io.swagger.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nokia.seatmanagement.core.db.SeatService;
import com.nokia.seatmanagement.models.Seats;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Floor;
import io.swagger.model.Seat;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-03-03T07:11:12.073Z")

@Controller
public class SeatApiController implements SeatApi {

    private static final Logger log = LoggerFactory.getLogger(SeatApiController.class);
    @Autowired
    SeatService seatService;
    
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SeatApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addSeat(@ApiParam(value = "Seat details that needs to be added to a Floor" ,required=true )  @Valid @RequestBody Seat body) {
        String accept = request.getHeader("Accept");
        
        Seats s = new Seats(body.getFloorid(), body.getSeatnumber(), body.getDescription(), body.getStatus());
        seatService.saveOrUpdate(s);
        
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteSeat(@ApiParam(value = "Floor id to delete",required=true) @PathVariable("seatId") Long seatId) {
        String accept = request.getHeader("Accept");
        seatService.delete(seatId);
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
       
    }

    public ResponseEntity<Seat> getSeatById(@ApiParam(value = "ID of Seat to return",required=true) @PathVariable("seatId") Long seatId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	
            	Seats dbseat= seatService.getSeatById(seatId);
            	Seat seatResponse = new Seat();
            	seatResponse.setId(dbseat.getId());
            	seatResponse.setSeatnumber(dbseat.getSeatNumber());
            	seatResponse.setFloorid(dbseat.getFloorId());
            	seatResponse.setDescription(dbseat.getDescription());
            	seatResponse.setStatus(dbseat.getStatus());
            	seatResponse.setUpdatedtime(dbseat.getUpdatedTime());
            	 return new ResponseEntity<Seat>(seatResponse, HttpStatus.OK);
                //return new ResponseEntity<Seat>(objectMapper.readValue("{  \"updatedtime\" : \"2000-01-23T04:56:07.000+00:00\",  \"name\" : \"First FLoor\",  \"description\" : \"description\",  \"id\" : 0}", Seat.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Seat>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Seat>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Seat>> getSeats() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Seat>>(objectMapper.readValue("[ {  \"floorid\" : 6,  \"updatedtime\" : \"2000-01-23T04:56:07.000+00:00\",  \"seatnumber\" : 1,  \"description\" : \"description\",  \"id\" : 0,  \"status\" : \"status\"}, {  \"floorid\" : 6,  \"updatedtime\" : \"2000-01-23T04:56:07.000+00:00\",  \"seatnumber\" : 1,  \"description\" : \"description\",  \"id\" : 0,  \"status\" : \"status\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Seat>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Seat>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateSeat(@ApiParam(value = "Seat details that needs to be added to a Floor" ,required=true )  @Valid @RequestBody Seat body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
