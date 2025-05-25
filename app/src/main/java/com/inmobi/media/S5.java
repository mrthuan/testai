package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkKeys;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class S5 {

    /* renamed from: a  reason: collision with root package name */
    public static final S5 f14635a;

    /* renamed from: b  reason: collision with root package name */
    public static final S5 f14636b;
    public static final S5 c;

    /* renamed from: d  reason: collision with root package name */
    public static final S5 f14637d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ S5[] f14638e;

    static {
        S5 s52 = new S5("INFO", 0);
        f14635a = s52;
        S5 s53 = new S5("DEBUG", 1);
        f14636b = s53;
        S5 s54 = new S5("ERROR", 2);
        c = s54;
        S5 s55 = new S5(InMobiNetworkKeys.STATE, 3);
        f14637d = s55;
        S5[] s5Arr = {s52, s53, s54, s55};
        f14638e = s5Arr;
        kotlin.enums.a.a(s5Arr);
    }

    public S5(String str, int i10) {
    }

    public static S5 valueOf(String str) {
        return (S5) Enum.valueOf(S5.class, str);
    }

    public static S5[] values() {
        return (S5[]) f14638e.clone();
    }
}
