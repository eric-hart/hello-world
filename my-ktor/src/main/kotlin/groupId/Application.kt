package groupId.myKtor

import io.ktor.jackson.*
import io.ktor.features.*
import io.ktor.server.netty.*
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.server.engine.*

fun main(args: Array<String>) {
  embeddedServer(
    Netty,
    watchPaths = listOf("solutions/exercise4"),
    port = 8080,
    module = Application::mymodule
  ).apply { start(wait = true) }
}

fun Application.mymodule() {
  install(ContentNegotiation) {
    jackson {
      // Configure Jackson's ObjectMapper here
    }
  }
  routing {
    get("/greeting") {
      val greeting = object {
        var content: String = "Hello, World"
      }
      call.respond(greeting)
    }
    get("/greeting/{name}") {
      val name = call.parameters["name"]
      val template = "Hello, $name"
      val greeting = object {
        var content: String = String.format(template)
      }
      call.respond(greeting)
    }
  }
}
