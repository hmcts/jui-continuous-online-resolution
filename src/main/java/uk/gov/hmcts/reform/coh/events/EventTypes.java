package uk.gov.hmcts.reform.coh.events;

public enum EventTypes {

    QUESTION_ROUND_ISSUED("question_round_issued"),
    QUESTION_DEADLINE_ELAPSED("question_deadline_elapsed"),
    QUESTION_DEADLINE_EXTENDED("question_deadline_extended"),
    QUESTION_DEADLINE_EXTENSION_DENIED("question_deadline_extension_denied"),
    QUESTION_DEADLINE_EXTENSION_GRANTED("question_deadline_extension_granted"),
    QUESTION_DEADLINE_REMINDER("question_deadline_reminder"),
    ANSWERS_SUBMITTED("answers_submitted"),
    DECISION_REJECTED("decision_rejected"),
    ONLINE_HEARING_RELISTED("continuous_online_hearing_relisted"),
    DECISION_ISSUED("decision_issued");
    
    private String eventType;

    EventTypes(String eventType) {
        this.eventType = eventType;
    }

    public String getEventType() {
        return eventType;
    }
}