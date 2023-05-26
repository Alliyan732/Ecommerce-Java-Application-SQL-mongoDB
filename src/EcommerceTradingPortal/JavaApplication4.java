package EcommerceTradingPortal;
import java.util.List;
import com.mongodb.*;
import com.mongodb.client.AggregateIterable;
import java.util.Arrays;
class JavaApplication4{
    public static void main(String args[]){
        try{
            MongoClient mongoclient = new MongoClient( new MongoClientURI("mongodb://localhost:27017"));
            DB mydb = mongoclient.getDB("test");
            DBCollection mycollection = mydb.getCollection("my_collection");
//            // Insert 2 employees in my_collection
//            List<String> hobbies = Arrays.asList("Cricket", "paragliding");
//            DBObject employee = new BasicDBObject("_id", "emp128").append("first_name", "Steven")
//            .append("last_name", "Root")
//            .append("hobbies", hobbies)
//            .append("age", 45)
//            .append("Education", new BasicDBObject("Undergrad", "Stanford").append("Graduation", "Comsats"));
//            
//            mycollection.insert(employee);   
//            hobbies = Arrays.asList("Karate", "paragliding");
//            employee = new BasicDBObject("_id", "emp129").append("first_name", "Steven")
//            .append("last_name", "Cook")
//            .append("hobbies", hobbies)
//            .append("age", 40)
//            .append("Education", new BasicDBObject("Undergrad", "Stanford").append("Graduation", "MIT"));
//            mycollection.insert(employee);
            
//            // Find employees with age less than 45
//            BasicDBObject query = new BasicDBObject("age", new BasicDBObject("$lt", 45));
//            // Print out the filtered employees
//            DBCursor cursor = mycollection.find(query);
//            while(cursor.hasNext()){
//                System.out.println(cursor.next());
//            }
            // Count employees hobby-wise
            // Aggregate API call require array of documents which each document represents a stage
//            AggregationOutput resultantCollection = mycollection.aggregate(Arrays.asList(
//            new BasicDBObject("$unwind", "$hobbies"), new BasicDBObject("$group", new BasicDBObject("_id", "$hobbies").append("HobbyCount", new BasicDBObject("$sum", 1))),
//            new BasicDBObject("$sort", new BasicDBObject("HobbyCount", -1))));
//            // Print out the aggregated results
//            for (DBObject obj : resultantCollection.results()) {
//                System.out.println(obj.toString());
//            }
            // Add new hobby for the employee whose ID is emp125
            mycollection.update(new BasicDBObject("_id","emp128"), new BasicDBObject("$push", new BasicDBObject("hobbies","Tennis")));
            // Print out the all the employees
            DBCursor cursor = mycollection.find();
            while(cursor.hasNext()){
                System.out.println(cursor.next());
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}