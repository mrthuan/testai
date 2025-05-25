package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import v7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class NamedThreadFactory implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f11385a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f11386b = Executors.defaultThreadFactory();

    @KeepForSdk
    public NamedThreadFactory(String str) {
        this.f11385a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f11386b.newThread(new a(runnable));
        newThread.setName(this.f11385a);
        return newThread;
    }
}
