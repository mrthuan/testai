package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzcx extends zzdu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzef zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzef zzefVar, String str, String str2, Context context, Bundle bundle) {
        super(zzefVar, true);
        this.zze = zzefVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() {
        boolean zzW;
        String str;
        String str2;
        String str3;
        zzcc zzccVar;
        boolean z10;
        zzcc zzccVar2;
        String str4;
        String unused;
        try {
            zzW = this.zze.zzW(this.zza, this.zzb);
            if (zzW) {
                String str5 = this.zzb;
                String str6 = this.zza;
                str4 = this.zze.zzd;
                str3 = str5;
                str2 = str6;
                str = str4;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.j(this.zzc);
            zzef zzefVar = this.zze;
            zzefVar.zzj = zzefVar.zzf(this.zzc, true);
            zzccVar = this.zze.zzj;
            if (zzccVar == null) {
                unused = this.zze.zzd;
                return;
            }
            int a10 = DynamiteModule.a(this.zzc, ModuleDescriptor.MODULE_ID);
            int d10 = DynamiteModule.d(this.zzc, ModuleDescriptor.MODULE_ID, false);
            int max = Math.max(a10, d10);
            if (d10 < a10) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzcl zzclVar = new zzcl(77000L, max, z10, str, str2, str3, this.zzd, com.google.android.gms.measurement.internal.zzfw.a(this.zzc));
            zzccVar2 = this.zze.zzj;
            Preconditions.j(zzccVar2);
            zzccVar2.initialize(new ObjectWrapper(this.zzc), zzclVar, this.zzh);
        } catch (Exception e10) {
            this.zze.zzT(e10, true, false);
        }
    }
}
