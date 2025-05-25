package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.appset.zzr;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public abstract class K0 {

    /* renamed from: a  reason: collision with root package name */
    public static AppSetIdInfo f14384a;

    static {
        b();
    }

    public static final void a(cg.l tmp0, Object obj) {
        kotlin.jvm.internal.g.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static void b() {
        Context d10 = Ha.d();
        if (d10 == null || !a()) {
            return;
        }
        Task<AppSetIdInfo> appSetIdInfo = new zzr(d10).getAppSetIdInfo();
        kotlin.jvm.internal.g.d(appSetIdInfo, "getAppSetIdInfo(...)");
        appSetIdInfo.e(new a1.e(J0.f14362a, 6));
    }

    public static boolean a() {
        try {
            kotlin.jvm.internal.i.a(AppSetIdInfo.class).b();
            kotlin.jvm.internal.i.a(Task.class).b();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }
}
