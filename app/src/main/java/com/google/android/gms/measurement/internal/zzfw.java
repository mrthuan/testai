package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfw {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.arg_res_0x7f1300be);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
