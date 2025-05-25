package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzq {
    public static Object a(Context context, String str, zzo zzoVar) {
        try {
            try {
                return zzoVar.zza(DynamiteModule.c(context, DynamiteModule.f11410b, ModuleDescriptor.MODULE_ID).b(str));
            } catch (Exception e10) {
                throw new zzp(e10);
            }
        } catch (Exception e11) {
            throw new zzp(e11);
        }
    }
}
