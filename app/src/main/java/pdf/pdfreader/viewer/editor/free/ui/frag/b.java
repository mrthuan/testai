package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import industries.deepthought.decode.Decoder;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: PdfReaderFilesFragment.java */
/* loaded from: classes3.dex */
public final class b implements ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    public int f28020a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f28021b = 0;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f28022d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f28023e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ pdf.pdfreader.viewer.editor.free.ui.frag.a f28024f;

    /* compiled from: PdfReaderFilesFragment.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = bVar.f28024f;
            int i10 = bVar.f28021b;
            ro.c cVar = pdf.pdfreader.viewer.editor.free.ui.frag.a.f27997y0;
            aVar.B0(i10);
            pdf.pdfreader.viewer.editor.free.ui.frag.a.y0(bVar.f28024f, bVar.f28021b);
        }
    }

    public b(pdf.pdfreader.viewer.editor.free.ui.frag.a aVar, boolean z10) {
        this.f28024f = aVar;
        this.f28023e = z10;
    }

    public final void a(int i10, int i11, a aVar) {
        this.f28022d.cancel();
        this.f28022d.removeAllUpdateListeners();
        this.f28022d.addUpdateListener(new c(this, aVar, i11, i10));
        this.f28022d.start();
    }

    public final void b() {
        if (this.f28022d == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f28022d = ofFloat;
            ofFloat.setDuration(150L);
            this.f28022d.setInterpolator(new LinearInterpolator());
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i10) {
        this.f28020a = i10;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i10, float f10, int i11) {
        int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        boolean z10 = this.f28023e;
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.f28024f;
        if (i12 == 0 && i11 == 0) {
            this.c = i10;
            androidx.fragment.app.u i13 = aVar.i();
            if (i13 instanceof ReaderHomeActivity) {
                int[] iArr = aVar.f28018x0;
                int i14 = iArr[i10];
                if (z10) {
                    TabLayout tabLayout = aVar.f27999e0;
                    if (tabLayout != null) {
                        tabLayout.setSelectedTabIndicatorColor(i14);
                    }
                } else {
                    if (i10 == 0) {
                        int i15 = iArr[1];
                        TabLayout tabLayout2 = aVar.f27999e0;
                        if (tabLayout2 != null) {
                            tabLayout2.setSelectedTabIndicatorColor(i15);
                        }
                    } else {
                        int i16 = iArr[0];
                        TabLayout tabLayout3 = aVar.f27999e0;
                        if (tabLayout3 != null) {
                            tabLayout3.setSelectedTabIndicatorColor(i16);
                        }
                    }
                    ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) i13;
                    if (readerHomeActivity.f26704y1 != 3) {
                        View view = readerHomeActivity.F;
                        if (view != null) {
                            view.setBackgroundColor(i14);
                        }
                        AppBarLayout appBarLayout = readerHomeActivity.G;
                        if (appBarLayout != null) {
                            appBarLayout.setBackgroundColor(i14);
                        }
                    }
                }
                aVar.B0(i10);
                pdf.pdfreader.viewer.editor.free.ui.frag.a.y0(aVar, i10);
            }
        }
        int i17 = this.f28020a;
        if (i17 == 2) {
            if (this.f28021b != this.c) {
                b();
                a(this.c, this.f28021b, new a());
                this.c = this.f28021b;
            }
        } else if (i17 == 1) {
            int i18 = this.c;
            if (i18 == i10) {
                if (f10 > 0.5f) {
                    b();
                    int i19 = i10 + 1;
                    a(i10, i19, null);
                    pdf.pdfreader.viewer.editor.free.ui.frag.a.y0(aVar, i19);
                    if (!z10 && i10 == 0 && (aVar.i() instanceof ReaderHomeActivity)) {
                        ((ReaderHomeActivity) aVar.i()).j2(1);
                    }
                    this.c = i19;
                }
            } else if (i18 > i10 && f10 < 0.5f) {
                b();
                a(this.c, i10, null);
                pdf.pdfreader.viewer.editor.free.ui.frag.a.y0(aVar, i10);
                if (!z10 && i10 == 0 && (aVar.i() instanceof ReaderHomeActivity)) {
                    ((ReaderHomeActivity) aVar.i()).j2(0);
                }
                this.c = i10;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i10) {
        this.f28021b = i10;
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.f28024f;
        Context r4 = aVar.r();
        if (r4 != null) {
            if (Decoder.f18572a) {
                yc.a.c(r4);
                ad.a.c(r4);
            } else {
                ReaderPdfApplication.o(r4);
            }
        }
        aVar.f28014t0 = pdf.pdfreader.viewer.editor.free.ui.frag.a.E0(i10);
        q0.x(aVar.r(), i10, "home_page_last_index");
    }
}
