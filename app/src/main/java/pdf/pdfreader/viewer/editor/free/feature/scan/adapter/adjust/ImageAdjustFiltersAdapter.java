package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import am.l1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.f;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.f0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import ul.c;

/* compiled from: ImageAdjustFiltersAdapter.kt */
/* loaded from: classes3.dex */
public final class ImageAdjustFiltersAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    public final w f25639d;

    /* renamed from: e  reason: collision with root package name */
    public final List<ho.b> f25640e;

    /* renamed from: f  reason: collision with root package name */
    public final a f25641f;

    /* renamed from: g  reason: collision with root package name */
    public long f25642g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f25643h;

    /* compiled from: ImageAdjustFiltersAdapter.kt */
    /* loaded from: classes3.dex */
    public final class ViewHolder extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final l1 f25644b;
        public final /* synthetic */ ImageAdjustFiltersAdapter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ImageAdjustFiltersAdapter imageAdjustFiltersAdapter, l1 l1Var) {
            super(l1Var.f1066a);
            ea.a.p("UWklZBpuZw==", "wOmU360D");
            this.c = imageAdjustFiltersAdapter;
            this.f25644b = l1Var;
        }

        public final void l(ho.b aiFilter) {
            ho.b bVar;
            c cVar;
            g.e(aiFilter, "aiFilter");
            l1 l1Var = this.f25644b;
            Context context = l1Var.f1066a.getContext();
            ImageAdjustFiltersAdapter imageAdjustFiltersAdapter = this.c;
            ul.b a10 = imageAdjustFiltersAdapter.f25641f.a();
            if (a10 != null && (cVar = a10.f30420r) != null) {
                bVar = cVar.c;
            } else {
                bVar = null;
            }
            AppCompatImageView appCompatImageView = l1Var.f1069e;
            View view = l1Var.c;
            TextView textView = l1Var.f1068d;
            if (a10 != null && bVar != null) {
                if (g.a(aiFilter.getClass(), bVar.getClass())) {
                    view.setSelected(true);
                    textView.setSelected(true);
                } else {
                    view.setSelected(false);
                    textView.setSelected(false);
                }
                textView.setText(aiFilter.f18384b);
                appCompatImageView.setTag(Long.valueOf(a10.f30405b));
                Bitmap bitmap = imageAdjustFiltersAdapter.f25643h;
                if (bitmap != null) {
                    t0.d0(imageAdjustFiltersAdapter.f25639d, null, null, new ImageAdjustFiltersAdapter$ViewHolder$bind$1$1(this, a10, aiFilter, context, imageAdjustFiltersAdapter, bitmap, null), 3);
                }
                l1Var.f1067b.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.a(0, imageAdjustFiltersAdapter, aiFilter));
                return;
            }
            view.setSelected(false);
            textView.setSelected(false);
            appCompatImageView.setImageBitmap(null);
        }
    }

    /* compiled from: ImageAdjustFiltersAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        ul.b a();

        void b(ho.b bVar);
    }

    public ImageAdjustFiltersAdapter(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, ArrayList arrayList, f0 f0Var) {
        ea.a.p("RWkudyBjDXBl", "6XmMa4aq");
        ea.a.p("N2kcdCNycw==", "PHQpFXx8");
        ea.a.p("UXJeZAll", "oR37nXtD");
        this.f25639d = lifecycleCoroutineScopeImpl;
        this.f25640e = arrayList;
        this.f25641f = f0Var;
        this.f25642g = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter r5, android.content.Context r6, ul.b r7, kotlin.coroutines.c r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$makeBitmap$1
            if (r0 == 0) goto L16
            r0 = r8
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$makeBitmap$1 r0 = (pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$makeBitmap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$makeBitmap$1 r0 = new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$makeBitmap$1
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2a
            androidx.activity.s.u0(r8)
            goto L4c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "MWEkbFJ0OSBvcgNzQW0yJxhiN2YmclMgU2kfdj5rJydydyF0GiA1bzpvE3RdbmU="
            java.lang.String r7 = "2MRHrVwE"
            java.lang.String r6 = ea.a.p(r6, r7)
            r5.<init>(r6)
            throw r5
        L38:
            androidx.activity.s.u0(r8)
            lg.b r8 = kotlinx.coroutines.j0.f20206a
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$makeBitmap$2 r2 = new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$makeBitmap$2
            r4 = 0
            r2.<init>(r7, r6, r5, r4)
            r0.label = r3
            java.lang.Object r8 = pdf.pdfreader.viewer.editor.free.utils.t0.w0(r8, r2, r0)
            if (r8 != r1) goto L4c
            goto L52
        L4c:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r1 = r8.m21unboximpl()
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter.h(pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter, android.content.Context, ul.b, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f25640e.size();
    }

    public final void i() {
        this.f25642g = -1L;
        this.f25643h = null;
        for (ho.b bVar : this.f25640e) {
            bVar.f18386e = null;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final int j(Context context, ul.b bVar) {
        boolean z10;
        g.e(context, "context");
        long j10 = this.f25642g;
        long j11 = bVar.f30405b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        List<ho.b> list = this.f25640e;
        if (i10 != 0) {
            this.f25642g = j11;
            this.f25643h = null;
            for (ho.b bVar2 : list) {
                bVar2.f18386e = null;
            }
            t0.d0(this.f25639d, null, null, new ImageAdjustFiltersAdapter$onImageChanged$2(this, context, bVar, null), 3);
        } else {
            notifyDataSetChanged();
        }
        int i11 = 0;
        for (ho.b bVar3 : list) {
            ho.b bVar4 = bVar.f30420r.c;
            if (bVar4 != null && g.a(bVar3.getClass(), bVar4.getClass())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(ViewHolder viewHolder, int i10) {
        ViewHolder holder = viewHolder;
        g.e(holder, "holder");
        holder.l(this.f25640e.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        g.e(parent, "parent");
        View i11 = f.i(parent, R.layout.item_image_adjust_filters, parent, false);
        int i12 = R.id.content_fl;
        FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(i11, R.id.content_fl);
        if (frameLayout != null) {
            i12 = R.id.content_mask_view;
            View u7 = com.google.android.play.core.assetpacks.c.u(i11, R.id.content_mask_view);
            if (u7 != null) {
                i12 = R.id.filter_name_tv;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(i11, R.id.filter_name_tv);
                if (textView != null) {
                    i12 = R.id.picture_iv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i11, R.id.picture_iv);
                    if (appCompatImageView != null) {
                        l1 l1Var = new l1((FrameLayout) i11, frameLayout, u7, textView, appCompatImageView);
                        ea.a.p("Jm5XbBh0UigWYTNvAHQhblNsD3Qgcktm2oDiLhRvJXQqeEUpVSBHYShlJHRZIA5hWXMLKQ==", "vDfI8DwK");
                        return new ViewHolder(this, l1Var);
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpDGhlSR46IA==", "xEZe04Vf").concat(i11.getResources().getResourceName(i12)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(ViewHolder viewHolder, int i10, List payloads) {
        c cVar;
        ViewHolder holder = viewHolder;
        g.e(holder, "holder");
        g.e(payloads, "payloads");
        ho.b aiFilter = this.f25640e.get(i10);
        g.e(aiFilter, "aiFilter");
        if (payloads.isEmpty()) {
            holder.l(aiFilter);
            return;
        }
        ul.b a10 = holder.c.f25641f.a();
        ho.b bVar = (a10 == null || (cVar = a10.f30420r) == null) ? null : cVar.c;
        if (bVar != null) {
            boolean a11 = g.a(aiFilter.getClass(), bVar.getClass());
            l1 l1Var = holder.f25644b;
            if (a11) {
                l1Var.c.setSelected(true);
                l1Var.f1068d.setSelected(true);
                return;
            }
            l1Var.c.setSelected(false);
            l1Var.f1068d.setSelected(false);
        }
    }
}
