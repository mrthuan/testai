package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class BlockingServiceConnection implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10872a = false;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedBlockingQueue f10873b = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final IBinder a(TimeUnit timeUnit) {
        Preconditions.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f10872a) {
            this.f10872a = true;
            IBinder iBinder = (IBinder) this.f10873b.poll(10000L, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10873b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
