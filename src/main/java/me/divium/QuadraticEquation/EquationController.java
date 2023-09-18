package me.divium.QuadraticEquation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quadratic-equation")
public class EquationController {
    @Autowired
    EquationService equationService;

    @GetMapping("/roots")
    ResponseEntity<RootModel> getRoots(@RequestParam Double a,
                                       @RequestParam Double b,
                                       @RequestParam Double c) {
        RootModel roots = equationService.getRoots(a, b, c);
        return ResponseEntity.ok(roots);
    }
}
