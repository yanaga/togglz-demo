package com.redhat.developers.togglz;

import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;
import org.togglz.servlet.user.ServletUserProvider;

import javax.enterprise.context.ApplicationScoped;
import java.io.File;

@ApplicationScoped
public class TogglzConfiguration implements TogglzConfig {

    public Class<? extends Feature> getFeatureClass() {
        return ApplicationFeatureToggle.class;
    }

    public StateRepository getStateRepository() {
        return new FileBasedStateRepository(new File("features.properties"));
    }

    public UserProvider getUserProvider() {
        return new UserProvider() {
            @Override
            public FeatureUser getCurrentUser() {
                return new SimpleFeatureUser("admin", true);
            }
        };
    }

}
