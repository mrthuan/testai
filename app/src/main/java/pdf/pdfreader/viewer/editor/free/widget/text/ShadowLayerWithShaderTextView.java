package pdf.pdfreader.viewer.editor.free.widget.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ea.a;
import kotlin.jvm.internal.g;

/* compiled from: ShadowLayerWithShaderTextView.kt */
/* loaded from: classes3.dex */
public class ShadowLayerWithShaderTextView extends AppCompatTextView {

    /* renamed from: h  reason: collision with root package name */
    public float f28851h;

    /* renamed from: i  reason: collision with root package name */
    public float f28852i;

    /* renamed from: j  reason: collision with root package name */
    public float f28853j;

    /* renamed from: k  reason: collision with root package name */
    public int f28854k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f28855l;

    /* renamed from: m  reason: collision with root package name */
    public Shader f28856m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowLayerWithShaderTextView(Context context) {
        this(context, null, 6, 0);
        g.e(context, a.p("Lm8KdDB4dA==", "2zMdUH6J"));
    }

    public final void l() {
        if (this.f28855l) {
            this.f28855l = false;
            return;
        }
        this.f28854k = getShadowColor();
        this.f28852i = getShadowDx();
        this.f28853j = getShadowDy();
        this.f28851h = getShadowRadius();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        g.e(canvas, "canvas");
        getPaint().setShadowLayer(this.f28851h, this.f28852i, this.f28853j, this.f28854k);
        this.f28856m = getPaint().getShader();
        getPaint().setShader(null);
        super.onDraw(canvas);
        this.f28855l = true;
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f28856m);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView
    public final void setShadowLayer(float f10, float f11, float f12, int i10) {
        super.setShadowLayer(f10, f11, f12, i10);
        l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowLayerWithShaderTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, a.p("LG9fdBx4dA==", "PM3Fn3nX"));
    }

    public /* synthetic */ ShadowLayerWithShaderTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowLayerWithShaderTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("LG9fdBx4dA==", "c3gBUUyC"));
        l();
    }
}
