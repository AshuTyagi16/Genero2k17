package in.genero.pirates.genero2k17.models;

import java.util.ArrayList;

/**
 * Created by Sasuke on 10/3/2017.
 */

public class Event {
    private int image;
    private String clubName;

    private ArrayList<EventDetail> eventDetails;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public ArrayList<EventDetail> getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(ArrayList<EventDetail> eventDetails) {
        this.eventDetails = eventDetails;
    }

}
