package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.inmobi.media.C1713la;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbrk extends zzbrq {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcej zzj;
    private final Activity zzk;
    private zzcgd zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbrr zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        String[] strArr = {"top-left", C1713la.DEFAULT_POSITION, "top-center", "center", "bottom-left", "bottom-right", "bottom-center"};
        y.d dVar = new y.d(7);
        Collections.addAll(dVar, strArr);
        Collections.unmodifiableSet(dVar);
    }

    public zzbrk(zzcej zzcejVar, zzbrr zzbrrVar) {
        super(zzcejVar, "resize");
        this.zza = C1713la.DEFAULT_POSITION;
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcejVar;
        this.zzk = zzcejVar.zzi();
        this.zzo = zzbrrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm */
    public final void zzc(boolean z10) {
        this.zzp.dismiss();
        this.zzq.removeView((View) this.zzj);
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            this.zzr.addView((View) this.zzj);
            this.zzj.zzaj(this.zzl);
        }
        if (z10) {
            zzl("default");
            zzbrr zzbrrVar = this.zzo;
            if (zzbrrVar != null) {
                zzbrrVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zza(final boolean z10) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjU)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                        zzbzo.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbri
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzbrk.this.zzc(z10);
                            }
                        });
                    } else {
                        zzc(z10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026c A[Catch: all -> 0x0488, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002f, B:17:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0043, B:24:0x0045, B:26:0x0053, B:27:0x0065, B:29:0x0073, B:30:0x0085, B:32:0x0093, B:33:0x00a5, B:35:0x00b3, B:36:0x00c5, B:38:0x00d3, B:39:0x00e1, B:41:0x00ef, B:42:0x00f1, B:44:0x00f5, B:46:0x00f9, B:48:0x0101, B:51:0x0109, B:55:0x012f, B:61:0x013b, B:132:0x026c, B:133:0x0271, B:135:0x0273, B:137:0x0293, B:139:0x0297, B:141:0x02a4, B:143:0x02e0, B:176:0x039a, B:183:0x03cd, B:184:0x03e5, B:185:0x0404, B:187:0x040c, B:188:0x0413, B:189:0x0439, B:192:0x043c, B:194:0x045c, B:195:0x0471, B:177:0x03a1, B:178:0x03a8, B:179:0x03af, B:180:0x03b8, B:181:0x03be, B:182:0x03c5, B:142:0x02dd, B:197:0x0473, B:198:0x0478, B:62:0x0142, B:64:0x0146, B:92:0x0199, B:105:0x01f8, B:107:0x01fd, B:109:0x0201, B:111:0x0206, B:114:0x020d, B:94:0x01a6, B:98:0x01c6, B:96:0x01b3, B:97:0x01bf, B:100:0x01cf, B:102:0x01dc, B:103:0x01e5, B:104:0x01f1, B:115:0x021f, B:121:0x0248, B:127:0x0259, B:124:0x024f, B:126:0x0257, B:118:0x0240, B:120:0x0246, B:128:0x025e, B:129:0x0264, B:200:0x047a, B:201:0x047f, B:203:0x0481, B:204:0x0486), top: B:209:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0273 A[Catch: all -> 0x0488, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002f, B:17:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0043, B:24:0x0045, B:26:0x0053, B:27:0x0065, B:29:0x0073, B:30:0x0085, B:32:0x0093, B:33:0x00a5, B:35:0x00b3, B:36:0x00c5, B:38:0x00d3, B:39:0x00e1, B:41:0x00ef, B:42:0x00f1, B:44:0x00f5, B:46:0x00f9, B:48:0x0101, B:51:0x0109, B:55:0x012f, B:61:0x013b, B:132:0x026c, B:133:0x0271, B:135:0x0273, B:137:0x0293, B:139:0x0297, B:141:0x02a4, B:143:0x02e0, B:176:0x039a, B:183:0x03cd, B:184:0x03e5, B:185:0x0404, B:187:0x040c, B:188:0x0413, B:189:0x0439, B:192:0x043c, B:194:0x045c, B:195:0x0471, B:177:0x03a1, B:178:0x03a8, B:179:0x03af, B:180:0x03b8, B:181:0x03be, B:182:0x03c5, B:142:0x02dd, B:197:0x0473, B:198:0x0478, B:62:0x0142, B:64:0x0146, B:92:0x0199, B:105:0x01f8, B:107:0x01fd, B:109:0x0201, B:111:0x0206, B:114:0x020d, B:94:0x01a6, B:98:0x01c6, B:96:0x01b3, B:97:0x01bf, B:100:0x01cf, B:102:0x01dc, B:103:0x01e5, B:104:0x01f1, B:115:0x021f, B:121:0x0248, B:127:0x0259, B:124:0x024f, B:126:0x0257, B:118:0x0240, B:120:0x0246, B:128:0x025e, B:129:0x0264, B:200:0x047a, B:201:0x047f, B:203:0x0481, B:204:0x0486), top: B:209:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbrk.zzb(java.util.Map):void");
    }

    public final void zzd(int i10, int i11, boolean z10) {
        synchronized (this.zzi) {
            this.zzc = i10;
            this.zzd = i11;
        }
    }

    public final void zze(int i10, int i11) {
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean zzf() {
        boolean z10;
        synchronized (this.zzi) {
            if (this.zzp != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }
}
