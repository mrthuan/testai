package com.google.android.gms.internal.ads;

import android.text.Spannable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdg {
    public static void zza(Spannable spannable, Object obj, int i10, int i11, int i12) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i10, i11, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i10 && spannable.getSpanEnd(obj2) == i11 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i10, i11, 33);
    }
}
