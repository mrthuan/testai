package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
abstract class zzgav extends zzgbz implements Runnable {
    y9.a zza;
    Class zzb;
    Object zzc;

    public zzgav(y9.a aVar, Class cls, Object obj) {
        aVar.getClass();
        this.zza = aVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            y9.a r0 = r10.zza
            java.lang.Class r1 = r10.zzb
            java.lang.Object r2 = r10.zzc
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = r3
            goto Ld
        Lc:
            r5 = r4
        Ld:
            if (r1 != 0) goto L11
            r6 = r3
            goto L12
        L11:
            r6 = r4
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = r4
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto L90
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L22
            goto L90
        L22:
            r3 = 0
            r10.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgdm     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            if (r4 == 0) goto L31
            r4 = r0
            com.google.android.gms.internal.ads.zzgdm r4 = (com.google.android.gms.internal.ads.zzgdm) r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            java.lang.Throwable r4 = r4.zzl()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L62
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzgcj.zzp(r0)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            goto L63
        L39:
            r4 = move-exception
            goto L62
        L3b:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L61
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = "Future type "
            java.lang.String r8 = " threw "
            java.lang.String r9 = " without a cause"
            java.lang.String r4 = a0.d.d(r7, r6, r8, r4, r9)
            r5.<init>(r4)
        L61:
            r4 = r5
        L62:
            r5 = r3
        L63:
            if (r4 != 0) goto L69
            r10.zzc(r5)
            return
        L69:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L8d
            java.lang.Object r0 = r10.zze(r2, r4)     // Catch: java.lang.Throwable -> L7b
            r10.zzb = r3
            r10.zzc = r3
            r10.zzf(r0)
            return
        L7b:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgdb.zza(r0)     // Catch: java.lang.Throwable -> L87
            r10.zzd(r0)     // Catch: java.lang.Throwable -> L87
            r10.zzb = r3
            r10.zzc = r3
            return
        L87:
            r0 = move-exception
            r10.zzb = r3
            r10.zzc = r3
            throw r0
        L8d:
            r10.zzs(r0)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgav.run():void");
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        String str;
        y9.a aVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (aVar != null) {
            str = a6.h.d("inputFuture=[", aVar.toString(), "], ");
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            String obj2 = cls.toString();
            String obj3 = obj.toString();
            return str + "exceptionType=[" + obj2 + "], fallback=[" + obj3 + "]";
        } else if (zza != null) {
            return str.concat(zza);
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zze(Object obj, Throwable th2);

    public abstract void zzf(Object obj);
}
