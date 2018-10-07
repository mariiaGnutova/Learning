import javax.swing.*;

public class Biography {
    public static void main(String[] args) {
        String userName = JOptionPane.showInputDialog("Please enter your name:");
        String userGender;
        do {
            userGender = JOptionPane.showInputDialog("Please choose your gender: Enter 1 for female, 2 for male, or 3 if you don't identify yourself with a gender.");
            if ((userGender.split("(\\d+)").length>0 || userGender.length()>1 || (Integer.parseInt(userGender)>3|| Integer.parseInt(userGender)<1))){
                JOptionPane.showMessageDialog(
                        null,
                        "please, enter only digits from 1 to 3",
                        "Info",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        while (!(userGender.charAt(0) == '1'|| userGender.charAt(0)== '2'||userGender.charAt(0)== '3'));
        if (userGender.charAt(0)== '1'){
            userGender ="I'm female";
        }
        else if(userGender.charAt(0)== '2'){
            userGender ="I'm male";
        }
        else{
            userGender ="I don't identify myself with a gender";
        }
        String userAge;
        do {
            userAge = JOptionPane.showInputDialog("How old are you?");
             String [] ifOnlyDigets = userAge.split("(\\d+)");
            if (ifOnlyDigets.length>0){
                JOptionPane.showMessageDialog(
                        null,
                        "please, enter only digits",
                        "title",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        }
        while (userAge.split("(\\d+)").length>0);

        String userNationality = JOptionPane.showInputDialog("What nationality are you?");
        String userJob = JOptionPane.showInputDialog("What is your job?");
        StringBuilder myBiography = new StringBuilder("My name is ");
        myBiography.append(userName);
        myBiography.append(". ");
        myBiography.append(userGender);
        myBiography.append(". Only ");
        myBiography.append(userAge);
        myBiography.append(" years old. My nationality is ");
        myBiography.append(userNationality);
        myBiography.append(" and my job is ");
        myBiography.append(userJob);
        myBiography.append(".");
        System.out.println(myBiography);
        }
    }

