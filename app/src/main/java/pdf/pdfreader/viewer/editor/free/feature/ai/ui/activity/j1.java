package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: ReaderAIPreviewActivity.java */
/* loaded from: classes3.dex */
public final class j1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageView f24608a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f24609b;
    public final /* synthetic */ Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ lo.c f24610d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f24611e;

    public j1(ImageView imageView, int i10, Bitmap bitmap, lo.c cVar, boolean z10) {
        this.f24608a = imageView;
        this.f24609b = i10;
        this.c = bitmap;
        this.f24610d = cVar;
        this.f24611e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24609b;
        ImageView imageView = this.f24608a;
        if (imageView != null && ((Integer) imageView.getTag()).intValue() == i10) {
            imageView.setImageBitmap(this.c);
        }
        this.f24610d.c(i10, this.f24611e);
    }
}
