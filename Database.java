package com.Sylhet;

import java.util.HashMap;
import java.util.Map;

public class Database {
    public static Sylhet sylhet;
    private static Map<Integer,Place> allPlaces;

    public static Place[] getAll() {
        return all;
    }

    private static Place[] all;

    public static Map<Integer, Place> getAllPlaces() {
        return allPlaces;
    }

    static public void initDatabase(){
         sylhet= new Sylhet(90);
                 allPlaces= new HashMap<>();
        Place v0 = new Place("Amborkhana",0);
        Place v1 = new Place("Eidgah",1);
        Place v2 = new Place("TB GATE",2);
        Place v3 = new Place("Tilagor",3);
        Place v4 = new Place("Khadim",4);
        Place v5 = new Place("Shahporan",5);
        Place v6 = new Place("Bondor",6);
        Place v7=new  Place("Kajitula",7);
        Place v8 = new Place("Loharpara",8);
        Place v9 = new Place("Noyashorok",9);
        Place v10=new  Place("Kumarpara",10);
        Place v11 = new Place("Naiorpul",11);
        Place v12=new  Place("Jailroad",12);
        Place v13 = new Place("Barutkhana",13);
        Place v14 = new Place("Zindabazar",14);
        Place v15=new  Place("Hawapara",15);
        Place v16 = new Place("Tatipara",16);
        Place v17=new  Place("Mirboxtula",17);
        Place v18 = new Place("Chowhatta",18);
        Place v19 = new Place("Rikabibazar",19);
        Place v20=new  Place("Lamabazar",20);
        Place v21=new  Place("Mirjajangal",21);
        Place v22 = new Place("Jollarpar",22);
        Place v23= new Place("Dariapara",23);
        Place v24=new  Place("Taltoala",24);
        Place v25 = new Place("Jitu miar point",25);
        Place v26=new  Place("Sheikhghat",26);
        Place v27 = new Place("Kuarpar",27);
        Place v28 = new Place("Medical",28);
        Place v29=new  Place("Bagbari",29);
        Place v30 = new Place("Kajolshah",30);
        Place v31=new  Place("Kalibari",31);
        Place v32 = new Place("Modina Market",32);
        Place v33 = new Place("Pathantula",33);
        Place v34=new  Place("Shubidbazar",34);
        Place v35 = new Place("Mirer Moydan",35);
        Place v36=new  Place("Payra",36);
        Place v37 = new Place("Poschim Dorga Gate",37);
        Place v38=new  Place("Dorshon Dewri",38);
        Place v39 = new Place("Housing Estate",39);
        Place v40 = new Place("Akhali ghat",40);
        Place v41=new  Place("Shurma",41);
        Place v42 = new Place("Topobon",42);
        Place v43=new  Place("Varsity gate",43);
        Place v44 = new Place("Kumargaon Bus Stand",44);
        Place v45=new  Place("Tukerbazar",45);
        Place v46 = new Place("Mojumdari",46);
        Place v47 = new Place("Khasdobir",47);
        Place v48=new  Place("Chowkidighi",48);
        Place v49=new  Place("Cricket Stadium",49);
        Place v50 = new Place("Lakkatura",50);
        Place v51 = new Place("Airport",51);
        Place v52=new  Place("Purbo Dorga Gate",52);
        Place v53 = new Place("Subhanighat",53);
        Place v54=new  Place("Jotorpur",54);
        Place v55 = new Place("Mirabazar",55);
        Place v56 = new Place("Shibgonj",56);
        Place v57=new  Place("Shonarpara",57);
        Place v58 = new Place("Raynogor",58);
        Place v59=new  Place("Dorjipara",59);
        Place v60 = new Place("Uposhohor",60);
        Place v61=new  Place("Mendibag",61);
        Place v62 = new Place("Bandh",62);
        Place v63 = new Place("Humayun chottor",63);
        Place v64=new  Place("Kodomtoli Bus stand",64);
        Place v65=new  Place("Railway Station",65);
        Place v66 = new Place("Kean bridge/Jalalabad park",66);
        Place v67 = new Place("Old Rail Station",67);
        Place v68=new  Place("Borobazar",68);
        Place v69 = new Place("Dhopadighir par",69);
        Place v70 = new Place("Pachbhai restaurant",70);
        Place v71=new  Place("Panshi restaurant",71);

        final Place[] v={v0,v1,v2,v3,v4,v5,v6,v7,v8,v9,
                v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,
                v20,v21,v22,v23,v24,v25,v26,v27,v28,v29,
                v30,v31,v32,v33,v34,v35,v36,v37,v38,v39,
                v40,v41,v42,v43,v44,v45,v46,v47,v48,v49,
                v50,v51,v52,v53,v54,v55,v56,v57,v58,v59,
                v60,v61,v62,v63,v64,v65,v66,v67,v68,v69,
                v70,v71};
        all=v;

        allPlaces.put(0,v0);
        allPlaces.put(1,v1);
        allPlaces.put(2,v2);
        allPlaces.put(3,v3);
        allPlaces.put(4,v4);
        allPlaces.put(5,v5);
        allPlaces.put(6,v6);
        allPlaces.put(7,v7);
        allPlaces.put(8,v8);
        allPlaces.put(9,v9);
        allPlaces.put(10,v10);
        allPlaces.put(11,v11);
        allPlaces.put(12,v12);
        allPlaces.put(13,v13);
        allPlaces.put(14,v14);
        allPlaces.put(15,v15);
        allPlaces.put(16,v16);
        allPlaces.put(17,v17);
        allPlaces.put(18,v18);
        allPlaces.put(19,v19);
        allPlaces.put(20,v20);
        allPlaces.put(21,v21);
        allPlaces.put(22,v22);
        allPlaces.put(23,v23);
        allPlaces.put(24,v24);
        allPlaces.put(25,v25);
        allPlaces.put(26,v26);
        allPlaces.put(27,v27);
        allPlaces.put(28,v28);
        allPlaces.put(29,v29);
        allPlaces.put(30,v30);
        allPlaces.put(31,v31);
        allPlaces.put(32,v32);
        allPlaces.put(33,v33);
        allPlaces.put(34,v34);
        allPlaces.put(35,v35);
        allPlaces.put(36,v36);
        allPlaces.put(37,v37);
        allPlaces.put(38,v38);
        allPlaces.put(39,v39);
        allPlaces.put(40,v40);
        allPlaces.put(41,v41);
        allPlaces.put(42,v42);
        allPlaces.put(43,v43);
        allPlaces.put(44,v44);
        allPlaces.put(45,v45);
        allPlaces.put(46,v46);
        allPlaces.put(47,v47);
        allPlaces.put(48,v48);
        allPlaces.put(49,v49);
        allPlaces.put(50,v50);
        allPlaces.put(51,v51);
        allPlaces.put(52,v52);
        allPlaces.put(53,v53);
        allPlaces.put(54,v54);
        allPlaces.put(55,v55);
        allPlaces.put(56,v56);
        allPlaces.put(57,v57);
        allPlaces.put(58,v58);
        allPlaces.put(59,v59);
        allPlaces.put(60,v60);
        allPlaces.put(61,v61);
        allPlaces.put(62,v62);
        allPlaces.put(63,v63);
        allPlaces.put(64,v64);
        allPlaces.put(65,v65);
        allPlaces.put(66,v66);
        allPlaces.put(67,v67);
        allPlaces.put(68,v68);
        allPlaces.put(69,v69);
        allPlaces.put(70,v70);
        allPlaces.put(71,v71);

        //0.Amborkhana
        sylhet.addRoute(v0, v12, 0, 30);
        sylhet.addRoute(v0, v1, 10, 20);
        sylhet.addRoute(v0, v2, 10, 30);
        sylhet.addRoute(v0, v3, 10, 50);
        sylhet.addRoute(v0, v6, 10, 40);
        sylhet.addRoute(v0, v46, 5, 10);
        sylhet.addRoute(v0, v47, 5, 15);
        sylhet.addRoute(v0, v48, 5, 20);
        sylhet.addRoute(v0, v49, 10, 30);
        sylhet.addRoute(v0, v50, 10, 30);
        sylhet.addRoute(v0, v51, 15, 40);
        sylhet.addRoute(v0, v68, 0, 10);
        sylhet.addRoute(v0, v8, 0, 10);
        sylhet.addRoute(v0, v7, 0, 15);
        sylhet.addRoute(v0, v9, 0, 20);
        sylhet.addRoute(v0, v15, 0, 15);
        sylhet.addRoute(v0, v13, 0, 20);
        sylhet.addRoute(v0, v17, 0, 20);
        sylhet.addRoute(v0, v52, 0, 10);
        sylhet.addRoute(v0, v18, 0, 10);
        sylhet.addRoute(v0, v23, 10, 20);
        sylhet.addRoute(v0, v21, 10, 30);
        sylhet.addRoute(v0, v14, 0, 20);
        sylhet.addRoute(v0, v22, 0, 30);
        sylhet.addRoute(v0, v11, 0, 40);
        sylhet.addRoute(v0, v19, 0, 20);
        sylhet.addRoute(v0, v20, 0, 30);
        sylhet.addRoute(v0, v60, 20, 70);
        sylhet.addRoute(v0, v61, 20, 70);
        sylhet.addRoute(v0, v62, 20, 100);
        sylhet.addRoute(v0, v63, 20, 100);
        sylhet.addRoute(v0, v49, 10, 30);
        sylhet.addRoute(v0, v50, 10, 30);
        sylhet.addRoute(v0, v51, 15, 40);
        sylhet.addRoute(v0, v34, 10, 20);
        sylhet.addRoute(v0, v33, 10, 30);
        sylhet.addRoute(v0, v32, 10, 30);
        sylhet.addRoute(v0, v37, 0, 10);
        sylhet.addRoute(v0, v38, 0, 10);
        sylhet.addRoute(v0, v39, 0, 10);
        sylhet.addRoute(v0, v35, 0, 30);
        sylhet.addRoute(v0, v36, 0, 30);
        sylhet.addRoute(v0, v40, 15, 40);
        sylhet.addRoute(v0, v41, 15, 50);
        sylhet.addRoute(v0, v42, 15, 50);
        sylhet.addRoute(v0, v43, 15, 50);
        sylhet.addRoute(v0, v44, 15, 0);
        sylhet.addRoute(v0, v45, 15, 0);

        //1.Eidgah
        sylhet.addRoute(v1, v0, 5, 20);
        sylhet.addRoute(v1, v2, 5, 10);
        sylhet.addRoute(v1, v3, 10, 30);
        sylhet.addRoute(v1, v6, 10, 40);
        sylhet.addRoute(v1, v68, 5, 10);
        sylhet.addRoute(v1, v10, 0, 15);
        sylhet.addRoute(v1, v7, 0, 10);
        sylhet.addRoute(v1, v8, 0, 15);
        sylhet.addRoute(v1, v12, 0, 20);
        sylhet.addRoute(v1, v13, 0, 30);
        sylhet.addRoute(v1, v15, 0, 30);
        sylhet.addRoute(v1, v16, 0, 30);
        sylhet.addRoute(v1, v17, 0, 20);
        //

        //2.Tb gate
        sylhet.addRoute(v2, v0, 5, 20);
        sylhet.addRoute(v2, v1, 5, 10);
        sylhet.addRoute(v2, v68, 5, 15);
        sylhet.addRoute(v2, v3, 10, 30);
        //

        //3.Tilagor
        sylhet.addRoute(v3, v0, 15, 50);
        sylhet.addRoute(v3, v1, 15, 40);
        sylhet.addRoute(v3, v2, 10, 30);
        sylhet.addRoute(v3, v68, 15, 50);
        sylhet.addRoute(v3, v4, 10, 0);
        sylhet.addRoute(v3, v5, 10, 0);
        sylhet.addRoute(v3, v55, 10, 25);
        sylhet.addRoute(v3, v56, 5, 10);
        sylhet.addRoute(v3, v57, 10, 20);
        sylhet.addRoute(v3, v58, 10, 20);
        sylhet.addRoute(v3, v59, 10, 20);
        sylhet.addRoute(v3, v6, 10, 40);
        sylhet.addRoute(v3, v11, 10, 30);
        sylhet.addRoute(v3, v69, 10, 40);
        //
        //4.Khadim
        sylhet.addRoute(v4, v3, 5, 15);
        sylhet.addRoute(v4, v5, 5, 15);
        sylhet.addRoute(v4, v55, 15, 0);
        sylhet.addRoute(v4, v56, 10, 0);
        sylhet.addRoute(v4, v57, 15, 0);
        sylhet.addRoute(v4, v58, 15, 0);
        sylhet.addRoute(v4, v59, 15, 0);
        sylhet.addRoute(v4, v6, 15, 0);
        sylhet.addRoute(v4, v11, 15, 0);
        sylhet.addRoute(v4, v69, 15, 0);
        //
        //5.Shahporan
        sylhet.addRoute(v5, v3, 10, 0);
        sylhet.addRoute(v5, v4, 5, 15);
        sylhet.addRoute(v5, v55, 20, 0);
        sylhet.addRoute(v5, v56, 15, 0);
        sylhet.addRoute(v5, v57, 20, 0);
        sylhet.addRoute(v5, v58, 20, 0);
        sylhet.addRoute(v5, v59, 20, 0);
        sylhet.addRoute(v5, v6, 20, 0);
        sylhet.addRoute(v5, v11, 20, 0);
        sylhet.addRoute(v5, v69, 20, 0);
        //
        //6.Bondor
        sylhet.addRoute(v6, v0, 10, 0);
        sylhet.addRoute(v6, v12, 0, 20);
        sylhet.addRoute(v6, v13, 10, 20);
        sylhet.addRoute(v6, v15, 0, 20);
        sylhet.addRoute(v6, v16, 0, 20);
        sylhet.addRoute(v6, v17, 0, 30);
        sylhet.addRoute(v6, v18, 10, 20);
        sylhet.addRoute(v6, v52, 10, 0);
        sylhet.addRoute(v6, v14, 0, 10);
        sylhet.addRoute(v6, v21, 10, 20);
        sylhet.addRoute(v6, v22, 0, 15);
        sylhet.addRoute(v6, v3, 10, 0);
        sylhet.addRoute(v6, v4, 15, 0);
        sylhet.addRoute(v6, v55, 10, 20);
        sylhet.addRoute(v6, v56, 10, 30);
        sylhet.addRoute(v6, v57, 10, 25);
        sylhet.addRoute(v6, v58, 10, 25);
        sylhet.addRoute(v6, v59, 10, 25);
        sylhet.addRoute(v6, v11, 5, 10);
        sylhet.addRoute(v6, v69, 0, 10);
        sylhet.addRoute(v6, v53, 10, 10);
        sylhet.addRoute(v6, v19, 10, 0);
        sylhet.addRoute(v6, v20, 10, 0);
        sylhet.addRoute(v6, v60, 10, 20);
        sylhet.addRoute(v6, v61, 10, 30);
        sylhet.addRoute(v6, v62, 10, 0);
        sylhet.addRoute(v6, v63, 10, 0);
        sylhet.addRoute(v6, v64, 15, 30);
        sylhet.addRoute(v6, v65, 15, 30);
        sylhet.addRoute(v6, v66, 0, 10);
        sylhet.addRoute(v6, v67, 15, 0);
        sylhet.addRoute(v6, v25, 10, 15);
        sylhet.addRoute(v6, v24, 0, 10);
        sylhet.addRoute(v6, v26, 10, 20);
        sylhet.addRoute(v6, v27, 10, 20);
        sylhet.addRoute(v6, v28, 10, 30);
        sylhet.addRoute(v6, v30, 10, 30);
        sylhet.addRoute(v6, v32, 10, 0);
        sylhet.addRoute(v6, v33, 10, 0);
        sylhet.addRoute(v6, v34, 10, 0);
        sylhet.addRoute(v6, v35, 10, 0);
        sylhet.addRoute(v6, v40, 15, 0);
        sylhet.addRoute(v6, v41, 15, 0);
        sylhet.addRoute(v6, v42, 15, 0);
        sylhet.addRoute(v6, v43, 15, 0);
        sylhet.addRoute(v6, v44, 20, 0);
        sylhet.addRoute(v6, v45, 20, 0);

        //7.Kajitula
        sylhet.addRoute(v7, v0, 0, 15);
        sylhet.addRoute(v7, v1, 0, 10);
        sylhet.addRoute(v7, v2, 0, 20);
        sylhet.addRoute(v7, v68, 0, 20);
        sylhet.addRoute(v7, v10, 0, 15);
        sylhet.addRoute(v7, v8, 0, 10);
        sylhet.addRoute(v7, v9, 0, 10);
        sylhet.addRoute(v7, v12, 0, 10);
        sylhet.addRoute(v7, v13, 0, 20);
        sylhet.addRoute(v7, v15, 0, 20);
        sylhet.addRoute(v7, v16, 0, 20);
        sylhet.addRoute(v7, v17, 0, 10);
        sylhet.addRoute(v7, v18, 0, 15);
        sylhet.addRoute(v7, v52, 0, 20);
        sylhet.addRoute(v7, v14, 0, 30);


        //
        //8.Loharpara
        sylhet.addRoute(v8, v0, 0, 10);
        sylhet.addRoute(v8, v1, 0, 10);
        sylhet.addRoute(v8, v7, 0, 10);
        sylhet.addRoute(v8, v9, 0, 10);


        //9.Noyashorok
        sylhet.addRoute(v9, v11, 0, 20);
        sylhet.addRoute(v9, v10, 0, 10);
        sylhet.addRoute(v9, v15, 0, 10);
        sylhet.addRoute(v9, v16, 0, 10);
        sylhet.addRoute(v9, v0, 0, 20);
        sylhet.addRoute(v9, v1, 0, 15);
        sylhet.addRoute(v9, v7, 0, 10);
        sylhet.addRoute(v9, v13, 0, 15);
        sylhet.addRoute(v9, v18, 0, 10);
        sylhet.addRoute(v9, v6, 0, 20);
        sylhet.addRoute(v9, v17, 0, 10);
        //

        //
        //10.Kumarpara
        sylhet.addRoute(v10, v9, 0, 10);
        sylhet.addRoute(v10, v11, 0, 10);
        sylhet.addRoute(v10, v17, 0, 15);
        sylhet.addRoute(v10, v1, 0, 15);
        sylhet.addRoute(v10, v18, 0, 20);
        //

        //11.Naiorpul
        sylhet.addRoute(v11, v55, 5, 10);
        sylhet.addRoute(v11, v57, 5, 15);
        sylhet.addRoute(v11, v58, 5, 15);
        sylhet.addRoute(v11, v59, 5, 10);
        sylhet.addRoute(v11, v56, 5, 20);
        sylhet.addRoute(v11, v3, 10, 30);
        sylhet.addRoute(v11, v4, 15, 50);
        sylhet.addRoute(v11, v5, 20, 70);
        sylhet.addRoute(v11, v14, 0, 20);
        sylhet.addRoute(v11, v12, 0, 10);
        sylhet.addRoute(v11, v6, 5, 20);
        sylhet.addRoute(v11, v13, 0, 15);
        sylhet.addRoute(v11, v16, 0, 20);
        sylhet.addRoute(v11, v15, 0, 20);
        sylhet.addRoute(v11, v17, 0, 20);
        sylhet.addRoute(v11, v7, 0, 20);
        sylhet.addRoute(v11, v9, 0, 20);
        sylhet.addRoute(v11, v1, 0, 25);
        sylhet.addRoute(v11, v8, 0, 20);
        sylhet.addRoute(v11, v10, 0, 10);

        //

        //12.Jailroad
        sylhet.addRoute(v12, v6, 0, 10);
        sylhet.addRoute(v12, v13, 0, 10);
        sylhet.addRoute(v12, v14, 0, 10);
        sylhet.addRoute(v12, v9, 0, 10);
        sylhet.addRoute(v12, v0, 0, 30);
        sylhet.addRoute(v12, v11, 0, 10);
        sylhet.addRoute(v12, v15, 0, 10);
        sylhet.addRoute(v12, v16, 0, 10);




    }
}
//         sylhet= new Sylhet(90);
//                 getPlace= new HashMap<>();
//
//        Place v0 = new Place("Amborkhana",0);
//        Place v1 = new Place("Noyasorok",1);
//        Place v2 = new Place("varsity",2);
//        Place v3 = new Place("Modina market",3);
//        Place v4 = new Place("subidbazar",4);
//        Place v5 = new Place("lamabazar",5);
//        Place v6 = new Place("Bondor",6);
//
//final Place[] v={v0,v1,v2,v3,v4,v5,v6};
//        all=v;
//
//        getPlace.put(0,v0);
//        getPlace.put(1,v1);
//        getPlace.put(2,v2);
//        getPlace.put(3,v3);
//        getPlace.put(4,v4);
//        getPlace.put(5,v5);
//        getPlace.put(6,v6);
//
//
//
//        //eirokom banabi
//        //  void addRoute(Place source, Place destination, double costForCNG, double costForRickshaw)
//        // eita holo format
//        sylhet.addRoute(v0,v1,0,15);
//        sylhet.addRoute(v0,v2,15,0);
//        sylhet.addRoute(v0,v3,10,0);
//        sylhet.addRoute(v0,v4,5,20);
//        sylhet.addRoute(v0,v6,10,30);
//        sylhet.addRoute(v1,v0,0,15);
//        sylhet.addRoute(v1,v6,0,30);
//        sylhet.addRoute(v2,v0,10,0);
//        sylhet.addRoute(v2,v3,5,20);
//        sylhet.addRoute(v2,v4,10,0);
//        sylhet.addRoute(v2,v5,15,0);
//        sylhet.addRoute(v2,v6,20,0);
//        sylhet.addRoute(v3,v0,10,0);
//        sylhet.addRoute(v3,v2,5,20);
//        sylhet.addRoute(v3,v4,5,15);
//        sylhet.addRoute(v3,v5,10,20);
//        sylhet.addRoute(v3,v6,10,0);
//        sylhet.addRoute(v4,v0,5,20);
//        sylhet.addRoute(v4,v2,10,0);
//        sylhet.addRoute(v4,v3,5,20);
//        sylhet.addRoute(v4,v5,10,20);
//        sylhet.addRoute(v4,v6,10,0);
//        sylhet.addRoute(v5,v2,15,0);
//        sylhet.addRoute(v5,v3,15,0);
//        sylhet.addRoute(v5,v4,10,20);
//        sylhet.addRoute(v5,v6,5,10);
//        sylhet.addRoute(v6,v0,10,30);
//        sylhet.addRoute(v6,v1,0,30);
//        sylhet.addRoute(v6,v2,20,0);
//        sylhet.addRoute(v6,v3,15,0);
//        sylhet.addRoute(v6,v4,10,20);
//        sylhet.addRoute(v6,v5,5,10);


