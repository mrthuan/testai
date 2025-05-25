package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import i2.a;

/* loaded from: classes3.dex */
public abstract class BaseBindingFrameLayout<V extends i2.a> extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public V f24761a;

    public BaseBindingFrameLayout(Context context) {
        super(context);
        this.f24761a = a(LayoutInflater.from(context));
        b(context);
    }

    public abstract V a(LayoutInflater layoutInflater);

    public abstract void b(Context context);

    public BaseBindingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24761a = a(LayoutInflater.from(context));
        b(context);
    }

    public BaseBindingFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f24761a = a(LayoutInflater.from(context));
        b(context);
    }
}
