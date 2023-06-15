package FeProject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recordId;
    private String crime;
    private double latitude;
    private double longitude;
    private String date;
    private String firId;
    private String policeStationName;
    private String perpName;
    private int severity;

    public DataEntity() {
    }

    public DataEntity(long recordId, String crime, double latitude, double longitude, String date, String firId, String policeStationName, String perpName, int severity) {
        this.recordId = recordId;
        this.crime = crime;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.firId = firId;
        this.policeStationName = policeStationName;
        this.perpName = perpName;
        this.severity = severity;
    }

    public long getRecordId() {
        return recordId;
    }

    public void setRecordId(long recordId) {
        this.recordId = recordId;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFirId() {
        return firId;
    }

    public void setFirId(String firId) {
        this.firId = firId;
    }

    public String getPoliceStationName() {
        return policeStationName;
    }

    public void setPoliceStationName(String policeStationName) {
        this.policeStationName = policeStationName;
    }

    public String getPerpName() {
        return perpName;
    }

    public void setPerpName(String perpName) {
        this.perpName = perpName;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
}
