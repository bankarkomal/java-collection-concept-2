import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Test{
    String name;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
        //if (this == obj) {
          //  return true;

       // } else if (obj instanceof Test) {
          //  return this.name.equals(((Test) obj).name);

       // } else {
           // return false;
       // }
    }
    @Override
    public int hashCode() {
        return 1;
       // return Objects.hash(name);
    }
}

public class KnowledgeCheckedHashMapExample {
    public static void main(String[] args) {
        Map<Test ,String> hashmap = new HashMap<>();
        Test test1 = new Test("a");//  test1 =1000h
        Test test2 = new Test("b");//  test2 = 2000h

        System.out.println(hashmap);
        System.out.println("test 1 hashcode :" + test1.hashCode());
        hashmap.put(test1 , "a");
        System.out.println(hashmap);

        System.out.println("test2 hashcode : " + test2.hashCode());
        System.out.println("test1.equal(test2):" + test1.equals(test2));
        System.out.println(hashmap);

        Test test3 = new Test("a");// test3 = 3000h
        Test test4 = new Test("b");// test 4 = 4000h

        System.out.println(hashmap.get(test3));
        System.out.println(hashmap);
        System.out.println(hashmap.get(test4));
        System.out.println(hashmap);

    }
}
/*
hash map working mechanism
HashMap works in 2 passes:-
1 -> Use HashCode and then find index of bucket using hash function
2 -> Use equals method when two keys have same hashCode// Key content is compared when same hashcode.
There are 3 Scenarios->
1. Two keys have same hashCode 	    --> Use equals method
				    		        --> equals returns true --> overwrite/update
2. Two keys have same hashCode 	    --> Use equals method
				    		        --> equals returns false --> Create new node in same bucket.
3. Two keys have different hashCode --> Create new Node to store key,value
Visualize it as below:-
0[]
1[] -->[1, 1000h, "a", 1234h] --> [1, 2000h,"b", null] --> null
2[]
3[]
4[]
5[]
6[]
7[]
In case of equals method is not overridden and doesn't return true all the time.
1. hashMap.get(test3) --> no key present in the map -->returns null
2. same for hashMap.get(test4) --> no key present in the map -->returns null
---------------------+++++++++++++++++++++++++------------------------
In case of equals method is overridden and returns true all the time.
1. hashMap.get(test3) --> no key present in the map -->returns null
2. same for hashMap.get(test4) --> no key present in the map -->returns null
put test1/1000h -->
Visualize it as below:-
0[]
1[] -->[1, 1000h, "a", null]
2[]
3[]
4[]
5[]
6[]
7[]
put test2/2000h -->
Visualize it as below:-
0[]
1[] -->[1, 1000h, "b", null]
2[]
3[]
4[]
5[]
6[]
7[]
now for hashMap.get(test3/3000h) --> hashCode(that is 1) is already present in the bucket and equals returns true.
Hence, it will return "b"
Visualize it as below:-
0[]
1[] -->[1, 1000h, "b", null]
2[]
3[]
4[]
5[]
6[]
7[]
now for hashMap.get(test4/4000h) --> hashCode(that is 1) is already present in the bucket and equals returns true.
Hence, it will return "b"
Visualize it as below:-
0[]
1[] -->[1, 1000h, "b", null]
2[]
3[]
4[]
5[]
6[]
7[]
 */

