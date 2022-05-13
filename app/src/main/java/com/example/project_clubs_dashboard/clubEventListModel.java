package com.example.project_clubs_dashboard;

public class clubEventListModel {
    String eventName;
    String eventDesc;
    String eventDate;
    String eventMonth;
    int filter;

    public int getFilter() {
        return filter;
    }

    public void setFilter(int filter) {
        this.filter = filter;
    }

    //    filter=0(past),1(today),2(upcoming)
    public String getEventMonth() { return eventMonth; }

    public void setEventMonth(String eventMonth) { this.eventMonth = eventMonth; }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}