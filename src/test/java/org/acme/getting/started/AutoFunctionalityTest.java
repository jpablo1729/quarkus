package org.acme.getting.started;

import org.acme.getting.started.entity.AutoRepository;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

@QuarkusTest
public class AutoFunctionalityTest {

    @InjectMock
    AutoRepository autoRepository;

    @Test
    public void testAutoRepositoryMocking() throws Throwable {
        
    }
    
}