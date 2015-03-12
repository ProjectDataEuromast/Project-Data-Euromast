

import java.util.Date;
import java.util.List;
import twitter4j.*;
import twitter4j.FilterQuery;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

public class twitter {

   
    public static void main(String[] args) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey("o1EWhGiS4jNC6zL7h1hRZ2v8I");
        cb.setOAuthConsumerSecret("qAWPnkCd3fBREfgxnWZmwYXCR8Jwo1kALFBX30OY6XOIV87cUm");
        cb.setOAuthAccessToken("192675086-v0OFPNPFFJyafSlLJgHIvA26EMp8xatD9pgYzn3w");
        cb.setOAuthAccessTokenSecret("5f7vPKZR9d4l51rmLW6a8S3BejyRIZMLXSVv57d04G2cx");
        
           TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();

        StatusListener listener = new StatusListener() {

            @Override
            public void onException(Exception arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onDeletionNotice(StatusDeletionNotice arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onScrubGeo(long arg0, long arg1) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onStatus(Status status) {
                User user = status.getUser();
                
                // gets Username
                String username = status.getUser().getScreenName();
                System.out.println("user name: " + username);
                // gets location
                String profileLocation = user.getLocation();
                System.out.println("Location: " + profileLocation);
                //gets id
                long tweetId = status.getId(); 
                System.out.println("id: " + tweetId);
                //gets date
                Date tweetDate = user.getCreatedAt();
                System.out.println("date: " + tweetDate);
                //gets language
                String userLang = user.getLang();
                System.out.println("Language: " + userLang);
                //gets text
                String content = status.getText();
                System.out.println(content +"\n");

            }

            @Override
            public void onTrackLimitationNotice(int arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onStallWarning(StallWarning sw) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };
        FilterQuery fq = new FilterQuery();
    
        String keywords[] = {"euromast"};

        fq.track(keywords);

        twitterStream.addListener(listener);
        twitterStream.filter(fq); 
        ////////////////////////////////
        
        
    } 
}