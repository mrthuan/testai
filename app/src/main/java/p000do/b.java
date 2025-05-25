package p000do;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import p000do.k;

/* compiled from: CustomGestureDetector.java */
/* renamed from: do.b  reason: invalid package */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f16267a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f16268b = 0;
    public final ScaleGestureDetector c;

    /* renamed from: d  reason: collision with root package name */
    public VelocityTracker f16269d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16270e;

    /* renamed from: f  reason: collision with root package name */
    public float f16271f;

    /* renamed from: g  reason: collision with root package name */
    public float f16272g;

    /* renamed from: h  reason: collision with root package name */
    public final float f16273h;

    /* renamed from: i  reason: collision with root package name */
    public final float f16274i;

    /* renamed from: j  reason: collision with root package name */
    public final c f16275j;

    public b(Context context, k.a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f16274i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f16273h = viewConfiguration.getScaledTouchSlop();
        this.f16275j = aVar;
        this.c = new ScaleGestureDetector(context, new a(this));
    }

    public final void a(MotionEvent motionEvent) {
        float x4;
        float y10;
        float x10;
        float y11;
        int i10;
        int i11;
        int i12;
        int i13;
        float x11;
        float y12;
        int i14;
        boolean z10;
        int action = motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC;
        int i15 = 0;
        if (action != 0) {
            int i16 = 1;
            c cVar = this.f16275j;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            int action2 = (motionEvent.getAction() & 65280) >> 8;
                            if (motionEvent.getPointerId(action2) == this.f16267a) {
                                if (action2 != 0) {
                                    i16 = 0;
                                }
                                this.f16267a = motionEvent.getPointerId(i16);
                                this.f16271f = motionEvent.getX(i16);
                                this.f16272g = motionEvent.getY(i16);
                            }
                        }
                    } else {
                        this.f16267a = -1;
                        VelocityTracker velocityTracker = this.f16269d;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f16269d = null;
                        }
                    }
                } else {
                    try {
                        x11 = motionEvent.getX(this.f16268b);
                    } catch (Exception unused) {
                        x11 = motionEvent.getX();
                    }
                    try {
                        y12 = motionEvent.getY(this.f16268b);
                    } catch (Exception unused2) {
                        y12 = motionEvent.getY();
                    }
                    float f10 = x11 - this.f16271f;
                    float f11 = y12 - this.f16272g;
                    if (!this.f16270e) {
                        if (Math.sqrt((f11 * f11) + (f10 * f10)) >= this.f16273h) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f16270e = z10;
                    }
                    if (this.f16270e) {
                        k kVar = k.this;
                        if (!kVar.f16284j.c.isInProgress()) {
                            kVar.f16287m.postTranslate(f10, f11);
                            kVar.a();
                            ViewParent parent = kVar.f16282h.getParent();
                            if (kVar.f16280f && !kVar.f16284j.c.isInProgress() && !kVar.f16281g) {
                                int i17 = kVar.f16293s;
                                if ((i17 == 2 || ((i17 == 0 && f10 >= 1.0f) || ((i17 == 1 && f10 <= -1.0f) || (((i14 = kVar.f16294t) == 0 && f11 >= 1.0f) || (i14 == 1 && f11 <= -1.0f))))) && parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(false);
                                }
                            } else if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        this.f16271f = x11;
                        this.f16272g = y12;
                        VelocityTracker velocityTracker2 = this.f16269d;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                    }
                }
            } else {
                this.f16267a = -1;
                if (this.f16270e && this.f16269d != null) {
                    try {
                        x10 = motionEvent.getX(this.f16268b);
                    } catch (Exception unused3) {
                        x10 = motionEvent.getX();
                    }
                    this.f16271f = x10;
                    try {
                        y11 = motionEvent.getY(this.f16268b);
                    } catch (Exception unused4) {
                        y11 = motionEvent.getY();
                    }
                    this.f16272g = y11;
                    this.f16269d.addMovement(motionEvent);
                    this.f16269d.computeCurrentVelocity(1000);
                    float xVelocity = this.f16269d.getXVelocity();
                    float yVelocity = this.f16269d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f16274i) {
                        k kVar2 = k.this;
                        k.f fVar = new k.f(kVar2.f16282h.getContext());
                        kVar2.f16292r = fVar;
                        ImageView imageView = kVar2.f16282h;
                        int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
                        int height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
                        int i18 = (int) (-xVelocity);
                        int i19 = (int) (-yVelocity);
                        RectF c = kVar2.c();
                        if (c != null) {
                            int round = Math.round(-c.left);
                            float f12 = width;
                            if (f12 < c.width()) {
                                i10 = Math.round(c.width() - f12);
                                i11 = 0;
                            } else {
                                i10 = round;
                                i11 = i10;
                            }
                            int round2 = Math.round(-c.top);
                            float f13 = height;
                            if (f13 < c.height()) {
                                i12 = Math.round(c.height() - f13);
                                i13 = 0;
                            } else {
                                i12 = round2;
                                i13 = i12;
                            }
                            fVar.f16308b = round;
                            fVar.c = round2;
                            if (round != i10 || round2 != i12) {
                                fVar.f16307a.fling(round, round2, i18, i19, i11, i10, i13, i12, 0, 0);
                            }
                        }
                        imageView.post(kVar2.f16292r);
                    }
                }
                VelocityTracker velocityTracker3 = this.f16269d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f16269d = null;
                }
            }
        } else {
            this.f16267a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f16269d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x4 = motionEvent.getX(this.f16268b);
            } catch (Exception unused5) {
                x4 = motionEvent.getX();
            }
            this.f16271f = x4;
            try {
                y10 = motionEvent.getY(this.f16268b);
            } catch (Exception unused6) {
                y10 = motionEvent.getY();
            }
            this.f16272g = y10;
            this.f16270e = false;
        }
        int i20 = this.f16267a;
        if (i20 != -1) {
            i15 = i20;
        }
        this.f16268b = motionEvent.findPointerIndex(i15);
    }
}
