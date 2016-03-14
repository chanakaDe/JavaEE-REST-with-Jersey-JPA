package com.chanakaSample.repository;

import java.util.ArrayList;
import java.util.List;

import com.chanakaSample.model.Activity;
import com.chanakaSample.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

	/* (non-Javadoc)
	 * @see com.chanakaSample.repository.ActivityRepository#findAllActivities()
	 */
	
	public void createActivity(Activity activity) {
//		Have to implement the data saving codes
		System.out.println("Printing the DB");
		System.out.println(activity.getDescription());
		System.out.println(activity.getDuration());
	};
	
	@Override
	public List<Activity> findAllActivities(){
		
		List<Activity> activities = new ArrayList<Activity>();
		Activity activity = new Activity();
		activity.setDescription("Swimming");
		activity.setDuration(50);
		activities.add(activity);
		
		Activity activity1 = new Activity();
		activity1.setDescription("Cycling");
		activity1.setDuration(100);
		activities.add(activity1);
		
		return activities;
	}
	
	@Override
	public Activity findActivity(String activityId) {
		
		Activity activity = new Activity();
		activity.setId("1234");
		activity.setDescription("Swimming");
		activity.setDuration(50);
		
		User user = new User();
		user.setId("123456");
		user.setName("Chanaka De Silva");
		activity.setUser(user);
		
		return activity;
	}
	 
}
