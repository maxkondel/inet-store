package com.engagepoint.university.inetStore.dataSource;

import com.engagepoint.university.inetStore.entity.Mobile;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class DataSource implements Serializable {

    private int id = 0;

    private List<Mobile> mobiles= new ArrayList<>();

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id+1;
    }
}
