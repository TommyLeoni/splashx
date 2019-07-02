package ch.bbcag.splashx.model;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import ch.bbcag.splashx.R;

public class Poolsite {

    private int cost;
    private String name;
    private String location;
    private Pool[] pools;

    public Poolsite(int cost, String name, String location, Pool[] pools) {
        this.cost = cost;
        this.name = name;
        this.location = location;
        this.pools = pools;
    }

    public String showCost() {
        if (cost == 0) {
            return Resources.getSystem().getString(R.string.label_pool_cost_free);
        }
        else {
            return cost + Resources.getSystem().getString(R.string.label_pool_cost_chf);
        }
    }

    public String showName() {
        return name;
    }

    public String showLocation() {
        return location;
    }

    public List<String> showPools() {
        List<String> finalPools = new ArrayList<String>();
        for (Pool pool : pools) {
            finalPools.add(pool.showPool());
            pool.addEmoji();
        }
        return finalPools;
    }
}
