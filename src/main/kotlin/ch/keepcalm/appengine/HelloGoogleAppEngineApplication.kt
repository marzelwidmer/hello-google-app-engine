package ch.keepcalm.appengine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloGoogleAppEngineApplication

fun main(args: Array<String>) {
    runApplication<HelloGoogleAppEngineApplication>(*args)

}


