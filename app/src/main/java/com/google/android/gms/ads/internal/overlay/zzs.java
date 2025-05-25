package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import l7.e;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzs extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final ImageButton f10332a;

    /* renamed from: b  reason: collision with root package name */
    public final zzae f10333b;

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:18:0x005e). Please submit an issue!!! */
    public zzs(Activity activity, zzr zzrVar, zzae zzaeVar) {
        super(activity);
        Drawable drawable;
        this.f10333b = zzaeVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(activity);
        this.f10332a = imageButton;
        String str = (String) zzba.f10115d.c.zza(zzbbw.zzaS);
        if (!TextUtils.isEmpty(str) && !"default".equals(str)) {
            Resources zze = com.google.android.gms.ads.internal.zzu.B.f10557g.zze();
            if (zze != null) {
                try {
                } catch (Resources.NotFoundException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.b("Close button resource not found, falling back to default.");
                }
                if ("white".equals(str)) {
                    drawable = zze.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                } else {
                    if ("black".equals(str)) {
                        drawable = zze.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                    }
                    drawable = null;
                }
                if (drawable == null) {
                    imageButton.setImageResource(17301527);
                } else {
                    imageButton.setImageDrawable(drawable);
                    imageButton.setScaleType(ImageView.ScaleType.CENTER);
                }
            } else {
                imageButton.setImageResource(17301527);
            }
        } else {
            imageButton.setImageResource(17301527);
        }
        this.f10332a.setBackgroundColor(0);
        this.f10332a.setOnClickListener(this);
        ImageButton imageButton2 = this.f10332a;
        zzf zzfVar = zzay.f10107f.f10108a;
        imageButton2.setPadding(zzf.o(activity, zzrVar.f10329a), zzf.o(activity, 0), zzf.o(activity, zzrVar.f10330b), zzf.o(activity, zzrVar.c));
        this.f10332a.setContentDescription("Interstitial close button");
        addView(this.f10332a, new FrameLayout.LayoutParams(zzf.o(activity, zzrVar.f10331d + zzrVar.f10329a + zzrVar.f10330b), zzf.o(activity, zzrVar.f10331d + zzrVar.c), 17));
        zzbbn zzbbnVar = zzbbw.zzaT;
        zzba zzbaVar = zzba.f10115d;
        long longValue = ((Long) zzbaVar.c.zza(zzbbnVar)).longValue();
        if (longValue <= 0) {
            return;
        }
        e eVar = ((Boolean) zzbaVar.c.zza(zzbbw.zzaU)).booleanValue() ? new e(this) : null;
        this.f10332a.setAlpha(0.0f);
        this.f10332a.animate().alpha(1.0f).setDuration(longValue).setListener(eVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzae zzaeVar = this.f10333b;
        if (zzaeVar != null) {
            zzaeVar.zzj();
        }
    }
}
