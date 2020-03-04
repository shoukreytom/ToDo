package com.shoukreytom.model;

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
                int id = rs.getInt("id");
                String from = rs.getString("start");
                String to = rs.getString("end");
                String topic = rs.getString("topic");
                String description = rs.getString("description");
                topics.add(new TopicsModel(id, from, to, topic, description));
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
                int id = rs.getInt("id");
                String from = rs.getString("start");
                String to = rs.getString("end");
                String project = rs.getString("project");
                String description = rs.getString("description");
                projects.add(new ProjectsModel(id, from, to, project, description));
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
