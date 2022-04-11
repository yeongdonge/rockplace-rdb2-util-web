package rockplace.rdb2.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/engineer")
public class EngineerController {

    @Operation(summary = "엔지니어 목록", description = "to /{url}")
    @GetMapping()
    public String engineerList() {

        return "ok";
    }

    @Operation(summary = "엔지니어 등록", description = "to /{url}")
    @PostMapping()
    public String engineerUpload() {

        return "ok";
    }


    @Operation(summary = "엔지니어 상세", description = "to /{url}")
    @GetMapping("{id}")
    public String engineerDetail(@PathVariable Long id) {

        return "ok";
    }

    @Operation(summary = "엔지니어 수정", description = "to /{url}")
    @PatchMapping("{id}")
    public String engineerUpdate(@PathVariable Long id) {

        return "ok";
    }

    @Operation(summary = "엔지니어 삭제", description = "to /{url}")
    @DeleteMapping("{id}")
    public String engineerDelete(@PathVariable Long id) {

        return "ok";
    }
}
