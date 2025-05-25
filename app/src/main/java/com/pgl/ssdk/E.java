package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: ReportDeviceInfo.java */
/* loaded from: classes2.dex */
public class E extends G {

    /* renamed from: n  reason: collision with root package name */
    private Context f15757n;

    public E(Context context, String str) {
        super(context, null);
        this.f15757n = context;
        this.f15760b = F.a() + b();
    }

    @Override // com.pgl.ssdk.G
    public boolean a(int i10, byte[] bArr) {
        if (i10 == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    ((Integer) com.pgl.ssdk.ces.a.meta(223, null, bArr)).intValue();
                    return true;
                }
                return true;
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }

    public String b() {
        Locale locale;
        LocaleList localeList;
        StringBuilder g10 = a0.d.g(a0.a.h("?os=0&ver=6.2.0.0.overseas-rc.2&mode=1&app_ver=", String.valueOf(x.c(this.f15757n))), "&region=");
        if (Build.VERSION.SDK_INT >= 24) {
            localeList = LocaleList.getDefault();
            locale = localeList.get(0);
        } else {
            locale = Locale.getDefault();
        }
        g10.append(locale.getLanguage());
        StringBuilder g11 = a0.d.g(g10.toString(), "&did=");
        g11.append(com.pgl.ssdk.ces.c.e());
        StringBuilder g12 = a0.d.g(g11.toString(), "&aid=");
        g12.append(com.pgl.ssdk.ces.c.d());
        return g12.toString();
    }
}
