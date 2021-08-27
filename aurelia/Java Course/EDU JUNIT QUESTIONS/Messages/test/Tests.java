import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tests {
  ArrayList<String> data;

  @Before
  public void runBefore()
  {
    data = new ArrayList<String>();
  }

  @Test
  public void test4messages2urgent() {

  String[] strings = new String[4];
  strings[0] = "Please reply ASAP";
  strings[1] = "This is important";
  strings[2] = "Reply, its urgent";
  strings[3] = "Hey";
  Queue<String> stuff = new LinkedList<String>();
  stuff.add(strings[0]);
  stuff.add(strings[2]);
  stuff.add(strings[1]);
  stuff.add(strings[3]);




    String msg = "";
    Assert.assertEquals(msg,stuff,Task.orderStrings(strings));

  }

  @Test
  public void test10messages5urgent() {

    String[] strings = new String[10];
    strings[0] = "Please reply ASAP";
    strings[1] = "This is important";
    strings[2] = "Reply, its urgent";
    strings[3] = "Hey";
    strings[4] = "I need your help ASAP";
    strings[5] = "Please call back its urgent";
    strings[6] = "I have an important work call today";
    strings[7] = "How are you doing?";
    strings[8] = "Urgent business - ASAP";
    strings[9] = "How has your day been?";


    Queue<String> stuff = new LinkedList<String>();
    stuff.add(strings[4]);
    stuff.add(strings[5]);
    stuff.add(strings[0]);
    stuff.add(strings[2]);
    stuff.add(strings[8]);
    stuff.add(strings[6]);
    stuff.add(strings[1]);
    stuff.add(strings[3]);
    stuff.add(strings[7]);
    stuff.add(strings[9]);






    String msg = "The five urgent messages go first, then the important messages and then the non important";
    Assert.assertEquals(msg,stuff,Task.orderStrings(strings));

  }

}