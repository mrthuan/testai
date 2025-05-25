package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.jb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1686jb {

    /* renamed from: a  reason: collision with root package name */
    public static final EnumC1686jb f15238a;

    /* renamed from: b  reason: collision with root package name */
    public static final EnumC1686jb f15239b;
    public static final /* synthetic */ EnumC1686jb[] c;

    static {
        EnumC1686jb enumC1686jb = new EnumC1686jb("SDK", 0);
        f15238a = enumC1686jb;
        EnumC1686jb enumC1686jb2 = new EnumC1686jb("TEMPLATE", 1);
        f15239b = enumC1686jb2;
        EnumC1686jb[] enumC1686jbArr = {enumC1686jb, enumC1686jb2};
        c = enumC1686jbArr;
        kotlin.enums.a.a(enumC1686jbArr);
    }

    public EnumC1686jb(String str, int i10) {
    }

    public static EnumC1686jb valueOf(String str) {
        return (EnumC1686jb) Enum.valueOf(EnumC1686jb.class, str);
    }

    public static EnumC1686jb[] values() {
        return (EnumC1686jb[]) c.clone();
    }
}
