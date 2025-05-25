package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: AdmobOverlayHelper.java */
/* loaded from: classes.dex */
public class ac {

    /* compiled from: AdmobOverlayHelper.java */
    /* loaded from: classes.dex */
    public static class Qhi implements View.OnLayoutChangeListener {
        private final Drawable Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private int f9376ac;
        private int cJ;

        public Qhi(Drawable drawable) {
            this.Qhi = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.cJ && i19 == this.f9376ac) {
                return;
            }
            this.cJ = i18;
            this.f9376ac = i19;
            this.Qhi.setBounds(0, 0, i18, i19);
        }
    }

    public static void Qhi(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (viewGroup == null || tPVar == null || TextUtils.isEmpty(tPVar.cBj())) {
            return;
        }
        try {
            int i10 = iMK.f9384wa;
            if (viewGroup.getTag(i10) != null) {
                return;
            }
            viewGroup.setTag(i10, Integer.valueOf(i10));
            Drawable Qhi2 = Qhi(viewGroup.getResources(), tPVar);
            if (Qhi2 == null) {
                return;
            }
            viewGroup.setForeground(Qhi2);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("add overlay fail", th2.getMessage());
        }
    }

    public static void Qhi(Activity activity, com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (activity == null || tPVar == null || TextUtils.isEmpty(tPVar.cBj())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i10 = iMK.f9384wa;
            if (decorView.getTag(i10) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i10, Integer.valueOf(i10));
            Drawable Qhi2 = Qhi(activity.getResources(), tPVar);
            if (Qhi2 == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(Qhi2);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("add overlay fail", th2.getMessage());
        }
    }

    private static Drawable Qhi(Resources resources, com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        try {
            String cBj = tPVar.cBj();
            if (TextUtils.isEmpty(cBj)) {
                return null;
            }
            byte[] decode = Base64.decode(cBj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
