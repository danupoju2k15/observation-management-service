package com.accolade.etp.observation.management.dal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "ObservationTemplate")
public class Uom {
    @Id
    private UUID id;
}
