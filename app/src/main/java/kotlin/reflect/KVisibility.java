package kotlin.reflect;

import xf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVisibility.kt */
/* loaded from: classes.dex */
public final class KVisibility {
    public static final KVisibility INTERNAL;
    public static final KVisibility PRIVATE;
    public static final KVisibility PROTECTED;
    public static final KVisibility PUBLIC;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ KVisibility[] f19957a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ a f19958b;

    static {
        KVisibility kVisibility = new KVisibility("PUBLIC", 0);
        PUBLIC = kVisibility;
        KVisibility kVisibility2 = new KVisibility("PROTECTED", 1);
        PROTECTED = kVisibility2;
        KVisibility kVisibility3 = new KVisibility("INTERNAL", 2);
        INTERNAL = kVisibility3;
        KVisibility kVisibility4 = new KVisibility("PRIVATE", 3);
        PRIVATE = kVisibility4;
        KVisibility[] kVisibilityArr = {kVisibility, kVisibility2, kVisibility3, kVisibility4};
        f19957a = kVisibilityArr;
        f19958b = kotlin.enums.a.a(kVisibilityArr);
    }

    public KVisibility(String str, int i10) {
    }

    public static a<KVisibility> getEntries() {
        return f19958b;
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f19957a.clone();
    }
}
