package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.da  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1601da {

    /* renamed from: a  reason: collision with root package name */
    public static final EnumC1601da f15018a;

    /* renamed from: b  reason: collision with root package name */
    public static final EnumC1601da f15019b;
    public static final /* synthetic */ EnumC1601da[] c;

    static {
        EnumC1601da enumC1601da = new EnumC1601da("GET", 0);
        f15018a = enumC1601da;
        EnumC1601da enumC1601da2 = new EnumC1601da("POST", 1);
        f15019b = enumC1601da2;
        EnumC1601da[] enumC1601daArr = {enumC1601da, enumC1601da2, new EnumC1601da("PUT", 2), new EnumC1601da("DELETE", 3), new EnumC1601da("PATCH", 4)};
        c = enumC1601daArr;
        kotlin.enums.a.a(enumC1601daArr);
    }

    public EnumC1601da(String str, int i10) {
    }

    public static EnumC1601da valueOf(String str) {
        return (EnumC1601da) Enum.valueOf(EnumC1601da.class, str);
    }

    public static EnumC1601da[] values() {
        return (EnumC1601da[]) c.clone();
    }
}
