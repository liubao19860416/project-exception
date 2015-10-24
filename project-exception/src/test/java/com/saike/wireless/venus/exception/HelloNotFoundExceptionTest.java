package com.saike.wireless.venus.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloNotFoundExceptionTest {

    public HelloNotFoundExceptionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {

        assertTrue(HelloErrorCode.NOT_FOUND.getSystemCode() == HelloErrorCode.SYSTEM_CODE);
        assertTrue(HelloErrorCode.NOT_FOUND.getModuleCode() == 1);
        assertTrue(HelloErrorCode.NOT_FOUND.getExceptionCode() == 1);
        assertEquals(HelloErrorCode.MODULE_NAME_COMMON,
                HelloErrorCode.NOT_FOUND.getModuleName());

        assertTrue(HelloErrorCode.ZERO.getSystemCode() == HelloErrorCode.SYSTEM_CODE);
        assertTrue(HelloErrorCode.ZERO.getModuleCode() == 0);
        assertTrue(HelloErrorCode.ZERO.getExceptionCode() == 0);
        assertEquals(HelloErrorCode.MODULE_NAME_OTHER,
                HelloErrorCode.ZERO.getModuleName());

        String msg = "test";
        HelloNotFoundException ex = new HelloNotFoundException(msg);

        assertEquals(msg, ex.getMessage());

        HelloErrorCode err = ex.getErrorCode();
        assertNotNull(err);
        assertTrue(HelloErrorCode.NOT_FOUND_CODE == err.getExceptionNumber());
        assertEquals(HelloErrorCode.NOT_FOUND, err);
    }
}
