package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.n3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1733n3 {

    /* renamed from: a  reason: collision with root package name */
    public static final EnumC1733n3 f15339a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ EnumC1733n3[] f15340b;

    static {
        EnumC1733n3 enumC1733n3 = new EnumC1733n3("URL", 0);
        f15339a = enumC1733n3;
        EnumC1733n3[] enumC1733n3Arr = {enumC1733n3, new EnumC1733n3("HTML", 1)};
        f15340b = enumC1733n3Arr;
        kotlin.enums.a.a(enumC1733n3Arr);
    }

    public EnumC1733n3(String str, int i10) {
    }

    public static EnumC1733n3 valueOf(String str) {
        return (EnumC1733n3) Enum.valueOf(EnumC1733n3.class, str);
    }

    public static EnumC1733n3[] values() {
        return (EnumC1733n3[]) f15340b.clone();
    }
}
