package com.google.android.gms.internal.measurement;

import android.net.Uri;
import y.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzhh {
    private final i zza;

    public zzhh(i iVar) {
        this.zza = iVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        i iVar = (i) this.zza.getOrDefault(uri.toString(), null);
        if (iVar == null) {
            return null;
        }
        return (String) iVar.getOrDefault("".concat(str3), null);
    }
}
