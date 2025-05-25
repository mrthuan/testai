package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbdq {
    public static final zzbdc zza = zzbdc.zzd("gads:init:init_on_bg_thread", true);
    public static final zzbdc zzb = zzbdc.zzd("gads:init:init_on_single_bg_thread", false);
    public static final zzbdc zzc = zzbdc.zzd("gads:adloader_load_bg_thread", true);
    public static final zzbdc zzd = zzbdc.zzd("gads:appopen_load_on_bg_thread", true);
    public static final zzbdc zze = zzbdc.zzd("gads:banner_destroy_bg_thread", false);
    public static final zzbdc zzf = zzbdc.zzd("gads:banner_load_bg_thread", true);
    public static final zzbdc zzg = zzbdc.zzd("gads:banner_pause_bg_thread", false);
    public static final zzbdc zzh = zzbdc.zzd("gads:banner_resume_bg_thread", false);
    public static final zzbdc zzi = zzbdc.zzd("gads:interstitial_load_on_bg_thread", true);
    public static final zzbdc zzj;
    public static final zzbdc zzk;

    static {
        zzbdc.zzd("gads:persist_flags_on_bg_thread", true);
        zzj = zzbdc.zzd("gads:query_info_bg_thread", true);
        zzk = zzbdc.zzd("gads:rewarded_load_bg_thread", true);
    }
}
