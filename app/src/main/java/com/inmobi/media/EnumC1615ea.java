package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.ea  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1615ea {

    /* renamed from: a  reason: collision with root package name */
    public static final EnumC1615ea f15032a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ EnumC1615ea[] f15033b;

    static {
        EnumC1615ea enumC1615ea = new EnumC1615ea("HIGH", 0);
        EnumC1615ea enumC1615ea2 = new EnumC1615ea("LOW", 1);
        f15032a = enumC1615ea2;
        EnumC1615ea[] enumC1615eaArr = {enumC1615ea, enumC1615ea2};
        f15033b = enumC1615eaArr;
        kotlin.enums.a.a(enumC1615eaArr);
    }

    public EnumC1615ea(String str, int i10) {
    }

    public static EnumC1615ea valueOf(String str) {
        return (EnumC1615ea) Enum.valueOf(EnumC1615ea.class, str);
    }

    public static EnumC1615ea[] values() {
        return (EnumC1615ea[]) f15033b.clone();
    }
}
