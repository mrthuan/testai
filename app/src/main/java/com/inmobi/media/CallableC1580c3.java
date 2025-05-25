package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.inmobi.media.c3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC1580c3 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1664i3 f14982a;

    public CallableC1580c3(C1664i3 c1664i3) {
        this.f14982a = c1664i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f14982a) {
            C1664i3 c1664i3 = this.f14982a;
            if (c1664i3.f15176j != null) {
                while (c1664i3.f15175i > c1664i3.f15172f) {
                    c1664i3.d((String) ((Map.Entry) c1664i3.f15177k.entrySet().iterator().next()).getKey());
                }
                if (this.f14982a.a()) {
                    this.f14982a.d();
                    this.f14982a.f15178l = 0;
                }
                return null;
            }
            return null;
        }
    }
}
