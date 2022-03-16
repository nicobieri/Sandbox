package src.ch.teko.nb.ArrayList;

import java.util.HashMap;
import java.util.Map;

class HashMapBsp {

    public static void main(String[] args) {

         Map<Integer, String> mapHttpErrors = new HashMap<>();

         mapHttpErrors.put(200, "OK");
         mapHttpErrors.put(303, "See Other");
         mapHttpErrors.put(404, "Not Found");
         mapHttpErrors.put(500, "Internal Server Error");

         System.out.println(mapHttpErrors);
    }
}
