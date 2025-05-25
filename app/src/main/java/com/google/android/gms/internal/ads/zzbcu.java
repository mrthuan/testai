package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbcu extends u.b {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziV)).split(","));
    private final zzbcx zzc;
    private final u.b zzd;

    public zzbcu(zzbcx zzbcxVar, u.b bVar) {
        this.zzd = bVar;
        this.zzc = zzbcxVar;
    }

    @Override // u.b
    public final void extraCallback(String str, Bundle bundle) {
        u.b bVar = this.zzd;
        if (bVar != null) {
            bVar.extraCallback(str, bundle);
        }
    }

    @Override // u.b
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        u.b bVar = this.zzd;
        if (bVar != null) {
            return bVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // u.b
    public final void onActivityResized(int i10, int i11, Bundle bundle) {
        u.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onActivityResized(i10, i11, bundle);
        }
    }

    @Override // u.b
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        u.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onMessageChannelReady(bundle);
        }
    }

    @Override // u.b
    public final void onNavigationEvent(int i10, Bundle bundle) {
        List list;
        this.zza.set(false);
        u.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onNavigationEvent(i10, bundle);
        }
        zzbcx zzbcxVar = this.zzc;
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        zzbcxVar.zzi(System.currentTimeMillis());
        if (this.zzc != null && (list = this.zzb) != null && list.contains(String.valueOf(i10))) {
            this.zzc.zzf();
        }
    }

    @Override // u.b
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.i();
        }
        u.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onPostMessage(str, bundle);
        }
    }

    @Override // u.b
    public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
        u.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onRelationshipValidationResult(i10, uri, z10, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
