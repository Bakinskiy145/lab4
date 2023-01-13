package org.evil.config;

import org.evil.service.JerseyRest;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {
        register(JerseyRest.class);
//        packages("org.evil.service");
    }
}
