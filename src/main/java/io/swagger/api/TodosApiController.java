package io.swagger.api;

import io.swagger.model.Todo;
import io.swagger.model.TodoExt;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-08T14:51:46.070Z")

@Controller
public class TodosApiController implements TodosApi {

    private static final Logger log = LoggerFactory.getLogger(TodosApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TodosApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<TodoExt>> todosGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<TodoExt>>(objectMapper.readValue("[ {  \"createdAt\" : \"createdAt\",  \"id\" : \"id\",  \"completed\" : true,  \"title\" : \"title\"}, {  \"createdAt\" : \"createdAt\",  \"id\" : \"id\",  \"completed\" : true,  \"title\" : \"title\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<TodoExt>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<TodoExt>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> todosIdDelete(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TodoExt> todosIdGet(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TodoExt>(objectMapper.readValue("{  \"createdAt\" : \"createdAt\",  \"id\" : \"id\",  \"completed\" : true,  \"title\" : \"title\"}", TodoExt.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TodoExt>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TodoExt>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TodoExt> todosIdPut(@ApiParam(value = "",required=true) @PathVariable("id") String id,@ApiParam(value = ""  )  @Valid @RequestBody Todo body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TodoExt>(objectMapper.readValue("{  \"createdAt\" : \"createdAt\",  \"id\" : \"id\",  \"completed\" : true,  \"title\" : \"title\"}", TodoExt.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TodoExt>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TodoExt>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TodoExt> todosPost(@ApiParam(value = ""  )  @Valid @RequestBody Todo body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TodoExt>(objectMapper.readValue("{  \"createdAt\" : \"createdAt\",  \"id\" : \"id\",  \"completed\" : true,  \"title\" : \"title\"}", TodoExt.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TodoExt>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TodoExt>(HttpStatus.NOT_IMPLEMENTED);
    }

}
