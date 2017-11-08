package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  private WordCounter fixture;

  @Before
  public void setUp() {
    fixture = new WordCounter(new HashMap<String, Integer>());
  }

  @After
  public void tearDown() {
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {
    // TODO verify that the SUT initially returns an empty map
    assertEquals(new HashMap<String, Integer>(), fixture.getCounts());
  }

  @Test
  public void testGetCountNonEmpty() {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Three");
    list.add("Three");
    list.add("Three");
    list.add("One");
    Iterator<String> listI = list.iterator();
    
    fixture.countWords(listI);
    assertEquals(3, fixture.getCount("Three"));
    assertEquals(1, fixture.getCount("One"));
    assertEquals(0, fixture.getCount("Zero"));
    assertEquals(0, fixture.getCount("Number"));
    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
  }
}
