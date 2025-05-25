package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ReaderAIPreviewActivity.java */
/* loaded from: classes3.dex */
public final class l1 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderAIPreviewActivity f24619a;

    public l1(ReaderAIPreviewActivity readerAIPreviewActivity) {
        this.f24619a = readerAIPreviewActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f24619a.f24502q0.setVisibility(8);
    }
}
