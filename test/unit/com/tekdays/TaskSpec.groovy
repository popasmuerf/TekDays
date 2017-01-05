package com.tekdays

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class TaskSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }
    void "test toString"(){
        when:"a tekEvent has a name and a city"
        def task = new Task(title:'Event Task',
    			                        notes: 'notes',
    			                        assignedTo: null,dueDate:null,event:null)
        then:"the toString method will combine them."
        task.toString()=='Event Task'
    }
}
