package com.linksharing

class LinkResources {
    String urls
    static belongsTo=[resource:Resource]
    static constraints={
        urls nullable:false, maxSize=300;
    }
}
