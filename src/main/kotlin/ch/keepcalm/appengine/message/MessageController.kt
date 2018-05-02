package ch.keepcalm.appengine.message

import org.springframework.hateoas.MediaTypes
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class APIController {

    @GetMapping(value = arrayOf("/"), produces = arrayOf(MediaTypes.HAL_JSON_UTF8_VALUE))
     fun message(): Message {
        return Message("Welcome to the Google AppEngine.")
    }


}
