package com.inmobi.media;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.h1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1648h1 {

    /* renamed from: b  reason: collision with root package name */
    public static final C1634g1 f15114b;
    public static final SparseArray c;

    /* renamed from: d  reason: collision with root package name */
    public static final EnumC1648h1 f15115d;

    /* renamed from: e  reason: collision with root package name */
    public static final EnumC1648h1 f15116e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ EnumC1648h1[] f15117f;

    /* renamed from: a  reason: collision with root package name */
    public final int f15118a;

    static {
        EnumC1648h1[] values;
        EnumC1648h1 enumC1648h1 = new EnumC1648h1(0, 0, "UNKNOWN");
        f15115d = enumC1648h1;
        EnumC1648h1 enumC1648h12 = new EnumC1648h1(1, 1, "PLAYING");
        f15116e = enumC1648h12;
        EnumC1648h1[] enumC1648h1Arr = {enumC1648h1, enumC1648h12, new EnumC1648h1(2, 2, "PAUSED"), new EnumC1648h1(3, 3, "COMPLETED")};
        f15117f = enumC1648h1Arr;
        kotlin.enums.a.a(enumC1648h1Arr);
        f15114b = new C1634g1();
        c = new SparseArray();
        for (EnumC1648h1 enumC1648h13 : values()) {
            c.put(enumC1648h13.f15118a, enumC1648h13);
        }
    }

    public EnumC1648h1(int i10, int i11, String str) {
        this.f15118a = i11;
    }

    public static EnumC1648h1 valueOf(String str) {
        return (EnumC1648h1) Enum.valueOf(EnumC1648h1.class, str);
    }

    public static EnumC1648h1[] values() {
        return (EnumC1648h1[]) f15117f.clone();
    }
}
