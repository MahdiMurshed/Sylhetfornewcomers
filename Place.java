package com.Sylhet;

public class Place {
    private final int placeId;
    private final String placeName;

    public Place(String placeName,int placeId) {
        this.placeId = placeId;
        this.placeName = placeName;
    }

    public int getPlaceId() {
        return placeId;
    }



    public String getPlaceName() {
        return placeName;
    }


    @Override
    public String toString() {
        return placeName;
    }
}
