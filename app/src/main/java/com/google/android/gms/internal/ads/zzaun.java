package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaun extends zzaum {
    public zzaun(Context context, String str, boolean z10) {
        super(context, str, z10);
    }

    public static zzaun zzt(String str, Context context, boolean z10) {
        zzaum.zzr(context, false);
        return new zzaun(context, str, false);
    }

    @Deprecated
    public static zzaun zzu(String str, Context context, boolean z10, int i10) {
        zzaum.zzr(context, z10);
        return new zzaun(context, str, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    public final List zzp(zzavp zzavpVar, Context context, zzaro zzaroVar, zzarh zzarhVar) {
        if (zzavpVar.zzk() != null && ((zzaum) this).zzu) {
            int zza = zzavpVar.zza();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(super.zzp(zzavpVar, context, zzaroVar, null));
            arrayList.add(new zzawh(zzavpVar, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", zzaroVar, zza, 24));
            return arrayList;
        }
        return super.zzp(zzavpVar, context, zzaroVar, null);
    }
}
