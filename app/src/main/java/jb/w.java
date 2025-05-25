package jb;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;

/* compiled from: ServiceStarter.java */
@KeepForSdk
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: e  reason: collision with root package name */
    public static w f19158e;

    /* renamed from: a  reason: collision with root package name */
    public String f19159a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f19160b = null;
    public Boolean c = null;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f19161d = new ArrayDeque();

    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (f19158e == null) {
                f19158e = new w();
            }
            wVar = f19158e;
        }
        return wVar;
    }

    public final boolean b(Context context) {
        boolean z10;
        if (this.c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.c = Boolean.valueOf(z10);
        }
        if (!this.f19160b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.c.booleanValue();
    }

    public final boolean c(Context context) {
        boolean z10;
        if (this.f19160b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f19160b = Boolean.valueOf(z10);
        }
        if (!this.f19160b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f19160b.booleanValue();
    }
}
