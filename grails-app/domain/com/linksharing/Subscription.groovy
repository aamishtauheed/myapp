package com.linksharing

class Subscription {
    static belongsTo=[user:User, topic:Topic]
    enum seriousness {
        CASUAL,SERIOUS,VERYSERIOUS;
    }
    Date dateCreated;
    static constraints={

    }
    static mappings={
        table:"subscription"
    }

}
