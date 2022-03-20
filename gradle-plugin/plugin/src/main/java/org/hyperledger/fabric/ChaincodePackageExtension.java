
package org.hyperledger.fabric;

import org.gradle.api.tasks.Nested;

public class ChaincodePackageExtension {

    String connectionJSON="default";
    String host="";

    @Nested
    CustomData customData;

    public String getConnectionJSON(){
        return connectionJSON;
    }

    public void setConnectionJSON(String json){
        this.connectionJSON = json;
    }

    public String getHost(){
        return host;
    }
 
    public void setHost(String host){
        this.host=host;
    }


    public CustomData getCustomData(){
        return this.customData;
    }

    public void setCustomData(CustomData data){
        this.customData = data;
    }

 }