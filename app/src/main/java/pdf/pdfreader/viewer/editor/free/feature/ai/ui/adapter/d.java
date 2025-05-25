package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter;

import am.h3;
import android.content.res.ColorStateList;
import android.widget.LinearLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;

/* compiled from: AITagViewHolder.kt */
/* loaded from: classes3.dex */
public final class d extends g<AIQuickTag, h3> {

    /* renamed from: d  reason: collision with root package name */
    public final Integer f24698d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f24699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h3 h3Var, Integer num, Integer num2) {
        super(h3Var);
        kotlin.jvm.internal.g.e(h3Var, ea.a.p("WmkBZCZuZw==", "bq8oOLJH"));
        this.f24698d = num;
        this.f24699e = num2;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g
    public final void l(int i10, AIQuickTag aIQuickTag) {
        tf.d dVar;
        AIQuickTag aIQuickTag2 = aIQuickTag;
        V v10 = this.f24704b;
        Integer num = this.f24699e;
        if (num != null) {
            int intValue = num.intValue();
            h3 h3Var = (h3) v10;
            h3Var.f961b.setImageTintList(ColorStateList.valueOf(intValue));
            h3Var.f962d.setTextColor(intValue);
        }
        h3 h3Var2 = (h3) v10;
        h3Var2.f961b.setImageResource(aIQuickTag2.getIcon());
        h3Var2.f962d.setText(aIQuickTag2.getTag());
        LinearLayout linearLayout = h3Var2.c;
        Integer num2 = this.f24698d;
        if (num2 != null) {
            linearLayout.setBackgroundResource(num2.intValue());
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            linearLayout.setBackgroundResource(R.drawable.bg_white_1e232f_r4);
        }
    }
}
