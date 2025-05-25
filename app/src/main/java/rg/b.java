package rg;

import android.graphics.Bitmap;

/* compiled from: IOffice.java */
/* loaded from: classes2.dex */
public final class b implements sg.c {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f29540a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f29541b;

    public b(c cVar) {
        this.f29541b = cVar;
    }

    @Override // sg.c
    public final Bitmap a(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            Bitmap bitmap = this.f29540a;
            if (bitmap == null || bitmap.getWidth() != i10 || this.f29540a.getHeight() != i11) {
                Bitmap bitmap2 = this.f29540a;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f29540a = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            }
            return this.f29540a;
        }
        return null;
    }

    @Override // sg.c
    public final void d() {
        this.f29541b.getClass();
    }

    @Override // sg.c
    public final void b() {
    }

    @Override // sg.c
    public final void c() {
    }

    @Override // sg.c
    public final void dispose() {
    }
}
