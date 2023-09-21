package org.example.models;

import java.util.List;

public class GroupOfTask {
    private String groupName;
    private Integer groupId;
    private List<Task> groupList;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public List<Task> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Task> groupList) {
        this.groupList = groupList;
    }

    @Override
    public String toString() {
        return "GroupOfTask{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", groupList=" + groupList +
                '}';
    }
}
