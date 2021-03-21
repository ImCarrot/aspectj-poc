package com.carrot.personal.utils;

public class DataTrackHelper {

    public void recordInstanceCount(final String dataClass, final String instance, final String dataName) {
        System.out.printf("Instance Count published for DataClass: %s, Instance: %s, DataName: %s%n",
                dataClass, instance, dataName);
    }

    public void recordInstanceTime(final String dataClass, final String instance,
                                   final String dataName, double totalTimeSeconds) {
        System.out.printf("Instance Time published for DataClass: %s, Instance: %s, DataName: %s, TimeInSeconds: %s%n",
                dataClass, instance, dataName, totalTimeSeconds);
    }
}
