package com.inmobi.media;

import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    private final String f14299a;

    /* renamed from: b  reason: collision with root package name */
    private long f14300b;
    private Map<String, String> c;

    /* renamed from: d  reason: collision with root package name */
    private String f14301d;

    /* renamed from: e  reason: collision with root package name */
    private String f14302e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14303f;

    /* renamed from: g  reason: collision with root package name */
    private String f14304g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14305h;

    /* renamed from: i  reason: collision with root package name */
    private String f14306i;

    /* renamed from: j  reason: collision with root package name */
    private String f14307j;

    public H(String mAdType) {
        kotlin.jvm.internal.g.e(mAdType, "mAdType");
        this.f14299a = mAdType;
        this.f14300b = Long.MIN_VALUE;
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.g.d(uuid, "toString(...)");
        this.f14303f = uuid;
        this.f14304g = "";
        this.f14306i = "activity";
    }

    private static /* synthetic */ void b() {
    }

    private static /* synthetic */ void c() {
    }

    public final H a(long j10) {
        this.f14300b = j10;
        return this;
    }

    public final H d(String m10Context) {
        kotlin.jvm.internal.g.e(m10Context, "m10Context");
        this.f14306i = m10Context;
        return this;
    }

    public final H e(String str) {
        this.f14302e = str;
        return this;
    }

    public final H a(J placement) {
        kotlin.jvm.internal.g.e(placement, "placement");
        this.f14300b = placement.g();
        this.f14306i = placement.j();
        this.c = placement.f();
        this.f14304g = placement.a();
        return this;
    }

    public final H b(String str) {
        this.f14307j = str;
        return this;
    }

    public final H c(String str) {
        this.f14301d = str;
        return this;
    }

    public final H a(String adSize) {
        kotlin.jvm.internal.g.e(adSize, "adSize");
        this.f14304g = adSize;
        return this;
    }

    public final H a(Map<String, String> map) {
        this.c = map;
        return this;
    }

    public final H a(boolean z10) {
        this.f14305h = z10;
        return this;
    }

    public final J a() {
        long j10 = this.f14300b;
        if (j10 != Long.MIN_VALUE) {
            Map<String, String> map = this.c;
            J j11 = new J(j10, (map == null || (r0 = map.get("tp")) == null) ? "" : "", this.f14299a, this.f14302e, null);
            j11.f14354d = this.f14301d;
            j11.a(this.c);
            j11.a(this.f14304g);
            j11.b(this.f14306i);
            j11.f14357g = this.f14303f;
            j11.f14360j = this.f14305h;
            j11.f14361k = this.f14307j;
            return j11;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty".toString());
    }
}
