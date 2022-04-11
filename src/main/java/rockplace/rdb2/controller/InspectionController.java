package rockplace.rdb2.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/inspection")
public class InspectionController {

    @Operation(summary = "점검보고서 목록", description = "to /{url}")
    @GetMapping()
    public String inspectionList() {

        return "ok";
    }

    @Operation(summary = "점검보고서 등록", description = "to /{url}")
    @PostMapping()
    public String inspectionUpload() {

        return "ok";
    }

    @Operation(summary = "점검보고서 상세", description = "to /{url}")
    @GetMapping({"{id}"})
    public String inspectionDetail(@PathVariable long id) {

        return "ok";
    }

    @Operation(summary = "점검보고서 수정", description = "to /{url}")
    @PatchMapping({"{id}"})
    public String inspectionUpdate(@PathVariable long id) {

        return "ok";
    }

    @Operation(summary = "점검보고서 삭제", description = "to /{url}")
    @DeleteMapping({"{id}"})
    public String inspectionDelete(@PathVariable long id) {

        return "ok";
    }
}
