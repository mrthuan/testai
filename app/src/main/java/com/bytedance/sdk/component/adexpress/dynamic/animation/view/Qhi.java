package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;

/* compiled from: AnimationWrapper.java */
/* loaded from: classes.dex */
public class Qhi {
    private int CJ;
    Paint Qhi;
    private int Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private int f8206fl;
    Path cJ = new Path();

    /* renamed from: ac  reason: collision with root package name */
    Path f8205ac = new Path();

    public Qhi() {
        Paint paint = new Paint();
        this.Qhi = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(android.graphics.Canvas r22, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation r23, android.view.View r24) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.animation.view.Qhi.Qhi(android.graphics.Canvas, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation, android.view.View):void");
    }

    public void Qhi(View view, float f10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i10 = this.Tgh;
        int i11 = (int) (i10 * f10);
        layoutParams.width = i11;
        view.setTranslationX((i10 - i11) / 2);
        if (view instanceof DynamicImageView) {
            int i12 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i12 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i12).setTranslationX((-(this.Tgh - layoutParams.width)) / 2);
                i12++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void Qhi(View view, int i10, int i11) {
        String str;
        this.CJ = i10 / 2;
        this.f8206fl = i11 / 2;
        if (this.Tgh == 0 && view.getLayoutParams().width > 0) {
            this.Tgh = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.f8205ac.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i11 / 2, i11 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.CJ * 2);
            view.setPivotY(this.f8206fl);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.f8206fl);
        } else {
            view.setPivotX(this.CJ);
            view.setPivotY(this.f8206fl);
        }
    }
}
