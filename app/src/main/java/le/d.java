package le;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: ZJAdCard.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f20564a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f20565b;

    /* compiled from: ZJAdCard.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap;
            d dVar = d.this;
            f fVar = dVar.f20565b;
            if (fVar.f20572f != null && (bitmap = fVar.f20570d) != null && !bitmap.isRecycled()) {
                try {
                    f fVar2 = dVar.f20565b;
                    fVar2.f20572f.setImageBitmap(fVar2.f20570d);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public d(f fVar, Activity activity) {
        this.f20565b = fVar;
        this.f20564a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (this.f20565b.f5405a) {
                f fVar = this.f20565b;
                fVar.f20570d = BitmapFactory.decodeFile(fVar.f20575i.f20577b);
                Bitmap bitmap = this.f20565b.f20570d;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f20564a.runOnUiThread(new a());
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
