package rockplace.rdb2.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inspection")
public class InspectionController {

    @Operation(summary = "점검보고서 목록", description = "to /{url}")
    @GetMapping()
    public String inspectionList() {

        return "ok";
    }

    @Operation(summary = "점검보고서 상세", description = "to /{url}")
    @GetMapping({"{id}"})
    public String inspectionDetail(@PathVariable long id) {

        return "ok";
    }
}
