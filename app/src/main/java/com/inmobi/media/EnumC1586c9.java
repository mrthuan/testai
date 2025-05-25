package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.c9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1586c9 {

    /* renamed from: a  reason: collision with root package name */
    public static final EnumC1586c9 f14989a;

    /* renamed from: b  reason: collision with root package name */
    public static final EnumC1586c9 f14990b;
    public static final EnumC1586c9 c;

    /* renamed from: d  reason: collision with root package name */
    public static final EnumC1586c9 f14991d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ EnumC1586c9[] f14992e;

    static {
        EnumC1586c9 enumC1586c9 = new EnumC1586c9("PORTRAIT", 0);
        f14989a = enumC1586c9;
        EnumC1586c9 enumC1586c92 = new EnumC1586c9("LANDSCAPE", 1);
        f14990b = enumC1586c92;
        EnumC1586c9 enumC1586c93 = new EnumC1586c9("REVERSE_PORTRAIT", 2);
        c = enumC1586c93;
        EnumC1586c9 enumC1586c94 = new EnumC1586c9("REVERSE_LANDSCAPE", 3);
        f14991d = enumC1586c94;
        EnumC1586c9[] enumC1586c9Arr = {enumC1586c9, enumC1586c92, enumC1586c93, enumC1586c94};
        f14992e = enumC1586c9Arr;
        kotlin.enums.a.a(enumC1586c9Arr);
    }

    public EnumC1586c9(String str, int i10) {
    }

    public static EnumC1586c9 valueOf(String str) {
        return (EnumC1586c9) Enum.valueOf(EnumC1586c9.class, str);
    }

    public static EnumC1586c9[] values() {
        return (EnumC1586c9[]) f14992e.clone();
    }
}
