package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzz implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ zzz f10871a = new zzz();

    private /* synthetic */ zzz() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
