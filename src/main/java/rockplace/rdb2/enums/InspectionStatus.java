package rockplace.rdb2.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@Getter
public enum InspectionStatus {
    Normal("정상"),
    Caution("주의"),
    Warning("경고");

    public String status;

    InspectionStatus(String status) {
        this.status = status;
    }

}
