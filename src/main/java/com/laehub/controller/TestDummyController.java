package com.laehub.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laehub.domain.TestDummy;
import com.laehub.exception.ResourceNotFoundException;
import com.laehub.service.TestDummyService;

@RestController
@RequestMapping("/testdummies")
public class TestDummyController {

    @Autowired
    private TestDummyService testDummyService;

    @GetMapping
    public List<TestDummy> getAllTestDummies() {
        return testDummyService.findAll();
    }

    @GetMapping("/{id}")
    public TestDummy getTestDummyById(@PathVariable UUID id) {
        return testDummyService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("TestDummy not found with id: " + id));
    }

    @PostMapping
    public TestDummy createTestDummy(@RequestBody TestDummy testDummy) {
        return testDummyService.save(testDummy);
    }

    @PutMapping("/{id}")
    public TestDummy updateTestDummy(@PathVariable UUID id, @RequestBody TestDummy testDummy) {
        testDummy.setId(id);
        return testDummyService.save(testDummy);
    }

    @DeleteMapping("/{id}")
    public void deleteTestDummy(@PathVariable UUID id) {
        testDummyService.deleteById(id);
    }

}
