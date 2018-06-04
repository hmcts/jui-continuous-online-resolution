package uk.gov.hmcts.reform.coh.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "online_hearing")
public class OnlineHearing {

    @Id
    @Column(name = "online_hearing_id")
    private int onlineHearingId;

    @Column(name = "EXTERNAL_REF")
    private String externalRef;
}
