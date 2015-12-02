package socialmedia;

/**
 * Created by israelcarvajal on 12/2/15.
 */
public class Adapter implements SocialMediaEntry {
    YouTubeVideo video;
    public Adapter(YouTubeVideo argument){
        video = argument;
    }
    public String getUser(){
        return video.getAuthor();
    }
    public String getPostText(){
        return new String(video.getTitle() + ": " + video.getDescription());
    }
}
