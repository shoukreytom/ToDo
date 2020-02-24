package com.shoukreytom.model;

import com.shoukreytom.control.Topics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LoadData {

    private static final Connection con = DBConnection.getConnection();

    public static List<TopicsModel> getTopics() {
        List<TopicsModel> topics = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM topics");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String from = rs.getString("from");
                String to = rs.getString("to");
                String topic = rs.getString("topic");
                String description = rs.getString("description");
                topics.add(new TopicsModel(from, to, topic, description));
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return topics;
    }

    public static List<ProjectsModel> getProject() {
        List<ProjectsModel> projects = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM projects");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String from = rs.getString("from");
                String to = rs.getString("to");
                String project = rs.getString("topic");
                String description = rs.getString("description");
                projects.add(new ProjectsModel(from, to, project, description));
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return projects;
    }

    public static List<ReportsModel> getReports() {
        List<ReportsModel> reports = new ArrayList<>();
        return reports;
    }

}
