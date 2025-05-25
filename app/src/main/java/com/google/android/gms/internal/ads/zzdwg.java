package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdwg {
    public static final void zza(Context context, ViewGroup viewGroup, AdView adView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        zzf(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void zzb(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        String string;
        String string2;
        String string3;
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        zzf(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        zzf(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        nativeAdView.addView(linearLayout);
        Resources zze = com.google.android.gms.ads.internal.zzu.B.f10557g.zze();
        if (zze == null) {
            string = "Headline";
        } else {
            string = zze.getString(R.string.arg_res_0x7f1302ab);
        }
        linearLayout.addView(zzc(context, string, "headline_header_tag"));
        View zzd = zzd(context, zzfvj.zzc(nativeAd.getHeadline()), "headline_tag");
        nativeAdView.setHeadlineView(zzd);
        linearLayout.addView(zzd);
        if (zze == null) {
            string2 = "Body";
        } else {
            string2 = zze.getString(R.string.arg_res_0x7f1302aa);
        }
        linearLayout.addView(zzc(context, string2, "body_header_tag"));
        View zzd2 = zzd(context, zzfvj.zzc(nativeAd.getBody()), "body_tag");
        nativeAdView.setBodyView(zzd2);
        linearLayout.addView(zzd2);
        if (zze == null) {
            string3 = "Media View";
        } else {
            string3 = zze.getString(R.string.arg_res_0x7f1302ac);
        }
        linearLayout.addView(zzc(context, string3, "media_view_header_tag"));
        MediaView mediaView = new MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        linearLayout.addView(mediaView);
        nativeAdView.setNativeAd(nativeAd);
    }

    private static TextView zzc(Context context, String str, String str2) {
        return zze(context, str, 16973894, -9210245, 0.0f, str2);
    }

    private static TextView zzd(Context context, String str, String str2) {
        return zze(context, str, 16973892, -16777216, 12.0f, str2);
    }

    private static TextView zze(Context context, String str, int i10, int i11, float f10, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        zzf(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f10, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i10);
        textView.setTextColor(i11);
        textView.setText(str);
        return textView;
    }

    private static void zzf(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i10;
        layoutParams2.width = i11;
        view.setLayoutParams(layoutParams2);
    }
}
