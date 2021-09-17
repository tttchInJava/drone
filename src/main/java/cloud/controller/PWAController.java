package cloud.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author TianCH
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class PWAController {
    @Value("${str.all}")
    private String allStr;
    @ApiOperation(value = "获取所有pwa应用")
    @GetMapping("/drone")
    public String pwaGetAll() {
        String[] all = allStr.split(",");

        int v = (int) (Math.random() * all.length);
        System.out.println(v);
        return all[v];
    }
}
