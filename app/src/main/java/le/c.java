package le;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: ZJAdCard.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f20561a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f20562b;

    /* compiled from: ZJAdCard.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap;
            c cVar = c.this;
            f fVar = cVar.f20562b;
            if (fVar.f20571e != null && (bitmap = fVar.c) != null && !bitmap.isRecycled()) {
                try {
                    f fVar2 = cVar.f20562b;
                    fVar2.f20571e.setImageBitmap(fVar2.c);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public c(f fVar, Activity activity) {
        this.f20562b = fVar;
        this.f20561a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (this.f20562b.f5405a) {
                f fVar = this.f20562b;
                fVar.c = BitmapFactory.decodeFile(fVar.f20575i.f20576a);
                Bitmap bitmap = this.f20562b.c;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f20561a.runOnUiThread(new a());
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
