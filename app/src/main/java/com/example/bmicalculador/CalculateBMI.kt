package com.example.bmicalculador

class BodyMassIndex (var height: Double, var mass:Double) {

    fun getIndex(): Double {
        return mass / (height * height)
    }
    fun getCategory(): String{
        val index = getIndex()
        if (index < 16.0){
            return "Underweght (Severe Thinness)"
        } else if (index >=16.0 && index <= 16.9){
            return "Underweight (Moderate thinness)"
        } else if (index >= 17.0 && index <= 18.49){
            return "Underweight (Mild Thinness)"
        }else if (index >= 18.5 && index <24.99){
            return "Normal range"
        }else if (index >= 25.0 && index <= 29.99){
            return "Overweight (Pre-Obese)"
        } else if(index >= 30.0 && index <=34.9){
            return "Obeso (Class 1)"
        }else if(index >= 35.0 && index <=39.99){
            return "Obese (Class 2)"
        }else{
            return "overweight (Pre-Obese)"
        }

    }
}

