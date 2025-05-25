package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import v7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class NumberedThreadFactory implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f11387a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f11388b = new AtomicInteger();
    public final ThreadFactory c = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(String str) {
        this.f11387a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new a(runnable));
        int andIncrement = this.f11388b.getAndIncrement();
        newThread.setName(this.f11387a + "[" + andIncrement + "]");
        return newThread;
    }
}
