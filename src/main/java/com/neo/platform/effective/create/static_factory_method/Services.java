package com.neo.platform.effective.create.static_factory_method;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
    private Services(){};

    private static final Map<String,Provider> providers = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME="default";

    //Provider register API
    public static  void registerDefaultProvider(Provider p){
        registerProvider(DEFAULT_PROVIDER_NAME,p);
    }

    public static void registerProvider(String name,Provider provider){
        providers.put(name,provider);
    }

    //Service access API
    public static Service newInstance(){
        return providers.get(DEFAULT_PROVIDER_NAME).newService();
    }

    public static Service newInstance(String name){
        return providers.get(name).newService();
    }

}
