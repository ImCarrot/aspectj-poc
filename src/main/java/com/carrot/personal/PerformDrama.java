package com.carrot.personal;

import com.carrot.personal.aspects.DataTrackEnabled;

import java.util.HashMap;
import java.util.Map;

public class PerformDrama {

    @DataTrackEnabled(dataClass = "Hey", dataName = "There", instance = "How are you?")
    public Map<String, String> fetchUser() {
        Map<String, String> returnable = new HashMap<>();
        returnable.put("firstName", "carrot");
        returnable.put("lastName", "radish");
        return returnable;
    }
}
