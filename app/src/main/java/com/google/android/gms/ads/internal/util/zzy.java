package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbze;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@TargetApi(28)
/* loaded from: classes.dex */
public class zzy extends zzw {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int f(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void g(final Activity activity) {
        boolean isInMultiWindowMode;
        int i10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaW)).booleanValue() && com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().zzm() == null) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            if (!isInMultiWindowMode) {
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                i10 = attributes.layoutInDisplayCutoutMode;
                if (1 != i10) {
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                }
                activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzx
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        int i11;
                        DisplayCutout displayCutout;
                        List<Rect> boundingRects;
                        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
                        if (zzuVar.f10557g.zzi().zzm() == null) {
                            displayCutout = windowInsets.getDisplayCutout();
                            zzbze zzbzeVar = zzuVar.f10557g;
                            String str = "";
                            if (displayCutout != null) {
                                zzg zzi = zzbzeVar.zzi();
                                boundingRects = displayCutout.getBoundingRects();
                                for (Rect rect : boundingRects) {
                                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("|");
                                    }
                                    str = str.concat(String.valueOf(format));
                                }
                                zzi.l(str);
                            } else {
                                zzbzeVar.zzi().l("");
                            }
                        }
                        Window window2 = activity.getWindow();
                        WindowManager.LayoutParams attributes2 = window2.getAttributes();
                        i11 = attributes2.layoutInDisplayCutoutMode;
                        if (2 != i11) {
                            attributes2.layoutInDisplayCutoutMode = 2;
                            window2.setAttributes(attributes2);
                        }
                        return view.onApplyWindowInsets(windowInsets);
                    }
                });
            }
        }
    }
}
