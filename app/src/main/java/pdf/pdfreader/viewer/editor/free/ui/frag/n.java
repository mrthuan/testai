package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.greenrobot.eventbus.ThreadMode;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseConvertImageTypeDialog;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.d;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g0;
import pdf.pdfreader.viewer.editor.free.ui.myview.TouchMonitorRecyclerView;
import pdf.pdfreader.viewer.editor.free.utils.ReaderWrapContentLinearLayoutManager;
import pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import qb.v0;

/* compiled from: PdfReaderFragment.java */
/* loaded from: classes3.dex */
public class n extends mo.c implements d.InterfaceC0353d {

    /* renamed from: c1  reason: collision with root package name */
    public static final /* synthetic */ int f28058c1 = 0;
    public pdf.pdfreader.viewer.editor.free.ui.adapter.d E0;
    public final ArrayList<PdfPreviewEntity> F0 = new ArrayList<>();
    public PdfListMoreMenuDialog G0;
    public g0 H0;
    public pdf.pdfreader.viewer.editor.free.utils.drag.a I0;
    public boolean J0;
    public ChooseConvertImageTypeDialog K0;
    public PopupWindow L0;
    public final b M0;
    public final c N0;
    public ObjectAnimator O0;
    public int P0;

    /* compiled from: PdfReaderFragment.java */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            n nVar = n.this;
            pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = nVar.E0;
            if (dVar != null) {
                if (i11 > 0) {
                    dVar.f27218m = false;
                } else {
                    dVar.f27218m = true;
                }
            }
            nVar.W0();
        }
    }

    /* compiled from: PdfReaderFragment.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* compiled from: PdfReaderFragment.java */
        /* loaded from: classes3.dex */
        public class a implements PopupWindow.OnDismissListener {
            public a() {
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                b bVar = b.this;
                n nVar = n.this;
                int i10 = n.f28058c1;
                ObjectAnimator objectAnimator = nVar.O0;
                if (objectAnimator != null && objectAnimator.isRunning()) {
                    nVar.O0.cancel();
                }
                n nVar2 = n.this;
                nVar2.f22162k0.removeCallbacks(nVar2.N0);
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinearLayoutManager linearLayoutManager;
            int P;
            View C;
            n nVar = n.this;
            if (nVar.i() == null || !pdf.pdfreader.viewer.editor.free.utils.extension.a.c(nVar.i()) || nVar.i() == null || pdf.pdfreader.viewer.editor.free.utils.extension.a.b(nVar.i()) || nVar.A || (linearLayoutManager = (LinearLayoutManager) nVar.f22162k0.getLayoutManager()) == null || nVar.i() == null) {
                return;
            }
            int dimensionPixelSize = nVar.v().getDimensionPixelSize(R.dimen.dp_80);
            View b12 = linearLayoutManager.b1(0, linearLayoutManager.I(), true, false);
            if (b12 == null) {
                P = -1;
            } else {
                P = RecyclerView.m.P(b12);
            }
            if (P != -1 && (C = linearLayoutManager.C(P)) != null) {
                int[] iArr = new int[2];
                C.getLocationOnScreen(iArr);
                View inflate = LayoutInflater.from(nVar.i()).inflate(R.layout.pop_home_list_select_guide, (ViewGroup) null, false);
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.rootView);
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                aVar.f(constraintLayout);
                androidx.fragment.app.u context = nVar.i();
                kotlin.jvm.internal.g.e(context, "context");
                aVar.k(R.id.v_content_bg).f3373e.f3390a0 = context.getResources().getDisplayMetrics().widthPixels - (dimensionPixelSize * 2);
                aVar.b(constraintLayout);
                PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
                nVar.L0 = popupWindow;
                popupWindow.setOnDismissListener(new a());
                nVar.L0.setBackgroundDrawable(new ColorDrawable(0));
                nVar.L0.setOutsideTouchable(false);
                nVar.L0.setFocusable(false);
                nVar.L0.showAtLocation(nVar.i().getWindow().getDecorView(), 8388659, dimensionPixelSize, nVar.v().getDimensionPixelSize(R.dimen.dp_55) + iArr[1]);
                zl.c.c.getClass();
                zl.c.f32424k.c(zl.c.f32417d[6], Boolean.TRUE);
                float dimensionPixelSize2 = nVar.v().getDimensionPixelSize(R.dimen.dp_6);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(inflate, ea.a.p("R3IqbgBsA3Qbb1pZ", "9POhUAla"), 0.0f, -dimensionPixelSize2, dimensionPixelSize2, 0.0f);
                nVar.O0 = ofFloat;
                ofFloat.setDuration(1500L);
                nVar.O0.setInterpolator(new LinearInterpolator());
                nVar.O0.start();
                TouchMonitorRecyclerView touchMonitorRecyclerView = nVar.f22162k0;
                if (touchMonitorRecyclerView != null) {
                    touchMonitorRecyclerView.postDelayed(nVar.N0, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                }
            }
        }
    }

    /* compiled from: PdfReaderFragment.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n nVar = n.this;
            if (nVar.i() != null && pdf.pdfreader.viewer.editor.free.utils.extension.a.c(nVar.i())) {
                nVar.W0();
            }
        }
    }

    static {
        ea.a.p("LmxdRgthZw==", "mmhO4mWm");
    }

    public n() {
        new ArrayList();
        this.I0 = null;
        this.J0 = false;
        this.L0 = null;
        this.M0 = new b();
        this.N0 = new c();
        this.O0 = null;
        this.P0 = -1;
        this.f22157f0 = false;
    }

    public static void S0(n nVar, PdfPreviewEntity pdfPreviewEntity, boolean z10, boolean z11) {
        if (nVar.r() != null) {
            if (z11) {
                nVar.O0(pdfPreviewEntity, new g(nVar, pdfPreviewEntity, z10, 0));
                return;
            }
            int i10 = Pdf2ImagePicPreviewActivity.I0;
            Pdf2ImagePicPreviewActivity.a.a(nVar.r(), pdfPreviewEntity.getPath(), ea.a.p("CVJ-TSZMflMOXwdPJ0U=", "NhFKTwCO"), "", z10);
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(nVar.i());
        }
    }

    public static void Y0() {
        t1.b(ea.a.p("H2RXUhxhU2UoRjhhEm0NbkEgAG8VZRdtEHMGaSZuDG87aVJlPHZSbi4gJ0waZw9lUUUYZSt0RT0g", "VPbRyuIB") + mo.c.C0);
        if (!mo.c.C0) {
            mo.c.C0 = true;
            tn.a.b(ReaderPdfApplication.m(), ea.a.p("OmULbRFzN2knbjkxMQ==", "vzJyxDHe"), ea.a.p("W28mZUIxPW4ddF1jDF8laCt3", "aeuEkj7u"));
            t1.b(ea.a.p("H2RXUhxhU2UoRjhhEm0NbkEgQy1oLUhoW20yMVNfCG87aVJlJnNfby0tZy1YLUhteW8JZyBkIHZRbiMgXyA=", "luBl4Wbf") + mo.c.C0);
        }
    }

    @Override // mo.c
    public final void A0(ArrayList<PdfPreviewEntity> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            Context r4 = r();
            int i10 = this.f22156e0;
            ArrayList<PdfPreviewEntity> arrayList3 = this.F0;
            if (i10 == 203) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
                    int i11 = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity).f22593n;
                    if (i11 > -1 && r4 != null) {
                        yn.a.h0(r4, i11);
                    }
                    int indexOf = arrayList3.indexOf(pdfPreviewEntity);
                    if (indexOf > -1) {
                        arrayList3.remove(indexOf);
                        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = this.E0;
                        ArrayList<PdfPreviewEntity> arrayList4 = dVar.f27210e;
                        int indexOf2 = arrayList4.indexOf(pdfPreviewEntity);
                        if (indexOf2 > -1) {
                            arrayList4.remove(indexOf2);
                            dVar.notifyItemRemoved(indexOf2);
                        }
                        androidx.fragment.app.u i12 = i();
                        if (i12 != null && (i12 instanceof RecentAddedActivity)) {
                            RecentAddedActivity recentAddedActivity = (RecentAddedActivity) i12;
                            int size = arrayList3.size();
                            tf.c cVar = recentAddedActivity.N;
                            if (size > 0) {
                                ((TextView) cVar.getValue()).setText(recentAddedActivity.getString(R.string.arg_res_0x7f1304d9, String.valueOf(size)));
                            } else {
                                ((TextView) cVar.getValue()).setVisibility(8);
                                ((ImageView) recentAddedActivity.M.getValue()).setVisibility(8);
                                recentAddedActivity.m2(false);
                            }
                            bm.c.b(this.Y.get()).h(pdfPreviewEntity);
                        }
                    }
                }
                FileRepository.f24155a.getClass();
                FileRepository.k().execute(new v0(arrayList2, 1));
                if (arrayList3.size() == 0) {
                    d1(true);
                }
                this.E0.f27213h.clear();
                mo.c.M0(0, arrayList3.size());
                return;
            }
            ArrayList<PdfPreviewEntity> E0 = E0();
            if (E0 != null && E0.size() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) it2.next();
                    int i13 = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity2).f22593n;
                    if (i13 > -1 && r4 != null) {
                        yn.a.h0(r4, i13);
                    }
                    if (this.Y.get() != null) {
                        int indexOf3 = arrayList3.indexOf(pdfPreviewEntity2);
                        int indexOf4 = E0.indexOf(pdfPreviewEntity2);
                        if (indexOf3 >= 0 && indexOf3 < arrayList3.size()) {
                            if (indexOf4 >= 0 && indexOf4 < E0.size() && arrayList3 != E0) {
                                E0.remove(indexOf4);
                            }
                            arrayList3.remove(indexOf3);
                            this.E0.f27210e.remove(indexOf3);
                            this.E0.notifyItemRemoved(indexOf3);
                            bm.c.b(this.Y.get()).h(pdfPreviewEntity2);
                        }
                    }
                }
                FileRepository fileRepository = FileRepository.f24155a;
                fileRepository.getClass();
                FileRepository.k().execute(new v0(arrayList2, 1));
                t1.b(ea.a.p("EWVYZQRlVyApbApMXXMjU1F6Nzo=", "vhu4pwiq") + E0.size());
                D0();
                if (r4 != null && h1.c() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(r4)) {
                    fileRepository.getClass();
                    if (kotlin.collections.m.E0((Iterable) FileRepository.f24177x.b()).isEmpty() && !mo.c.D0) {
                        mo.c.D0 = true;
                        tn.a.b(r4, ea.a.p("Q2U5bRpzEWkdbmsxMQ==", "qENs0A4Q"), ea.a.p("LG8qZX8xCm4nZg9sUV8kaFd3", "qDDGNUWm"));
                    }
                }
            }
        }
    }

    @Override // mo.c
    public final void C0() {
        W0();
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = this.E0;
        if (dVar != null) {
            dVar.f27212g = 1;
            dVar.f27213h.clear();
            pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar2 = this.E0;
            ArrayList<PdfPreviewEntity> arrayList = this.F0;
            dVar2.j(arrayList);
            if (i() != null && this.f22163l0 != null && arrayList.size() > 0 && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(i()) && h1.c()) {
                if (this.J) {
                    Context r4 = r();
                    if (wn.b.f31388d && r4 != null) {
                        EventCenter.f(ea.a.p("J29cZTI=", "C2rcN16n"));
                        EventCenter.c(r4);
                    }
                }
                this.f22163l0.setVisibility(0);
                t1.b(ea.a.p("Y2QtUhZhBmUARkZhDm0zbjAgXmE_bzZ0K3I1cQZlAXRscC5yHmkRcxtvWiBbICBpN2lQbGU=", "tPsruz5s"));
                Y0();
            }
        }
    }

    @Override // mo.c
    public final ArrayList<PdfPreviewEntity> E0() {
        if (this.f22156e0 == 203) {
            return this.F0;
        }
        return super.E0();
    }

    @Override // mo.c
    public final int G0() {
        return this.f22156e0;
    }

    @Override // mo.c
    public final void J0(PdfPreviewEntity pdfPreviewEntity) {
        if (this.E0 != null) {
            if (TextUtils.equals(pdfPreviewEntity.getOtherStrOne(), this.f22155d0) || this.f22155d0.equals(ea.a.p("ckxM", "aTV4D543"))) {
                e1(this.f22156e0, this.f22155d0);
            }
        }
    }

    @Override // mo.c
    public final void K0(long j10, String str) {
        Iterator<PdfPreviewEntity> it = this.F0.iterator();
        while (it.hasNext()) {
            PdfPreviewEntity next = it.next();
            if (next.getId() == j10) {
                next.setOtherStrTwo(str);
                return;
            }
        }
    }

    @Override // mo.c
    public final void L0(String str, Boolean bool) {
        ArrayList<PdfPreviewEntity> arrayList;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.F0;
            if (i11 >= arrayList.size()) {
                break;
            }
            PdfPreviewEntity pdfPreviewEntity = arrayList.get(i11);
            if (pdfPreviewEntity.getPath().equals(str)) {
                File file = new File(str);
                if (file.exists()) {
                    pdfPreviewEntity.setDate(file.lastModified());
                }
                pdfPreviewEntity.setOtherBoolOne(bool.booleanValue());
                pdfPreviewEntity.setOtherIntOne(1);
                bm.c.b(this.Y.get()).i(pdfPreviewEntity);
                FileRepository.I(pdfPreviewEntity);
            } else {
                i11++;
            }
        }
        ArrayList<PdfPreviewEntity> E0 = E0();
        if (E0 != null) {
            while (true) {
                if (i10 >= E0.size()) {
                    break;
                }
                PdfPreviewEntity pdfPreviewEntity2 = E0.get(i10);
                if (pdfPreviewEntity2.getPath().equals(str)) {
                    File file2 = new File(str);
                    if (file2.exists()) {
                        pdfPreviewEntity2.setDate(file2.lastModified());
                    }
                    pdfPreviewEntity2.setOtherBoolOne(bool.booleanValue());
                    pdfPreviewEntity2.setOtherIntOne(1);
                } else {
                    i10++;
                }
            }
        }
        pdf.pdfreader.viewer.editor.free.utils.v.O(no.f.b(g0()).f22632f, arrayList);
        this.E0.j(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public final void O() {
        this.F = true;
        wk.b.b().k(this);
    }

    @Override // mo.c, pdf.pdfreader.viewer.editor.free.base.a, androidx.fragment.app.Fragment
    public final void P() {
        super.P();
        TouchMonitorRecyclerView touchMonitorRecyclerView = this.f22162k0;
        if (touchMonitorRecyclerView != null) {
            touchMonitorRecyclerView.removeCallbacks(this.M0);
            this.f22162k0.removeCallbacks(this.N0);
        }
        ObjectAnimator objectAnimator = this.O0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.O0.cancel();
        }
        W0();
        V0();
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = this.E0;
        if (dVar != null) {
            gl.e.f17918a.getClass();
            d.a listener = dVar.f27222q;
            kotlin.jvm.internal.g.e(listener, "listener");
            gl.f.f17921p.e().remove(listener);
            gl.g.f17922p.e().remove(listener);
        }
    }

    @Override // mo.c
    public final void P0() {
        if (this.f22156e0 == 203) {
            z0(false);
            return;
        }
        if (ReaderHomeActivity.f26650n2) {
            this.f22163l0.setVisibility(8);
        }
        z0(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void T() {
        this.F = true;
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = this.E0;
        if (dVar != null) {
            dVar.f27221p = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[Catch: Exception -> 0x013a, TryCatch #0 {Exception -> 0x013a, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0018, B:8:0x001e, B:10:0x0028, B:12:0x0037, B:13:0x003e, B:15:0x0048, B:19:0x005e, B:18:0x004f, B:20:0x0061, B:22:0x0077, B:24:0x007d, B:26:0x0085, B:32:0x0091, B:33:0x0094, B:36:0x009a, B:38:0x00a0, B:41:0x00a7, B:43:0x00ad, B:57:0x00db, B:59:0x012a, B:60:0x0130, B:46:0x00b7, B:48:0x00be, B:50:0x00c6, B:52:0x00cc, B:55:0x00d7), top: B:66:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130 A[Catch: Exception -> 0x013a, TRY_LEAVE, TryCatch #0 {Exception -> 0x013a, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0018, B:8:0x001e, B:10:0x0028, B:12:0x0037, B:13:0x003e, B:15:0x0048, B:19:0x005e, B:18:0x004f, B:20:0x0061, B:22:0x0077, B:24:0x007d, B:26:0x0085, B:32:0x0091, B:33:0x0094, B:36:0x009a, B:38:0x00a0, B:41:0x00a7, B:43:0x00ad, B:57:0x00db, B:59:0x012a, B:60:0x0130, B:46:0x00b7, B:48:0x00be, B:50:0x00c6, B:52:0x00cc, B:55:0x00d7), top: B:66:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T0(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.frag.n.T0(java.lang.String, boolean):void");
    }

    public final void U0(int i10) {
        ea.a.p("JWwAUyJsAmM8OiA=", "epDlGgx7");
        mo.c.M0(i10, this.F0.size());
        wk.b.b().e(new qo.n());
    }

    public final void V0() {
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.G0;
        if (pdfListMoreMenuDialog != null && pdfListMoreMenuDialog.isShowing()) {
            this.G0.cancel();
        }
        g0 g0Var = this.H0;
        if (g0Var != null && g0Var.isShowing()) {
            this.H0.cancel();
        }
        ChooseConvertImageTypeDialog chooseConvertImageTypeDialog = this.K0;
        if (chooseConvertImageTypeDialog != null && chooseConvertImageTypeDialog.isShowing()) {
            this.K0.cancel();
        }
        B0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void W() {
        this.F = true;
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = this.E0;
        if (dVar != null) {
            dVar.f27221p = this.J;
            dVar.i();
        }
    }

    public final void W0() {
        PopupWindow popupWindow = this.L0;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.L0.dismiss();
        }
    }

    public final String X0() {
        String p10 = ea.a.p("Umxs", "lZ35AxmL");
        switch (this.f22156e0) {
            case 200:
                return ea.a.p("Lmxs", "TbRnAX6o");
            case 201:
                return ea.a.p("PWVSZRd0", "3WrfFZsY");
            case 202:
                return ea.a.p("XmE5aw==", "ib0PeQqr");
            case 203:
                return ea.a.p("LmRVZWQ=", "LCLTtTgu");
            default:
                return p10;
        }
    }

    public final void Z0() {
        TouchMonitorRecyclerView touchMonitorRecyclerView;
        if (this.E0.f27212g != 0) {
            zl.c.c.getClass();
            if ((!((Boolean) zl.c.f32424k.b(zl.c.f32417d[6])).booleanValue() || zl.c.f32425l) && (touchMonitorRecyclerView = this.f22162k0) != null) {
                touchMonitorRecyclerView.postDelayed(this.M0, 200L);
            }
        }
        ea.a.p("F3A8bmJlVWUrdCtvUHU7ZQIg", "iQxY19Ug");
        String str = n0.f28727a;
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = this.E0;
        if (dVar != null) {
            dVar.f27212g = 0;
            dVar.j(this.F0);
        }
        ConstraintLayout constraintLayout = this.f22163l0;
        if (constraintLayout != null && constraintLayout.getVisibility() == 0) {
            this.f22163l0.setVisibility(8);
        }
        wk.b.b().e(new qo.n());
        Context r4 = r();
        String p10 = ea.a.p("LGhebwpl", "CnzLeetl");
        String p11 = ea.a.p("LGhebwplaGM2aSlr", "vmPkvYkM");
        tn.a.d(r4, p10, p11, X0() + ea.a.p("Xw==", "IcPAv6o5") + aj.b.t(this.f22155d0), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a1(int i10, String type) {
        List list;
        boolean z10;
        if (i() != null && (i() instanceof ReaderHomeActivity)) {
            FileRepository fileRepository = FileRepository.f24155a;
            kotlin.jvm.internal.g.e(type, "type");
            int hashCode = type.hashCode();
            FileRepository fileRepository2 = FileRepository.f24155a;
            switch (hashCode) {
                case 64897:
                    if (type.equals(ea.a.p("DkxM", "1Qfsp1PL"))) {
                        fileRepository2.getClass();
                        list = kotlin.collections.m.E0((Iterable) FileRepository.f24177x.b());
                        break;
                    }
                    list = EmptyList.INSTANCE;
                    break;
                case 79058:
                    if (type.equals(ea.a.p("H0RG", "XLdOxQyg"))) {
                        fileRepository2.getClass();
                        list = FileRepository.m();
                        break;
                    }
                    list = EmptyList.INSTANCE;
                    break;
                case 79444:
                    if (type.equals(ea.a.p("Y1BU", "XIZN0K3P"))) {
                        fileRepository2.getClass();
                        list = kotlin.collections.m.E0((Iterable) FileRepository.B.b());
                        break;
                    }
                    list = EmptyList.INSTANCE;
                    break;
                case 2670346:
                    if (type.equals(ea.a.p("B09lRA==", "JiP7z4Wy"))) {
                        fileRepository2.getClass();
                        list = FileRepository.p();
                        break;
                    }
                    list = EmptyList.INSTANCE;
                    break;
                case 66411159:
                    if (type.equals(ea.a.p("AFg3RUw=", "ZPEtwq2n"))) {
                        fileRepository2.getClass();
                        list = FileRepository.h();
                        break;
                    }
                    list = EmptyList.INSTANCE;
                    break;
                default:
                    list = EmptyList.INSTANCE;
                    break;
            }
            this.f22156e0 = i10;
            ArrayList<PdfPreviewEntity> arrayList = this.F0;
            arrayList.clear();
            boolean z11 = false;
            if (!list.isEmpty()) {
                switch (i10) {
                    case 200:
                        if (!ReaderHomeActivity.f26650n2) {
                            pdf.pdfreader.viewer.editor.free.utils.v.O(no.f.b(i()).f22632f, list);
                            arrayList.addAll(list);
                            break;
                        }
                        break;
                    case 201:
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) list.get(i11);
                            if (pdfPreviewEntity != null && pdfPreviewEntity.getRecent() == 1) {
                                arrayList.add(pdfPreviewEntity);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Collections.sort(arrayList, new h());
                            break;
                        }
                        break;
                    case 202:
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) list.get(i12);
                            if (pdfPreviewEntity2 != null && pdfPreviewEntity2.getFavorite() == 1) {
                                arrayList.add(pdfPreviewEntity2);
                            }
                        }
                        pdf.pdfreader.viewer.editor.free.utils.v.O(no.f.b(i()).f22632f, arrayList);
                        break;
                }
                if (arrayList.isEmpty()) {
                    if (ReaderHomeActivity.f26650n2 && i10 == 200) {
                        RelativeLayout relativeLayout = this.f22159h0;
                        if (relativeLayout != null) {
                            relativeLayout.setVisibility(0);
                        }
                        NestedScrollView nestedScrollView = this.f22170s0;
                        if (nestedScrollView != null) {
                            nestedScrollView.setVisibility(8);
                            N0();
                        }
                    } else {
                        RelativeLayout relativeLayout2 = this.f22159h0;
                        if (relativeLayout2 != null) {
                            relativeLayout2.setVisibility(8);
                        }
                        NestedScrollView nestedScrollView2 = this.f22170s0;
                        if (nestedScrollView2 != null) {
                            nestedScrollView2.setVisibility(0);
                            N0();
                        }
                    }
                } else {
                    NestedScrollView nestedScrollView3 = this.f22170s0;
                    if (nestedScrollView3 != null) {
                        nestedScrollView3.setVisibility(8);
                    }
                    RelativeLayout relativeLayout3 = this.f22159h0;
                    if (relativeLayout3 != null) {
                        relativeLayout3.setVisibility(0);
                        if (this.f22163l0 != null && this.E0.f27212g != 0) {
                            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(i())) {
                                this.f22163l0.setVisibility(8);
                            } else {
                                if (this.J) {
                                    Context r4 = r();
                                    if (wn.b.f31388d && r4 != null) {
                                        EventCenter.f(ea.a.p("W28mZTI=", "BAEmayin"));
                                        EventCenter.c(r4);
                                    }
                                }
                                this.f22163l0.setVisibility(0);
                                Y0();
                            }
                        }
                    }
                }
                t1.b(ea.a.p("JmVeci1zG0QpdAcgUGEjYRhzO3osOg==", "tIT8HsWU") + arrayList.size() + ea.a.p("E2YibBZUG3AXOg==", "7YPVnSK4") + type);
            } else {
                t1.b(ea.a.p("QWUvIANyDWcAZUdzU245ICBhRmFmYS9sc1IPYQxlP0hcbS5BEHQLdht0TS4AcxBpKGVBTClhJ2k9Z1Ag", "SjhMhW7B") + ReaderHomeActivity.f26650n2 + ea.a.p("E2YibBZUG3AXOg==", "9ExpKGaZ") + type);
                if (!ReaderHomeActivity.f26650n2 && arrayList.isEmpty()) {
                    NestedScrollView nestedScrollView4 = this.f22170s0;
                    if (nestedScrollView4 != null) {
                        nestedScrollView4.setVisibility(0);
                        N0();
                    }
                    RelativeLayout relativeLayout4 = this.f22159h0;
                    if (relativeLayout4 != null) {
                        relativeLayout4.setVisibility(8);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            z0(z10);
            pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = this.E0;
            if (dVar != null) {
                dVar.f27216k = i10;
                dVar.j(arrayList);
            }
            if (!arrayList.isEmpty() && i10 != 201) {
                z11 = true;
            }
            wk.b.b().e(new qo.c(z11, i10, type, !arrayList.isEmpty()));
        }
    }

    public final void b1() {
        if (this.f22162k0 != null && this.F0.size() > 0) {
            this.f22162k0.r0(0);
        }
    }

    public final void c1() {
        ArrayList<PdfPreviewEntity> arrayList;
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = this.E0;
        if (dVar != null && (arrayList = dVar.f27210e) != null && !arrayList.isEmpty()) {
            dVar.f27212g = 0;
            int size = arrayList.size();
            ArrayList<PdfPreviewEntity> arrayList2 = dVar.f27213h;
            if (arrayList2.size() == size) {
                arrayList2.clear();
            } else {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            }
            String p10 = ea.a.p("UGgkbwBl", "nKc45Xm0");
            String p11 = ea.a.p("LGhebwplaGE2bBVjGWkLaw==", "KQAntKlM");
            StringBuilder sb2 = new StringBuilder();
            String p12 = ea.a.p("OWxs", "1LXcVE9R");
            switch (dVar.f27216k) {
                case 200:
                    p12 = ea.a.p("Umxs", "ZK0eLPI8");
                    break;
                case 201:
                    p12 = ea.a.p("QWUoZR10", "0CCFu3wt");
                    break;
                case 202:
                    p12 = ea.a.p("OmE6aw==", "2YWHHzDk");
                    break;
                case 203:
                    p12 = ea.a.p("UmQvZWQ=", "oLTUSpyL");
                    break;
            }
            sb2.append(p12);
            sb2.append(ea.a.p("Xw==", "tnqbRwVx"));
            sb2.append(aj.b.t(dVar.f27217l));
            tn.a.d(dVar.f27209d, p10, p11, sb2.toString(), false);
            d.InterfaceC0353d interfaceC0353d = dVar.f27211f;
            if (interfaceC0353d != null) {
                if (arrayList2.size() > 0) {
                    ((n) interfaceC0353d).U0(size);
                } else {
                    ((n) interfaceC0353d).U0(0);
                }
            }
            dVar.h();
        }
    }

    public final void d1(boolean z10) {
        ea.a.p("W28mZVNpFmUfRkZhDm0zbjAgQWgpdS9kEGg5dwRtRnRKICJzNm0SdAs9", "CVA60q8c");
        if (z10) {
            RelativeLayout relativeLayout = this.f22159h0;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            if (this.f22170s0 != null) {
                ea.a.p("J29cZVlpQ2U3RjhhEm0NbkEgHWgqd0VlL3AheUI0NA==", "EUdoBUbU");
                this.f22170s0.setVisibility(0);
                N0();
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = this.f22159h0;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        if (this.f22170s0 != null) {
            ea.a.p("IG8uZXRpQmUlRhRhU20ybkwgOmktZRZlGXAFeXE0NA==", "M6HCT6Ze");
            this.f22170s0.setVisibility(8);
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void dismissDialogEvent(qo.a aVar) {
        if (i() != null && !(i() instanceof RecentAddedActivity) && aVar != null) {
            V0();
            int i10 = this.f22156e0;
            if (i10 == 201) {
                e1(i10, this.f22155d0);
                D0();
            }
        }
    }

    public final void e1(int i10, String str) {
        ArrayList<PdfPreviewEntity> E0 = E0();
        if (E0 != null && E0.size() != 0) {
            a1(i10, str);
        }
    }

    public final void f1(int i10, String str) {
        if (i() != null && (i() instanceof ReaderHomeActivity)) {
            a1(i10, str);
        }
    }

    @Override // mo.c, androidx.fragment.app.Fragment
    public final void m0(boolean z10) {
        super.m0(z10);
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = this.E0;
        if (dVar != null) {
            dVar.f27221p = z10;
            dVar.i();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void v0() {
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new mo.b(this, 1));
    }

    @Override // mo.c, pdf.pdfreader.viewer.editor.free.base.a
    public final void x0() {
        super.x0();
        i();
        this.f22162k0.setLayoutManager(new ReaderWrapContentLinearLayoutManager());
        this.f22162k0.setHasFixedSize(true);
        this.f22162k0.setItemViewCacheSize(7);
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = new pdf.pdfreader.viewer.editor.free.ui.adapter.d(this, this.f22156e0, this);
        this.E0 = dVar;
        dVar.f27217l = this.f22155d0;
        this.f22162k0.setAdapter(dVar);
        this.f22162k0.s(new a());
        TouchMonitorRecyclerView touchMonitorRecyclerView = this.f22162k0;
        DragSelectionProcessor dragSelectionProcessor = new DragSelectionProcessor(new o(this));
        dragSelectionProcessor.f28620a = DragSelectionProcessor.Mode.Simple;
        pdf.pdfreader.viewer.editor.free.utils.drag.a aVar = new pdf.pdfreader.viewer.editor.free.utils.drag.a();
        aVar.f28634k = dragSelectionProcessor;
        this.I0 = aVar;
        touchMonitorRecyclerView.r(aVar);
        if (this.f22156e0 == 203) {
            pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar2 = this.E0;
            ArrayList<PdfPreviewEntity> arrayList = this.F0;
            dVar2.j(arrayList);
            d1(arrayList.isEmpty());
        }
        gl.e eVar = gl.e.f17918a;
        d.a listener = this.E0.f27222q;
        eVar.getClass();
        kotlin.jvm.internal.g.e(listener, "listener");
        gl.f.f17921p.e().add(listener);
        gl.g.f17922p.e().add(listener);
        v0();
    }

    public n(String str) {
        new ArrayList();
        this.I0 = null;
        this.J0 = false;
        this.L0 = null;
        this.M0 = new b();
        this.N0 = new c();
        this.O0 = null;
        this.P0 = -1;
        this.f22155d0 = str;
    }
}
