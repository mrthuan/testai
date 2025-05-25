package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class Storage {
    public static final ReentrantLock c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public static Storage f10829d;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f10830a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f10831b;

    public Storage(Context context) {
        this.f10831b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk
    public static Storage a(Context context) {
        Preconditions.j(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (f10829d == null) {
                f10829d = new Storage(context.getApplicationContext());
            }
            return f10829d;
        } finally {
            reentrantLock.unlock();
        }
    }
}
