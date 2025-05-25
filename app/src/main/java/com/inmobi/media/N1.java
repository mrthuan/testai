package com.inmobi.media;

import com.google.android.gms.common.api.Api;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class N1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f14506a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14507b;
    public final Map c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14508d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14509e;

    /* renamed from: f  reason: collision with root package name */
    public int f14510f;

    /* renamed from: g  reason: collision with root package name */
    public long f14511g;

    /* renamed from: h  reason: collision with root package name */
    public final long f14512h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f14513i;

    public N1(int i10, String url, Map map, boolean z10, boolean z11, int i11, long j10, long j11) {
        kotlin.jvm.internal.g.e(url, "url");
        this.f14506a = i10;
        this.f14507b = url;
        this.c = map;
        this.f14508d = z10;
        this.f14509e = z11;
        this.f14510f = i11;
        this.f14511g = j10;
        this.f14512h = j11;
        this.f14513i = new AtomicBoolean(false);
    }

    public /* synthetic */ N1(String str, Map map, boolean z10, boolean z11, int i10, int i11) {
        this(new Random().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, str, (i11 & 4) != 0 ? null : map, z10, z11, i10, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
