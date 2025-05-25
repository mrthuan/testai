package bb;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.IntentFilter;
import android.view.autofill.AutofillValue;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k {
    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2);
    }

    public static /* synthetic */ NotificationChannel e(String str, String str2) {
        return new NotificationChannel(str, str2, 4);
    }

    public static /* bridge */ /* synthetic */ AutofillValue g(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* synthetic */ InMemoryDexClassLoader i(ByteBuffer byteBuffer, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBuffer, classLoader);
    }

    public static /* bridge */ /* synthetic */ void m(Context context, m7.j jVar, IntentFilter intentFilter) {
        context.registerReceiver(jVar, intentFilter, 4);
    }
}
