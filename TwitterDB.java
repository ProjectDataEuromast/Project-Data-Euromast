package data.project;

import twitter4j.*;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import java.util.List;

public class TwitterDB {
    
    public void tweetsRetrieve1() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey("o1EWhGiS4jNC6zL7h1hRZ2v8I");
        cb.setOAuthConsumerSecret("qAWPnkCd3fBREfgxnWZmwYXCR8Jwo1kALFBX30OY6XOIV87cUm");
        cb.setOAuthAccessToken("192675086-v0OFPNPFFJyafSlLJgHIvA26EMp8xatD9pgYzn3w");
        cb.setOAuthAccessTokenSecret("5f7vPKZR9d4l51rmLW6a8S3BejyRIZMLXSVv57d04G2cx");
        
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        
        try {
            Query query = new Query("Euromast");
            query.count(25);
            QueryResult result;
            result = twitter.search(query);
            List<Status> tweets = result.getTweets();
            for (Status tweet : tweets) {
                System.out.println(tweet.getCreatedAt() +  " - " + "@" + tweet.getUser().getScreenName() + " - " + tweet.getUser().getLocation() + " - " + tweet.getText());
            }

            System.exit(0);
            } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
            }
    }
    
    public void tweetsRetrieve2() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey("o1EWhGiS4jNC6zL7h1hRZ2v8I");
        cb.setOAuthConsumerSecret("qAWPnkCd3fBREfgxnWZmwYXCR8Jwo1kALFBX30OY6XOIV87cUm");
        cb.setOAuthAccessToken("192675086-v0OFPNPFFJyafSlLJgHIvA26EMp8xatD9pgYzn3w");
        cb.setOAuthAccessTokenSecret("5f7vPKZR9d4l51rmLW6a8S3BejyRIZMLXSVv57d04G2cx");
        
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        
        try {
            Query query = new Query("Euromast");
            query.count(50);
            QueryResult result;
            result = twitter.search(query);
            List<Status> tweets = result.getTweets();
            for (Status tweet : tweets) {
                System.out.println(tweet.getCreatedAt() +  " - " + "@" + tweet.getUser().getScreenName() + " - " + tweet.getUser().getLocation() + " - " + tweet.getText());
            }

            System.exit(0);
            } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
            }
    }
    
    public void tweetsRetrieve3() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey("o1EWhGiS4jNC6zL7h1hRZ2v8I");
        cb.setOAuthConsumerSecret("qAWPnkCd3fBREfgxnWZmwYXCR8Jwo1kALFBX30OY6XOIV87cUm");
        cb.setOAuthAccessToken("192675086-v0OFPNPFFJyafSlLJgHIvA26EMp8xatD9pgYzn3w");
        cb.setOAuthAccessTokenSecret("5f7vPKZR9d4l51rmLW6a8S3BejyRIZMLXSVv57d04G2cx");
        
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        
        try {
            Query query = new Query("Euromast");
            query.count(100);
            QueryResult result;
            result = twitter.search(query);
            List<Status> tweets = result.getTweets();
            for (Status tweet : tweets) {
                System.out.println(tweet.getCreatedAt() +  " - " + "@" + tweet.getUser().getScreenName() + " - " + tweet.getUser().getLocation() + " - " + tweet.getText());
            }

            System.exit(0);
            } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
            }
    }
}
