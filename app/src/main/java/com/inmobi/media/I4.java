package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class I4 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14344a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14345b;

    public I4(String name, boolean z10) {
        kotlin.jvm.internal.g.e(name, "name");
        this.f14344a = z10;
        this.f14345b = "TIM-".concat(name);
    }

    public final boolean a() {
        return this.f14344a;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r4) {
        kotlin.jvm.internal.g.e(r4, "r");
        try {
            Thread thread = new Thread(r4, this.f14345b);
            thread.setDaemon(this.f14344a);
            return thread;
        } catch (InternalError e10) {
            e10.toString();
            return null;
        }
    }

    public /* synthetic */ I4(String str, boolean z10, int i10, kotlin.jvm.internal.d dVar) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I4(String name) {
        this(name, false);
        kotlin.jvm.internal.g.e(name, "name");
    }
}
