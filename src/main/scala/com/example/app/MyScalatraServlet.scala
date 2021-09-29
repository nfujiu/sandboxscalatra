package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

  get("/test/:name") {
    s"hello, ${params("name")}."
  }

  get("/error") {
    <h1>Some Error</h1>
  }
}
