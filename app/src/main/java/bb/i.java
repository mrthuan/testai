package bb;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i {
    public static /* synthetic */ NotificationChannel c(int i10) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i10);
    }

    public static /* synthetic */ NotificationChannel d(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return AutofillManager.class;
    }
}
