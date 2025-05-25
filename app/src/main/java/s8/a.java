package s8;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.Arrays;
import p0.a;

/* compiled from: DrawableUtils.java */
/* loaded from: classes2.dex */
public final class a {
    public static Drawable a(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight;
        int i10;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() != -1 && drawable2.getIntrinsicHeight() != -1) {
            if (drawable2.getIntrinsicWidth() <= drawable.getIntrinsicWidth() && drawable2.getIntrinsicHeight() <= drawable.getIntrinsicHeight()) {
                i10 = drawable2.getIntrinsicWidth();
                intrinsicHeight = drawable2.getIntrinsicHeight();
            } else {
                float intrinsicWidth = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
                if (intrinsicWidth >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                    i10 = drawable.getIntrinsicWidth();
                    intrinsicHeight = (int) (i10 / intrinsicWidth);
                } else {
                    intrinsicHeight = drawable.getIntrinsicHeight();
                    i10 = (int) (intrinsicWidth * intrinsicHeight);
                }
            }
        } else {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
            i10 = intrinsicWidth2;
        }
        layerDrawable.setLayerSize(1, i10, intrinsicHeight);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                a.b.i(drawable, mode);
            }
        }
        return drawable;
    }

    public static int[] c(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == 16842912) {
                return iArr;
            }
            if (i11 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i10] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }
}
