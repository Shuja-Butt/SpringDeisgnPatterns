package com.design.patterns.factory;

import org.apache.coyote.http11.filters.SavedRequestInputFilter;

public interface Pet {
    void setName(String name);
    void feed();

   /* String getName();
    boolean getFeed();
*/
}
