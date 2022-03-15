package com.example.Administration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;
@RequestMapping("/administration")
@RestController
public class SchoolController {
    private final List<School> Administration = Arrays.asList(
            new School(1, "A school", "A","bangalore","560054","50000"),
            new School(2, "B school", "B","mangalore","560055","10000"));

    @GetMapping
    public List<School> getAllAdministration() {
        return Administration;
    }

    @GetMapping("/{id}")
    public School getschoolById(@PathVariable int id) {
        return Administration.stream()
                     .filter(order -> order.getId() == id)
                     .findFirst()
                     .orElseThrow(IllegalArgumentException::new);
    }
}