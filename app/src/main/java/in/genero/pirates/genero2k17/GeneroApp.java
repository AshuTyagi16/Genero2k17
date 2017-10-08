package in.genero.pirates.genero2k17;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by Sasuke on 10/3/2017.
 */

public class GeneroApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
