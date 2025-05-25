package dj;

import lib.zj.office.wp.control.Word;

/* compiled from: Word.java */
/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f16239a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Word f16240b;

    public f(Word word, boolean z10) {
        this.f16240b = word;
        this.f16239a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Word word = this.f16240b;
        if (word.f21097e == 1) {
            word.scrollTo(0, word.getScrollY());
        }
        word.f21110r.H(this.f16239a);
        word.postInvalidate();
    }
}
