package cloud.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TianCH
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class PWAController {
    @ApiOperation(value = "获取所有pwa应用")
    @GetMapping("/drone")
    public String pwaGetAll() {
        System.out.println("a");
        return "test";
    }
}
