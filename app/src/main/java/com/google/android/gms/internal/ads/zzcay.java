package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcay extends FrameLayout implements zzcap {
    final zzcbm zza;
    private final zzcbk zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbcl zze;
    private final long zzf;
    private final zzcaq zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcay(Context context, zzcbk zzcbkVar, int i10, boolean z10, zzbcl zzbclVar, zzcbj zzcbjVar) {
        super(context);
        zzcaq zzcaoVar;
        String str;
        this.zzb = zzcbkVar;
        this.zze = zzbclVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.j(zzcbkVar.zzj());
        zzcar zzcarVar = zzcbkVar.zzj().f10508a;
        zzcbl zzcblVar = new zzcbl(context, zzcbkVar.zzn(), zzcbkVar.zzdi(), zzbclVar, zzcbkVar.zzk());
        if (i10 == 2) {
            zzcaoVar = new zzccc(context, zzcblVar, zzcbkVar, z10, zzcar.zza(zzcbkVar), zzcbjVar);
        } else {
            zzcaoVar = new zzcao(context, zzcbkVar, z10, zzcar.zza(zzcbkVar), zzcbjVar, new zzcbl(context, zzcbkVar.zzn(), zzcbkVar.zzdi(), zzbclVar, zzcbkVar.zzk()));
        }
        this.zzg = zzcaoVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcaoVar, new FrameLayout.LayoutParams(-1, -1, 17));
        zzbbn zzbbnVar = zzbbw.zzz;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzw)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) zzbaVar.c.zza(zzbbw.zzB)).longValue();
        boolean booleanValue = ((Boolean) zzbaVar.c.zza(zzbbw.zzy)).booleanValue();
        this.zzk = booleanValue;
        if (zzbclVar != null) {
            if (true != booleanValue) {
                str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            } else {
                str = "1";
            }
            zzbclVar.zzd("spinner_used", str);
        }
        this.zza = new zzcbm(this);
        zzcaoVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() != null && this.zzi && !this.zzj) {
            this.zzb.zzi().getWindow().clearFlags(128);
            this.zzi = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        if (this.zzq.getParent() != null) {
            return true;
        }
        return false;
    }

    public final void finalize() {
        try {
            this.zza.zza();
            final zzcaq zzcaqVar = this.zzg;
            if (zzcaqVar != null) {
                zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcas
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcaq.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcau
            @Override // java.lang.Runnable
            public final void run() {
                zzcay.this.zzq(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcap
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new zzcax(this, z10));
    }

    public final void zzA(int i10) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzz(i10);
    }

    public final void zzB(int i10) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzA(i10);
    }

    public final void zzC(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzz)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzD(int i10) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzB(i10);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i10, int i11, int i12, int i13) {
        if (com.google.android.gms.ads.internal.util.zze.i()) {
            StringBuilder f10 = a0.d.f("Set video bounds to x:", i10, ";y:", i11, ";w:");
            f10.append(i12);
            f10.append(";h:");
            f10.append(i13);
            com.google.android.gms.ads.internal.util.zze.h(f10.toString());
        }
        if (i12 != 0 && i13 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.setMargins(i10, i11, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzG(float f10) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzb.zze(f10);
        zzcaqVar.zzn();
    }

    public final void zzH(float f10, float f11) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar != null) {
            zzcaqVar.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzb.zzd(false);
        zzcaqVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbI)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zze() {
        boolean z10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbI)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            if ((this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.zzj = z10;
            if (!z10) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzf() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar != null && this.zzm == 0) {
            zzcaq zzcaqVar2 = this.zzg;
            zzK("canplaythrough", "duration", String.valueOf(zzcaqVar.zzc() / 1000.0f), "videoWidth", String.valueOf(zzcaqVar2.zze()), "videoHeight", String.valueOf(zzcaqVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcat
            @Override // java.lang.Runnable
            public final void run() {
                zzcay.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new zzcav(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new zzcaw(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbbn zzbbnVar = zzbbw.zzA;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            int max = Math.max(i10 / ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue(), 1);
            int max2 = Math.max(i11 / ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg != null && this.zzp != null) {
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            zzuVar.f10560j.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            zzuVar.f10560j.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (com.google.android.gms.ads.internal.util.zze.i()) {
                com.google.android.gms.ads.internal.util.zze.h("Spinner frame grab took " + elapsedRealtime2 + "ms");
            }
            if (elapsedRealtime2 > this.zzf) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbcl zzbclVar = this.zze;
                if (zzbclVar != null) {
                    zzbclVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final Integer zzl() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar != null) {
            return zzcaqVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        String string;
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        TextView textView = new TextView(zzcaqVar.getContext());
        Resources zze = com.google.android.gms.ads.internal.zzu.B.f10557g.zze();
        if (zze == null) {
            string = "AdMob - ";
        } else {
            string = zze.getString(R.string.arg_res_0x7f13057f);
        }
        textView.setText(String.valueOf(string).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar != null) {
            zzcaqVar.zzt();
        }
        zzJ();
    }

    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void zzq(boolean z10) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzn)) {
            this.zzg.zzC(this.zzn, this.zzo, num);
        } else {
            zzK("no_src", new String[0]);
        }
    }

    public final void zzs() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzb.zzd(true);
        zzcaqVar.zzn();
    }

    public final void zzt() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar != null) {
            long zza = zzcaqVar.zza();
            if (this.zzl != zza && zza > 0) {
                float f10 = ((float) zza) / 1000.0f;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbG)).booleanValue()) {
                    String valueOf = String.valueOf(f10);
                    String valueOf2 = String.valueOf(this.zzg.zzh());
                    String valueOf3 = String.valueOf(this.zzg.zzf());
                    String valueOf4 = String.valueOf(this.zzg.zzg());
                    String valueOf5 = String.valueOf(this.zzg.zzb());
                    com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                    zzK("timeupdate", "time", valueOf, "totalBytes", valueOf2, "qoeCachedBytes", valueOf3, "qoeLoadedBytes", valueOf4, "droppedFrames", valueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
                } else {
                    zzK("timeupdate", "time", String.valueOf(f10));
                }
                this.zzl = zza;
            }
        }
    }

    public final void zzu() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzo();
    }

    public final void zzv() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzp();
    }

    public final void zzw(int i10) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzq(i10);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i10) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzx(i10);
    }

    public final void zzz(int i10) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzy(i10);
    }
}
