package com.Sylhet;

import java.util.*;

public class choosingPath {

    public static void calculate(Place source,Place destination){
        ApplyingDjk minCosting= new ApplyingDjk();
        int[] cngCosts= minCosting.getShortestPathCNG(source);
        int[] rickshawCosts= minCosting.getShortestPathRickshaw(source);

        Map<Place,Place> cngParent = minCosting.parentCNG;
        Map<Place,Place> rickshawParent = minCosting.parentRickshaw;

        List<Place> cngpath = new ArrayList<Place>();
        for (Place vertex = destination; vertex != null; vertex = cngParent.get(vertex))
            cngpath.add(vertex);

        List<Place> rickshawPath = new ArrayList<Place>();
        for (Place vertex = destination; vertex != null; vertex = rickshawParent.get(vertex))
            rickshawPath.add(vertex);

        Collections.reverse(cngpath);
        Collections.reverse(rickshawPath);



        PriorityQueue<Option> pq = new PriorityQueue<>(100, new Comparator<Option>() {
            @Override
            public int compare(Option o1, Option o2) {
                return o1.total-o2.total;
            }
        });



        for(int i=0;i<80;i++)
        {
            if(cngCosts[i]!=Integer.MAX_VALUE && cngCosts[i]!=0){
                int[] cngTemp=minCosting.getShortestPathCNG(Database.getAllPlaces().get(i));
                if(cngTemp[destination.getPlaceId()]!=Integer.MAX_VALUE)
                {
                    pq.offer(new Option(Database.getAllPlaces().get(i),cngCosts[i],cngTemp[destination.getPlaceId()],"Cng","Cng"));
                }
                int[] temp=minCosting.getShortestPathRickshaw(Database.getAllPlaces().get(i));
                if(temp[destination.getPlaceId()]!=Integer.MAX_VALUE)
                {
                    pq.offer(new Option(Database.getAllPlaces().get(i),cngCosts[i],temp[destination.getPlaceId()],"Cng","Rickshaw"));
                }
            }


        }



            for(int i=0;i<80;i++)
            {
                if(rickshawCosts[i]!=Integer.MAX_VALUE){
                    int[] temp=minCosting.getShortestPathCNG(Database.getAllPlaces().get(i));
                    if(temp[destination.getPlaceId()]!=Integer.MAX_VALUE )
                    {
                        pq.offer(new Option(Database.getAllPlaces().get(i),rickshawCosts[i],temp[destination.getPlaceId()],"Rickshaw","Cng"));
                    }
                }


            }
        Option op=pq.poll();
        //System.out.println("There is no direct cng route between "+source.name+" and " + destination.name);
        if(op.midPlace.equals(destination)){
            System.out.println("Directly go to "+op.midPlace.getPlaceName()+ " by "+ op.first+" . Cost is "+ op.firstCost);
//           if(op.first.equals("Cng")) System.out.println("The cheapest route is to go from  "+source.getPlaceName()+ " to " +op.midPlace.getPlaceName() + " by "+op.first+", cost = "+
//                    op.cngCost+" ");
//           else System.out.println("The cheapest route is to go from [ "+source.getPlaceName()+ " to " +op.midPlace.getPlaceName() + "by "+op.second+", cost = "+
//                   op.rickshawCost+" ]");
        }else {
            System.out.println("Go from  " + source.getPlaceName() + " to " + op.midPlace.getPlaceName() + " by " + op.first + ", cost is " +
                    op.firstCost + " . Then from  " + op.midPlace.getPlaceName() + " to " + destination.getPlaceName() + " by " + op.second + ", cost is "
                    + op.secondCost + " . Total cost is " + op.total + ".");
        }
        if(cngCosts[destination.getPlaceId()]!=Integer.MAX_VALUE)
        {
            if(op.first!="Cng" && op.second!="Cng" ) {
                System.out.println("There is a direct cng route between " + source.getPlaceName() + " and " + destination.getPlaceName() + " which costs " + cngCosts[destination.getPlaceId()]);
                System.out.println("Cng path -> "+cngpath.toString());

            }else
                System.out.println("There is no direct cng route between "+source.getPlaceName() + " and " + destination.getPlaceName() + ".");
        }else
        {
            System.out.println("There is no direct cng route between "+source.getPlaceName() + " and " + destination.getPlaceName() + ".");
        }

        if(rickshawCosts[destination.getPlaceId()]!=Integer.MAX_VALUE)
        {
            System.out.println("There is a direct Rickshaw route between "+source.getPlaceName() + " and " + destination.getPlaceName() + " which costs " + rickshawCosts[destination.getPlaceId()]);
            System.out.println("rickshaw Path -> "+rickshawPath.toString());
        }else
        {
            System.out.println("There is no direct Rickshaw route between "+source.getPlaceName() + " and " + destination.getPlaceName() + ".");
        }






    }
   static class  Option{
        Place midPlace;
        int firstCost,secondCost,total;
        String first,second;

       public Option(Place midPlace, int a, int b, String first, String second) {
           this.midPlace = midPlace;
           this.firstCost = a;
           this.secondCost = b;
           this.first = first;
           this.second = second;
           total=firstCost+secondCost;
       }
   }
}
