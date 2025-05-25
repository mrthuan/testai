package lib.zj.pdfeditor;

import android.graphics.Bitmap;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: PageView.java */
/* loaded from: classes3.dex */
public final class g extends AppCompatImageView {
    @Override // android.widget.ImageView, android.view.View
    public final boolean isOpaque() {
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ViewParent parent = getParent();
        if (parent instanceof PageView) {
            PageView pageView = (PageView) parent;
            if (pageView.r1()) {
                pageView.q1();
            }
        }
    }
}
