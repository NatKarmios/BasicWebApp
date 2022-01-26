package com.develogical;

import java.util.ArrayList;

public class QueryProcessor {

    public String process(String query) {
        ArrayList<String> results = new ArrayList<>();
        if (query.toLowerCase().contains("shakespeare")) {
            results.add("William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.");
        }

        if (query.toLowerCase().contains("imperial")) {
            results.add("Imperial College is a university in London");
        }
        return String.join("<p>", results);
    }
}
