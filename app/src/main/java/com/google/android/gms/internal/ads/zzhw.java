package com.google.android.gms.internal.ads;

import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhw extends zzbp {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzaf zzf;
    public final int zzg;
    public final zzui zzh;
    final boolean zzi;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(ErrorCodes.MALFORMED_URL_EXCEPTION, 36);
        Integer.toString(ErrorCodes.PROTOCOL_EXCEPTION, 36);
        Integer.toString(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, 36);
        Integer.toString(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, 36);
    }

    private zzhw(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    public static zzhw zzb(Throwable th2, String str, int i10, zzaf zzafVar, int i11, boolean z10, int i12) {
        int i13;
        if (zzafVar == null) {
            i13 = 4;
        } else {
            i13 = i11;
        }
        return new zzhw(1, th2, null, i12, str, i10, zzafVar, i13, z10);
    }

    public static zzhw zzc(IOException iOException, int i10) {
        return new zzhw(0, iOException, i10);
    }

    public static zzhw zzd(RuntimeException runtimeException, int i10) {
        return new zzhw(2, runtimeException, i10);
    }

    public final zzhw zza(zzui zzuiVar) {
        String message = getMessage();
        int i10 = zzet.zza;
        return new zzhw(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzuiVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zzhw(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.zzaf r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L59
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L5f
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            int r2 = com.google.android.gms.internal.ads.zzet.zza
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            java.lang.String r0 = androidx.activity.r.g(r2, r1, r0)
            goto L5f
        L59:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L5f:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L6c
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L6c:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhw.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzaf, int, boolean):void");
    }

    private zzhw(String str, Throwable th2, int i10, int i11, String str2, int i12, zzaf zzafVar, int i13, zzui zzuiVar, long j10, boolean z10) {
        super(str, th2, i10, j10);
        int i14;
        boolean z11;
        if (z10) {
            i14 = i11;
            if (i14 == 1) {
                i14 = 1;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            i14 = i11;
            z11 = true;
        }
        zzdi.zzd(z11);
        zzdi.zzd(th2 != null);
        this.zzc = i14;
        this.zzd = str2;
        this.zze = i12;
        this.zzf = zzafVar;
        this.zzg = i13;
        this.zzh = zzuiVar;
        this.zzi = z10;
    }
}
