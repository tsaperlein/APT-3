package gr.upatras.rest.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class MessageController {
	@Autowired
	private IMessageService messageService;
	private static final Logger log = LoggerFactory.getLogger(MessageController.class);
	
	@ApiOperation(value = "Posts a Message", notes = "This operation creates a Message entity.", response = Message.class)
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created", response = Message.class),
							@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
							@ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
							@ApiResponse(code = 403, message = "Forbidden", response = Error.class),
							@ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
							@ApiResponse(code = 409, message = "Conflict", response = Error.class),
							@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) 
	})
	@RequestMapping(value = "/messsage", produces = { "application/json;charset=utf-8" }, consumes = {"application/json;charset=utf-8" }, method = RequestMethod.POST)
	public ResponseEntity<Message> postMessage(@ApiParam(value = "The message to be posted", required = true)@RequestBody String text) {
		log.info( "Will post a new message" );
		Message message = messageService.postMessage(text);
		messageService.publishMessage(message);
		return new ResponseEntity<Message>( message, HttpStatus.OK);
	}

}