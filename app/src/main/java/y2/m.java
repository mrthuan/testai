package y2;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* compiled from: WakeLocks.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f32011a;

    static {
        o2.h.e("WakeLocks");
        f32011a = new WeakHashMap<>();
    }

    public static PowerManager.WakeLock a(Context context, String str) {
        String h10 = a0.a.h("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, h10);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f32011a;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, h10);
        }
        return newWakeLock;
    }
}
