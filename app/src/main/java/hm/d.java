package hm;

import android.graphics.Matrix;
import android.view.MotionEvent;
import pdf.pdfreader.viewer.editor.free.edit.image.myview.GestureCropImageView;

/* compiled from: RotationGestureDetector.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public float f18375a;

    /* renamed from: b  reason: collision with root package name */
    public float f18376b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f18377d;

    /* renamed from: e  reason: collision with root package name */
    public int f18378e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f18379f = -1;

    /* renamed from: g  reason: collision with root package name */
    public float f18380g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18381h;

    /* renamed from: i  reason: collision with root package name */
    public final a f18382i;

    /* compiled from: RotationGestureDetector.java */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* compiled from: RotationGestureDetector.java */
    /* loaded from: classes3.dex */
    public static class b implements a {
    }

    public d(GestureCropImageView.b bVar) {
        this.f18382i = bVar;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            this.f18379f = -1;
                            return;
                        }
                        return;
                    }
                    this.f18375a = motionEvent.getX();
                    this.f18376b = motionEvent.getY();
                    this.f18379f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    this.f18380g = 0.0f;
                    this.f18381h = true;
                    return;
                } else if (this.f18378e != -1 && this.f18379f != -1 && motionEvent.getPointerCount() > this.f18379f) {
                    float x4 = motionEvent.getX(this.f18378e);
                    float y10 = motionEvent.getY(this.f18378e);
                    float x10 = motionEvent.getX(this.f18379f);
                    float y11 = motionEvent.getY(this.f18379f);
                    if (this.f18381h) {
                        this.f18380g = 0.0f;
                        this.f18381h = false;
                    } else {
                        float f10 = this.f18375a;
                        float degrees = (((float) Math.toDegrees((float) Math.atan2(y11 - y10, x10 - x4))) % 360.0f) - (((float) Math.toDegrees((float) Math.atan2(this.f18376b - this.f18377d, f10 - this.c))) % 360.0f);
                        this.f18380g = degrees;
                        if (degrees < -180.0f) {
                            this.f18380g = degrees + 360.0f;
                        } else if (degrees > 180.0f) {
                            this.f18380g = degrees - 360.0f;
                        }
                    }
                    a aVar = this.f18382i;
                    if (aVar != null) {
                        float f11 = this.f18380g;
                        GestureCropImageView gestureCropImageView = GestureCropImageView.this;
                        float f12 = gestureCropImageView.Q;
                        float f13 = gestureCropImageView.R;
                        if (f11 != 0.0f) {
                            Matrix matrix = gestureCropImageView.f24315g;
                            matrix.postRotate(f11, f12, f13);
                            gestureCropImageView.setImageMatrix(matrix);
                        }
                    }
                    this.f18375a = x10;
                    this.f18376b = y11;
                    this.c = x4;
                    this.f18377d = y10;
                    return;
                } else {
                    return;
                }
            }
            this.f18378e = -1;
            return;
        }
        this.c = motionEvent.getX();
        this.f18377d = motionEvent.getY();
        this.f18378e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        this.f18380g = 0.0f;
        this.f18381h = true;
    }
}
