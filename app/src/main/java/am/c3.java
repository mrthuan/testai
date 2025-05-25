package am;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView;

/* compiled from: ListItemAiChatAnswerBinding.java */
/* loaded from: classes3.dex */
public final class c3 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f798a;

    /* renamed from: b  reason: collision with root package name */
    public final AIAnswerView f799b;
    public final TextView c;

    public c3(LinearLayout linearLayout, AIAnswerView aIAnswerView, TextView textView) {
        this.f798a = linearLayout;
        this.f799b = aIAnswerView;
        this.c = textView;
    }

    @Override // i2.a
    public final View b() {
        return this.f798a;
    }
}
