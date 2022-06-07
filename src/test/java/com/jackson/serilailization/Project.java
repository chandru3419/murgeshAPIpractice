package com.jackson.serilailization;

public class Project {
	
	String createdBy;
	String createdOn;
	String ProjectName;
	String projectId;
	String status;
	int teamsize;
	
	
	public Project(String createdBy, String createdOn, String projectName, String projectId, String status,
			int teamsize) {
		
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		ProjectName = projectName;
		this.projectId = projectId;
		this.status = status;
		this.teamsize = teamsize;
	}
	
	Project(){}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	
	
	

}
