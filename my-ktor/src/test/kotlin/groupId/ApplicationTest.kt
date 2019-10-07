package groupId.myKtor

import io.kotlintest.properties.assertAll
import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe

import khttp.get

class ApplicationTest: StringSpec() {
  init {
    "/greeting" {
      val text =  get("http://localhost:8080/greeting").text
      text shouldBe "{\"content\":\"Hello, World\"}"
    }
    "/greeting/{name}" {
      val text =  get("http://localhost:8080/greeting/jack").text
      text shouldBe "{\"content\":\"Hello, jack\"}"
    }
  }
}
