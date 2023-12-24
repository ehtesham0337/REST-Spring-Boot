package FYP.MatchPoint.backend.model.Users;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Reliability {
    LOW,
    MEDIUM,
    HIGH;

//    @JsonCreator
//    public static Reliability fromString(String status) {
//        if(status.equalsIgnoreCase("")) {
//            return null;
//        }
//        return Reliability.valueOf(status);
//    }
}
