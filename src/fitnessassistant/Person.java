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
public class Person {

    String gender;
    int age;
    double heigth;
    double weight;
    double IMC;
    boolean tieneEnfermedades;
    boolean smoke;
    boolean drink;
    
    public Person(String gender, int age, double heigth, double weight){
        this.gender = gender;
        this.age = age;
        this.heigth = heigth/100;
        this.weight = weight;
        
    }
    
    /*public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setHeigth(double heigth){
        this.heigth = heigth/100;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }*/
    
    public void setTieneEnfermedades(boolean tieneEnfermedades){
        this.tieneEnfermedades = tieneEnfermedades;
    }
    
    public void setSmoke(boolean smoke){
        this.smoke = smoke;
    }
    
    public void setDrink(boolean drink){
        this.drink = drink;
    }
    
    public void computeIMC(){
        IMC = weight/(heigth*heigth);
    }
   
}
