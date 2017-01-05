package com.tekdays

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class TekUserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }
    void "test toString"(){
        when:"a TekUser has been instantiated"
        def tekUser = new TekUser(fullName:'Lucy Lu',
    			                        userName: 'llu',
    			                        password: 'blu3gr33n',email:'llu@gmail.com',website:'http:lucylu.com',bio:'groovy developer esquire',)
        then:"the toString method will return fullName."
        tekUser.toString()=='Lucy Lu'
    }
}
