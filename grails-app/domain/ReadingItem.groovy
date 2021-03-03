class ReadingItem {
    static belongsTo=[resource:Resource,user:User]
    boolean isRead
    static constraints={
        isRead nullable:false;
    }
    static mapping={
        table:"readingItem"
    }
}
