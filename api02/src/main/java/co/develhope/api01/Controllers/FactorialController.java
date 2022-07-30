package co.develhope.api01.Controllers;

import org.apache.commons.math3.util.CombinatoricsUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("/{n}")
    public long factorial(@PathVariable(value = "n") int n) {
        return CombinatoricsUtils.factorial(n);
    }
}
