package ro.fortech.junit.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CoachTest {

    @Parameterized.Parameter(0)
    public int age;

    @Parameterized.Parameter(1)
    public String reputation;

    @Parameterized.Parameter(2)
    public int profile;

    @Parameterized.Parameters
    public static Collection<Object> obtainCoachData() {

        Object[][] coachData = new Object[][]{{35, "GREAT", 6500}, {40, "GREAT", 6000}, {40, "VERY GOOD", 4500},
                {50, "GOOD", 2500}};
        return Arrays.asList(coachData);
    }

    @Test
    public void obtainCoachProfile() {

        Coach coach = new Coach();
        assertEquals(profile, coach.obtainCoachProfile(age, reputation));
    }

}