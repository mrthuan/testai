package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbue;
import com.google.android.gms.internal.ads.zzbxl;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzb {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10510a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10511b;
    public final zzbxl c;

    /* renamed from: d  reason: collision with root package name */
    public final zzbue f10512d = new zzbue(false, Collections.emptyList());

    public zzb(Context context, zzbxl zzbxlVar) {
        this.f10510a = context;
        this.c = zzbxlVar;
    }

    public final void a(String str) {
        boolean z10;
        List<String> list;
        zzbue zzbueVar = this.f10512d;
        zzbxl zzbxlVar = this.c;
        if ((zzbxlVar != null && zzbxlVar.zza().zzf) || zzbueVar.zza) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (str == null) {
                str = "";
            }
            if (zzbxlVar != null) {
                zzbxlVar.zzd(str, null, 3);
            } else if (zzbueVar.zza && (list = zzbueVar.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        com.google.android.gms.ads.internal.util.zzt zztVar = zzu.B.c;
                        com.google.android.gms.ads.internal.util.zzt.j(this.f10510a, "", replace);
                    }
                }
            }
        }
    }

    public final boolean b() {
        boolean z10;
        zzbxl zzbxlVar = this.c;
        if ((zzbxlVar != null && zzbxlVar.zza().zzf) || this.f10512d.zza) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f10511b) {
            return false;
        }
        return true;
    }
}
