package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzsk extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzsf zzc;
    public final String zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzsk(com.google.android.gms.internal.ads.zzaf r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = r11.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder init failed: ["
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r3 = r0.toString()
            java.lang.String r5 = r11.zzm
            r6 = 0
            r7 = 0
            int r11 = java.lang.Math.abs(r14)
            java.lang.String r13 = "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_"
            java.lang.String r8 = b.a.c(r13, r11)
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsk.<init>(com.google.android.gms.internal.ads.zzaf, java.lang.Throwable, boolean, int):void");
    }

    public static /* bridge */ /* synthetic */ zzsk zza(zzsk zzskVar, zzsk zzskVar2) {
        return new zzsk(zzskVar.getMessage(), zzskVar.getCause(), zzskVar.zza, false, zzskVar.zzc, zzskVar.zzd, zzskVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzsk(com.google.android.gms.internal.ads.zzaf r12, java.lang.Throwable r13, boolean r14, com.google.android.gms.internal.ads.zzsf r15) {
        /*
            r11 = this;
            java.lang.String r14 = r15.zza
            java.lang.String r0 = r12.toString()
            java.lang.String r1 = "Decoder init failed: "
            java.lang.String r2 = ", "
            java.lang.String r4 = androidx.appcompat.view.menu.d.d(r1, r14, r2, r0)
            java.lang.String r6 = r12.zzm
            int r12 = com.google.android.gms.internal.ads.zzet.zza
            boolean r12 = r13 instanceof android.media.MediaCodec.CodecException
            if (r12 == 0) goto L1e
            r12 = r13
            android.media.MediaCodec$CodecException r12 = (android.media.MediaCodec.CodecException) r12
            java.lang.String r12 = r12.getDiagnosticInfo()
            goto L1f
        L1e:
            r12 = 0
        L1f:
            r9 = r12
            r7 = 0
            r10 = 0
            r3 = r11
            r5 = r13
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsk.<init>(com.google.android.gms.internal.ads.zzaf, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.zzsf):void");
    }

    private zzsk(String str, Throwable th2, String str2, boolean z10, zzsf zzsfVar, String str3, zzsk zzskVar) {
        super(str, th2);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzsfVar;
        this.zzd = str3;
    }
}
