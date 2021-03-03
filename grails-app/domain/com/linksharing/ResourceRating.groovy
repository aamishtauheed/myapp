package com.linksharing

import com.linksharing.Resource

class ResourceRating {
    static belongsTo=[resource: Resource, user:User]
    int score;
    static constraints={
        score nullable:false,maxSize=5;
    }
    static mapping={
        table:"resourceRating"
    }
}
