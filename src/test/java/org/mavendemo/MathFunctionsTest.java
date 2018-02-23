package org.mavendemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathFunctionsTest {
    MathFunctions matchFunctions;

    @Before
    public void iinit(){
        matchFunctions = new MathFunctions();
    }

    @Test
    public void testAdd(){
        Assert.assertEquals(5, matchFunctions.add(2,3));
    }
}
