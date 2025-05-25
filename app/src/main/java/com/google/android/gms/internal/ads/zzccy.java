package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzccy extends zzccv {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzccy(zzcbk zzcbkVar) {
        super(zzcbkVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfqu.zza(zzfqt.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(zzfqu.zza(zzfqt.zza(), this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0334, code lost:
        r25 = r4;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0338, code lost:
        r25.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0340, code lost:
        if (com.google.android.gms.ads.internal.util.client.zzm.g(3) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0342, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.b("Preloaded " + com.google.android.gms.internal.ads.zzccy.zzf.format(r1) + " bytes from " + r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0365, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x036e, code lost:
        if (r0.isFile() == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0370, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0378, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03da  */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzccv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(final java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccy.zzt(java.lang.String):boolean");
    }
}
