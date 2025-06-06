//package sorfware.example.sorfware.config;
//
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.EnableMongoAuditing;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//import java.util.concurrent.TimeUnit;
//
//@Configuration
//public class MongoConfig {
//
//    @Bean
//    public MongoClient mongoClient() {
//        String connectionString = "mongodb://mongo:rDhdllSDnjdviZDthcbvTgrjTXcoXpDZ@ballast.proxy.rlwy.net:57328";
//        System.out.println("Connecting to MongoDB with connection string: " + connectionString);
//        try {
//            MongoClientSettings settings = MongoClientSettings.builder()
//                    .applyConnectionString(new ConnectionString(connectionString))
//                    .applyToSocketSettings(builder ->
//                            builder.connectTimeout(30, TimeUnit.SECONDS)
//                                    .readTimeout(30, TimeUnit.SECONDS))
//                    .build();
//            MongoClient client = MongoClients.create(settings);
//            System.out.println("Successfully connected to MongoDB");
//            return client;
//        } catch (Exception e) {
//            System.err.println("Error connecting to MongoDB: " + e.getMessage());
//            e.printStackTrace();
//            throw e;
//        }
//    }
//}
