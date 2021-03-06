package bookmarks.exception;

import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BookmarkControllerAdvice
    {

	@ResponseBody
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	VndErrors userNotFoundExceptionHanlder(UserNotFoundException ex)
	{
	    return new VndErrors("error", ex.getMessage());
	}
    }
