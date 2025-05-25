package c7;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c7.p;
import java.lang.ref.WeakReference;
import java.util.Map;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b;
import y6.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements p.a, dn.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f5650a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5651b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f5652d;

    public /* synthetic */ o(Object obj, Context context, Object obj2, bn.a aVar) {
        this.f5650a = obj;
        this.f5651b = context;
        this.c = obj2;
        this.f5652d = aVar;
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        p pVar = (p) this.f5650a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        pVar.getClass();
        return (y6.a) p.l(sQLiteDatabase.rawQuery((String) this.f5651b, new String[0]), new c5.f(pVar, (Map) this.c, (a.C0418a) this.f5652d));
    }

    @Override // dn.b
    public final void h(bn.a aVar, Bitmap bitmap, boolean z10) {
        Bitmap bitmap2;
        b.a aVar2 = (b.a) this.f5650a;
        Context context = (Context) this.f5651b;
        pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b bVar = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b) this.c;
        bn.a aVar3 = (bn.a) this.f5652d;
        kotlin.jvm.internal.g.e(aVar2, ea.a.p("F2gkbBdlcg==", "nfaLUjjU"));
        ImageView imageView = aVar2.c;
        kotlin.jvm.internal.g.e(bVar, ea.a.p("JWgbc0kw", "qzQrmhfv"));
        kotlin.jvm.internal.g.e(aVar3, ea.a.p("a2lcYR5l", "PLZuQrs4"));
        try {
            if (imageView.getContext() instanceof Activity) {
                Context context2 = imageView.getContext();
                kotlin.jvm.internal.g.c(context2, ea.a.p("X3U0bGJjCG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBFeShlYmEHZDpvD2QaYSdwFkExdCB2X3R5", "9R1XBiYK"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b((Activity) context2)) {
                    return;
                }
            }
            int i10 = aVar.f5491e;
            if (kotlin.jvm.internal.g.a("longImage_" + i10, imageView.getTag())) {
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    aVar.a(width + ":" + height);
                }
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
                    bVar2.G = aVar3.f5494h;
                    imageView.setLayoutParams(bVar2);
                    aVar.f5490d = new WeakReference<>(bitmap);
                    com.bumptech.glide.f f10 = com.bumptech.glide.b.c(context).f(context);
                    WeakReference<Bitmap> weakReference = aVar.f5490d;
                    if (weakReference != null) {
                        bitmap2 = weakReference.get();
                    } else {
                        bitmap2 = null;
                    }
                    f10.l(bitmap2).n(SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID).i().E(imageView);
                    aVar2.f25465b.setVisibility(8);
                    bVar.h(aVar2);
                    return;
                }
                throw new NullPointerException(ea.a.p("PnU0bGFjKG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAkeShlYWEnZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdzlkP2U1LgpvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyMW1z", "qHPXAImX"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
