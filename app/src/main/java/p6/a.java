package p6;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: CustomGestureDetector.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f23724a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f23725b = 0;
    public final ScaleGestureDetector c;

    /* renamed from: d  reason: collision with root package name */
    public VelocityTracker f23726d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23727e;

    /* renamed from: f  reason: collision with root package name */
    public float f23728f;

    /* renamed from: g  reason: collision with root package name */
    public float f23729g;

    /* renamed from: h  reason: collision with root package name */
    public final float f23730h;

    /* renamed from: i  reason: collision with root package name */
    public final float f23731i;

    /* renamed from: j  reason: collision with root package name */
    public final c f23732j;

    public a(Context context, c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f23731i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f23730h = viewConfiguration.getScaledTouchSlop();
        this.f23732j = cVar;
        this.c = new ScaleGestureDetector(context, new ScaleGestureDetector$OnScaleGestureListenerC0326a());
    }

    public final boolean a() {
        return this.c.isInProgress();
    }

    public final void b(MotionEvent motionEvent) {
        float x4;
        float y10;
        float x10;
        float y11;
        float x11;
        float y12;
        int action = motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC;
        int i10 = 0;
        if (action != 0) {
            boolean z10 = true;
            int i11 = 1;
            c cVar = this.f23732j;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            int action2 = (motionEvent.getAction() & 65280) >> 8;
                            if (motionEvent.getPointerId(action2) == this.f23724a) {
                                if (action2 != 0) {
                                    i11 = 0;
                                }
                                this.f23724a = motionEvent.getPointerId(i11);
                                this.f23728f = motionEvent.getX(i11);
                                this.f23729g = motionEvent.getY(i11);
                            }
                        }
                    } else {
                        this.f23724a = -1;
                        VelocityTracker velocityTracker = this.f23726d;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f23726d = null;
                        }
                    }
                } else {
                    try {
                        x11 = motionEvent.getX(this.f23725b);
                    } catch (Exception unused) {
                        x11 = motionEvent.getX();
                    }
                    try {
                        y12 = motionEvent.getY(this.f23725b);
                    } catch (Exception unused2) {
                        y12 = motionEvent.getY();
                    }
                    float f10 = x11 - this.f23728f;
                    float f11 = y12 - this.f23729g;
                    if (!this.f23727e) {
                        if (Math.sqrt((f11 * f11) + (f10 * f10)) < this.f23730h) {
                            z10 = false;
                        }
                        this.f23727e = z10;
                    }
                    if (this.f23727e) {
                        cVar.b(f10, f11);
                        this.f23728f = x11;
                        this.f23729g = y12;
                        VelocityTracker velocityTracker2 = this.f23726d;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                    }
                }
            } else {
                this.f23724a = -1;
                if (this.f23727e && this.f23726d != null) {
                    try {
                        x10 = motionEvent.getX(this.f23725b);
                    } catch (Exception unused3) {
                        x10 = motionEvent.getX();
                    }
                    this.f23728f = x10;
                    try {
                        y11 = motionEvent.getY(this.f23725b);
                    } catch (Exception unused4) {
                        y11 = motionEvent.getY();
                    }
                    this.f23729g = y11;
                    this.f23726d.addMovement(motionEvent);
                    this.f23726d.computeCurrentVelocity(1000);
                    float xVelocity = this.f23726d.getXVelocity();
                    float yVelocity = this.f23726d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f23731i) {
                        cVar.c(-xVelocity, -yVelocity);
                    }
                }
                VelocityTracker velocityTracker3 = this.f23726d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f23726d = null;
                }
            }
        } else {
            this.f23724a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f23726d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x4 = motionEvent.getX(this.f23725b);
            } catch (Exception unused5) {
                x4 = motionEvent.getX();
            }
            this.f23728f = x4;
            try {
                y10 = motionEvent.getY(this.f23725b);
            } catch (Exception unused6) {
                y10 = motionEvent.getY();
            }
            this.f23729g = y10;
            this.f23727e = false;
        }
        int i12 = this.f23724a;
        if (i12 != -1) {
            i10 = i12;
        }
        this.f23725b = motionEvent.findPointerIndex(i10);
    }

    /* compiled from: CustomGestureDetector.java */
    /* renamed from: p6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ScaleGestureDetector$OnScaleGestureListenerC0326a implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetector$OnScaleGestureListenerC0326a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                a.this.f23732j.a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
            return false;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}
