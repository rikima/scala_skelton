package com.rikima

import org.eintr.loglady.Logging

class Test extends Logging {
  log.info("Hello, Log Lady")

  log.warn("We all float (%.4f) down here", 3.141592)

  log.debug("Some random stuff: %d %s %x", 42, List(0, 1, 1, 2, 3, 5), -559038737)

  log.error("Formatted date: %1$tm %1$te,%1$tY", new java.util.Date)

  try {
    throw new Exception("Oops!")
  } catch {
    case exc: Exception => {
      log.error(exc, "Something bad happened")
    }
  }
}

object Test {

}