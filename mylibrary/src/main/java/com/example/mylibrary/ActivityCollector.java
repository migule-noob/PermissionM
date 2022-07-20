package com.example.mylibrary;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    private static final List<Activity> activityList = new ArrayList<>();

    private ActivityCollector() {};

    static class InnerActivityCollector{
        private static final ActivityCollector INSTANCE = new ActivityCollector();
    }

    public static ActivityCollector getInstance() {
        return InnerActivityCollector.INSTANCE;
    }

    public static void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    public static void finishAll() {
        for(Activity activity : activityList) {
            if (activity != null) {
                activityList.remove(activity);
            }
        }
        activityList.clear();
    }
}
