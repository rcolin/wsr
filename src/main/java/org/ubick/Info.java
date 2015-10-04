package org.ubick;

import java.io.Serializable;

/**
 * Created by remi on 15/09/2015.
 */
public class Info implements Serializable{

    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
