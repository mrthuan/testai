package com.inmobi.media;

/* loaded from: classes2.dex */
public abstract class Z5 {

    /* renamed from: a  reason: collision with root package name */
    public static byte f14905a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f14906b;

    public static final void a(byte b10, String tag, String str) {
        kotlin.jvm.internal.g.e(tag, "tag");
        if (f14906b) {
            System.out.println((Object) str);
        }
        if (b10 == 1) {
            byte b11 = f14905a;
            if (2 == b11 || 1 == b11 || 3 == b11) {
                kotlin.jvm.internal.g.b(str);
            }
        } else if (b10 == 2) {
            byte b12 = f14905a;
            if (2 == b12 || 3 == b12) {
                kotlin.jvm.internal.g.b(str);
            }
        } else if (b10 == 3) {
            kotlin.jvm.internal.g.b(str);
            if (str.length() > 4000) {
                b(tag, str);
            }
        }
    }

    public static void b(String str, String str2) {
        if (str2.length() > 4000) {
            kotlin.jvm.internal.g.d(str2.substring(0, 4000), "this as java.lang.String…ing(startIndex, endIndex)");
            String substring = str2.substring(4000);
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String).substring(startIndex)");
            b(str, substring);
        }
    }

    public static final void a(String tag, String str) {
        kotlin.jvm.internal.g.e(tag, "tag");
        a((byte) 3, tag, str);
    }

    public static final void a(String str, String str2, Throwable th2) {
        a((byte) 3, str, str2, th2);
    }

    public static final void a(byte b10, String str, String str2, Throwable th2) {
        if (f14906b) {
            System.out.println((Object) str2);
        }
    }

    public static final void a(byte b10) {
        f14905a = b10;
    }

    public static final void a(boolean z10) {
        f14906b = z10;
    }
}
