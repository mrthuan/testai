package com.inmobi.media;

import java.util.Map;

/* renamed from: com.inmobi.media.ga  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1643ga {

    /* renamed from: a  reason: collision with root package name */
    public final String f15101a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC1601da f15102b;
    public final Map c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f15103d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15104e;

    /* renamed from: f  reason: collision with root package name */
    public final EnumC1615ea f15105f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15106g;

    /* renamed from: h  reason: collision with root package name */
    public final C1629fa f15107h;

    /* renamed from: i  reason: collision with root package name */
    public final int f15108i;

    /* renamed from: j  reason: collision with root package name */
    public final int f15109j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f15110k;

    /* renamed from: l  reason: collision with root package name */
    public F8 f15111l;

    /* renamed from: m  reason: collision with root package name */
    public int f15112m;

    public C1643ga(C1587ca c1587ca) {
        boolean z10;
        int i10;
        boolean z11;
        this.f15101a = c1587ca.f14993a;
        this.f15102b = c1587ca.f14994b;
        this.c = c1587ca.c;
        this.f15103d = c1587ca.f14995d;
        String str = c1587ca.f14996e;
        this.f15104e = str == null ? "" : str;
        this.f15105f = EnumC1615ea.f15032a;
        Boolean bool = c1587ca.f14997f;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = true;
        }
        this.f15106g = z10;
        this.f15107h = c1587ca.f14998g;
        Integer num = c1587ca.f14999h;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 60000;
        }
        this.f15108i = i10;
        Integer num2 = c1587ca.f15000i;
        this.f15109j = num2 != null ? num2.intValue() : 60000;
        Boolean bool2 = c1587ca.f15001j;
        if (bool2 != null) {
            z11 = bool2.booleanValue();
        } else {
            z11 = false;
        }
        this.f15110k = z11;
    }

    public final String toString() {
        return "URL:" + E8.a(this.f15101a, this.f15103d) + " | TAG:null | METHOD:" + this.f15102b + " | PAYLOAD:" + this.f15104e + " | HEADERS:" + this.c + " | RETRY_POLICY:" + this.f15107h;
    }
}
