package uk.gov.hmcts.reform.coh.controller.decision;

import uk.gov.hmcts.reform.coh.domain.Decision;

import java.util.function.BiConsumer;
import java.util.function.Function;

public enum DecisionResponseMapper {
    DECISION_ID(d -> d.getDecisionId().toString(), DecisionResponse::setDecisionId),
    ONLINE_HEARING_ID(d -> d.getOnlineHearing().getOnlineHearingId().toString(), DecisionResponse::setOnlineHearingId),
    DECISION_HEADER(Decision::getDecisionHeader, DecisionResponse::setDecisionHeader),
    DECISION_TEXT(Decision::getDecisionText, DecisionResponse::setDecisionText),
    DECISION_REASON(Decision::getDecisionReason, DecisionResponse::setDecisionReason),
    DECISION_AWARD(Decision::getDecisionAward, DecisionResponse::setDecisionAward),
    DEADLINE_EXPIRY_DATE(d -> d.getDeadlineExpiryDate().toString(), DecisionResponse::setDeadlineExpiryDate),
    DECISION_STATE_NAME(d -> d.getDecisionstate().getState(), DecisionResponse::setDecisionStateName);

    private Function<Decision, String> getter;

    private BiConsumer<DecisionResponse, String> setter;

    DecisionResponseMapper(Function<Decision, String> getter, BiConsumer<DecisionResponse, String> setter) {
        this.getter = getter;
        this.setter = setter;
    }

    public static void map(Decision decision, DecisionResponse response) {
        for (DecisionResponseMapper m : DecisionResponseMapper.class.getEnumConstants()) {
            m.set(decision, response);
        }
    }

    public void set(Decision decision, DecisionResponse response) {
        setter.accept(response, getter.apply(decision));
    }
}

