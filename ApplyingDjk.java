package com.Sylhet;

import java.util.*;

public class ApplyingDjk {

        private int vertices=80;
        Map<Place,Place> parentCNG ;
        Map<Place,Place> parentRickshaw ;
        public ApplyingDjk() {
            parentCNG = new HashMap<>();
            parentRickshaw = new HashMap<>();
        }


        int[] getShortestPathCNG(Place source){

            boolean[] SPT = new boolean[vertices];


            int[] cngAllCost = new int[vertices];


            PriorityQueue<Pair> pq = new PriorityQueue<>(vertices, Comparator.comparingInt(p -> p.currentCost));

            for(int i = 0; i < vertices; i++){
                cngAllCost[i] = Integer.MAX_VALUE;
            }
            cngAllCost[source.getPlaceId()] = 0;
            parentCNG.put(source,null);
            Pair p0 = new Pair( source,cngAllCost[source.getPlaceId()]);
            pq.offer(p0);

            while(!pq.isEmpty()){
                Pair extractedPair = pq.poll();
                Place extractedPlace= extractedPair.currentPlace;
                if(!SPT[extractedPlace.getPlaceId()]){
                    SPT[extractedPlace.getPlaceId()] = true;
                    for(Route edge : Database.sylhet.routes.get(extractedPlace.getPlaceId())){
                        Place destination = edge.getEnding();
                        if(!SPT[destination.getPlaceId()]){
                            if( (int)edge.getCngCost()==0) continue;
                            int newDistance = cngAllCost[extractedPlace.getPlaceId()] + (int)edge.getCngCost();

                            if(cngAllCost[destination.getPlaceId()] > newDistance){
                                parentCNG.put(destination,extractedPlace);
                                Pair newPair = new Pair(destination, newDistance);
                                pq.offer(newPair);
                                cngAllCost[destination.getPlaceId()] = newDistance;
                            }
                        }
                    }
                }
            }

            // printShortestPath(sourceVertex, distance);
            return cngAllCost;

        }
        int[] getShortestPathRickshaw(Place source){

            boolean[] SPT = new boolean[vertices];


            int[] rickAllCost = new int[vertices];


            PriorityQueue<Pair> pq = new PriorityQueue<>(vertices, Comparator.comparingInt(p -> (int) p.currentCost));

            for(int i = 0; i < vertices; i++){
                rickAllCost[i] = Integer.MAX_VALUE;
            }
            rickAllCost[source.getPlaceId()] = 0;
            parentRickshaw.put(source,null);
            Pair p0 = new Pair( source,rickAllCost[source.getPlaceId()]);
            pq.offer(p0);

            while(!pq.isEmpty()){
                Pair extractedPair = pq.poll();
                Place extractedPlace= extractedPair.currentPlace;
                if(!SPT[extractedPlace.getPlaceId()]){
                    SPT[extractedPlace.getPlaceId()] = true;
                    for(Route edge : Database.sylhet.routes.get(extractedPlace.getPlaceId())){
                        Place destination = edge.getEnding();
                        if(!SPT[destination.getPlaceId()]){
                            if((int)edge.getRickshawCost()==0) continue;
                            int newDistance = rickAllCost[extractedPlace.getPlaceId()] + (int)edge.getRickshawCost();

                            if(rickAllCost[destination.getPlaceId()] > newDistance){
                                parentRickshaw.put(destination,extractedPlace);
                                Pair newPair = new Pair(destination, newDistance);
                                pq.offer(newPair);
                                rickAllCost[destination.getPlaceId()] = newDistance;
                            }
                        }
                    }
                }
            }

            // printShortestPath(sourceVertex, distance);
            return rickAllCost;
        }

//        public static List<Place> getShortestPathTo(Place target, Map<Place,Place> parent) {
//            List<Place> path = new ArrayList<Place>();
//            for (Place vertex = target; vertex != null; vertex = parent.get(vertex))
//                path.add(vertex);
//
//            Collections.reverse(path);
//            return path;
//        }
        static class Pair{
            Place currentPlace;
            int currentCost;

            public Pair(Place currentPlace, int currentCost) {
                this.currentPlace = currentPlace;
                this.currentCost = currentCost;
            }
        }


    }

