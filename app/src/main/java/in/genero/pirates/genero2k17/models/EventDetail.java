package in.genero.pirates.genero2k17.models;

/**
 * Created by Sasuke on 10/3/2017.
 */

public class EventDetail {

    private String evevtName;
    private String eventDescription;
    private String eventType;
    private String eventRules;

    public String getEventRules() {
        return checkResponse(eventRules);
    }

    public void setEventRules(String eventRules) {
        this.eventRules = eventRules;
    }

    private String eventDuration;

    public String getEventType() {
        return checkResponse(eventType);
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventDuration() {
        return checkResponse(eventDuration);
    }

    public void setEventDuration(String eventDuration) {
        this.eventDuration = eventDuration;
    }

    public String getEvevtName() {
        return checkResponse(evevtName);
    }

    public void setEvevtName(String evevtName) {
        this.evevtName = evevtName;
    }

    public String getEventDescription() {
        return checkResponse(eventDescription);
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    private String checkResponse(String response) {
        if (response != null)
            return response;
        else
            return "";

    }
}
