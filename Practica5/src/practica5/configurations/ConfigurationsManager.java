/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurations;

/**
 *
 * @author carlo
 */
public class ConfigurationsManager {
    Object[] configurations;
    int first, last, iterator;

    public ConfigurationsManager(int lenght) {
        this.configurations = new Object[lenght];
        this.first = 0;
        this.last = 0;
        this.iterator = 0;
    }
    
    public void addConfiguration(Object conf){
        
        configurations[last]=conf;
        iterator=last;
        
        if(last==configurations.length-1){
            last=0;
        }else{
            last++;
        }
        
        if(first==last){
            if(first==configurations.length-1){
                first=0;
            }else{
                first++;
            }
        }
    }
    
    public Object getPreConfig(){    
        if(iterator==first){
            return null;
        }
        
        if(iterator==0){
            iterator=configurations.length-1;
        }else{
            iterator--;
        }       
        return configurations[iterator];
    }
    
    public Object getNextConfig(){
        if(iterator==last-1 || (iterator==configurations.length-1 && last==0)){
            return null;
        }
        
        if(iterator==configurations.length-1){
            iterator=0;
        }else{
            iterator++;
        }     
        return configurations[iterator];
    }
    
}
