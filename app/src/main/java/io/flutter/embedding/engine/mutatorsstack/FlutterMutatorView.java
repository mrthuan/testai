package io.flutter.embedding.engine.mutatorsstack;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import p001if.b;
import t5.g;

@TargetApi(19)
/* loaded from: classes.dex */
public class FlutterMutatorView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public FlutterMutatorsStack f18643a;

    /* renamed from: b  reason: collision with root package name */
    public final float f18644b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f18645d;

    /* renamed from: e  reason: collision with root package name */
    public int f18646e;

    /* renamed from: f  reason: collision with root package name */
    public int f18647f;

    /* renamed from: g  reason: collision with root package name */
    public final io.flutter.embedding.android.a f18648g;

    /* renamed from: h  reason: collision with root package name */
    public a f18649h;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnFocusChangeListener f18650a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f18651b;

        public a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f18650a = onFocusChangeListener;
            this.f18651b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public final void onGlobalFocusChanged(View view, View view2) {
            g gVar = new g(10);
            View view3 = this.f18651b;
            this.f18650a.onFocusChange(view3, b.b(view3, gVar));
        }
    }

    public FlutterMutatorView(Context context, float f10, io.flutter.embedding.android.a aVar) {
        super(context, null);
        this.f18644b = f10;
        this.f18648g = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f18643a.getFinalMatrix());
        float f10 = this.f18644b;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate(-this.c, -this.f18645d);
        return matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f18643a.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset(-this.c, -this.f18645d);
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        io.flutter.embedding.android.a aVar = this.f18648g;
        if (aVar == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                matrix.postTranslate(this.c, this.f18645d);
            } else {
                matrix.postTranslate(this.f18646e, this.f18647f);
                this.f18646e = this.c;
                this.f18647f = this.f18645d;
            }
        } else {
            int i10 = this.c;
            this.f18646e = i10;
            int i11 = this.f18645d;
            this.f18647f = i11;
            matrix.postTranslate(i10, i11);
        }
        aVar.c(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getImportantForAccessibility() == 4) {
            return false;
        }
        return super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        a aVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (aVar = this.f18649h) != null) {
            this.f18649h = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f18649h == null) {
            a aVar2 = new a(onFocusChangeListener, this);
            this.f18649h = aVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(aVar2);
        }
    }

    public FlutterMutatorView(Context context) {
        this(context, 1.0f, null);
    }
}
