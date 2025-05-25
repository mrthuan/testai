package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GmsClientSupervisor {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f11213a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static l f11214b;
    public static HandlerThread c;

    @KeepForSdk
    public static l a(Context context) {
        synchronized (f11213a) {
            if (f11214b == null) {
                f11214b = new l(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return f11214b;
    }

    @KeepForSdk
    public static HandlerThread b() {
        synchronized (f11213a) {
            HandlerThread handlerThread = c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            c = handlerThread2;
            handlerThread2.start();
            return c;
        }
    }

    public abstract void c(zzo zzoVar, zze zzeVar);

    public abstract boolean d(zzo zzoVar, zze zzeVar, String str, Executor executor);
}
