package uk.gov.hmcts.reform.coh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import uk.gov.hmcts.reform.coh.domain.OnlineHearing;
import uk.gov.hmcts.reform.coh.repository.OnlineHearingRepository;

import java.util.UUID;

@Service
@Component
public class OnlineHearingService {

    private OnlineHearingRepository onlineHearingRepository;

    @Autowired
    public OnlineHearingService(OnlineHearingRepository onlineHearingRepository) {
        this.onlineHearingRepository = onlineHearingRepository;
    }

    public OnlineHearing createOnlineHearing(final OnlineHearing onlineHearing) {
        return onlineHearingRepository.save(onlineHearing);
    }

    public OnlineHearing retrieveOnlineHearingByExternalRef(final OnlineHearing onlineHearing) {
        return onlineHearingRepository.findByExternalRef(onlineHearing.getExternalRef()).orElse(null);
    }

    public OnlineHearing retrieveOnlineHearingById (final UUID onlineHearingId) {
        return onlineHearingRepository.findById(onlineHearingId).orElse(null);
    }

    public void deleteOnlineHearingByExternalRef(final OnlineHearing onlineHearing){
        onlineHearingRepository.delete(retrieveOnlineHearingByExternalRef(onlineHearing));
    }
}