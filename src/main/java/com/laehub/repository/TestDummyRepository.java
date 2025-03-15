package com.laehub.repository;

import java.util.UUID;
import com.laehub.domain.TestDummy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDummyRepository extends JpaRepository<TestDummy, UUID> {

}
