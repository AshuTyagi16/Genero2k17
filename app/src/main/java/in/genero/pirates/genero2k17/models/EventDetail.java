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
        return eventRules;
    }

    public void setEventRules(String eventRules) {
        this.eventRules = eventRules;
    }

    private String eventDuration;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(String eventDuration) {
        this.eventDuration = eventDuration;
    }

    public String getEvevtName() {
        return evevtName;
    }

    public void setEvevtName(String evevtName) {
        this.evevtName = evevtName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
}
