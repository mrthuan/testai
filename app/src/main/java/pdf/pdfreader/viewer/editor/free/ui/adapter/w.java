package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Priority;
import eightbitlab.com.blurview.BlurView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.adapter.w;
import pdf.pdfreader.viewer.editor.free.utils.p0;

/* compiled from: SplitPreviewAdapter.kt */
/* loaded from: classes3.dex */
public final class w extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f27312d;

    /* renamed from: e  reason: collision with root package name */
    public final String f27313e;

    /* renamed from: f  reason: collision with root package name */
    public final a f27314f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f27315g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f27316h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f27317i;

    /* compiled from: SplitPreviewAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i10);

        void b(int i10);

        void l(boolean z10);
    }

    /* compiled from: SplitPreviewAdapter.kt */
    @SuppressLint({"ClickableViewAccessibility"})
    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.b0 {

        /* renamed from: l  reason: collision with root package name */
        public static final /* synthetic */ int f27318l = 0;

        /* renamed from: b  reason: collision with root package name */
        public final ViewGroup f27319b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f27320d;

        /* renamed from: e  reason: collision with root package name */
        public final FrameLayout f27321e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f27322f;

        /* renamed from: g  reason: collision with root package name */
        public final BlurView f27323g;

        /* renamed from: h  reason: collision with root package name */
        public final TextView f27324h;

        /* renamed from: i  reason: collision with root package name */
        public final FrameLayout f27325i;

        /* renamed from: j  reason: collision with root package name */
        public float f27326j;

        /* renamed from: k  reason: collision with root package name */
        public float f27327k;

        /* compiled from: SplitPreviewAdapter.kt */
        /* loaded from: classes3.dex */
        public static final class a extends ViewOutlineProvider {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f27328a;

            public a(View view) {
                this.f27328a = view;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                kotlin.jvm.internal.g.e(view, "view");
                kotlin.jvm.internal.g.e(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f27328a.getContext().getResources().getDimension(R.dimen.dp_6));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(final w wVar, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "KUa2x2if");
            View findViewById = view.findViewById(R.id.root_view);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuJGR_cgpvGl9FaS53KQ==", "MQena67k"));
            this.f27319b = (ViewGroup) findViewById;
            View findViewById2 = view.findViewById(R.id.item_icon);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuDWR5aSBlKl8mY15uKQ==", "lrMddWTG"));
            this.c = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.item_pdf_ck);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("AXRcbTppAXdmZg9uUFY-ZU9CK0ktKGQuHWRfaSVlL18YZF9fD2sp", "hQh9ldI7"));
            this.f27320d = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.item_pdf_unck);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("E3QLbTVpAndmZg9uUFY-ZU9CK0ktKGQuHWRfaSVlL18KZAhfFm4Eayk=", "PqzncgIB"));
            FrameLayout frameLayout = (FrameLayout) findViewById4;
            this.f27321e = frameLayout;
            View findViewById5 = view.findViewById(R.id.pdf_select_foreground);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuMWRkcBxmM3MqbFRjDV9RbyhlLXIadQZkKQ==", "VATnXJxl"));
            this.f27322f = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.item_blur);
            kotlin.jvm.internal.g.d(findViewById6, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuUWRgaTNlAV8tbERyKQ==", "Wk4E8NGl"));
            this.f27323g = (BlurView) findViewById6;
            View findViewById7 = view.findViewById(R.id.page_count);
            kotlin.jvm.internal.g.d(findViewById7, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuIWRCcCRnCl9Qbz5uByk=", "HlEoS83W"));
            this.f27324h = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.progress_fl);
            kotlin.jvm.internal.g.d(findViewById8, ea.a.p("AHQsbRxpJndmZg9uUFY-ZU9CK0ktKGQuHWRfcCNvJXIMczpfLGwp", "ZkiIJC98"));
            this.f27325i = (FrameLayout) findViewById8;
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new a(view));
            view.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.e(1, this, wVar));
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.x
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean z10;
                    String p10 = ea.a.p("N2gGcx0w", "R9Co9Md9");
                    w.b bVar = w.b.this;
                    kotlin.jvm.internal.g.e(bVar, p10);
                    String p11 = ea.a.p("O2hYc10x", "3en3EiPf");
                    w wVar2 = wVar;
                    kotlin.jvm.internal.g.e(wVar2, p11);
                    Integer valueOf = Integer.valueOf(bVar.getAdapterPosition());
                    int intValue = valueOf.intValue();
                    if (intValue >= 0 && intValue < wVar2.f27316h.size()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        return false;
                    }
                    wVar2.f27314f.a(valueOf.intValue());
                    return true;
                }
            });
            view.setOnTouchListener(new View.OnTouchListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.y
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean z10;
                    String p10 = ea.a.p("TWgYc1Mw", "Wy9qwh1Y");
                    w.b bVar = w.b.this;
                    kotlin.jvm.internal.g.e(bVar, p10);
                    String p11 = ea.a.p("O2hYc10x", "43grtDxu");
                    w wVar2 = wVar;
                    kotlin.jvm.internal.g.e(wVar2, p11);
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 2) {
                            wVar2.f27317i = false;
                            return false;
                        } else if (wVar2.f27317i) {
                            return false;
                        } else {
                            float x4 = motionEvent.getX();
                            float y10 = motionEvent.getY();
                            if (Math.abs(y10 - bVar.f27327k) < 5.0f && Math.abs(x4 - bVar.f27326j) < 5.0f) {
                                return false;
                            }
                            wVar2.f27317i = true;
                            if (Math.abs(x4 - bVar.f27326j) <= Math.abs(y10 - bVar.f27327k)) {
                                return false;
                            }
                            Integer valueOf = Integer.valueOf(bVar.getAdapterPosition());
                            int intValue = valueOf.intValue();
                            if (intValue >= 0 && intValue < wVar2.f27316h.size()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                valueOf = null;
                            }
                            if (valueOf == null) {
                                return false;
                            }
                            wVar2.f27314f.a(valueOf.intValue());
                            return true;
                        }
                    }
                    bVar.f27326j = motionEvent.getX();
                    bVar.f27327k = motionEvent.getY();
                    wVar2.f27317i = false;
                    return false;
                }
            });
        }
    }

    public w(Context context, String str, a aVar) {
        ea.a.p("IkNebg1lT3Q=", "UYXVdjhi");
        ea.a.p("OGFHaA==", "pXH3jMgE");
        kotlin.jvm.internal.g.e(aVar, ea.a.p("KWkHdFxuAHI=", "DPEt9egr"));
        this.f27312d = context;
        this.f27313e = str;
        this.f27314f = aVar;
        this.f27315g = new ArrayList();
        this.f27316h = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27316h.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void h(int i10, boolean z10) {
        ArrayList arrayList = this.f27316h;
        if (arrayList.size() < i10) {
            for (int size = arrayList.size(); size < i10; size++) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        if (arrayList.size() != i10) {
            arrayList.clear();
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        notifyDataSetChanged();
    }

    public final void i(b bVar, int i10) {
        if (this.f27315g.contains(Integer.valueOf(i10))) {
            bVar.f27322f.setVisibility(0);
            bVar.f27320d.setVisibility(0);
            bVar.f27321e.setVisibility(8);
            return;
        }
        bVar.f27322f.setVisibility(4);
        bVar.f27320d.setVisibility(8);
        bVar.f27321e.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i10) {
        int i11;
        b holder = bVar;
        String str = this.f27313e;
        kotlin.jvm.internal.g.e(holder, "holder");
        if (((Boolean) this.f27316h.get(i10)).booleanValue()) {
            i11 = 8;
            try {
                holder.itemView.setTag(Integer.valueOf(i10));
                holder.f27323g.setVisibility(8);
                Context context = holder.itemView.getContext();
                String a10 = p0.a(str + i10);
                String str2 = str + i10;
                long j10 = 0;
                if (!TextUtils.isEmpty(str2)) {
                    String a11 = p0.a(str2);
                    File file = new File(str2);
                    if (file.exists() && file.length() > 0) {
                        j10 = file.lastModified() + file.length();
                    }
                    if (!TextUtils.isEmpty(a11)) {
                        j10 += new File(a11).lastModified();
                    }
                }
                com.bumptech.glide.e j11 = com.bumptech.glide.b.f(context).o(a10).u(new o4.d(Long.valueOf(j10))).o(R.drawable.ic_placeholder).j(R.drawable.ic_placeholder);
                j11.K(0.4f);
                j11.H(new z(this, holder, i10));
                j11.h().q(Priority.HIGH).E(holder.c);
            } catch (Exception e10) {
                e10.printStackTrace();
                o9.d.s(ea.a.p("A3BUaT5QBmU-aQN3dWQ2cExlcg==", "7nP8JtGW"), "load cover error: " + e10.getMessage());
            }
        } else {
            i11 = 0;
        }
        holder.f27325i.setVisibility(i11);
        holder.f27324h.setText(String.valueOf(i10 + 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = LayoutInflater.from(this.f27312d).inflate(R.layout.item_split_preview, parent, false);
        kotlin.jvm.internal.g.d(inflate, ea.a.p("VXIkbVttIW8cdFF4HSl4aSpmXmEyZWtS1oCWdDpwA2VFaS53XyASYQBlWnRFIDBhKHNXKQ==", "40eq9HgR"));
        return new b(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i10, List payloads) {
        b holder = bVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
        } else {
            i(holder, i10);
        }
    }
}
