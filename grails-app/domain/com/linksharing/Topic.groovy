package com.linksharing

import com.linksharing.Resource
import com.linksharing.Subscription

class Topic {
    String tname;
    String createdBy;
    Date dateCreated;
    Date lastUpdated;
    enum Visibility{
        Public,Private
    }
    Visibility visibility
    static belongsTo=[createdByuser:User]
    static hasMany=[subscriptions: Subscription, resources: Resource]
    static constraints={
        tname nullable:false,maxSize: 255
        createdBy nullable:false,maxSize:255
    }
    static mapping={
        table:"topic"
    }

}
