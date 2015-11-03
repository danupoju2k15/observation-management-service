package com.accolade.etp.observation.management.dal;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;

import javax.inject.Inject;

public class ObservationTemplateDAO {
    private EbeanServer db;

    @Inject
    public ObservationTemplateDAO() {
        db = Ebean.getDefaultServer();
    }
}
