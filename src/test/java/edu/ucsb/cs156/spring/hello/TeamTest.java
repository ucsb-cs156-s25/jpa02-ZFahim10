package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string(){
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_for_sameObject(){
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_returns_false_for_differentClass(){
        assertFalse(team.equals(null));
    }

    @Test
    public void equals_returns_correct_bool(){
        Team TT1 = new Team("TT-x");
        TT1.addMember("TT_mem");
        Team TT2 = new Team("TT-x");
        TT2.addMember("TT_mem");
        assertTrue(TT1.equals(TT2));

        Team TF1 = new Team("TF-x");
        TF1.addMember("TF_mem");
        Team TF2 = new Team("TF-x");
        TF2.addMember("TT_memX");
        assertFalse(TF1.equals(TF2));

        Team FT1 = new Team("FT-x");
        FT1.addMember("TT_mem");
        Team FT2 = new Team("FT-xy");
        FT2.addMember("TT_mem");
        assertFalse(FT1.equals(FT2));

        Team FF1 = new Team("FF-x");
        FF1.addMember("FF_mem");
        Team FF2 = new Team("FF-xy");
        FF2.addMember("FF_memx");
        assertFalse(FF1.equals(FF2));



    }

    @Test
    public void hashCode_returns_correct_int(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void secondary_hashCode_check(){
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

}
