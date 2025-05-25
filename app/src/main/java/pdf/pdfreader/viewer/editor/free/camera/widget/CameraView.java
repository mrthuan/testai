package pdf.pdfreader.viewer.editor.free.camera.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: CameraView.kt */
/* loaded from: classes3.dex */
public final class CameraView extends ViewGroup implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f24110l = 0;

    /* renamed from: a  reason: collision with root package name */
    public GestureDetector f24111a;

    /* renamed from: b  reason: collision with root package name */
    public ScaleGestureDetector f24112b;
    public b c;

    /* renamed from: d  reason: collision with root package name */
    public sl.a f24113d;

    /* renamed from: e  reason: collision with root package name */
    public a f24114e;

    /* renamed from: f  reason: collision with root package name */
    public CameraSurfaceView f24115f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f24116g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f24117h;

    /* renamed from: i  reason: collision with root package name */
    public int f24118i;

    /* renamed from: j  reason: collision with root package name */
    public AnimatorSet f24119j;

    /* renamed from: k  reason: collision with root package name */
    public AnimatorSet f24120k;

    /* compiled from: CameraView.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void c();

        void e();
    }

    /* compiled from: CameraView.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void b(float f10);

        void d(float f10, float f11, pdf.pdfreader.viewer.editor.free.camera.widget.a aVar);
    }

    /* compiled from: CameraView.kt */
    /* loaded from: classes3.dex */
    public interface c {
        void a(boolean z10);

        void b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraView(Context context) {
        this(context, null);
        g.e(context, ea.a.p("LG9fdBx4dA==", "IcnYcZxQ"));
    }

    public final int getFocusViewId() {
        return this.f24118i;
    }

    public final SurfaceHolder getSurfaceHolder() {
        CameraSurfaceView cameraSurfaceView = this.f24115f;
        if (cameraSurfaceView != null) {
            return cameraSurfaceView.getHolder();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f24119j;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f24120k;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f24117h.removeCallbacksAndMessages(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight();
                int measuredWidth = childAt.getMeasuredWidth();
                sl.a aVar = this.f24113d;
                int i19 = aVar.f29824b;
                if (measuredHeight >= i19) {
                    i15 = measuredHeight + i11;
                    i14 = i11;
                } else {
                    i14 = ((i19 + i11) - measuredHeight) / 2;
                    i15 = measuredHeight + i14;
                }
                int i20 = aVar.f29823a;
                if (measuredWidth < i20) {
                    i16 = (i20 - measuredWidth) / 2;
                    i17 = measuredWidth + i16;
                } else {
                    i16 = i10;
                    i17 = i12;
                }
                if (childAt.getId() == this.f24118i) {
                    ea.a.p("cGEmZQFhNGkXdw==", "5QZcUdsF");
                    return;
                }
                childAt.layout(i16, i14, i17, i15);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChildren(i10, i11);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        g.e(detector, "detector");
        b bVar = this.c;
        if (bVar != null) {
            bVar.b(detector.getScaleFactor());
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        g.e(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        g.e(detector, "detector");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        g.e(event, "event");
        GestureDetector gestureDetector = this.f24111a;
        if (gestureDetector != null) {
            if (gestureDetector.onTouchEvent(event)) {
                return true;
            }
            ScaleGestureDetector scaleGestureDetector = this.f24112b;
            if (scaleGestureDetector != null) {
                return scaleGestureDetector.onTouchEvent(event);
            }
            g.i(ea.a.p("FmMCbBRHMHM8dRRlcGUjZVt0PXI=", "XhecqU1s"));
            throw null;
        }
        g.i(ea.a.p("VGU4dAZyB0QXdFFjHW9y", "u1Rc0J0U"));
        throw null;
    }

    public final void setCameraPreviewSize(sl.a previewSize) {
        CameraSurfaceView cameraSurfaceView;
        g.e(previewSize, "previewSize");
        if (previewSize.f29823a > 0 && previewSize.f29824b > 0 && (cameraSurfaceView = this.f24115f) != null) {
            cameraSurfaceView.setCameraPreviewSize(previewSize);
        }
    }

    public final void setCameraViewListener(a listener) {
        g.e(listener, "listener");
        this.f24114e = listener;
    }

    public final void setFocusViewId(int i10) {
        this.f24118i = i10;
    }

    public final void setGestureListener(b listener) {
        g.e(listener, "listener");
        this.c = listener;
    }

    public final void setUserSeePreviewSize(sl.a bestPreviewSize) {
        g.e(bestPreviewSize, "bestPreviewSize");
        this.f24113d = bestPreviewSize;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "yOoOUKgS"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "uVka2HQ5"));
        this.f24113d = new sl.a(1080, 1920);
        this.f24117h = new Handler(Looper.getMainLooper());
        this.f24118i = 16716340;
        CameraSurfaceView cameraSurfaceView = new CameraSurfaceView(context);
        addView(cameraSurfaceView, new ViewGroup.LayoutParams(-1, -1));
        this.f24115f = cameraSurfaceView;
        ImageView imageView = new ImageView(context);
        this.f24116g = imageView;
        imageView.setId(this.f24118i);
        ea.a.p("cGEmZQFhNGkXdw==", "2KpS10Kc");
        ImageView imageView2 = this.f24116g;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
            ImageView imageView3 = this.f24116g;
            if (imageView3 != null) {
                imageView3.setBackgroundResource(R.drawable.camera_tap_focus_selector);
                int i11 = (int) ((context.getResources().getDisplayMetrics().density * 80.0f) + 0.5f);
                View view = this.f24116g;
                if (view != null) {
                    addView(view, i11, i11);
                    SurfaceHolder holder = cameraSurfaceView.getHolder();
                    if (holder != null) {
                        holder.addCallback(new pdf.pdfreader.viewer.editor.free.camera.widget.b(this));
                    }
                    this.f24111a = new GestureDetector(context, new pdf.pdfreader.viewer.editor.free.camera.widget.c(this, cameraSurfaceView, i11));
                    this.f24112b = new ScaleGestureDetector(context, this);
                    return;
                }
                g.i(ea.a.p("KW8tdRRWLWV3", "9LONgDbF"));
                throw null;
            }
            g.i(ea.a.p("V28rdQJWO2V3", "8W1HqRmf"));
            throw null;
        }
        g.i(ea.a.p("J28QdRxWPmV3", "dqAsoWxp"));
        throw null;
    }
}
