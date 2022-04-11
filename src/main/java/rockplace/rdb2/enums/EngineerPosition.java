package rockplace.rdb2.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@Getter
public enum EngineerPosition {
    Staff("사원"),
    AssistantManager("대리"),
    Manager("과장"),
    DeputyGeneralManager("차장"),
    GeneralManager("부장"),
    ExecutiveDirector("이사");

    public String position;
    EngineerPosition(String name) {
        this.position = name;
    }

}
