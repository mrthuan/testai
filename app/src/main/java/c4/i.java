package c4;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import java.util.Locale;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i {
    public static /* synthetic */ Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("update", "update", 4);
    }

    public static /* synthetic */ Locale.LanguageRange j(String str) {
        return new Locale.LanguageRange(str);
    }
}
