package ch.keepcalm.appengine.message

import org.springframework.hateoas.MediaTypes
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class APIController {

    @GetMapping(value = arrayOf("/"), produces = arrayOf(MediaTypes.HAL_JSON_UTF8_VALUE))
     fun message(@RequestParam(value = "message", defaultValue = "Welcome to the Google AppEngine.") message: String): Message {
        return Message(message)
    }

}
