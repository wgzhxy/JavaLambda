package org.wanggz.lambda.advance;

import org.junit.Test;

public class ThreadTest {

    @Test
    public void testThread() {
        new Thread(()-> System.out.println("========")).start();
    }
}
