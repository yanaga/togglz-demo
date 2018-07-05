package com.redhat.developers.togglz;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum ApplicationFeatureToggle implements Feature {
    @Label("hello")
    HELLO,

    @Label("world_cup")
    WORLD_CUP_TEAMS;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }

}