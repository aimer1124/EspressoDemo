package demo.test.espressodemo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {


    public static final String STRING_TO_BE_TYPED_EMAIL = "EspressoDemo@mail.com";
    public static final String STRING_TO_BE_TYPED_EMAIL_PASSWORD = "123456";

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("demo.test.test", appContext.getPackageName());
    }


    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(
            LoginActivity.class);

    @Test
    public void attemptLoginTest() {
        // Type text and then press the button.
        onView(withId(demo.test.espressodemo.R.id.email))
                .perform(typeText(STRING_TO_BE_TYPED_EMAIL), closeSoftKeyboard());
        onView(withId(demo.test.espressodemo.R.id.email))
                .check(matches(withText(STRING_TO_BE_TYPED_EMAIL)));

        onView(withId(demo.test.espressodemo.R.id.password))
                .perform(typeText(STRING_TO_BE_TYPED_EMAIL_PASSWORD), closeSoftKeyboard());
        onView(withId(demo.test.espressodemo.R.id.password))
                .check(matches(withText(STRING_TO_BE_TYPED_EMAIL_PASSWORD)));

        onView(withId(demo.test.espressodemo.R.id.email_sign_in_button))
                .perform(click());

    }
}
