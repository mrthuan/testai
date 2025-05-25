package lm;

import ig.h;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.i;
import pdf.pdfreader.viewer.editor.free.datasource.sp.SharePreferencesImpl;

/* compiled from: AISpData.kt */
/* loaded from: classes3.dex */
public final class f extends SharePreferencesImpl {
    public static final f c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ h<Object>[] f21774d;

    /* renamed from: e  reason: collision with root package name */
    public static final pdf.pdfreader.viewer.editor.free.datasource.sp.a f21775e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile Boolean f21776f;

    /* renamed from: g  reason: collision with root package name */
    public static final pdf.pdfreader.viewer.editor.free.datasource.sp.a f21777g;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(f.class, ea.a.p("OnBdbxhkcWk2ZQlvAG50", "8devJAAN"), ea.a.p("LWUdVQJsWGEsRg9sUUM4dVZ0eilJ", "VQJir7Jm"), 0);
        i.f19949a.getClass();
        f21774d = new h[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(f.class, ea.a.p("JnN_ZRxkZGg1dwtpNmgJblJlKXUsZABQDHApcA==", "oVtcczQj"), ea.a.p("WnMFZRZkMWgdd3VpKmg3biNldXUvZCZQKXAQcBgpWg==", "FC01DrgJ"), 0)};
        f fVar = new f();
        c = fVar;
        f21775e = com.google.android.play.core.assetpacks.c.J(fVar, 0, null, 6);
        f21777g = com.google.android.play.core.assetpacks.c.i(fVar, true, null, 6);
    }

    public f() {
        super(ea.a.p("UmkUcwNfBmEGYQ==", "qyLm0JIb"));
    }

    public static int h() {
        return ((Number) f21775e.b(f21774d[0])).intValue();
    }

    public final boolean i() {
        boolean booleanValue;
        Boolean bool = f21776f;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            Boolean bool2 = f21776f;
            if (bool2 != null) {
                booleanValue = bool2.booleanValue();
            } else {
                c.getClass();
                booleanValue = ((Boolean) f21777g.b(f21774d[1])).booleanValue();
                f21776f = Boolean.valueOf(booleanValue);
            }
        }
        return booleanValue;
    }
}
