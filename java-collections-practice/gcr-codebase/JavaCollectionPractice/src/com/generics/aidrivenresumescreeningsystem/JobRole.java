package com.generics.aidrivenresumescreeningsystem;

public abstract class JobRole<T> {
	 protected String candidateName;
	    protected int experience; // years of experience

	    // Constructor
	    public JobRole(String candidateName, int experience) {
	        this.candidateName = candidateName;
	        this.experience = experience;
	    }

	    // Abstract method to evaluate resume
	    public abstract void evaluateResume();
}
