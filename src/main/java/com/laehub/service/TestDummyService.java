package com.laehub.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laehub.domain.TestDummy;
import com.laehub.repository.TestDummyRepository;

@Service
public class TestDummyService {

    @Autowired
    private TestDummyRepository testDummyRepository;

    public List<TestDummy> findAll() {
        return testDummyRepository.findAll();
    }

    public Optional<TestDummy> findById(UUID id) {
        return testDummyRepository.findById(id);
    }

    public TestDummy save(TestDummy testDummy) {
        return testDummyRepository.save(testDummy);
    }

    public void deleteById(UUID id) {
        testDummyRepository.deleteById(id);
    }

}
