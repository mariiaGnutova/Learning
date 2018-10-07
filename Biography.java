import javax.swing.*;

public class Biography {
    public static void main(String[] args) {
        String name = "My name is ";
        String nameEnd = ". ";
        boolean addToBiography = false;
        String userName;
        StringBuilder question = new StringBuilder("What is your name?");
        do {
          userName = JOptionPane.showInputDialog(question);
          addToBiography = checkInfo( userName, question.toString());
        }
        while (addToBiography & userName.length()<2);

        if (!addToBiography){
            name = "";
            nameEnd = "";
        }
        String userGender;

        String genderStart = " ";
        String ageStart = " I'm only ";
        String ageEnde = " years old. ";
        String natianality = "My nationality is ";
        String nationalityEnd = ".";
        String job = " And my job is ";
        String jobEnd = ".";
        do {
            question.replace(0, question.length(), "What is your gender: Enter 1 for female, 2 for male, or 3 if you don't identify yourself with a gender.");
            userGender = JOptionPane.showInputDialog(question);
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
            userGender ="I'm female.";
        }
        else if(userGender.charAt(0)== '2'){
            userGender ="I'm male.";
        }
        else{
            userGender ="I don't identify myself with a gender.";
        }
        String userAge;
        do {
            question.replace(0, question.length(),"How old are you?");
            userAge = JOptionPane.showInputDialog(question);
             String [] ifOnlyDigets = userAge.split("(\\d+)");
            if (ifOnlyDigets.length>0){
                JOptionPane.showMessageDialog(
                        null,
                        "please, enter only digits",
                        "title",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } while (userAge.split("(\\d+)").length>0);


        question.replace(0, question.length(),"What nationality are you?");

        String userNationality;
        addToBiography = false;
        do {
            userNationality = JOptionPane.showInputDialog(question);
            addToBiography = checkInfo( userNationality, question.toString());
        }
        while (addToBiography & userName.length()<2);

        if (!addToBiography){
            nationalityEnd = "";
            natianality = "";
        }

        question.replace(0, question.length(),"What is your job?");
        addToBiography = false;
        String userJob;
        do {
            userJob = JOptionPane.showInputDialog(question);
            addToBiography = checkInfo( userJob, question.toString());
        }
        while (addToBiography & userName.length()<2);

        if (!addToBiography){
            job = "";
            jobEnd = "";
        }

       // question.replace(0, question.length(),name);
        StringBuilder myBiography = new StringBuilder();
        myBiography.append(name);
        myBiography.append(userName);
        myBiography.append(nameEnd);
        myBiography.append(genderStart);
        myBiography.append(userGender);
        myBiography.append(ageStart);
        myBiography.append(userAge);
        myBiography.append(ageEnde);
        myBiography.append(natianality);
        myBiography.append(userNationality);
        myBiography.append(nationalityEnd);
        myBiography.append(job);
        myBiography.append(userJob);
        myBiography.append(jobEnd);
        if (myBiography.length() ==0 ){
            JOptionPane.showMessageDialog(
                    null,
                    "It's sade, that you don't want to sheare information about you",
                    ":(",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        System.out.println(myBiography);
        }

        public static boolean checkInfo (String yourInfo, String wantToKnow){
            boolean addToBiography = true;
            if (yourInfo.length() <2){
                addToBiography = true;
            int reply = JOptionPane.showConfirmDialog(null, "Do you want to add information about your? " + wantToKnow, yourInfo, JOptionPane.YES_NO_OPTION);
            if (!(reply == JOptionPane.YES_OPTION)){
                addToBiography = false;
             }
            }
        return addToBiography;
        }
    }

