package com.tekdays

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class SponsorSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }
    void "test toString"(){
        when:"a Sponsor has been instantiated"
        def sponsor = new Sponsor(name:'Anders Heilsberg',
    			                        website: 'http://microsoft.com',
    			                        description: null,logo:null)
        then:"the toString method will return fullName."
        sponsor.toString()=='Anders Heilsberg'
    }
}
