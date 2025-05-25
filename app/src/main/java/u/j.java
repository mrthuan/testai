package u;

import java.lang.ref.WeakReference;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30102a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f30103b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f30104d;

    public /* synthetic */ j(Object obj, int i10, Object obj2, int i11) {
        this.f30102a = i11;
        this.c = obj;
        this.f30103b = i10;
        this.f30104d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:7:0x002c, B:14:0x003e, B:15:0x0047), top: B:49:0x002c }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f30102a
            r1 = 1
            r2 = 0
            r3 = 0
            int r4 = r7.f30103b
            java.lang.Object r5 = r7.f30104d
            java.lang.Object r6 = r7.c
            switch(r0) {
                case 0: goto Lc4;
                case 1: goto Lbe;
                case 2: goto L55;
                case 3: goto L10;
                default: goto Le;
            }
        Le:
            goto Lcc
        L10:
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity$c r6 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity.c) r6
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity r5 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity) r5
            java.lang.String r0 = "O2hYc10w"
            java.lang.String r2 = "hhoc1y1l"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.e(r6, r0)
            java.lang.String r0 = "R2gic1cx"
            java.lang.String r2 = "riO5vjdu"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.e(r5, r0)
            if (r4 < 0) goto L3b
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity$a r0 = pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity.f25491w0     // Catch: java.lang.Throwable -> L39
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a r0 = r5.b3()     // Catch: java.lang.Throwable -> L39
            int r0 = r0.getItemCount()     // Catch: java.lang.Throwable -> L39
            if (r4 >= r0) goto L3b
            goto L3c
        L39:
            r0 = move-exception
            goto L4d
        L3b:
            r1 = r3
        L3c:
            if (r1 == 0) goto L47
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity$a r0 = pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity.f25491w0     // Catch: java.lang.Throwable -> L39
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a r0 = r5.b3()     // Catch: java.lang.Throwable -> L39
            r0.notifyItemChanged(r4)     // Catch: java.lang.Throwable -> L39
        L47:
            tf.d r0 = tf.d.f30009a     // Catch: java.lang.Throwable -> L39
            kotlin.Result.m13constructorimpl(r0)     // Catch: java.lang.Throwable -> L39
            goto L54
        L4d:
            kotlin.Result$Failure r0 = androidx.activity.s.v(r0)
            kotlin.Result.m13constructorimpl(r0)
        L54:
            return
        L55:
            pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment r6 = (pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment) r6
            androidx.viewpager2.widget.ViewPager2 r5 = (androidx.viewpager2.widget.ViewPager2) r5
            java.lang.String r0 = "R2gic1cw"
            java.lang.String r1 = "OYG0us66"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.e(r6, r0)
            java.lang.String r0 = "c3YPZUBQGGctcg=="
            java.lang.String r1 = "FKWf7ykh"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.e(r5, r0)
            pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment$a r0 = pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment.f24996h0
            boolean r0 = r6.Z
            if (r0 != 0) goto L76
            goto Lbd
        L76:
            android.view.View r0 = r5.getChildAt(r3)
            boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView
            if (r1 == 0) goto L81
            r2 = r0
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
        L81:
            if (r2 == 0) goto Lbd
            androidx.recyclerview.widget.RecyclerView$m r0 = r2.getLayoutManager()
            if (r0 == 0) goto Lbd
            android.view.View r0 = r0.C(r4)
            if (r0 == 0) goto Lbd
            r1 = 2131364215(0x7f0a0977, float:1.834826E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 4
            if (r1 != 0) goto L9c
            goto L9f
        L9c:
            r1.setVisibility(r2)
        L9f:
            r1 = 2131364148(0x7f0a0934, float:1.8348125E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 != 0) goto Lab
            goto Lae
        Lab:
            r1.setVisibility(r2)
        Lae:
            r1 = 2131362038(0x7f0a00f6, float:1.8343845E38)
            android.view.View r0 = r0.findViewById(r1)
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            if (r0 != 0) goto Lba
            goto Lbd
        Lba:
            r0.setVisibility(r2)
        Lbd:
            return
        Lbe:
            androidx.profileinstaller.c$c r6 = (androidx.profileinstaller.c.InterfaceC0021c) r6
            r6.b(r4, r5)
            return
        Lc4:
            u.n r6 = (u.n) r6
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6.onGreatestScrollPercentageIncreased(r4, r5)
            return
        Lcc:
            pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity r6 = (pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity) r6
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.String r0 = pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity.f26794c0
            r6.getClass()
            java.lang.Object r0 = r5.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r3 = r6.getString(r4)
            r4 = -1
            pdf.pdfreader.viewer.editor.free.utils.j1.e(r0, r3, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.j.run():void");
    }

    public /* synthetic */ j(ReaderSearchActivity readerSearchActivity, WeakReference weakReference, int i10) {
        this.f30102a = 4;
        this.c = readerSearchActivity;
        this.f30104d = weakReference;
        this.f30103b = i10;
    }
}
