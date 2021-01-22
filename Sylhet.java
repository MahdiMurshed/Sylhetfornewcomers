package com.Sylhet;

import java.util.ArrayList;
import java.util.List;

public class Sylhet {
    private int totalPlace;
    List<List<Route>> routes;

    public Sylhet() {
    }
    Sylhet(int totalPlace)
    {
        this.totalPlace=totalPlace;
        routes=new ArrayList<>();
        for (int i=0;i<totalPlace;i++)
            routes.add(new ArrayList<>());
    }
    void addRoute(Place source,Place destination,double costCng,double costRick)
    {
        routes.get(source.getPlaceId()).add(new Route(source,destination,costCng,costRick));
    }
}
