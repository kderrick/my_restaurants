package com.epicodus.www.myrestaurants;

import android.content.Intent;
import android.os.Build;
import android.widget.TextView;

import com.epicodus.www.myrestaurants.ui.MainActivity;
<<<<<<< HEAD
import com.epicodus.www.myrestaurants.ui.RestaurantListActivity;
=======
import com.epicodus.www.myrestaurants.ui.RestaurantsActivity;
>>>>>>> 8e0d3a2681102eec2bffd78d11b5042ba7d24b62

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.Assert.assertTrue;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void validateTextViewContent() {
        TextView appNameTextView = (TextView) activity.findViewById(R.id.appNameTextView);
        assertTrue("MyRestaurants".equals(appNameTextView.getText().toString()));
    }

    @Test
    public void secondActivityStarted() {
        activity.findViewById(R.id.findRestaurantsButton).performClick();
<<<<<<< HEAD
        Intent expectedIntent = new Intent(activity, RestaurantListActivity.class);
=======
        Intent expectedIntent = new Intent(activity, RestaurantsActivity.class);
>>>>>>> 8e0d3a2681102eec2bffd78d11b5042ba7d24b62
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }
}