package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbxg implements zzbxl {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhbz zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxi zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxg(Context context, VersionInfoParcel versionInfoParcel, zzbxi zzbxiVar, String str, zzbxh zzbxhVar) {
        if (zzbxiVar != null) {
            this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            this.zze = new LinkedHashMap();
            this.zzi = zzbxiVar;
            for (String str2 : zzbxiVar.zze) {
                this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
            }
            this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
            zzhbz zzc2 = zzhdy.zzc();
            zzc2.zzn(9);
            zzc2.zzj(str);
            zzc2.zzh(str);
            zzhca zzc3 = zzhcb.zzc();
            String str3 = this.zzi.zza;
            if (str3 != null) {
                zzc3.zza(str3);
            }
            zzc2.zzg((zzhcb) zzc3.zzbr());
            zzhdp zzc4 = zzhdq.zzc();
            zzc4.zzc(Wrappers.a(this.zzh).d());
            String str4 = versionInfoParcel.f10345a;
            if (str4 != null) {
                zzc4.zza(str4);
            }
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f10884b;
            Context context2 = this.zzh;
            googleApiAvailabilityLight.getClass();
            long a10 = GoogleApiAvailabilityLight.a(context2);
            if (a10 > 0) {
                zzc4.zzb(a10);
            }
            zzc2.zzf((zzhdq) zzc4.zzbr());
            this.zzd = zzc2;
            return;
        }
        throw new NullPointerException("SafeBrowsing config is not present.");
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final zzbxi zza() {
        return this.zzi;
    }

    public final y9.a zzb(Map map) {
        zzhdn zzhdnVar;
        y9.a zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzhdnVar = (zzhdn) this.zze.get(str);
                            }
                            if (zzhdnVar == null) {
                                zzbxk.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                boolean z10 = false;
                                for (int i10 = 0; i10 < length; i10++) {
                                    zzhdnVar.zza(optJSONArray.getJSONObject(i10).getString("threat_type"));
                                }
                                boolean z11 = this.zza;
                                if (length > 0) {
                                    z10 = true;
                                }
                                this.zza = z10 | z11;
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
                if (((Boolean) zzbea.zza.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(3);
                }
                return zzgcj.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z12 = this.zza;
        if ((z12 && this.zzi.zzg) || ((this.zzm && this.zzi.zzf) || (!z12 && this.zzi.zzd))) {
            synchronized (this.zzj) {
                for (zzhdn zzhdnVar2 : this.zze.values()) {
                    this.zzd.zzc((zzhdo) zzhdnVar2.zzbr());
                }
                this.zzd.zza(this.zzf);
                this.zzd.zzb(this.zzg);
                if (zzbxk.zzb()) {
                    StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                    for (zzhdo zzhdoVar : this.zzd.zzm()) {
                        sb2.append("    [");
                        sb2.append(zzhdoVar.zzc());
                        sb2.append("] ");
                        sb2.append(zzhdoVar.zzf());
                    }
                    zzbxk.zza(sb2.toString());
                }
                byte[] zzaV = ((zzhdy) this.zzd.zzbr()).zzaV();
                String str2 = this.zzi.zzb;
                new com.google.android.gms.ads.internal.util.zzbo(this.zzh);
                m7.f a10 = com.google.android.gms.ads.internal.util.zzbo.a(1, str2, null, zzaV);
                if (zzbxk.zzb()) {
                    a10.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxd
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbxk.zza("Pinged SB successfully.");
                        }
                    }, zzbzo.zza);
                }
                zzm = zzgcj.zzm(a10, new zzful() { // from class: com.google.android.gms.internal.ads.zzbxe
                    @Override // com.google.android.gms.internal.ads.zzful
                    public final Object apply(Object obj) {
                        String str3 = (String) obj;
                        int i11 = zzbxg.zzb;
                        return null;
                    }
                }, zzbzo.zzf);
            }
            return zzm;
        }
        return zzgcj.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzd(String str, Map map, int i10) {
        String str2;
        String str3;
        synchronized (this.zzj) {
            if (i10 == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i10 == 3) {
                    ((zzhdn) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzhdn zzd = zzhdo.zzd();
            int zza = zzhdm.zza(i10);
            if (zza != 0) {
                zzd.zze(zza);
            }
            zzd.zzb(this.zze.size());
            zzd.zzd(str);
            zzhcm zzc2 = zzhcp.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        str2 = (String) entry.getKey();
                    } else {
                        str2 = "";
                    }
                    if (entry.getValue() != null) {
                        str3 = (String) entry.getValue();
                    } else {
                        str3 = "";
                    }
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhck zzc3 = zzhcl.zzc();
                        zzc3.zza(zzgwm.zzw(str2));
                        zzc3.zzb(zzgwm.zzw(str3));
                        zzc2.zza((zzhcl) zzc3.zzbr());
                    }
                }
            }
            zzd.zzc((zzhcp) zzc2.zzbr());
            this.zze.put(str, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            y9.a zzh = zzgcj.zzh(Collections.emptyMap());
            zzgbq zzgbqVar = new zzgbq() { // from class: com.google.android.gms.internal.ads.zzbxb
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    return zzbxg.this.zzb((Map) obj);
                }
            };
            zzgcu zzgcuVar = zzbzo.zzf;
            y9.a zzn = zzgcj.zzn(zzh, zzgbqVar, zzgcuVar);
            y9.a zzo = zzgcj.zzo(zzn, 10L, TimeUnit.SECONDS, zzbzo.zzd);
            zzgcj.zzr(zzn, new zzbxf(this, zzo), zzgcuVar);
            zzc.add(zzo);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgwl zzt = zzgwm.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzhbz zzhbzVar = this.zzd;
            zzhdh zzc2 = zzhdj.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb(ContentTypes.IMAGE_PNG);
            zzc2.zzc(2);
            zzhbzVar.zzi((zzhdj) zzc2.zzbr());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbxl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbxi r0 = r8.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L8d
        L8:
            boolean r0 = r8.zzl
            if (r0 != 0) goto L8d
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.ads.internal.util.zzt r0 = r0.c
            r0 = 1
            r1 = 0
            if (r9 != 0) goto L15
            goto L67
        L15:
            r2 = 6
            boolean r3 = r9.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r9.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r4 = r9.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r4 == 0) goto L28
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4)     // Catch: java.lang.RuntimeException -> L2d
            goto L29
        L28:
            r4 = r1
        L29:
            r9.setDrawingCacheEnabled(r3)     // Catch: java.lang.RuntimeException -> L2e
            goto L31
        L2d:
            r4 = r1
        L2e:
            com.google.android.gms.ads.internal.util.client.zzm.g(r2)
        L31:
            if (r4 != 0) goto L66
            int r3 = r9.getWidth()     // Catch: java.lang.RuntimeException -> L62
            int r4 = r9.getHeight()     // Catch: java.lang.RuntimeException -> L62
            if (r3 == 0) goto L5c
            if (r4 != 0) goto L40
            goto L5c
        L40:
            int r5 = r9.getWidth()     // Catch: java.lang.RuntimeException -> L62
            int r6 = r9.getHeight()     // Catch: java.lang.RuntimeException -> L62
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L62
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7)     // Catch: java.lang.RuntimeException -> L62
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L62
            r6.<init>(r5)     // Catch: java.lang.RuntimeException -> L62
            r7 = 0
            r9.layout(r7, r7, r3, r4)     // Catch: java.lang.RuntimeException -> L62
            r9.draw(r6)     // Catch: java.lang.RuntimeException -> L62
            r1 = r5
            goto L67
        L5c:
            java.lang.String r9 = "Width or height of view is zero"
            com.google.android.gms.ads.internal.util.client.zzm.e(r9)     // Catch: java.lang.RuntimeException -> L62
            goto L67
        L62:
            com.google.android.gms.ads.internal.util.client.zzm.g(r2)
            goto L67
        L66:
            r1 = r4
        L67:
            if (r1 != 0) goto L6f
            java.lang.String r9 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbxk.zza(r9)
            return
        L6f:
            r8.zzl = r0
            com.google.android.gms.internal.ads.zzbxc r9 = new com.google.android.gms.internal.ads.zzbxc
            r9.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L88
            r9.run()
            return
        L88:
            com.google.android.gms.internal.ads.zzgcu r0 = com.google.android.gms.internal.ads.zzbzo.zza
            r0.execute(r9)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxg.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final boolean zzi() {
        if (this.zzi.zzc && !this.zzl) {
            return true;
        }
        return false;
    }
}
