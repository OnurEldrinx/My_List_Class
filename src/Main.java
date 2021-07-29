public class Main {
    public static void main(String[] args) {

     MyList<Integer> myList = new MyList<>();

     System.out.println("Capacity of the Array           : " + myList.getCapacity());
     System.out.println("Number of Elements In the List  : " + myList.size());
     myList.add(10);
     myList.add(20);
     myList.add(30);
     myList.add(40);
     System.out.println("Capacity of the Array           : " + myList.getCapacity());
     System.out.println("Number of Elements In the List  : " + myList.size());
     myList.add(50);
     myList.add(60);
     myList.add(70);
     myList.add(80);
     myList.add(90);
     myList.add(100);
     myList.add(110);
     System.out.println("Capacity of the Array           : " + myList.getCapacity());
     System.out.println("Number of Elements In the List  : " + myList.size());
     myList.add(120);
     myList.add(130);
     myList.add(140);
     myList.add(150);
     myList.add(160);
     myList.add(170);
     myList.add(180);
     myList.add(190);
     myList.add(220);
     myList.add(230);
     myList.add(240);
     System.out.println("Capacity of the Array           : " + myList.getCapacity());
     System.out.println("Number of Elements In the List  : " + myList.size());

     System.out.println("-----------------------------------------------------------------------");

     MyList<String> stringMyList = new MyList<>();
     stringMyList.add("onur");
     stringMyList.add("Öztop");
     stringMyList.add("IUE");
     System.out.println("Value of 2. Index  : " + stringMyList.get(2));
     stringMyList.remove(2);
     stringMyList.add("Computer Engineering");
     stringMyList.set(0, "Onur");
     System.out.println("Value of 2. Index  : " + stringMyList.get(2));
     System.out.println(stringMyList.toString());

     System.out.println("-----------------------------------------------------------------------");

     MyList<Integer> integerMyList = new MyList<>();

     System.out.println("List Status : " + (integerMyList.isEmpty() ? "Empty" : "Not Empty"));
     integerMyList.add(10);
     integerMyList.add(20);
     integerMyList.add(30);
     integerMyList.add(40);
     integerMyList.add(20);
     integerMyList.add(50);
     integerMyList.add(60);
     integerMyList.add(70);
     //integerMyList.add(120);

     System.out.println("List Status : " + (integerMyList.isEmpty() ? "Empty" : "Not Empty"));

     // Returns the index of first match
     System.out.println("Index  : " + integerMyList.indexOf(20));

     // Returns -1 if there is no match
     System.out.println("Index  :" + integerMyList.indexOf(100));

     // Returns the index of last match
     System.out.println("Index  : " + integerMyList.lastIndexOf(20));

     // Return the list as Object[] array.
     Object[] array = integerMyList.toArray();
     System.out.println("First Element of the Object Array:" + array[0]);

     // Creates a sublist in the given range of indexes
     MyList<Integer> subList = integerMyList.subList(0, 3);
     System.out.println(subList.toString());

     // Question whether the list contains given parameter or not
     System.out.println(integerMyList.toString());

     System.out.println("Is there any 20 in my list?  : " + integerMyList.contains(20));
     System.out.println("Is there any 120 in my list? : " + integerMyList.contains(120));

     // Deletes the all elements of list and resize its size to default length.
     integerMyList.clear();
     System.out.println(integerMyList.toString());

     System.out.println("-----------------------------------------------------------------------");

     MyList<Double> a = new MyList<>();

     a.add(10d);
     a.add(20d);
     a.add(30d);
     a.add(40d);
     a.add(50d);
     a.add(60d);

     System.out.println("Is there any 20 in 'a' list?  : " + a.contains(20d));
     System.out.println("Is there any 120 in 'a' list? : " + a.contains(120d));

     MyList<Float> b = new MyList<>(6);

     b.add(10d);
     b.add(20d);
     b.add(30d);
     b.add(40d);
     b.add(50d);
     b.add(120d);

     System.out.println("Is there any 20 in 'b' list?  : " + b.contains(20d));
     System.out.println("Is there any 120 in 'b' list? : " + b.contains(120d));

     System.out.println("a: " + a.toString());
     System.out.println("b: " + b.toString());
    }
}
