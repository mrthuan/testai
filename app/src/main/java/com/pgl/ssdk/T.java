package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* compiled from: TokenReqRunnable.java */
/* loaded from: classes2.dex */
public class T implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final U f15792a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f15793b;

    public T(Context context, U u7) {
        this.f15792a = u7;
        this.f15793b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        byte[] bArr;
        int i10 = F.f15758a;
        if (i10 != 0) {
            if (i10 != 1) {
                str = "";
            } else {
                str = "https://ssdk-va.pangle.io/ssdk/sd/token";
            }
        } else {
            str = "https://ssdk-sg.pangle.io/ssdk/sd/token";
        }
        try {
            bArr = (byte[]) com.pgl.ssdk.ces.a.meta(301, this.f15793b, null);
        } catch (Throwable unused) {
            S.f15789a = PglCryptUtils.LOAD_SO_FAILED;
        }
        if (bArr != null && bArr.length > 0) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new V(this.f15793b, null).a(1, 2, bArr);
            U u7 = this.f15792a;
            if (u7 != null) {
                u7.a(S.a());
                return;
            }
            return;
        }
        S.f15789a = PglCryptUtils.LOAD_SO_FAILED;
    }
}
