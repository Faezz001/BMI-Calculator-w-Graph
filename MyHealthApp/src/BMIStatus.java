/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

/* Display BMI status */
public class BMIStatus {
    private String underweight_str = "BMI status: Underweight";
    private String healthy_str     = "BMI status: Healthy";
    private String overweight_str  = "BMI status: Overweight";
    private String obese_str       = "BMI status: Obese"; 
    
    public String getBMIStatus(double bmi){
        String BMIStatus = "";
        if(bmi < 18.5){
           BMIStatus = underweight_str; /* When less than 18.5 hence the patient status is UNDERWEIGHT */
        }else if(bmi >= 18.5 && bmi <25.0){
            BMIStatus = healthy_str; /* Between 18.5 and 25 hence the patient status is HEALTHY */
        }else if(bmi >= 25.0 && bmi <30){
            BMIStatus = overweight_str;
        }else if(bmi >= 30){
            BMIStatus = obese_str; /* When more than 30 hence the patient status is OVERWEIGHT */
        }
        return BMIStatus;
    }
}



        