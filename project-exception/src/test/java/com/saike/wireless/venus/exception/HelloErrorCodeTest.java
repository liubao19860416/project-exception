package com.saike.wireless.venus.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloErrorCodeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertEquals(HelloErrorCode.NOT_FOUND_CODE,
                HelloErrorCode.NOT_FOUND.getExceptionNumber());

        assertTrue(HelloErrorCode.SYSTEM_CODE == HelloErrorCode.NOT_FOUND
                .getSystemCode());
    }

}
