package guru.qa.java.com.demoqa.utils;

import com.github.javafaker.Faker;
import java.util.Locale;

public class RandomData {

    Faker fakerEn = new Faker(new Locale("en"));


    public String getRandomFirstName() {
        return fakerEn.name().firstName();
    }

    public String getRandomLastName() {
        return fakerEn.name().lastName();
    }

    public String getRandomUserEmail() {
        return fakerEn.internet().emailAddress();
    }

    public String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return fakerEn.options().option(genders);
    }

    public String getRandomUserNumber() {
        return fakerEn.phoneNumber().subscriberNumber(10);
    }

    public String getRandomDay() {
        int day = fakerEn.number().numberBetween(1, 28);
        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }

    public String getRandomMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return fakerEn.options().option(months);
    }

    public String getRandomYear() {
        int year = fakerEn.number().numberBetween(1980, 2010);
        return Integer.toString(year);
    }

    public String getRandomSubject() {
        String[] subjects = {"Accounting", "Arts", "Biology", "Chemistry", "Civics", "Economics", "English", "Commerce",
                "Computer Science", "Physics", "Maths", "Hindi", "History", "Social Studies"};

        return fakerEn.options().option(subjects);
    }

    public String getRandomHobby() {
        String[] hobbies = {"Sports", "Reading", "Music"};

        return fakerEn.options().option(hobbies);
    }

    public String getRandomPicture() {
        String[] pictures = {"5567c77f407118991c19f34cdb36358a.jpg", "1652235714_41.jpg", "hw1.JPG", "sponge-bob.jpg"};

        return fakerEn.options().option(pictures);
    }

    public String getRandomCurrentAddress() {
        return fakerEn.address().fullAddress();
    }

    public String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return fakerEn.options().option(states);
    }

    public String getRandomCity(String stateValue) {
        switch (stateValue) {
            case "NCR": {
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return fakerEn.options().option(city);
            }
            case "Uttar Pradesh": {
                String[] city = {"Agra", "Lucknow", "Merrut"};
                return fakerEn.options().option(city);
            }
            case "Haryana": {
                String[] city = {"Karnal", "Panipat"};
                return fakerEn.options().option(city);
            }
            case "Rajasthan": {
                String[] city = {"Jaipur", "Jaiselmer"};
                return fakerEn.options().option(city);
            }
        }
        return null;
    }
}