package bb;

import android.app.NotificationChannel;
import android.app.usage.StorageStatsManager;
import android.view.autofill.AutofillManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j {
    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* bridge */ /* synthetic */ StorageStatsManager e(Object obj) {
        return (StorageStatsManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager m(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* synthetic */ NotificationChannel y(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }
}
