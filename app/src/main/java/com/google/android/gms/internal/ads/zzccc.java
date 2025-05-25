package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzccc extends zzcaq implements TextureView.SurfaceTextureListener, zzcba {
    private final zzcbk zzc;
    private final zzcbl zzd;
    private final zzcbj zze;
    private zzcap zzf;
    private Surface zzg;
    private zzcbb zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcbi zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzccc(Context context, zzcbl zzcblVar, zzcbk zzcbkVar, boolean z10, boolean z11, zzcbj zzcbjVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzcbkVar;
        this.zzd = zzcblVar;
        this.zzn = z10;
        this.zze = zzcbjVar;
        setSurfaceTextureListener(this);
        zzcblVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + PackagingURIHelper.FORWARD_SLASH_STRING + canonicalName + ":" + message;
    }

    private final void zzU() {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            zzcbbVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (!this.zzo) {
            this.zzo = true;
            com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccb
                @Override // java.lang.Runnable
                public final void run() {
                    zzccc.this.zzI();
                }
            });
            zzn();
            this.zzd.zzb();
            if (this.zzp) {
                zzp();
            }
        }
    }

    private final void zzW(boolean z10, Integer num) {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null && !z10) {
            zzcbbVar.zzP(num);
        } else if (this.zzi != null && this.zzg != null) {
            if (z10) {
                if (zzad()) {
                    zzcbbVar.zzU();
                    zzY();
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.e("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzi.startsWith("cache:")) {
                zzccv zzp = this.zzc.zzp(this.zzi);
                if (zzp instanceof zzcde) {
                    zzcbb zza = ((zzcde) zzp).zza();
                    this.zzh = zza;
                    zza.zzP(num);
                    if (!this.zzh.zzV()) {
                        com.google.android.gms.ads.internal.util.client.zzm.e("Precached video player has been released.");
                        return;
                    }
                } else if (zzp instanceof zzcdb) {
                    zzcdb zzcdbVar = (zzcdb) zzp;
                    String zzF = zzF();
                    ByteBuffer zzk = zzcdbVar.zzk();
                    boolean zzl = zzcdbVar.zzl();
                    String zzi = zzcdbVar.zzi();
                    if (zzi == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.e("Stream cache URL is null.");
                        return;
                    }
                    zzcbb zzE = zzE(num);
                    this.zzh = zzE;
                    zzE.zzG(new Uri[]{Uri.parse(zzi)}, zzF, zzk, zzl);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.e("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
            } else {
                this.zzh = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i10 = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    uriArr[i10] = Uri.parse(strArr[i10]);
                    i10++;
                }
                this.zzh.zzF(uriArr, zzF2);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                int zzt = this.zzh.zzt();
                this.zzl = zzt;
                if (zzt == 3) {
                    zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            zzcbbVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcbb zzcbbVar = this.zzh;
            if (zzcbbVar != null) {
                zzcbbVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z10) {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            try {
                zzcbbVar.zzS(surface, z10);
                return;
            } catch (IOException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("Trying to set surface before player is initialized.");
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i10, int i11) {
        float f10;
        if (i11 > 0) {
            f10 = i10 / i11;
        } else {
            f10 = 1.0f;
        }
        if (this.zzs != f10) {
            this.zzs = f10;
            requestLayout();
        }
    }

    private final boolean zzac() {
        if (zzad() && this.zzl != 1) {
            return true;
        }
        return false;
    }

    private final boolean zzad() {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null && zzcbbVar.zzV() && !this.zzk) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzs;
        if (f10 != 0.0f && this.zzm == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbi zzcbiVar = this.zzm;
        if (zzcbiVar != null) {
            zzcbiVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.zzn) {
            zzcbi zzcbiVar = new zzcbi(getContext());
            this.zzm = zzcbiVar;
            zzcbiVar.zzd(surfaceTexture, i10, i11);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq != 0 && this.zzr != 0) {
            zzaa();
        } else {
            zzab(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
            @Override // java.lang.Runnable
            public final void run() {
                zzccc.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcbi zzcbiVar = this.zzm;
        if (zzcbiVar != null) {
            zzcbiVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbu
            @Override // java.lang.Runnable
            public final void run() {
                zzccc.this.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        zzcbi zzcbiVar = this.zzm;
        if (zzcbiVar != null) {
            zzcbiVar.zzc(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbt
            @Override // java.lang.Runnable
            public final void run() {
                zzccc.this.zzO(i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i10) {
        com.google.android.gms.ads.internal.util.zze.h("AdExoPlayerView3 window visibility changed to " + i10);
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbs
            @Override // java.lang.Runnable
            public final void run() {
                zzccc.this.zzQ(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzA(int i10) {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            zzcbbVar.zzN(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzB(int i10) {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            zzcbbVar.zzR(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        boolean z10 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzl == 4) {
            z10 = true;
        }
        this.zzi = str;
        zzW(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzD(int i10, int i11) {
        this.zzq = i10;
        this.zzr = i11;
        zzaa();
    }

    public final zzcbb zzE(Integer num) {
        zzcbj zzcbjVar = this.zze;
        zzcbk zzcbkVar = this.zzc;
        zzcdw zzcdwVar = new zzcdw(zzcbkVar.getContext(), zzcbjVar, zzcbkVar, num);
        com.google.android.gms.ads.internal.util.client.zzm.d("ExoPlayerAdapter initialized.");
        return zzcdwVar;
    }

    public final String zzF() {
        zzcbk zzcbkVar = this.zzc;
        return com.google.android.gms.ads.internal.zzu.B.c.v(zzcbkVar.getContext(), zzcbkVar.zzn().f10345a);
    }

    public final /* synthetic */ void zzG(String str) {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean z10, long j10) {
        this.zzc.zzv(z10, j10);
    }

    public final /* synthetic */ void zzK(String str) {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.zzi();
        }
    }

    public final /* synthetic */ void zzO(int i10, int i11) {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.zzj(i10, i11);
        }
    }

    public final void zzP() {
        float zza = this.zzb.zza();
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            try {
                zzcbbVar.zzT(zza, false);
                return;
            } catch (IOException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("Trying to set volume before player is initialized.");
    }

    public final /* synthetic */ void zzQ(int i10) {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.onWindowVisibilityChanged(i10);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcap zzcapVar = this.zzf;
        if (zzcapVar != null) {
            zzcapVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final int zzb() {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            return zzcbbVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final long zzf() {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            return zzcbbVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final long zzg() {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            return zzcbbVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final long zzh() {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            return zzcbbVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzi(final boolean z10, final long j10) {
        if (this.zzc != null) {
            zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbv
                @Override // java.lang.Runnable
                public final void run() {
                    zzccc.this.zzJ(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final String zzj() {
        String str;
        if (true != this.zzn) {
            str = "";
        } else {
            str = " spherical";
        }
        return "ExoPlayer/2".concat(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzk(String str, Exception exc) {
        final String zzT = zzT(str, exc);
        com.google.android.gms.ads.internal.util.client.zzm.e("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbz
            @Override // java.lang.Runnable
            public final void run() {
                zzccc.this.zzG(zzT);
            }
        });
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzl(String str, Exception exc) {
        final String zzT = zzT("onLoadException", exc);
        com.google.android.gms.ads.internal.util.client.zzm.e("ExoPlayerAdapter exception: ".concat(zzT));
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbw
            @Override // java.lang.Runnable
            public final void run() {
                zzccc.this.zzK(zzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzm(int i10) {
        if (this.zzl != i10) {
            this.zzl = i10;
            if (i10 != 3) {
                if (i10 == 4) {
                    if (this.zze.zza) {
                        zzX();
                    }
                    this.zzd.zze();
                    this.zzb.zzc();
                    com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcca
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzccc.this.zzH();
                        }
                    });
                    return;
                }
                return;
            }
            zzV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq, com.google.android.gms.internal.ads.zzcbn
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbr
            @Override // java.lang.Runnable
            public final void run() {
                zzccc.this.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbx
                @Override // java.lang.Runnable
                public final void run() {
                    zzccc.this.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzp() {
        if (zzac()) {
            if (this.zze.zza) {
                zzU();
            }
            this.zzh.zzO(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbq
                @Override // java.lang.Runnable
                public final void run() {
                    zzccc.this.zzS();
                }
            });
            return;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzq(int i10) {
        if (zzac()) {
            this.zzh.zzI(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzr(zzcap zzcapVar) {
        this.zzf = zzcapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzu(float f10, float f11) {
        zzcbi zzcbiVar = this.zzm;
        if (zzcbiVar != null) {
            zzcbiVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbp
            @Override // java.lang.Runnable
            public final void run() {
                zzccc.this.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final Integer zzw() {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            return zzcbbVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzx(int i10) {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            zzcbbVar.zzJ(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzy(int i10) {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            zzcbbVar.zzK(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzz(int i10) {
        zzcbb zzcbbVar = this.zzh;
        if (zzcbbVar != null) {
            zzcbbVar.zzM(i10);
        }
    }
}
