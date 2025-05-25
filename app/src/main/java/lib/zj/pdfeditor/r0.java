package lib.zj.pdfeditor;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: Stepper.java */
/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final View f21573a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f21574b;
    public boolean c = false;

    /* compiled from: Stepper.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r0 r0Var = r0.this;
            r0Var.c = false;
            r0Var.f21574b.run();
        }
    }

    public r0(View view, Runnable runnable) {
        this.f21573a = view;
        this.f21574b = runnable;
    }

    @SuppressLint({"NewApi"})
    public final void a() {
        if (!this.c) {
            this.c = true;
            this.f21573a.postOnAnimation(new a());
        }
    }
}
