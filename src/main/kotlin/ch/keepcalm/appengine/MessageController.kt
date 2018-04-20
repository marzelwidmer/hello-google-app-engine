package ch.keepcalm.appengine

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class APIController {


    @GetMapping(value = arrayOf("/"), produces = arrayOf("application/json"))
     fun message(): Message {
        return Message("Welcome to the Google AppEngine.")
    }


}
