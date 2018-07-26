package uk.gov.hmcts.reform.coh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.gov.hmcts.reform.coh.domain.OnlineHearing;
import uk.gov.hmcts.reform.coh.domain.SessionEvent;

import java.util.List;
import java.util.UUID;

@Repository
public interface SessionEventRepository extends CrudRepository<SessionEvent, UUID> {

    void deleteByOnlineHearing(OnlineHearing onlineHearing);

    List<SessionEvent> findAllByOnlineHearing(OnlineHearing onlineHearing);
}
