package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* renamed from: com.inmobi.media.w8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1854w8 extends AbstractC1711l8 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1867x8 f15585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1854w8(C1867x8 c1867x8) {
        super(c1867x8);
        this.f15585e = c1867x8;
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final View a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        try {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.g.d(applicationContext, "getApplicationContext(...)");
            return new S9(applicationContext, (byte) 0, null, null, false, null, 0L, null, null, null, 508);
        } catch (Exception e10) {
            HashMap hashMap = C1867x8.c;
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return null;
        }
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view, W6 asset, AdConfig adConfig) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(asset, "asset");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof S9) {
            S9 s92 = (S9) view;
            this.f15585e.getClass();
            try {
                C1893z8 c1893z8 = asset instanceof C1893z8 ? (C1893z8) asset : null;
                s92.a(S9.N0, adConfig);
                A4 a42 = s92.f14665j;
                if (a42 != null) {
                    String TAG = S9.O0;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).a(TAG, "disableUrlsToOpenInExternalApp " + s92);
                }
                s92.f14689v = true;
                Object obj = asset.f14789e;
                String str = obj instanceof String ? (String) obj : null;
                String str2 = c1893z8 != null ? c1893z8.f15707y : null;
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode == -1081286672) {
                        if (!str2.equals("REF_IFRAME")) {
                        }
                        s92.d(str);
                        return;
                    } else if (hashCode == 84303) {
                        if (!str2.equals("URL")) {
                        }
                        s92.d(str);
                        return;
                    } else if (hashCode == 2228139) {
                        if (!str2.equals("HTML")) {
                        }
                        s92.c(str);
                        return;
                    } else if (hashCode == 83774455) {
                        if (!str2.equals("REF_HTML")) {
                        }
                        s92.c(str);
                        return;
                    }
                }
                s92.d(str);
            } catch (Exception e10) {
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
            }
        }
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        if (!(view instanceof S9) || ((S9) view).f14651b0) {
            return;
        }
        super.a(view);
    }
}
