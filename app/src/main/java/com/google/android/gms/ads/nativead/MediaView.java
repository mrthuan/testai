package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbfx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public MediaContent f10594a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10595b;
    public ImageView.ScaleType c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10596d;

    /* renamed from: e  reason: collision with root package name */
    public zzb f10597e;

    /* renamed from: f  reason: collision with root package name */
    public zzc f10598f;

    public MediaView(Context context) {
        super(context);
    }

    public final synchronized void a(zzc zzcVar) {
        this.f10598f = zzcVar;
        if (this.f10596d) {
            ImageView.ScaleType scaleType = this.c;
            zzbfh zzbfhVar = zzcVar.f10618a.f10616b;
            if (zzbfhVar != null && scaleType != null) {
                try {
                    zzbfhVar.zzdy(new ObjectWrapper(scaleType));
                } catch (RemoteException unused) {
                    zzm.g(6);
                }
            }
        }
    }

    public MediaContent getMediaContent() {
        return this.f10594a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        zzbfh zzbfhVar;
        this.f10596d = true;
        this.c = scaleType;
        zzc zzcVar = this.f10598f;
        if (zzcVar != null && (zzbfhVar = zzcVar.f10618a.f10616b) != null && scaleType != null) {
            try {
                zzbfhVar.zzdy(new ObjectWrapper(scaleType));
            } catch (RemoteException unused) {
                zzm.g(6);
            }
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        boolean zzr;
        this.f10595b = true;
        this.f10594a = mediaContent;
        zzb zzbVar = this.f10597e;
        if (zzbVar != null) {
            zzbVar.f10617a.b(mediaContent);
        }
        if (mediaContent != null) {
            try {
                zzbfx zza = mediaContent.zza();
                if (zza != null) {
                    if (mediaContent.a()) {
                        zzr = zza.zzs(new ObjectWrapper(this));
                    } else {
                        if (mediaContent.zzb()) {
                            zzr = zza.zzr(new ObjectWrapper(this));
                        }
                        removeAllViews();
                    }
                    if (zzr) {
                        return;
                    }
                    removeAllViews();
                }
            } catch (RemoteException unused) {
                removeAllViews();
                zzm.g(6);
            }
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
