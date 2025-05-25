package kj;

import android.view.MotionEvent;
import android.view.View;
import xo.a;

/* compiled from: ScaleGestureDetector.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0264a f19786a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19787b;
    public MotionEvent c;

    /* renamed from: d  reason: collision with root package name */
    public MotionEvent f19788d;

    /* renamed from: e  reason: collision with root package name */
    public final c f19789e = new c();

    /* renamed from: f  reason: collision with root package name */
    public float f19790f;

    /* renamed from: g  reason: collision with root package name */
    public float f19791g;

    /* renamed from: h  reason: collision with root package name */
    public float f19792h;

    /* renamed from: i  reason: collision with root package name */
    public float f19793i;

    /* renamed from: j  reason: collision with root package name */
    public float f19794j;

    /* renamed from: k  reason: collision with root package name */
    public float f19795k;

    /* renamed from: l  reason: collision with root package name */
    public float f19796l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f19797m;

    /* renamed from: n  reason: collision with root package name */
    public int f19798n;

    /* compiled from: ScaleGestureDetector.java */
    /* renamed from: kj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0264a {
    }

    /* compiled from: ScaleGestureDetector.java */
    /* loaded from: classes3.dex */
    public static class b implements InterfaceC0264a {
    }

    public a(a.C0411a c0411a) {
        this.f19786a = c0411a;
    }

    public final float a() {
        if (this.f19796l == -1.0f) {
            if (this.f19795k == -1.0f) {
                float f10 = this.f19790f;
                float f11 = this.f19791g;
                this.f19795k = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            }
            if (this.f19795k != 0.0f) {
                if (this.f19794j == -1.0f) {
                    float f12 = this.f19792h;
                    float f13 = this.f19793i;
                    this.f19794j = (float) Math.sqrt((f13 * f13) + (f12 * f12));
                }
                float f14 = this.f19794j;
                if (this.f19795k == -1.0f) {
                    float f15 = this.f19790f;
                    float f16 = this.f19791g;
                    this.f19795k = (float) Math.sqrt((f16 * f16) + (f15 * f15));
                }
                this.f19796l = f14 / this.f19795k;
            }
        }
        return this.f19796l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r0 != 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r1 <= (r8 * 4)) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147 A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:52:0x0129, B:53:0x0141, B:55:0x0147, B:57:0x0152, B:59:0x015f, B:61:0x0167, B:63:0x0172, B:64:0x0175, B:65:0x017b), top: B:76:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.a.b(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void c() {
        MotionEvent motionEvent = this.c;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.c = null;
        }
        MotionEvent motionEvent2 = this.f19788d;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.f19788d = null;
        }
        this.f19787b = false;
        this.f19798n = -1;
        this.f19797m = false;
    }

    public final void d(View view, MotionEvent motionEvent) {
        c cVar = this.f19789e;
        try {
            MotionEvent motionEvent2 = this.f19788d;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f19788d = MotionEvent.obtain(motionEvent);
            this.f19794j = -1.0f;
            this.f19795k = -1.0f;
            this.f19796l = -1.0f;
            cVar.set(0.0f, 0.0f);
            MotionEvent motionEvent3 = this.c;
            int findPointerIndex = motionEvent3.findPointerIndex(this.f19798n);
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f19798n);
            if (findPointerIndex == 0 && findPointerIndex2 == 0) {
                float x4 = motionEvent3.getX(findPointerIndex);
                float y10 = motionEvent3.getY(findPointerIndex);
                float x10 = motionEvent.getX(findPointerIndex2);
                float y11 = motionEvent.getY(findPointerIndex2);
                float width = x10 - (view.getWidth() / 2.0f);
                float height = y11 - (view.getHeight() / 2.0f);
                cVar.set(width, height);
                this.f19790f = x4 - (view.getWidth() / 2.0f);
                this.f19791g = y10 - (view.getHeight() / 2.0f);
                this.f19792h = width;
                this.f19793i = height;
                motionEvent.getEventTime();
                motionEvent3.getEventTime();
                return;
            }
            this.f19797m = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
