package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcrg extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcrg(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcrg zza(Context context, View view, zzfel zzfelVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcrg zzcrgVar = new zzcrg(context);
        if (!zzfelVar.zzu.isEmpty() && (resources = zzcrgVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfem zzfemVar = (zzfem) zzfelVar.zzu.get(0);
            float f10 = displayMetrics.density;
            zzcrgVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfemVar.zza * f10), (int) (zzfemVar.zzb * f10)));
        }
        zzcrgVar.zzb = view;
        zzcrgVar.addView(view);
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzcab zzcabVar = zzuVar.A;
        zzcab.zzb(zzcrgVar, zzcrgVar);
        zzcab zzcabVar2 = zzuVar.A;
        zzcab.zza(zzcrgVar, zzcrgVar);
        JSONObject jSONObject = zzfelVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcrgVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcrgVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcrgVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcrgVar.addView(relativeLayout);
        return zzcrgVar;
    }

    private final int zzb(double d10) {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
        return com.google.android.gms.ads.internal.util.client.zzf.o(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble(InMobiNetworkValues.HEIGHT, 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
