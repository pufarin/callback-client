package net.gabrielkovacs.callbackclient.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="incoming")
public class ClientCallBackWithDate {

    public ClientCallBackWithDate() {
    }

    public ClientCallBackWithDate(String uuid, String call_back, Timestamp timeStamp, String eventName, String parameter
            , Long timeReceived) {
        this.uuid = uuid;
        this.call_back = call_back;
        this.timeStamp = timeStamp;
        this.eventName = eventName;
        this.parameter = parameter;
        this.timeReceived = timeReceived;
    }

    @Id
    private String uuid;

    private String call_back;

    private Timestamp timeStamp;

    private String eventName;

    private String parameter;

    private Long timeReceived;

    public String getParameter() { return parameter; }

    public void setParameter(String parameter) { this.parameter = parameter; }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCall_back() {
        return call_back;
    }

    public void setCall_back(String call_back) {
        this.call_back = call_back;
    }

    public Long getTimeReceived() {
        return timeReceived;
    }

    public void setTimeReceived(Long timeReceived) {
        this.timeReceived = timeReceived;
    }

}
