package lib.zj.reflow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.i;
import androidx.appcompat.widget.z0;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class ReflowLoadingView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f21746a;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReflowLoadingView.this.a();
        }
    }

    public ReflowLoadingView(Context context) {
        this(context, null);
    }

    public final void a() {
        ImageView imageView = this.f21746a;
        if (imageView != null) {
            imageView.setRotation(0.0f);
            imageView.animate().rotation(360.0f).setDuration(1000L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new a()).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f21746a;
        if (imageView != null) {
            imageView.animate().cancel();
            imageView.setRotation(0.0f);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            post(new z0(this, 19));
        } else {
            post(new i(this, 24));
        }
    }

    public ReflowLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReflowLoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        setLayerType(1, null);
        View.inflate(context, R.layout.reflow_loading, this);
        setOrientation(1);
        setGravity(17);
        this.f21746a = (ImageView) findViewById(R.id.reflow_loading_iv);
    }
}
