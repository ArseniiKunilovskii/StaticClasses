package com.pluralsight;

public class NameFormatter {

    private NameFormatter(){}

    public static String format(String firstName, String lastName){
        return lastName+", "+firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }
    public static String format(String fullName){
        String[] nameArray = fullName.split(" ");
        int length = nameArray.length;
        if(length == 2){
            return nameArray[1]+" "+nameArray[0];
        } else if (length == 4) {
            return nameArray[2]+" "+nameArray[0]+" "+nameArray[1]+", "+nameArray[3];
        }else if(length == 5){
            return nameArray[3]+ " "+nameArray[0]+" "+nameArray[1]+" "+nameArray[2]+", "+nameArray[4];
        }
        return fullName + " - Name in the wrong format";
    }
}
