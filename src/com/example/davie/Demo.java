package com.example.davie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A_B_100");
        list.add("A_C_200");
        list.add("B_C_200");
        list.add("B_D_50");
        list.add("C_E_10");
        Map<String,ArrayList<String>> service2ServicesMap = new HashMap<>();
        Map<String,Long> service2TimeOutMap = new HashMap<>();
        Map<String,Long> serviceMaxTimeOutMap = new HashMap<>();
        for (String str: list){
            String[] arr = str.split("_");
            service2ServicesMap.computeIfAbsent(arr[0],k -> new ArrayList<>()).add(arr[1]);
            service2TimeOutMap.put(arr[0] + "_" + arr[1],Long.valueOf(arr[2]));
        }
        for (Map.Entry<String,ArrayList<String>> entry:service2ServicesMap.entrySet()){
            String serviceName = entry.getKey();
            List<String> passServiceList = entry.getValue();

        }
    }
    public long useTime(Map<String,ArrayList<String>> service2ServicesMap,Map<String,Long> service2TimeOutMap,String passServiceName){
        if (!service2ServicesMap.containsKey(passServiceName)){
            return 0;
        }
        List<String> passServiceList = service2ServicesMap.get(passServiceName);

    }
}
