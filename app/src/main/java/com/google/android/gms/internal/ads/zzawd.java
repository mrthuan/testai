package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzawd extends zzaxd {
    private static final zzaxe zzh = new zzaxe();
    private final Context zzi;

    public zzawd(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i10, int i11, Context context, zzarh zzarhVar) {
        super(zzavpVar, "iz9pI8M74OdFMOjBXhk6CVKK/c29GtinDT3TfbuphLdYOSnoV+Rg8WuW9whaa7rD", "AMztxBQmasdCMrU1nlH2RhtlfSPsjcYFxTHFmKvCDYM=", zzaroVar, i10, 27);
        this.zzi = context;
    }

    private final String zzc() {
        try {
            if (this.zza.zzl() != null) {
                this.zza.zzl().get();
            }
            zzasj zzc = this.zza.zzc();
            if (zzc != null && zzc.zzaj()) {
                return zzc.zzh();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final void zza() {
        Boolean bool;
        int i10;
        boolean z10;
        String str;
        zzata zzataVar;
        AtomicReference zza = zzh.zza(this.zzi.getPackageName());
        synchronized (zza) {
            zzata zzataVar2 = (zzata) zza.get();
            if (zzataVar2 == null || zzavs.zzd(zzataVar2.zza) || zzataVar2.zza.equals("E") || zzataVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzavs.zzd(null)) {
                    i10 = 5;
                } else {
                    if (!zzavs.zzd(null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    bool.booleanValue();
                    i10 = 3;
                }
                if (i10 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                zzbbn zzbbnVar = zzbbw.zzch;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                Boolean bool2 = (Boolean) zzbaVar.c.zza(zzbbnVar);
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzcg)).booleanValue()) {
                    str = zzb();
                } else {
                    str = null;
                }
                if (bool2.booleanValue() && this.zza.zzp() && zzavs.zzd(str)) {
                    str = zzc();
                }
                zzata zzataVar3 = new zzata((String) this.zze.invoke(null, this.zzi, valueOf, str));
                if (zzavs.zzd(zzataVar3.zza) || zzataVar3.zza.equals("E")) {
                    int i11 = i10 - 1;
                    if (i11 != 3) {
                        if (i11 == 4) {
                            throw null;
                        }
                    } else {
                        String zzc = zzc();
                        if (!zzavs.zzd(zzc)) {
                            zzataVar3.zza = zzc;
                        }
                    }
                }
                zza.set(zzataVar3);
            }
            zzataVar = (zzata) zza.get();
        }
        synchronized (this.zzd) {
            if (zzataVar != null) {
                this.zzd.zzx(zzataVar.zza);
                this.zzd.zzX(zzataVar.zzb);
                this.zzd.zzZ(zzataVar.zzc);
                this.zzd.zzi(zzataVar.zzd);
                this.zzd.zzw(zzataVar.zze);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.zzaxf] */
    public final String zzb() {
        ArrayList arrayList;
        Context context;
        String packageName;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            zzbbn zzbbnVar = zzbbw.zzci;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            byte[] zzf = zzavs.zzf((String) zzbaVar.c.zza(zzbbnVar));
            arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzavs.zzf((String) zzbaVar.c.zza(zzbbw.zzcj)))));
            }
            context = this.zzi;
            packageName = context.getPackageName();
            this.zza.zzk();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
        }
        if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
            final zzgdc zze = zzgdc.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxf
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzgdc zzgdcVar = zzgdc.this;
                    if (list == null) {
                        zzgdcVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum b10 = com.google.android.gms.common.internal.i.b(list.get(i10));
                            type = b10.getType();
                            if (type == 8) {
                                value = b10.getValue();
                                zzgdcVar.zzc(zzavs.zzb(value));
                                return;
                            }
                        }
                        zzgdcVar.zzc(null);
                    } catch (Throwable unused2) {
                        zzgdcVar.zzc(null);
                    }
                }
            });
            return (String) zze.get();
        }
        return null;
    }
}
