package serenitylabs.tutorials.vetclinic.domain;

import java.util.ArrayList;
import java.util.List;

public class ComplaintRegister {
    private List<String> complaints;

    public ComplaintRegister() {
        complaints = new ArrayList<>();
    }

    public void recordComplaint(String complaint) {
        this.complaints.add(complaint);
    }

    public List<String> getComplaints() {
        return complaints;
    }
}
