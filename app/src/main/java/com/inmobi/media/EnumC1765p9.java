package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.p9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1765p9 {

    /* renamed from: b  reason: collision with root package name */
    public static final EnumC1765p9 f15379b;
    public static final EnumC1765p9 c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ EnumC1765p9[] f15380d;

    /* renamed from: a  reason: collision with root package name */
    public final int f15381a;

    static {
        EnumC1765p9 enumC1765p9 = new EnumC1765p9(0, 0, "HIGHEST");
        f15379b = enumC1765p9;
        EnumC1765p9 enumC1765p92 = new EnumC1765p9(1, 1, "HIGH");
        EnumC1765p9 enumC1765p93 = new EnumC1765p9(2, 2, "MEDIUM");
        c = enumC1765p93;
        EnumC1765p9[] enumC1765p9Arr = {enumC1765p9, enumC1765p92, enumC1765p93, new EnumC1765p9(3, 3, "LOW"), new EnumC1765p9(4, 4, "LOWEST")};
        f15380d = enumC1765p9Arr;
        kotlin.enums.a.a(enumC1765p9Arr);
    }

    public EnumC1765p9(int i10, int i11, String str) {
        this.f15381a = i11;
    }

    public static EnumC1765p9 valueOf(String str) {
        return (EnumC1765p9) Enum.valueOf(EnumC1765p9.class, str);
    }

    public static EnumC1765p9[] values() {
        return (EnumC1765p9[]) f15380d.clone();
    }
}
