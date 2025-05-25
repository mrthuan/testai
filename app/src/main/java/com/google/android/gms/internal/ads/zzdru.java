package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdru {
    public static final zzfxr zza;
    public static final zzfxr zzb;
    private final String zzc;
    private final zzdrt zzd;
    private final zzdrt zze;

    static {
        zzdrt zzdrtVar = zzdrt.PUBLIC_API_CALL;
        zzdrt zzdrtVar2 = zzdrt.PUBLIC_API_CALLBACK;
        zzdru zzdruVar = new zzdru("tqgt", zzdrtVar, zzdrtVar2);
        zzdrt zzdrtVar3 = zzdrt.DYNAMITE_ENTER;
        zzdru zzdruVar2 = new zzdru("l.dl", zzdrtVar, zzdrtVar3);
        zzdrt zzdrtVar4 = zzdrt.CLIENT_SIGNALS_START;
        zzdru zzdruVar3 = new zzdru("l.rcc", zzdrtVar3, zzdrtVar4);
        zzdrt zzdrtVar5 = zzdrt.CLIENT_SIGNALS_END;
        zzdru zzdruVar4 = new zzdru("l.cs", zzdrtVar4, zzdrtVar5);
        zzdrt zzdrtVar6 = zzdrt.SERVICE_CONNECTED;
        zzdru zzdruVar5 = new zzdru("l.cts", zzdrtVar5, zzdrtVar6);
        zzdrt zzdrtVar7 = zzdrt.GMS_SIGNALS_START;
        zzdrt zzdrtVar8 = zzdrt.GMS_SIGNALS_END;
        zzdru zzdruVar6 = new zzdru("l.gs", zzdrtVar7, zzdrtVar8);
        zzdrt zzdrtVar9 = zzdrt.GET_SIGNALS_SDKCORE_START;
        zzdru zzdruVar7 = new zzdru("l.jse", zzdrtVar8, zzdrtVar9);
        zzdrt zzdrtVar10 = zzdrt.GET_SIGNALS_SDKCORE_END;
        zza = zzfxr.zzs(zzdruVar, zzdruVar2, zzdruVar3, zzdruVar4, zzdruVar5, zzdruVar6, zzdruVar7, new zzdru("l.gs-sdkcore", zzdrtVar9, zzdrtVar10), new zzdru("l.gs-pp", zzdrtVar10, zzdrtVar2));
        zzdru zzdruVar8 = new zzdru("l.al", zzdrtVar, zzdrtVar2);
        zzdru zzdruVar9 = new zzdru("l.dl", zzdrtVar, zzdrtVar3);
        zzdru zzdruVar10 = new zzdru("l.rcc", zzdrtVar3, zzdrtVar4);
        zzdru zzdruVar11 = new zzdru("l.cs", zzdrtVar4, zzdrtVar5);
        zzdru zzdruVar12 = new zzdru("l.cts", zzdrtVar5, zzdrtVar6);
        zzdru zzdruVar13 = new zzdru("l.gs", zzdrtVar7, zzdrtVar8);
        zzdrt zzdrtVar11 = zzdrt.GET_AD_DICTIONARY_SDKCORE_START;
        zzdru zzdruVar14 = new zzdru("l.jse", zzdrtVar8, zzdrtVar11);
        zzdrt zzdrtVar12 = zzdrt.GET_AD_DICTIONARY_SDKCORE_END;
        zzdru zzdruVar15 = new zzdru("l.gad-js", zzdrtVar11, zzdrtVar12);
        zzdrt zzdrtVar13 = zzdrt.HTTP_RESPONSE_READY;
        zzb = zzfxr.zzt(zzdruVar8, zzdruVar9, zzdruVar10, zzdruVar11, zzdruVar12, zzdruVar13, zzdruVar14, zzdruVar15, new zzdru("l.http", zzdrtVar12, zzdrtVar13), new zzdru("l.nml-js", zzdrtVar13, zzdrt.SERVER_RESPONSE_PARSE_START));
    }

    public zzdru(String str, zzdrt zzdrtVar, zzdrt zzdrtVar2) {
        this.zzc = str;
        this.zzd = zzdrtVar;
        this.zze = zzdrtVar2;
    }

    public final zzdrt zza() {
        return this.zzd;
    }

    public final zzdrt zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}
