package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.SparseArray;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzof {
    static final zzfxu zzb;
    private final SparseArray zzd;
    private final int zze;
    public static final zzof zza = new zzof(zzfxr.zzn(zzod.zza));
    @SuppressLint({"InlinedApi"})
    private static final zzfxr zzc = zzfxr.zzp(2, 5, 6);

    static {
        zzfxt zzfxtVar = new zzfxt();
        zzfxtVar.zza(5, 6);
        zzfxtVar.zza(17, 6);
        zzfxtVar.zza(7, 6);
        zzfxtVar.zza(30, 10);
        zzfxtVar.zza(18, 6);
        zzfxtVar.zza(6, 8);
        zzfxtVar.zza(8, 8);
        zzfxtVar.zza(14, 8);
        zzb = zzfxtVar.zzc();
    }

    public static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static zzof zzc(Context context, zzh zzhVar, zzon zzonVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzhVar, zzonVar);
    }

    @SuppressLint({"InlinedApi"})
    public static zzof zzd(Context context, Intent intent, zzh zzhVar, zzon zzonVar) {
        boolean z10;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzonVar == null) {
            if (zzet.zza >= 33) {
                zzonVar = zzoc.zzb(audioManager, zzhVar);
            } else {
                zzonVar = null;
            }
        }
        int i10 = zzet.zza;
        if (i10 >= 33 && (zzet.zzN(context) || zzet.zzJ(context))) {
            return zzoc.zza(audioManager, zzhVar);
        }
        if (i10 >= 23 && zzoa.zza(audioManager, zzonVar)) {
            return zza;
        }
        zzfxv zzfxvVar = new zzfxv();
        zzfxvVar.zzf((Object) 2);
        if (i10 >= 29 && (zzet.zzN(context) || zzet.zzJ(context))) {
            zzfxvVar.zzh(zzob.zzb(zzhVar));
            return new zzof(zze(zzgap.zzh(zzfxvVar.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzfxvVar.zzh(zzc);
        }
        if (intent != null && !z10 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                zzfxvVar.zzh(zzgap.zzg(intArrayExtra));
            }
            return new zzof(zze(zzgap.zzh(zzfxvVar.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new zzof(zze(zzgap.zzh(zzfxvVar.zzi()), 10));
    }

    private static zzfxr zze(int[] iArr, int i10) {
        zzfxo zzfxoVar = new zzfxo();
        for (int i11 : iArr) {
            zzfxoVar.zzf(new zzod(i11, i10));
        }
        return zzfxoVar.zzi();
    }

    private static boolean zzf() {
        String str = zzet.zzc;
        if (!"Amazon".equals(str) && !"Xiaomi".equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r1 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzof
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzof r9 = (com.google.android.gms.internal.ads.zzof) r9
            android.util.SparseArray r1 = r8.zzd
            android.util.SparseArray r3 = r9.zzd
            int r4 = com.google.android.gms.internal.ads.zzet.zza
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = com.google.android.gms.internal.ads.n.k(r1, r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = r2
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.zze
            int r9 = r9.zze
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzof.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int i11 = zzet.zza;
        SparseArray sparseArray = this.zzd;
        if (i11 >= 31) {
            i10 = sparseArray.contentHashCode();
        } else {
            int i12 = 17;
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                int keyAt = sparseArray.keyAt(i13);
                i12 = Objects.hashCode(sparseArray.valueAt(i13)) + ((keyAt + (i12 * 31)) * 31);
            }
            i10 = i12;
        }
        return (i10 * 31) + this.zze;
    }

    public final String toString() {
        String obj = this.zzd.toString();
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + obj + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (com.google.android.gms.internal.ads.zzet.zzH(r8.zzd, 30) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
        if (r6 != 5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzaf r9, com.google.android.gms.internal.ads.zzh r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.zzm
            r0.getClass()
            java.lang.String r1 = r9.zzj
            int r0 = com.google.android.gms.internal.ads.zzbn.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfxu r1 = com.google.android.gms.internal.ads.zzof.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L19
            goto Lc3
        L19:
            r1 = 7
            r2 = 6
            r3 = 8
            r4 = 18
            if (r0 != r4) goto L2c
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzet.zzH(r0, r4)
            if (r0 != 0) goto L2b
            r0 = r2
            goto L47
        L2b:
            r0 = r4
        L2c:
            if (r0 != r3) goto L3a
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzet.zzH(r0, r3)
            if (r0 == 0) goto L38
            r0 = r3
            goto L3a
        L38:
            r0 = r1
            goto L47
        L3a:
            r5 = 30
            if (r0 != r5) goto L47
            android.util.SparseArray r6 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzet.zzH(r6, r5)
            if (r5 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r5 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzet.zzH(r5, r0)
            if (r5 == 0) goto Lc3
            android.util.SparseArray r5 = r8.zzd
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzod r5 = (com.google.android.gms.internal.ads.zzod) r5
            r5.getClass()
            int r6 = r9.zzz
            r7 = -1
            if (r6 == r7) goto L7e
            if (r0 != r4) goto L62
            goto L7e
        L62:
            java.lang.String r9 = r9.zzm
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L77
            int r9 = com.google.android.gms.internal.ads.zzet.zza
            r10 = 33
            if (r9 >= r10) goto L77
            r9 = 10
            if (r6 <= r9) goto L89
            goto Lc3
        L77:
            boolean r9 = r5.zzb(r6)
            if (r9 != 0) goto L89
            goto Lc3
        L7e:
            int r9 = r9.zzA
            if (r9 != r7) goto L85
            r9 = 48000(0xbb80, float:6.7262E-41)
        L85:
            int r6 = r5.zza(r9, r10)
        L89:
            int r9 = com.google.android.gms.internal.ads.zzet.zza
            r10 = 28
            if (r9 > r10) goto L9d
            if (r6 != r1) goto L93
            r2 = r3
            goto L9e
        L93:
            r10 = 3
            if (r6 == r10) goto L9e
            r10 = 4
            if (r6 == r10) goto L9e
            r10 = 5
            if (r6 != r10) goto L9d
            goto L9e
        L9d:
            r2 = r6
        L9e:
            r10 = 26
            if (r9 > r10) goto Lb0
            java.lang.String r9 = "fugu"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzet.zzb
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r9 = 1
            if (r2 != r9) goto Lb0
            r2 = 2
        Lb0:
            int r9 = com.google.android.gms.internal.ads.zzet.zzh(r2)
            if (r9 == 0) goto Lc3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Lc3:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzof.zzb(com.google.android.gms.internal.ads.zzaf, com.google.android.gms.internal.ads.zzh):android.util.Pair");
    }

    private zzof(List list) {
        this.zzd = new SparseArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzod zzodVar = (zzod) list.get(i10);
            this.zzd.put(zzodVar.zzb, zzodVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzd.size(); i12++) {
            i11 = Math.max(i11, ((zzod) this.zzd.valueAt(i12)).zzc);
        }
        this.zze = i11;
    }
}
