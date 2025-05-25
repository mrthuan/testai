package jb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* compiled from: WakeLockHolder.java */
/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f19126a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f19127b = new Object();
    public static WakeLock c;

    public static void a(Context context) {
        if (c == null) {
            WakeLock wakeLock = new WakeLock(context);
            c = wakeLock;
            synchronized (wakeLock.f11964a) {
                wakeLock.f11969g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f19127b) {
            if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                c.c();
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f19127b) {
            a(context);
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                c.a(f19126a);
            }
            return startService;
        }
    }
}
