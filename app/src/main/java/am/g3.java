package am;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIErrorRetryView;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;

/* compiled from: ListItemAiChatSendBinding.java */
/* loaded from: classes3.dex */
public final class g3 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f936a;

    /* renamed from: b  reason: collision with root package name */
    public final AIErrorRetryView f937b;
    public final AppCompatImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final ProgressView f938d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f939e;

    public g3(LinearLayout linearLayout, AIErrorRetryView aIErrorRetryView, AppCompatImageView appCompatImageView, ProgressView progressView, TextView textView) {
        this.f936a = linearLayout;
        this.f937b = aIErrorRetryView;
        this.c = appCompatImageView;
        this.f938d = progressView;
        this.f939e = textView;
    }

    @Override // i2.a
    public final View b() {
        return this.f936a;
    }
}
