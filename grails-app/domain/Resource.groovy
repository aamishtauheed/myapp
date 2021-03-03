class Resource {
    String title;
    String description;
    static belongsTo=[createdBy:User,topic:Topic]
    static hasMany=[readingItems:ReadingItem,]
    Date datecreated;
    Date lastUpdated;

    static constraints={
        createdBy nullable:false;
        title nullable:false,maxSize:100;
        description nullable:true,maxSize:1000;
        title unique:"topic";
    }
    static mapping={
        table:"resource"
    }
}
