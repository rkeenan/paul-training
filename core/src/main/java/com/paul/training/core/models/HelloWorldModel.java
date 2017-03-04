package com.paul.training.core.models;

import com.adobe.cq.sightly.WCMUse;

import org.apache.sling.api.resource.ValueMap;

public class HelloWorldModel extends WCMUse {

    private String message;

    @Override
    public void activate() throws Exception {
        ValueMap properties = getProperties();
        message = properties.get("text", String.class) + " message";
    }

    public String getMessage() {
        return message;
    }
}
