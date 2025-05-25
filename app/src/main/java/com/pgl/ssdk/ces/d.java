package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import com.pgl.ssdk.E;
import com.pgl.ssdk.F;

/* compiled from: ReportNowRunnable.java */
/* loaded from: classes2.dex */
public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f15810a;

    /* renamed from: b  reason: collision with root package name */
    private String f15811b;

    public d(Context context, String str) {
        this.f15810a = context;
        this.f15811b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            byte[] bArr = (byte[]) a.meta(222, this.f15810a, this.f15811b);
            if (bArr != null && bArr.length > 0) {
                int i10 = F.f15758a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        str = "";
                    } else {
                        str = "https://ssdk-va.pangle.io/ssdk/v2/r";
                    }
                } else {
                    str = "https://ssdk-sg.pangle.io/ssdk/v2/r";
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                new E(this.f15810a, null).a(1, 2, bArr);
            }
        } catch (Throwable unused) {
        }
    }
}
