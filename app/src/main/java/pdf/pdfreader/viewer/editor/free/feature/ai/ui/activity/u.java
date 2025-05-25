package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.view.View;
import android.widget.ImageView;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;

/* compiled from: AIChatActivity.kt */
/* loaded from: classes3.dex */
public final class u extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AIChatActivity f24656b;

    public u(AIChatActivity aIChatActivity) {
        this.f24656b = aIChatActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        AIChatActivity.a aVar = AIChatActivity.f24356v0;
        AIChatActivity aIChatActivity = this.f24656b;
        aIChatActivity.y2();
        ImageView imageView = aIChatActivity.I;
        if (imageView != null) {
            imageView.performClick();
        }
    }
}
