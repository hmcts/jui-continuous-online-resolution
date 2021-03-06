package uk.gov.hmcts.reform.coh.task;

import java.util.Arrays;
import java.util.List;

public interface ContinuousOnlineResolutionTask<T> {

    void execute(T t);

    default List<String> supports() {
        return Arrays.asList("default");
    }
}
