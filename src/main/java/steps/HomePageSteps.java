package steps;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pages.Home;

import java.util.Arrays;
import java.util.HashSet;
@Component
public class HomePageSteps {
    @Autowired
    Home homePage;

    public void open() {
        homePage.open();
    }

    public void printUserCredentials(User user) {
        User testUser=new User("test","password", new HashSet<String>(Arrays.asList("testSkill")));
        User secondTestUser=new User();
        secondTestUser=testUser;
        user.setSkills(testUser.getSkills());
        user.addSkill("Java+Junit+Cucumber");
        System.out.println(user.getLogin()+ " - "+user.getPassword()+" - "+user.getSkills());
    }
}
