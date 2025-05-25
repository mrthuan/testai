package qe;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import eightbitlab.com.blurview.BlurView;

/* compiled from: PreDrawBlurController.java */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: b  reason: collision with root package name */
    public final qe.a f29294b;
    public c c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f29295d;

    /* renamed from: e  reason: collision with root package name */
    public final BlurView f29296e;

    /* renamed from: f  reason: collision with root package name */
    public final int f29297f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f29298g;

    /* renamed from: k  reason: collision with root package name */
    public boolean f29302k;

    /* renamed from: a  reason: collision with root package name */
    public float f29293a = 16.0f;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f29299h = new int[2];

    /* renamed from: i  reason: collision with root package name */
    public final int[] f29300i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    public final a f29301j = new a();

    /* compiled from: PreDrawBlurController.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            d.this.e();
            return true;
        }
    }

    public d(BlurView blurView, ViewGroup viewGroup, int i10, g gVar) {
        this.f29298g = viewGroup;
        this.f29296e = blurView;
        this.f29297f = i10;
        this.f29294b = gVar;
        if (gVar instanceof f) {
            ((f) gVar).f29309f = blurView.getContext();
        }
        b(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    @Override // qe.b
    public final b a(boolean z10) {
        ViewGroup viewGroup = this.f29298g;
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        a aVar = this.f29301j;
        viewTreeObserver.removeOnPreDrawListener(aVar);
        if (z10) {
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
        return this;
    }

    public final void b(int i10, int i11) {
        boolean z10;
        a(true);
        qe.a aVar = this.f29294b;
        aVar.a();
        float f10 = i11;
        if (((int) Math.ceil(f10 / 6.0f)) != 0 && ((int) Math.ceil(i10 / 6.0f)) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        BlurView blurView = this.f29296e;
        if (z10) {
            blurView.setWillNotDraw(true);
            return;
        }
        blurView.setWillNotDraw(false);
        float f11 = i10;
        int ceil = (int) Math.ceil(f11 / 6.0f);
        int i12 = ceil % 64;
        if (i12 != 0) {
            ceil = (ceil - i12) + 64;
        }
        this.f29295d = Bitmap.createBitmap(ceil, (int) Math.ceil(f10 / (f11 / ceil)), aVar.b());
        this.c = new c(this.f29295d);
        this.f29302k = true;
        e();
    }

    @Override // qe.b
    public final void c() {
        BlurView blurView = this.f29296e;
        b(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    @Override // qe.b
    public final boolean d(Canvas canvas) {
        if (!this.f29302k) {
            return true;
        }
        if (canvas instanceof c) {
            return false;
        }
        BlurView blurView = this.f29296e;
        float height = blurView.getHeight() / this.f29295d.getHeight();
        canvas.save();
        canvas.scale(blurView.getWidth() / this.f29295d.getWidth(), height);
        this.f29294b.d(canvas, this.f29295d);
        canvas.restore();
        int i10 = this.f29297f;
        if (i10 != 0) {
            canvas.drawColor(i10);
        }
        return true;
    }

    @Override // qe.b
    public final void destroy() {
        a(false);
        this.f29294b.destroy();
        this.f29302k = false;
    }

    public final void e() {
        if (this.f29302k) {
            this.f29295d.eraseColor(0);
            this.c.save();
            ViewGroup viewGroup = this.f29298g;
            int[] iArr = this.f29299h;
            viewGroup.getLocationOnScreen(iArr);
            BlurView blurView = this.f29296e;
            int[] iArr2 = this.f29300i;
            blurView.getLocationOnScreen(iArr2);
            int i10 = iArr2[0] - iArr[0];
            int i11 = iArr2[1] - iArr[1];
            float height = blurView.getHeight() / this.f29295d.getHeight();
            float width = blurView.getWidth() / this.f29295d.getWidth();
            this.c.translate((-i10) / width, (-i11) / height);
            this.c.scale(1.0f / width, 1.0f / height);
            viewGroup.draw(this.c);
            this.c.restore();
            Bitmap bitmap = this.f29295d;
            float f10 = this.f29293a;
            qe.a aVar = this.f29294b;
            this.f29295d = aVar.e(bitmap, f10);
            aVar.c();
        }
    }
}
