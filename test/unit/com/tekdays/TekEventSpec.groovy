package com.tekdays

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class TekEventSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }
    void "test toString"(){
        when:"a tekEvent has a name and a city"
        def tekEvent = new TekEvent(name:'Groovy One',
    			                        city: 'San Francisco',
    			                        organizer: 'John Doe')
        then:"the toString method will combine them."
        tekEvent.toString()=='Groovy One, San Francisco'
    }
}
