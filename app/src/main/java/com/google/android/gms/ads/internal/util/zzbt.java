package com.google.android.gms.ads.internal.util;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzfru;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbt {

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f10433a = null;

    /* renamed from: b  reason: collision with root package name */
    public zzfru f10434b = null;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f10435d = new Object();

    public final Looper a() {
        Looper looper;
        synchronized (this.f10435d) {
            if (this.c == 0) {
                if (this.f10433a == null) {
                    zze.h("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f10433a = handlerThread;
                    handlerThread.start();
                    this.f10434b = new zzfru(this.f10433a.getLooper());
                    zze.h("Looper thread started.");
                } else {
                    zze.h("Resuming the looper thread");
                    this.f10435d.notifyAll();
                }
            } else {
                Preconditions.k(this.f10433a, "Invalid state: handlerThread should already been initialized.");
            }
            this.c++;
            looper = this.f10433a.getLooper();
        }
        return looper;
    }
}
