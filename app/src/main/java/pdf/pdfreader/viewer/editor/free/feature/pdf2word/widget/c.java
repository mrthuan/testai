package pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget;

import am.x1;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.text.j;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PreviewPageManageGuideView.kt */
/* loaded from: classes3.dex */
public final class c extends kl.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f25614a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x1 f25615b;
    public final /* synthetic */ PreviewPageManageGuideView c;

    public c(String str, x1 x1Var, PreviewPageManageGuideView previewPageManageGuideView) {
        this.f25614a = str;
        this.f25615b = x1Var;
        this.c = previewPageManageGuideView;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            String p10 = ea.a.p("c2I-", "FkEo2ErQ");
            String str = this.f25614a;
            int V = k.V(str, p10, 0, false, 6);
            k.V(str, ea.a.p("cy9TPg==", "UhxI4vvu"), 0, false, 6);
            float measureText = textPaint.measureText(j.K(j.K(str, ea.a.p("c2I-", "AOnyJVBR"), ""), ea.a.p("cy9TPg==", "iynULb4I"), ""), 0, V);
            float measuredWidth = ((AppCompatTextView) this.f25615b.f1646d).getMeasuredWidth();
            float textSize = textPaint.getTextSize();
            PreviewPageManageGuideView previewPageManageGuideView = this.c;
            textPaint.setShader(new LinearGradient(measureText, 0.0f, measuredWidth, textSize, androidx.core.content.a.getColor(previewPageManageGuideView.getContext(), R.color.color_100_FFBD51), androidx.core.content.a.getColor(previewPageManageGuideView.getContext(), R.color.color_100_FF5532), Shader.TileMode.CLAMP));
        }
    }
}
