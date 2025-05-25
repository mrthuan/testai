package com.pgl.ssdk;

import android.content.Context;

/* compiled from: GetSecTokenReq.java */
/* loaded from: classes2.dex */
public class V extends G {

    /* renamed from: n  reason: collision with root package name */
    private Context f15794n;

    public V(Context context, String str) {
        super(context, null);
        this.f15794n = context;
        this.f15760b = F.b() + b();
    }

    @Override // com.pgl.ssdk.G
    public boolean a(int i10, byte[] bArr) {
        Object a10;
        try {
            a10 = S.a(bArr);
        } catch (Throwable unused) {
        }
        if ((a10 instanceof Integer) && ((Integer) a10).intValue() == 0) {
            S.f15789a = 200;
            return true;
        }
        if (a10 instanceof String) {
            S.c = (String) a10;
            S.f15789a = 200;
            return true;
        }
        return false;
    }

    public String b() {
        return "?os=android&app_id=" + S.f15790b + "&did=" + com.pgl.ssdk.ces.c.e() + "&app_ver=" + x.c(this.f15794n) + "&platform=android&ver=6.2.0.0.overseas-rc.2&mode=1";
    }
}
