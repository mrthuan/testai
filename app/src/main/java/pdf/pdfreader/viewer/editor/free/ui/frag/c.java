package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.frag.b;

/* compiled from: PdfReaderFilesFragment.java */
/* loaded from: classes3.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f28026a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f28027b = false;
    public final /* synthetic */ Runnable c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f28028d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f28029e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f28030f;

    public c(b bVar, b.a aVar, int i10, int i11) {
        this.f28030f = bVar;
        this.c = aVar;
        this.f28028d = i10;
        this.f28029e = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() > 0.5f && !this.f28026a) {
            this.f28026a = true;
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
        if (valueAnimator.getAnimatedFraction() > 0.45f && !this.f28027b) {
            this.f28027b = true;
            b bVar = this.f28030f;
            a aVar = bVar.f28024f;
            int[] iArr = aVar.f28018x0;
            int i10 = this.f28028d;
            int i11 = iArr[i10];
            androidx.fragment.app.u i12 = aVar.i();
            if (i12 instanceof ReaderHomeActivity) {
                boolean z10 = bVar.f28023e;
                a aVar2 = bVar.f28024f;
                if (z10) {
                    a.z0(aVar2, i11);
                    return;
                }
                if (i10 == 0) {
                    int i13 = aVar2.f28018x0[1];
                    TabLayout tabLayout = aVar2.f27999e0;
                    if (tabLayout != null) {
                        tabLayout.setSelectedTabIndicatorColor(i13);
                    }
                } else if (this.f28029e == 0) {
                    int i14 = aVar2.f28018x0[0];
                    TabLayout tabLayout2 = aVar2.f27999e0;
                    if (tabLayout2 != null) {
                        tabLayout2.setSelectedTabIndicatorColor(i14);
                    }
                }
                ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) i12;
                if (readerHomeActivity.f26704y1 != 3) {
                    View view = readerHomeActivity.F;
                    if (view != null) {
                        view.setBackgroundColor(i11);
                    }
                    AppBarLayout appBarLayout = readerHomeActivity.G;
                    if (appBarLayout != null) {
                        appBarLayout.setBackgroundColor(i11);
                    }
                }
            }
        }
    }
}
