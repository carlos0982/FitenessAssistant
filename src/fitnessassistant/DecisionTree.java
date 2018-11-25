/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessassistant;

/**
 *
 * @author carlos
 */
public class DecisionTree {

    public String getTrainingPlan(Person person) {
        
        person.computeIMC();
        double IMC = person.IMC;
        String recomendation = "Work out";
         
        if (person.gender.equals("MALE")) {
            
            if (person.age >= 18 && person.age <= 25) {
 
                if (IMC < 18.5) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC >= 18.5 && IMC <= 24.9) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC >= 25 && IMC <= 29.9) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC > 30) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                }
                
            } else {
                
                if (IMC < 18.5) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC >= 18.5 && IMC <= 24.9) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC >= 25 && IMC <= 29.9) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC > 30) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                }

            }
        } else {
            
            if (person.age >= 18 && person.age <= 25) {
                
                if (IMC < 18.5) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC >= 18.5 && IMC <= 24.9) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC >= 25 && IMC <= 29.9) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC > 30) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                }
                
            } else {
                
                if (IMC < 18.5) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC >= 18.5 && IMC <= 24.9) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC >= 25 && IMC <= 29.9) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                } else if (IMC > 30) {
                    
                    if(person.tieneEnfermedades){
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }else{
                        
                        if(person.drink || person.smoke){
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }else{
                            
                            if(person.activity.equals("SEDENTARY")){
                                // Recomendation goes here
                            }else if(person.activity.equals("MODERATE")){
                                // Recomendation goes here
                            }else{
                                // Recomendation goes here
                            }
                            
                        }
                        
                    }

                }

            }

        }
        
        return recomendation;
        
    }

}
