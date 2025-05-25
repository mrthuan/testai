package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.pdfeditor.Annotation;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbcb {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static void zzc(zzbcb zzbcbVar) {
        while (true) {
            try {
                zzbcl zzbclVar = (zzbcl) zzbcbVar.zza.take();
                zzbck zza = zzbclVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbcbVar.zzg(zzbcbVar.zzb(zzbcbVar.zzb, zzbclVar.zzb()), zza);
                }
            } catch (InterruptedException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbck zzbckVar) {
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbckVar != null) {
            StringBuilder sb2 = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbckVar.zzb())) {
                sb2.append("&it=");
                sb2.append(zzbckVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbckVar.zza())) {
                sb2.append("&blat=");
                sb2.append(zzbckVar.zza());
            }
            uri = sb2.toString();
        }
        if (this.zzh.get()) {
            File file = this.zzi;
            if (file != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                        try {
                            fileOutputStream2.write(uri.getBytes());
                            fileOutputStream2.write(10);
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                                com.google.android.gms.ads.internal.util.client.zzm.g(5);
                            }
                        } catch (IOException unused2) {
                            fileOutputStream = fileOutputStream2;
                            com.google.android.gms.ads.internal.util.client.zzm.g(5);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused3) {
                                    com.google.android.gms.ads.internal.util.client.zzm.g(5);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused4) {
                                    com.google.android.gms.ads.internal.util.client.zzm.g(5);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused5) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.e("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            }
        } else {
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            com.google.android.gms.ads.internal.util.zzt.j(this.zze, this.zzf, uri);
        }
    }

    public final zzbch zza(String str) {
        zzbch zzbchVar = (zzbch) this.zzc.get(str);
        if (zzbchVar != null) {
            return zzbchVar;
        }
        return zzbch.zza;
    }

    public final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zza(str).zza(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbdn.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzfqu.zza(zzfqt.zza(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbca
            @Override // java.lang.Runnable
            public final void run() {
                zzbcb.zzc(zzbcb.this);
            }
        });
        Map map2 = this.zzc;
        zzbch zzbchVar = zzbch.zzb;
        map2.put("action", zzbchVar);
        this.zzc.put("ad_format", zzbchVar);
        this.zzc.put(Annotation.KEY_E, zzbch.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbcl zzbclVar) {
        return this.zza.offer(zzbclVar);
    }
}
