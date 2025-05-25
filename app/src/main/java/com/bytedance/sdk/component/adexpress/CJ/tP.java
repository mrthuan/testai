package com.bytedance.sdk.component.adexpress.CJ;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: DeviceUtil.java */
/* loaded from: classes.dex */
public class tP {
    public static boolean Qhi(Context context) {
        boolean z10;
        if (context == null) {
            return false;
        }
        if (TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (context.getApplicationInfo().flags & 4194304) != 4194304) {
            return false;
        }
        return true;
    }
}
