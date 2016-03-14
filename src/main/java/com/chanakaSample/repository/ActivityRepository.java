package com.chanakaSample.repository;

import java.util.List;

import com.chanakaSample.model.Activity;

public interface ActivityRepository {

	public abstract List<Activity> findAllActivities();

	public abstract Activity findActivity(String activityId);

	public abstract void createActivity(Activity activity);

}