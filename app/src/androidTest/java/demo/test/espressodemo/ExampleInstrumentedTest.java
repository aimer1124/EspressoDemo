package demo.test.espressodemo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import demo.test.pageObject.LoginPageObject;
import demo.test.support.UserInfo;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(
            LoginActivity.class);

    @Test
    public void testAttemptLogin() {
        // Type text and then press the button.

        LoginPageObject.inputEmail(UserInfo.email);

        LoginPageObject.inputPassword(UserInfo.password);

        LoginPageObject.clickLogin();

    }
}
