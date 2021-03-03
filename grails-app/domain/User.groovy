class User {
        String email;
        String psswd;
        String username;
        String firstName;
        String lastName;
        boolean active;
        boolean admin;
        byte image;
        Date dateCreated;
        Date lastUpdated;
        static hasMany=[
                topics:Topic,subscriptions:Subscription,resources:Resource,readingItems:ReadingItem,resouceRatings:ResourceRating
        ]


        static constraints = {
            firstName nullable: false, maxSize: 255
            lastName nullable: false, maxSize: 255
            username nullable:false,maxSize:20
            email nullable:false,maxSize:40
            psswd nullable:false,maxSize:255
            admin nullable:true
            active nullable: true
            image nullable: true
        }
        static mapping={
        table: "User_info"
        version: false

    }

}
