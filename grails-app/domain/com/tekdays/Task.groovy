/***
 * Excerpted from "Grails 2: A Quick-Start Guide",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/dkgrails2 for more book information.
***/
package com.tekdays
class Task {
    String title
    String notes
    TekUser assignedTo
    Date dueDate
    TekEvent event
    Boolean completed
    String toString(){
        title
    }
    static constraints = {
        title blank: false
        notes blank: true, nullable: true, maxSize: 5000
        assignedTo nullable: true
        dueDate nullable: true
        completed nullable: true
    }
    static belongsTo = TekEvent
}
