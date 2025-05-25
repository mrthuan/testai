package com.inmobi.media;

import android.os.Build;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class Jc {
    public static long a(String str) {
        String[] strArr = (String[]) new Regex("\\:").split(str, 0).toArray(new String[0]);
        byte[] bArr = new byte[6];
        for (int i10 = 0; i10 < 6; i10++) {
            try {
                String str2 = strArr[i10];
                pdf.pdfreader.viewer.editor.free.utils.t0.w(16);
                bArr[i10] = (byte) Integer.parseInt(str2, 16);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return ((bArr[0] & 255) << 40) | ((bArr[3] & 255) << 16) | (bArr[5] & 255) | ((bArr[4] & 255) << 8) | ((bArr[2] & 255) << 24) | ((bArr[1] & 255) << 32);
    }

    public static final boolean a() {
        if (Ha.q()) {
            String[] strArr = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION"};
            boolean a10 = AbstractC1684j9.a(Ha.d(), "android.permission.ACCESS_FINE_LOCATION");
            boolean z10 = true;
            for (int i10 = 0; i10 < 3; i10++) {
                if (!AbstractC1684j9.a(Ha.d(), strArr[i10])) {
                    z10 = false;
                }
            }
            if (z10) {
                return Build.VERSION.SDK_INT < 29 || a10;
            }
            return false;
        }
        return false;
    }
}
