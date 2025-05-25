package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class oc {

    /* renamed from: a  reason: collision with root package name */
    public static final oc f15365a;

    /* renamed from: b  reason: collision with root package name */
    public static final oc f15366b;
    public static final oc c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ oc[] f15367d;

    static {
        oc ocVar = new oc("UNKNOWN", 0);
        f15365a = ocVar;
        oc ocVar2 = new oc("HIDDEN", 1);
        f15366b = ocVar2;
        oc ocVar3 = new oc("VISIBLE", 2);
        c = ocVar3;
        oc[] ocVarArr = {ocVar, ocVar2, ocVar3};
        f15367d = ocVarArr;
        kotlin.enums.a.a(ocVarArr);
    }

    public oc(String str, int i10) {
    }

    public static oc valueOf(String str) {
        return (oc) Enum.valueOf(oc.class, str);
    }

    public static oc[] values() {
        return (oc[]) f15367d.clone();
    }
}
