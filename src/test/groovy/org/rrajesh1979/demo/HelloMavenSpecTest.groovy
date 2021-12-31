package org.rrajesh1979.demo

import spock.lang.Specification

class HelloMavenSpecTest extends Specification {
  def "getMessage"() {
      when:
        def foo = "Inside Groovy Spock Spec"
      then:
      println foo
      true
  }
}
