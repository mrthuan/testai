package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zak implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final zaj f11268a;

    /* renamed from: h  reason: collision with root package name */
    public final com.google.android.gms.internal.base.zau f11274h;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f11269b = new ArrayList();
    public final ArrayList c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f11270d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f11271e = false;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f11272f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    public boolean f11273g = false;

    /* renamed from: i  reason: collision with root package name */
    public final Object f11275i = new Object();

    public zak(Looper looper, k3.e eVar) {
        this.f11268a = eVar;
        this.f11274h = new com.google.android.gms.internal.base.zau(looper, this);
    }

    public final void a(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.j(onConnectionFailedListener);
        synchronized (this.f11275i) {
            if (this.f11270d.contains(onConnectionFailedListener)) {
                String.valueOf(onConnectionFailedListener);
            } else {
                this.f11270d.add(onConnectionFailedListener);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.f11275i) {
                if (this.f11271e && this.f11268a.isConnected() && this.f11269b.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", b.a.c("Don't know how to handle message: ", i10), new Exception());
        return false;
    }
}
