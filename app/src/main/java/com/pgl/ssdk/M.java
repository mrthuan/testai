package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* compiled from: HandlerPool.java */
/* loaded from: classes2.dex */
public class M {

    /* renamed from: a  reason: collision with root package name */
    private final P<N> f15783a;

    /* renamed from: b  reason: collision with root package name */
    private Q f15784b;

    /* compiled from: HandlerPool.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final M f15785a = new M();
    }

    public static M a() {
        return b.f15785a;
    }

    public Q b() {
        if (this.f15784b == null) {
            synchronized (M.class) {
                if (this.f15784b == null) {
                    this.f15784b = a("ssdk_net_handler");
                }
            }
        }
        return this.f15784b;
    }

    public Q c() {
        if (this.f15784b == null) {
            synchronized (M.class) {
                if (this.f15784b == null) {
                    this.f15784b = a("ssdk_handler");
                }
            }
        }
        return this.f15784b;
    }

    private M() {
        this.f15783a = P.a(2);
    }

    public Q a(String str) {
        N a10 = this.f15783a.a();
        if (a10 != null) {
            a10.f15788a = new WeakReference<>(null);
            a10.a(str);
            return a10;
        }
        if (!H.b().a()) {
            try {
                HandlerThread handlerThread = new HandlerThread(str);
                handlerThread.start();
                return new N(handlerThread, null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
