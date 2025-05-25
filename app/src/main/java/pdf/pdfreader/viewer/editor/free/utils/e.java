package pdf.pdfreader.viewer.editor.free.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: BitmapUtil.java */
/* loaded from: classes3.dex */
public final class e {
    public static Bitmap a(Drawable drawable) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (!drawable.getBounds().isEmpty()) {
            intrinsicWidth = drawable.getBounds().width();
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (!drawable.getBounds().isEmpty()) {
            intrinsicHeight = drawable.getBounds().height();
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        if (intrinsicHeight <= 0) {
            intrinsicHeight = 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }
}
