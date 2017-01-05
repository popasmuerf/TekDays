/***
 * Excerpted from "Grails 2: A Quick-Start Guide",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/dkgrails2 for more book information.
***/
package com.tekdays

class TekMessage {
    String subject
    String content
    TekMessage parent
    TekEvent event
    TekUser author
    static constraints = {
        subject blank: false
        content blank: false, maxSize: 2000
        parent nullable: true
        author nullable: false 
    }
    static belongsTo = TekEvent
}
