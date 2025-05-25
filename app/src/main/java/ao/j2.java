package ao;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class j2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageView f5082a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5083b;
    public final /* synthetic */ Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ lo.c f5084d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f5085e;

    public j2(ImageView imageView, int i10, Bitmap bitmap, lo.c cVar, boolean z10) {
        this.f5082a = imageView;
        this.f5083b = i10;
        this.c = bitmap;
        this.f5084d = cVar;
        this.f5085e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5083b;
        ImageView imageView = this.f5082a;
        if (imageView != null && ((Integer) imageView.getTag()).intValue() == i10) {
            imageView.setImageBitmap(this.c);
        }
        this.f5084d.c(i10, this.f5085e);
    }
}
