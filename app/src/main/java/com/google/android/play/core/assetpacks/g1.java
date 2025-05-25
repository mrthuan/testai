package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class g1 {

    /* renamed from: f  reason: collision with root package name */
    public static final q9.y f13236f = new q9.y("ExtractorSessionStoreView");

    /* renamed from: a  reason: collision with root package name */
    public final d0 f13237a;

    /* renamed from: b  reason: collision with root package name */
    public final y0 f13238b;
    public final HashMap c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantLock f13239d = new ReentrantLock();

    /* renamed from: e  reason: collision with root package name */
    public final q9.k f13240e;

    public g1(d0 d0Var, q9.k kVar, y0 y0Var) {
        this.f13237a = d0Var;
        this.f13240e = kVar;
        this.f13238b = y0Var;
    }

    public static String d(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new ck("Session without pack received.");
    }

    public final void a(int i10) {
        boolean z10;
        d1 b10 = b(i10);
        c1 c1Var = b10.c;
        int i11 = c1Var.f13201d;
        if (i11 != 5 && i11 != 6 && i11 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            d0 d0Var = this.f13237a;
            int i12 = b10.f13210b;
            long j10 = c1Var.f13200b;
            String str = c1Var.f13199a;
            if (d0Var.d(i12, j10, str).exists()) {
                d0.h(d0Var.d(i12, j10, str));
            }
            int i13 = c1Var.f13201d;
            if ((i13 == 5 || i13 == 6) && d0Var.l(i12, j10, str).exists()) {
                d0.h(d0Var.l(i12, j10, str));
                return;
            }
            return;
        }
        throw new ck(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i10)), i10);
    }

    public final d1 b(int i10) {
        HashMap hashMap = this.c;
        Integer valueOf = Integer.valueOf(i10);
        d1 d1Var = (d1) hashMap.get(valueOf);
        if (d1Var != null) {
            return d1Var;
        }
        throw new ck(String.format("Could not find session %d while trying to get it", valueOf), i10);
    }

    public final Object c(f1 f1Var) {
        ReentrantLock reentrantLock = this.f13239d;
        try {
            reentrantLock.lock();
            return f1Var.a();
        } finally {
            reentrantLock.unlock();
        }
    }
}
