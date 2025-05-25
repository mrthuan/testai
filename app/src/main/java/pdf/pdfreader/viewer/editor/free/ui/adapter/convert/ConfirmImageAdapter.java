package pdf.pdfreader.viewer.editor.free.ui.adapter.convert;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import cg.l;
import com.bumptech.glide.Priority;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import eightbitlab.com.blurview.BlurView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.m;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import qb.j1;

/* compiled from: ConfirmImageAdapter.kt */
/* loaded from: classes3.dex */
public final class ConfirmImageAdapter extends RecyclerView.Adapter<c> implements ep.a {

    /* renamed from: d  reason: collision with root package name */
    public final b f27131d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<ul.b> f27132e;

    /* renamed from: f  reason: collision with root package name */
    public r f27133f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27134g;

    /* renamed from: h  reason: collision with root package name */
    public int f27135h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f27136i;

    /* renamed from: j  reason: collision with root package name */
    public cg.a<tf.d> f27137j;

    /* renamed from: k  reason: collision with root package name */
    public final int f27138k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f27139l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f27140m;

    /* compiled from: ConfirmImageAdapter.kt */
    /* loaded from: classes3.dex */
    public final class AddViewHolder extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddViewHolder(final ConfirmImageAdapter confirmImageAdapter, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "SNzNIbEB");
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter.AddViewHolder.1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                    invoke2(view2);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    ConfirmImageAdapter.this.f27131d.Y();
                }
            });
        }
    }

    /* compiled from: ConfirmImageAdapter.kt */
    /* loaded from: classes3.dex */
    public final class DragTipsViewHolder extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DragTipsViewHolder(final ConfirmImageAdapter confirmImageAdapter, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "Hx6icqa7");
            View findViewById = view.findViewById(R.id.tipsCloseIv);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("JnQJbW9pH3dmZg9uUFY-ZU9CK0ktKGQuHWRfdDhwMUMjbx9lcHYp", "KPOl9zbV"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e((ImageView) findViewById, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter.DragTipsViewHolder.1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                    invoke2(view2);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    ConfirmImageAdapter.this.f27132e.remove(0);
                    ConfirmImageAdapter confirmImageAdapter2 = ConfirmImageAdapter.this;
                    confirmImageAdapter2.f27135h--;
                    confirmImageAdapter2.f27134g = false;
                    confirmImageAdapter2.notifyItemRemoved(0);
                    ConfirmImageAdapter.this.f27131d.G();
                }
            });
        }
    }

    /* compiled from: ConfirmImageAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends c {

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ int f27141g = 0;

        /* renamed from: b  reason: collision with root package name */
        public final FrameLayout f27142b;
        public final AppCompatTextView c;

        /* renamed from: d  reason: collision with root package name */
        public final AppCompatImageView f27143d;

        /* renamed from: e  reason: collision with root package name */
        public final ConstraintLayout f27144e;

        /* renamed from: f  reason: collision with root package name */
        public final BlurView f27145f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final ConfirmImageAdapter confirmImageAdapter, View view) {
            super(view);
            ea.a.p("C3QwbSdpV3c=", "oMbUq2Kn");
            View findViewById = view.findViewById(R.id.progressFl);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuA2RAcCRvUXIqc0JGFSk=", "ppypjnV6"));
            this.f27142b = (FrameLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.pageIndex);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuEGRXcDVnCkldZC54KQ==", "yyTobr09"));
            this.c = (AppCompatTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.pageIv);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuCGRmcDVnNklFKQ==", "aHTSqVqL"));
            this.f27143d = (AppCompatImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.rootView);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("IHQ9bRtpXHdmZg9uUFY-ZU9CK0ktKGQuHWRfcj5vNlYgZS8p", "iAIXM9Wo"));
            this.f27144e = (ConstraintLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.blurView);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuDmRCYjt1OVYmZUYp", "CAwrglWK"));
            this.f27145f = (BlurView) findViewById5;
            view.findViewById(R.id.removeIv).setOnClickListener(new j1(3, this, confirmImageAdapter));
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    String p10 = ea.a.p("O2hYc10w", "iV8XBPrD");
                    ConfirmImageAdapter confirmImageAdapter2 = ConfirmImageAdapter.this;
                    kotlin.jvm.internal.g.e(confirmImageAdapter2, p10);
                    String p11 = ea.a.p("R2gic1cx", "AN0RKMJg");
                    ConfirmImageAdapter.a aVar = this;
                    kotlin.jvm.internal.g.e(aVar, p11);
                    r rVar = confirmImageAdapter2.f27133f;
                    if (rVar != null) {
                        rVar.t(aVar);
                        return true;
                    }
                    return true;
                }
            });
            view.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.e(3, confirmImageAdapter, this));
        }
    }

    /* compiled from: ConfirmImageAdapter.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void G();

        void U();

        void Y();

        void b(int i10);
    }

    /* compiled from: ConfirmImageAdapter.kt */
    /* loaded from: classes3.dex */
    public class c extends RecyclerView.b0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "sTonYG04");
        }
    }

    /* compiled from: ConfirmImageAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class d extends GridLayoutManager.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.m f27146d;

        public d(RecyclerView.m mVar) {
            this.f27146d = mVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i10) {
            if (ConfirmImageAdapter.this.getItemViewType(i10) == 2) {
                return ((GridLayoutManager) this.f27146d).F;
            }
            return 1;
        }
    }

    static {
        ea.a.p("cG8lZhpyD0kfYVNlKGQ3cDBlcg==", "5WkDk7G8");
    }

    public ConfirmImageAdapter(ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity) {
        kotlin.jvm.internal.g.e(readerImg2PDFConvertActivity, ea.a.p("I2lCdBxuUnI=", "Jug3AIXm"));
        this.f27131d = readerImg2PDFConvertActivity;
        this.f27132e = new ArrayList<>();
        this.f27138k = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
        try {
            Context m10 = ReaderPdfApplication.m();
            kotlin.jvm.internal.g.d(m10, ea.a.p("KGVFSRdzQ2E0Yy8oKQ==", "16Lc2smw"));
            int i10 = m10.getResources().getDisplayMetrics().widthPixels;
            if (i10 > 0) {
                this.f27138k = ((i10 / 2) * 196) / ShapeTypes.FLOW_CHART_MANUAL_OPERATION;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // ep.a
    public final void d(int i10, int i11) {
        dp.a.a().getClass();
        dp.a.c("ConfirmImageAdapter onItemMove fromPosition: " + i10 + " toPosition: " + i11);
        this.f27139l = true;
        this.f27140m = true;
        ArrayList<ul.b> arrayList = this.f27132e;
        if (i10 < i11) {
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                Collections.swap(arrayList, i12, i13);
                i12 = i13;
            }
        } else {
            int i14 = i11 + 1;
            if (i14 <= i10) {
                int i15 = i10;
                while (true) {
                    int i16 = i15 - 1;
                    Collections.swap(arrayList, i15, i16);
                    if (i15 == i14) {
                        break;
                    }
                    i15 = i16;
                }
            }
        }
        notifyItemMoved(i10, i11);
    }

    @Override // ep.a
    public final void f() {
        androidx.activity.f.q("DG9fZhByWkk3YS1lNGQJcEFlHCAqbix0Jm0QbhxlCGUsdA==", "zubbCEOd", dp.a.a());
        if (this.f27139l) {
            Iterator<ul.b> it = this.f27132e.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                ul.b next = it.next();
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    next.c(i11);
                    i10 = i11;
                } else {
                    ge.a.c0();
                    throw null;
                }
            }
            notifyItemRangeChanged(0, getItemCount(), ge.a.j(""));
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.n();
        }
    }

    @Override // ep.a
    public final void g() {
        androidx.activity.f.q("DG9fZhByWkk3YS1lNGQJcEFlHCAqbix0CG0UZVRlEHQqZA==", "bWNlmG8s", dp.a.a());
        this.f27139l = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27132e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        if (this.f27134g && i10 == 0) {
            return 2;
        }
        if (i10 == this.f27132e.size() - 1) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x000b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ul.b> h() {
        /*
            r6 = this;
            java.util.ArrayList<ul.b> r0 = r6.f27132e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            r3 = r2
            ul.b r3 = (ul.b) r3
            ul.b r4 = r3.f30423u
            r5 = 0
            if (r4 == 0) goto L20
            java.lang.String r4 = r4.f30404a
            goto L21
        L20:
            r4 = r5
        L21:
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L35
            ul.b r3 = r3.f30423u
            if (r3 == 0) goto L2d
            java.lang.String r5 = r3.f30410h
        L2d:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = 0
        L36:
            if (r3 == 0) goto Lb
            r1.add(r2)
            goto Lb
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter.h():java.util.List");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.g.e(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).K = new d(layoutManager);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(c cVar, int i10) {
        ul.b bVar;
        Priority priority;
        c holder = cVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        if (holder instanceof AddViewHolder) {
            AddViewHolder addViewHolder = (AddViewHolder) holder;
        } else if (holder instanceof DragTipsViewHolder) {
            DragTipsViewHolder dragTipsViewHolder = (DragTipsViewHolder) holder;
        } else if (holder instanceof a) {
            a aVar = (a) holder;
            ul.b bVar2 = (ul.b) m.t0(i10, this.f27132e);
            if (bVar2 == null || (bVar = bVar2.f30423u) == null) {
                return;
            }
            ea.a.p("JnRUbVdhU2ovcz5JGGEPZRU_VCA3ZRF1KG4=", "Rb1uZp1c");
            Context context = aVar.itemView.getContext();
            long j10 = bVar.f30406d;
            if (j10 < 10485760) {
                priority = Priority.HIGH;
            } else if (j10 > 52428800) {
                priority = Priority.LOW;
            } else {
                priority = Priority.NORMAL;
            }
            aVar.f27142b.setVisibility(0);
            com.bumptech.glide.e<Drawable> o10 = com.bumptech.glide.b.f(context).o(bVar.f30410h);
            o10.E = com.bumptech.glide.a.c();
            int i11 = this.f27138k;
            com.bumptech.glide.e j11 = o10.q(priority).n(i11, i11).c().j(R.drawable.ic_convert_unavailable);
            j11.H(new pdf.pdfreader.viewer.editor.free.ui.adapter.convert.b(aVar, bVar, this));
            j11.E(aVar.f27143d);
            if (!this.f27134g) {
                i10++;
            }
            aVar.c.setText(String.valueOf(i10));
            aVar.f27145f.b(aVar.f27144e, new qe.g(context)).f29293a = 6.0f;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final c onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        if (i10 != 1) {
            if (i10 != 2) {
                View i11 = androidx.activity.f.i(parent, R.layout.item_img_convert_pdf_confirm_r3, parent, false);
                kotlin.jvm.internal.g.d(i11, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1mk4Dfbw1mXHJeXzkzXyASYQBlWnRFIDBhKHNXKQ==", "qyc57YVV"));
                return new a(this, i11);
            }
            View i12 = androidx.activity.f.i(parent, R.layout.item_img_convert_pdf_drag_tips_r3, parent, false);
            kotlin.jvm.internal.g.d(i12, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilraQtmkID8Zwt0LXA8X0MzVSBHYShlJHRZIA5hWXMLKQ==", "yKW1rZTD"));
            return new DragTipsViewHolder(this, i12);
        }
        View i13 = androidx.activity.f.i(parent, R.layout.item_img_convert_pdf_confirm_add_r3, parent, false);
        kotlin.jvm.internal.g.d(i13, ea.a.p("EXInbWpwFXItbhIuV285dF14JilnaVhmloDXcjxfI2QTXzozbiAEYTplCHQYIDFhVHM3KQ==", "CNwHBtX2"));
        return new AddViewHolder(this, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(c cVar, int i10, List payloads) {
        c holder = cVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
        } else if (holder instanceof a) {
            a aVar = (a) holder;
            if (!this.f27134g) {
                i10++;
            }
            aVar.c.setText(String.valueOf(i10));
        }
    }
}
