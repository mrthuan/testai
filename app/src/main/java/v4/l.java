package v4;

import android.graphics.Bitmap;
import android.widget.ImageView;
import ge.d;

/* compiled from: PangleNativeBanner.kt */
/* loaded from: classes.dex */
public final class l implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f30581a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImageView f30582b;

    public l(n nVar, ImageView imageView) {
        this.f30581a = nVar;
        this.f30582b = imageView;
    }

    @Override // ge.d.a
    public final void a(Bitmap bitmap) {
        kotlin.jvm.internal.g.e(bitmap, "bitmap");
        Object lock = this.f30581a.f5405a;
        kotlin.jvm.internal.g.d(lock, "lock");
        ImageView imageView = this.f30582b;
        synchronized (lock) {
            imageView.setImageBitmap(bitmap);
            tf.d dVar = tf.d.f30009a;
        }
    }

    @Override // ge.d.a
    public final void b() {
        Object lock = this.f30581a.f5405a;
        kotlin.jvm.internal.g.d(lock, "lock");
        ImageView imageView = this.f30582b;
        synchronized (lock) {
            imageView.setVisibility(8);
            tf.d dVar = tf.d.f30009a;
        }
    }
}
