package harvester;

import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teague
 */
public class SystemResourceMonitor {
    private static final SystemResourceMonitor SYSTEM_RESOURCE_MONITOR = new SystemResourceMonitor();
    private final HashMap<String, SystemResourceGenerator> srgs = new HashMap<>();
    
    public static SystemResourceMonitor getSystemResourceMonitor(){
        return SYSTEM_RESOURCE_MONITOR;
    }
    
    private SystemResourceMonitor(){
        System.out.println("System resource monitor started");
        
        SystemResourceGenerator srg = new SystemResourceGenerator("date +%s");
        
        srgs.put("date", srg);
    }
    
    public SystemResourceGenerator getResourceGenerator(String s){
        return srgs.get(s);
    }
}