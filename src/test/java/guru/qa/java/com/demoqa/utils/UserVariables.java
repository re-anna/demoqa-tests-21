package guru.qa.java.com.demoqa.utils;

public class UserVariables {
    RandomData randomData = new RandomData();
    public String
                firstName = randomData.getRandomFirstName(),
                lastName = randomData.getRandomLastName(),
                userEmail = randomData.getRandomUserEmail(),
                genderWrapper = randomData.getRandomGender(),
                userNumber = randomData.getRandomUserNumber(),
                birthDay = randomData.getRandomDay(),
                birthMonth = randomData.getRandomMonth(),
                birthYear = randomData.getRandomYear(),
                subjectsInput = randomData.getRandomSubject(),
                hobbiesWrapper = randomData.getRandomHobby(),
                uploadPicture = "kartinki-stich-22.jpg",
                currentAddress = randomData.getRandomCurrentAddress(),
                state = randomData.getRandomState(),
                city = randomData.getRandomCity(state);
    }
