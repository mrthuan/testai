package com.inmobi.media;

import android.content.Context;

/* renamed from: com.inmobi.media.j9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1684j9 {
    public static final boolean a(Context context, String permission) {
        kotlin.jvm.internal.g.e(permission, "permission");
        if (context == null) {
            return false;
        }
        try {
            if (context.checkCallingOrSelfPermission(permission) != 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
