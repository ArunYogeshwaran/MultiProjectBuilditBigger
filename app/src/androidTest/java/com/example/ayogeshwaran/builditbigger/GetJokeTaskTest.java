package com.example.ayogeshwaran.builditbigger;

import android.text.TextUtils;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.fail;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;

public class GetJokeTaskTest {
    @Test
    public void testGetJoke() {

        try {
            GetJokeTask getJokeTask = new GetJokeTask();
            getJokeTask.execute();
            String joke = getJokeTask.get(30, TimeUnit.SECONDS);

            assertThat(joke, notNullValue());
            assertFalse(TextUtils.isEmpty(joke));

        } catch (Exception e) {
            fail("Operation timed out");
        }
    }


}