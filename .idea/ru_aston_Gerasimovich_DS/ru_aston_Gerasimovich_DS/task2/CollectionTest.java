package ru_aston_Gerasimovich_DS.task2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class CollectionsTest {

    @Test
    void testArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, list.size());
        assertTrue(list.contains(1));
        Collections.sort(list);
        assertEquals(Arrays.asList(1, 2), list);
    }

    @Test
    void testHashMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        assertEquals(1, map.size());
        assertTrue(map.containsKey("one"));
        assertEquals(1, map.get("one"));
    }

    @Test
    void testTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        assertEquals(2, set.size());
        assertTrue(set.contains(1));
        assertEquals(1, set.first());
    }
}
