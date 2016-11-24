package demo.test.pageObject;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by yjshi on 11/24/16.
 * PageObject fot LoginActivity
 */

public class LoginPageObject {

    public static void inputEmail(String email){
        onView(withId(demo.test.espressodemo.R.id.email))
                .perform(typeText(email), closeSoftKeyboard());
        onView(withId(demo.test.espressodemo.R.id.email))
                .check(matches(withText(email)));
    }

    public static void inputPassword(String password){
        onView(withId(demo.test.espressodemo.R.id.password))
                .perform(typeText(password), closeSoftKeyboard());
        onView(withId(demo.test.espressodemo.R.id.password))
                .check(matches(withText(password)));
    }

    public static void clickLogin(){
        onView(withId(demo.test.espressodemo.R.id.email_sign_in_button))
                .perform(click());
    }
}
