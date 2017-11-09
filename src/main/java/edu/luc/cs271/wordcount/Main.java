package edu.luc.cs271.wordcount;

import java.util.*;
import java.io.File;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
    WordCounter wordC = new WordCounter(new HashMap<String, Integer>());
    ArrayList<String> list = new ArrayList<String>();
    while(input.hasNext()){
      list.add(input.next());
    }
    Iterator<String> iList = list.iterator();
    wordC.countWords(iList);
    ArrayList<Map.Entry<String, Integer>> sortedList = new ArrayList<Map.Entry<String, Integer>>(wordC.getCounts().size());
    Iterator<Map.Entry<String, Integer>> Imap = wordC.getCounts().entrySet().iterator();
    while(Imap.hasNext()){
      sortedList.add(Imap.next());
    }
    Collections.sort(sortedList, new DescendingByCount());
    for(int i = 0; i < 10; i++){
      System.out.println(sortedList.get(i).getKey());
    }
    // TODO complete this main program
    // 1. create a WordCounter instance
    // 2. use this to count the words in the input
    // 3. determine the size of the resulting map
    // 4. create an ArrayList of that size and
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)
    // 7. print the (up to) ten most frequent words in the text

  }
}
