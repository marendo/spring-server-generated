/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Todo;
import io.swagger.model.TodoExt;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-08T14:51:46.070Z")

@Api(value = "todos", description = "the todos API")
public interface TodosApi {

    @ApiOperation(value = "Return all todos", nickname = "todosGet", notes = "", response = TodoExt.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TodoExt.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Definition generated from Swagger Inspector") })
    @RequestMapping(value = "/todos",
        method = RequestMethod.GET)
    ResponseEntity<List<TodoExt>> todosGet();


    @ApiOperation(value = "Delete todo {id}", nickname = "todosIdDelete", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Definition generated from Swagger Inspector") })
    @RequestMapping(value = "/todos/{id}",
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> todosIdDelete(@ApiParam(value = "",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "Return todo {id}", nickname = "todosIdGet", notes = "", response = TodoExt.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TodoExt.class),
        @ApiResponse(code = 200, message = "Definition generated from Swagger Inspector") })
    @RequestMapping(value = "/todos/{id}",
        method = RequestMethod.GET)
    ResponseEntity<TodoExt> todosIdGet(@ApiParam(value = "",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "Modify todo {id}", nickname = "todosIdPut", notes = "", response = TodoExt.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TodoExt.class),
        @ApiResponse(code = 200, message = "Definition generated from Swagger Inspector") })
    @RequestMapping(value = "/todos/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<TodoExt> todosIdPut(@ApiParam(value = "",required=true) @PathVariable("id") String id,@ApiParam(value = ""  )  @Valid @RequestBody Todo body);


    @ApiOperation(value = "Add todo", nickname = "todosPost", notes = "", response = TodoExt.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TodoExt.class),
        @ApiResponse(code = 200, message = "Definition generated from Swagger Inspector") })
    @RequestMapping(value = "/todos",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<TodoExt> todosPost(@ApiParam(value = ""  )  @Valid @RequestBody Todo body);

}
