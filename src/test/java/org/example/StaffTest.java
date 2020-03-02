package org.example;

import org.junit.*;

public class StaffTest {
    Staff staff1;
    Staff staff2;

    @Before
    public void setUp() throws Exception {
        staff1 = new Staff.Employee()
                .firstName("Laura")
                .lastName("Lee")
                .build();
        staff2 = new Staff.Employee()
                .firstName("Laura")
                .lastName("Lee")
                .build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getStaffNo() {
    }

    @Test
    public void getFirstName() {
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void build() {
    }

    @Test
    public void ObjectEquality() {
        Assert.assertEquals(staff1, staff2);
    }

    @Test
    public void ObjectIdentity() {
        Assert.assertSame(staff1, staff2);
    }

    @Test(timeout = 10000)
    public void Timeouts() {
        Assert.assertSame(staff1, staff2);
        while (true);
    }

    @Ignore
    @Test
    public void DisablingTest() {
        Assert.assertEquals(staff1, staff2);
    }

    @Test(expected = AssertionError.class)
    public void FailingTest() {
        Assert.assertEquals(staff1, staff2);
    }
}
