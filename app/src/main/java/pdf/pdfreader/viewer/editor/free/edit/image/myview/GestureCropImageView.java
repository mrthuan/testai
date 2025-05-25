package pdf.pdfreader.viewer.editor.free.edit.image.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import hm.d;
import java.util.ArrayList;
import java.util.Iterator;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import pdf.pdfreader.viewer.editor.free.edit.image.myview.CropImageView;
import pdf.pdfreader.viewer.editor.free.edit.image.myview.TransformImageView;

/* loaded from: classes3.dex */
public class GestureCropImageView extends CropImageView {
    public ScaleGestureDetector N;
    public d O;
    public GestureDetector P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;

    /* loaded from: classes3.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            float doubleTapTargetScale = gestureCropImageView.getDoubleTapTargetScale();
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (doubleTapTargetScale > gestureCropImageView.getMaxScale()) {
                doubleTapTargetScale = gestureCropImageView.getMaxScale();
            }
            float currentScale = gestureCropImageView.getCurrentScale();
            CropImageView.b bVar = new CropImageView.b(gestureCropImageView, currentScale, doubleTapTargetScale - currentScale, x4, y10);
            gestureCropImageView.J = bVar;
            gestureCropImageView.post(bVar);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            GestureCropImageView.this.g(-f10, -f11);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends d.b {
        public b() {
        }
    }

    /* loaded from: classes3.dex */
    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            if (gestureCropImageView.V > 1) {
                gestureCropImageView.j(scaleGestureDetector.getScaleFactor(), gestureCropImageView.Q, gestureCropImageView.R);
                return true;
            }
            return false;
        }
    }

    public GestureCropImageView(Context context) {
        super(context);
        this.S = true;
        this.T = true;
        this.U = 5;
    }

    @Override // pdf.pdfreader.viewer.editor.free.edit.image.myview.TransformImageView
    public final void c() {
        super.c();
        this.P = new GestureDetector(getContext(), new a(), null, true);
        this.N = new ScaleGestureDetector(getContext(), new c());
        this.O = new d(new b());
    }

    public int getDoubleTapScaleSteps() {
        return this.U;
    }

    public float getDoubleTapTargetScale() {
        ea.a.p("akNU", "J9F8aiUr");
        ea.a.p("dDB5NHo-ZD52PgFlQEMickplPHQaY1dsET0=", "fbEHDZpU");
        getCurrentScale();
        ea.a.p("FkNU", "wL48fCXn");
        ea.a.p("AjB6NE0-XD5MPkdjCGwzIDRvRT0=", "D8afxvPN");
        Math.pow(getMaxScale() / getMinScale(), 1.0f / this.U);
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.U));
    }

    public final void l(float f10, float f11) {
        if (this.f24333y == null) {
            return;
        }
        float abs = Math.abs(f10 - this.f24325q);
        float abs2 = Math.abs(this.f24326r - f11);
        if (abs >= 4.0f || abs2 >= 4.0f) {
            Path path = this.f24333y;
            float f12 = this.f24325q;
            float f13 = this.f24326r;
            path.quadTo(f12, f13, (f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            this.A = false;
            this.f24325q = f10;
            this.f24326r = f11;
            if (getPointMode() == TransformImageView.ModeEnum.TY) {
                this.f24331w.setStrokeWidth(this.f24327s / getCurrentScale());
            } else if (getPointMode() == TransformImageView.ModeEnum.XP) {
                this.f24331w.setStrokeWidth(this.f24328t / getCurrentScale());
            }
            this.f24330v.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            this.f24330v.drawPath(this.f24333y, this.f24331w);
        }
    }

    public final void m() {
        Path path = this.f24333y;
        if (path != null && this.f24330v != null) {
            path.lineTo(this.f24325q, this.f24326r);
            this.f24330v.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            this.f24330v.drawPath(this.f24333y, this.f24331w);
            TransformImageView.C.add(this.f24334z);
            this.f24333y = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f24329u != null) {
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.drawBitmap(this.f24329u, this.f24315g, null);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        this.V = motionEvent.getPointerCount();
        if (getEditMode() == TransformImageView.EditMode.TUYA) {
            if (this.T) {
                this.N.onTouchEvent(motionEvent);
            }
            if (this.V > 1) {
                if (this.f24333y != null) {
                    PathMeasure pathMeasure = new PathMeasure(this.f24333y, false);
                    m();
                    if (pathMeasure.getLength() < 600.0f && (arrayList = TransformImageView.C) != null && arrayList.size() > 0) {
                        ArrayList arrayList2 = TransformImageView.C;
                        arrayList2.remove(arrayList2.size() - 1);
                        this.f24330v.drawColor(0, PorterDuff.Mode.CLEAR);
                        Iterator it = TransformImageView.C.iterator();
                        while (it.hasNext()) {
                            TransformImageView.a aVar = (TransformImageView.a) it.next();
                            this.f24330v.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                            this.f24330v.drawPath(aVar.f24337a, aVar.f24338b);
                        }
                        invalidate();
                    }
                }
                if (motionEvent.getPointerCount() > 1) {
                    this.P.onTouchEvent(motionEvent);
                    this.Q = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                    this.R = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                }
                if ((motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC) == 6) {
                    setImageToWrapCropBounds(true);
                }
            } else {
                try {
                    float x4 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    int action = motionEvent.getAction();
                    Matrix matrix = this.f24315g;
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                Matrix matrix2 = new Matrix();
                                matrix.invert(matrix2);
                                float[] fArr = {x4, y10};
                                matrix2.mapPoints(fArr);
                                l(fArr[0], fArr[1]);
                                invalidate();
                            }
                        } else {
                            m();
                            if (this.A) {
                                TransformImageView.C.clear();
                            }
                            invalidate();
                        }
                    } else {
                        this.f24333y = new Path();
                        this.f24334z = new TransformImageView.a();
                        if (getPointMode() == TransformImageView.ModeEnum.TY) {
                            d();
                        } else {
                            e();
                        }
                        TransformImageView.a aVar2 = this.f24334z;
                        aVar2.f24337a = this.f24333y;
                        aVar2.f24338b = this.f24331w;
                        Matrix matrix3 = new Matrix();
                        matrix.invert(matrix3);
                        float[] fArr2 = {x4, y10};
                        matrix3.mapPoints(fArr2);
                        float f10 = fArr2[0];
                        float f11 = fArr2[1];
                        this.f24333y.moveTo(f10, f11);
                        this.f24325q = f10;
                        this.f24326r = f11;
                        invalidate();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return true;
        } else if (getEditMode() != TransformImageView.EditMode.ROTATE) {
            return false;
        } else {
            try {
                if ((motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC) == 0) {
                    removeCallbacks(this.I);
                    removeCallbacks(this.J);
                }
                if (motionEvent.getPointerCount() > 1) {
                    this.Q = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                    this.R = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                }
                this.P.onTouchEvent(motionEvent);
                if (this.T) {
                    this.N.onTouchEvent(motionEvent);
                }
                if (this.S) {
                    this.O.a(motionEvent);
                }
                if ((motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC) == 1) {
                    setImageToWrapCropBounds(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return true;
        }
    }

    public void setDoubleTapScaleSteps(int i10) {
        this.U = i10;
    }

    public void setRotateEnabled(boolean z10) {
        this.S = z10;
    }

    public void setScaleEnabled(boolean z10) {
        this.T = z10;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.S = true;
        this.T = true;
        this.U = 5;
    }

    public void setApplyCallback(TransformImageView.c cVar) {
    }
}
