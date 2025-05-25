package mo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.h0;
import com.tom_roush.fontbox.ttf.WGL4Names;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.greenrobot.eventbus.ThreadMode;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.h;
import pdf.pdfreader.viewer.editor.free.ui.dialog.u2;
import pdf.pdfreader.viewer.editor.free.ui.frag.n;
import pdf.pdfreader.viewer.editor.free.ui.myview.TouchMonitorRecyclerView;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qo.m;
import qo.q;
import v0.f;
import wk.i;

/* compiled from: PdfReaderBaseFragment.java */
/* loaded from: classes3.dex */
public abstract class c extends pdf.pdfreader.viewer.editor.free.base.a implements xn.c {
    public static Point A0 = null;
    public static ro.c B0 = null;
    public static boolean C0 = false;
    public static boolean D0 = false;

    /* renamed from: z0  reason: collision with root package name */
    public static int f22154z0 = -1;

    /* renamed from: d0  reason: collision with root package name */
    public String f22155d0 = ea.a.p("ckxM", "V5HUaLb3");

    /* renamed from: e0  reason: collision with root package name */
    public int f22156e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f22157f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public FrameLayout f22158g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f22159h0;

    /* renamed from: i0  reason: collision with root package name */
    public Space f22160i0;

    /* renamed from: j0  reason: collision with root package name */
    public LinearLayout f22161j0;

    /* renamed from: k0  reason: collision with root package name */
    public TouchMonitorRecyclerView f22162k0;

    /* renamed from: l0  reason: collision with root package name */
    public ConstraintLayout f22163l0;

    /* renamed from: m0  reason: collision with root package name */
    public AppCompatTextView f22164m0;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f22165n0;

    /* renamed from: o0  reason: collision with root package name */
    public AppCompatImageView f22166o0;

    /* renamed from: p0  reason: collision with root package name */
    public TextView f22167p0;

    /* renamed from: q0  reason: collision with root package name */
    public TextView f22168q0;

    /* renamed from: r0  reason: collision with root package name */
    public ProgressBar f22169r0;

    /* renamed from: s0  reason: collision with root package name */
    public NestedScrollView f22170s0;

    /* renamed from: t0  reason: collision with root package name */
    public TouchMonitorRecyclerView.a f22171t0;

    /* renamed from: u0  reason: collision with root package name */
    public RenameDialog f22172u0;

    /* renamed from: v0  reason: collision with root package name */
    public g2 f22173v0;

    /* renamed from: w0  reason: collision with root package name */
    public DecryptAndCopyUIHelper f22174w0;

    /* renamed from: x0  reason: collision with root package name */
    public h f22175x0;

    /* renamed from: y0  reason: collision with root package name */
    public u2 f22176y0;

    /* compiled from: PdfReaderBaseFragment.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = c.this;
            if (cVar.G0() == 200) {
                cVar.q0(WGL4Names.NUMBER_OF_MAC_GLYPHS, null);
            }
        }
    }

    /* compiled from: PdfReaderBaseFragment.java */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i10 = c.f22154z0;
            c.this.q0(263, null);
        }
    }

    /* compiled from: PdfReaderBaseFragment.java */
    /* renamed from: mo.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class View$OnLayoutChangeListenerC0293c implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC0293c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (view.getMeasuredHeight() <= 0) {
                return;
            }
            c cVar = c.this;
            ViewGroup.LayoutParams layoutParams = cVar.f22160i0.getLayoutParams();
            layoutParams.height = (cVar.f22158g0.getMeasuredHeight() - cVar.f22161j0.getMeasuredHeight()) / 3;
            cVar.f22160i0.setLayoutParams(layoutParams);
        }
    }

    /* compiled from: PdfReaderBaseFragment.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public int f22180a = -1;

        public d() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (this.f22180a == view.getMeasuredHeight()) {
                return;
            }
            this.f22180a = view.getMeasuredHeight();
            c.this.y0();
        }
    }

    /* compiled from: PdfReaderBaseFragment.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22182a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f22183b;

        /* compiled from: PdfReaderBaseFragment.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                g2 g2Var = c.this.f22173v0;
                if (g2Var != null && g2Var.isShowing()) {
                    c.this.f22173v0.cancel();
                }
                if (eVar.f22183b) {
                    if (c.this.r() != null) {
                        tn.a.d(c.this.r(), ea.a.p("Q2E4cwRvEGQ=", "NEd0Dzjq"), ea.a.p("AGEVcyVzN3cXZAluZQ==", "iHpfzG19"), ea.a.p("Xm85ZQ==", "bXcECSS2"), false);
                        j1.e(c.this.r(), c.this.r().getString(R.string.arg_res_0x7f1303aa), false, androidx.core.content.a.getDrawable(c.this.r(), R.drawable.ic_more_lock), c.this.H0());
                    }
                } else if (c.this.r() != null) {
                    tn.a.d(c.this.r(), ea.a.p("Q2E4cwRvEGQ=", "drB5Xe2s"), ea.a.p("P2FCcyZyR3cFZCVuZQ==", "mMdnk4Nx"), ea.a.p("Xm85ZQ==", "JNHIY2Y0"), false);
                    j1.e(c.this.r(), c.this.r().getString(R.string.arg_res_0x7f1303c4), true, androidx.core.content.a.getDrawable(c.this.r(), R.drawable.ic_more_unlock), c.this.H0());
                }
                c.this.L0(eVar.f22182a, Boolean.valueOf(eVar.f22183b));
            }
        }

        public e(String str, boolean z10) {
            this.f22182a = str;
            this.f22183b = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view;
            a aVar;
            c cVar = c.this;
            try {
                try {
                    v.b();
                    cVar.g0();
                    view = cVar.H;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    view = cVar.H;
                    if (view != null) {
                        aVar = new a();
                    } else {
                        return;
                    }
                }
                if (view != null) {
                    aVar = new a();
                    view.post(aVar);
                }
            } catch (Throwable th2) {
                View view2 = cVar.H;
                if (view2 != null) {
                    view2.post(new a());
                }
                throw th2;
            }
        }
    }

    public static void M0(int i10, int i11) {
        wk.b.b().e(new q(i10, i11));
    }

    public abstract void A0(ArrayList<PdfPreviewEntity> arrayList);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r1.isShowing() == true) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0() {
        /*
            r3 = this;
            pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog r0 = r3.f22172u0
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lf
            pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog r0 = r3.f22172u0
            r0.cancel()
        Lf:
            pdf.pdfreader.viewer.editor.free.ui.dialog.h r0 = r3.f22175x0
            if (r0 == 0) goto L1e
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L1e
            pdf.pdfreader.viewer.editor.free.ui.dialog.h r0 = r3.f22175x0
            r0.cancel()
        L1e:
            pdf.pdfreader.viewer.editor.free.ui.dialog.u2 r0 = r3.f22176y0
            if (r0 == 0) goto L2d
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L2d
            pdf.pdfreader.viewer.editor.free.ui.dialog.u2 r0 = r3.f22176y0
            r0.cancel()
        L2d:
            pdf.pdfreader.viewer.editor.free.ui.dialog.g2 r0 = r3.f22173v0
            if (r0 == 0) goto L3c
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L3c
            pdf.pdfreader.viewer.editor.free.ui.dialog.g2 r0 = r3.f22173v0
            r0.cancel()
        L3c:
            pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper r0 = r3.f22174w0
            if (r0 == 0) goto L58
            pdf.pdfreader.viewer.editor.free.ui.dialog.f0 r1 = r0.e()
            if (r1 == 0) goto L4e
            boolean r1 = r1.isShowing()
            r2 = 1
            if (r1 != r2) goto L4e
            goto L4f
        L4e:
            r2 = 0
        L4f:
            if (r2 == 0) goto L58
            pdf.pdfreader.viewer.editor.free.ui.dialog.f0 r0 = r0.e()
            r0.dismiss()
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mo.c.B0():void");
    }

    public abstract void C0();

    public final void D0() {
        t1.b(ea.a.p("QHcicBZSB2YAZUdoJWEvbzF0EmIncyZGMWEjbQ9uOyBWbi9TFmwHYwZPRHQAbzhzfnRAdWU=", "CDjOSGGg"));
        wk.b.b().e(new qo.b(true));
        C0();
    }

    public ArrayList<PdfPreviewEntity> E0() {
        if (i() != null && (i() instanceof ReaderHomeActivity)) {
            return ((ReaderHomeActivity) i()).U;
        }
        return null;
    }

    public final String F0() {
        if (G0() == 200) {
            return ea.a.p("Umxs", "BXmVg0Or");
        }
        if (G0() == 201) {
            return ea.a.p("PWVSZRd0", "CfVC1cmN");
        }
        if (G0() == 202) {
            return ea.a.p("XmE5aw==", "h2fyuoLa");
        }
        return "";
    }

    public abstract int G0();

    public final int H0() {
        u i10 = i();
        if (i10 instanceof ReaderHomeActivity) {
            return (int) ((ReaderHomeActivity) i10).getResources().getDimension(R.dimen.dp_104);
        }
        return -1;
    }

    public final Context I0() {
        Context context;
        WeakReference<Activity> weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            context = this.Y.get();
        } else {
            context = null;
        }
        if (context == null) {
            context = i();
        }
        if (context == null) {
            return r();
        }
        return context;
    }

    public abstract void J0(PdfPreviewEntity pdfPreviewEntity);

    @Override // androidx.fragment.app.Fragment
    public final void K(Activity activity) {
        B0 = (ro.c) activity;
        this.F = true;
    }

    public abstract void K0(long j10, String str);

    @Override // pdf.pdfreader.viewer.editor.free.base.a, androidx.fragment.app.Fragment
    public final void L(Context context) {
        if (context instanceof Activity) {
            B0 = (ro.c) context;
        }
        super.L(context);
    }

    public abstract void L0(String str, Boolean bool);

    @Override // androidx.fragment.app.Fragment
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (B0 == null && i() != null) {
            B0 = (ro.c) i();
        }
        k0(true);
    }

    public final void N0() {
        boolean isExternalStorageManager;
        ea.a.p("X28LZRJpJmUlRhRhU20ybkwgIWgmd35pEGU0bSF0O0dYdAlTV3Q=", "um7f2RPY");
        boolean z10 = true;
        if (h1.c()) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager && ((n) this).f22156e0 == 200) {
                if (this.J) {
                    Context r4 = r();
                    if (wn.b.f31388d && r4 != null) {
                        EventCenter.f(ea.a.p("HG8vZTE=", "fMtBP8o9"));
                        EventCenter.c(r4);
                    }
                }
                this.f22164m0.setVisibility(0);
                this.f22165n0.setVisibility(0);
                this.f22165n0.setText(x(R.string.arg_res_0x7f13036e));
                this.f22166o0.setImageResource(R.drawable.ic_home_no_permission);
                this.f22167p0.setVisibility(0);
                this.f22168q0.setVisibility(8);
                ArrayList<PdfPreviewEntity> E0 = E0();
                NestedScrollView nestedScrollView = this.f22170s0;
                if (E0 == null || E0.size() <= 0) {
                    z10 = false;
                }
                nestedScrollView.setNestedScrollingEnabled(z10);
                return;
            }
        }
        this.f22164m0.setVisibility(8);
        this.f22165n0.setVisibility(8);
        this.f22166o0.setImageResource(R.drawable.ic_home_no_file);
        this.f22167p0.setVisibility(8);
        this.f22168q0.setVisibility(0);
        this.f22170s0.setNestedScrollingEnabled(true);
    }

    public final void O0(PdfPreviewEntity pdfPreviewEntity, DecryptAndCopyUIHelper.b bVar) {
        Context I0 = I0();
        if (I0 != null) {
            p0(I0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(aj.b.l(pdfPreviewEntity));
            DecryptAndCopyUIHelper decryptAndCopyUIHelper = new DecryptAndCopyUIHelper(I0, arrayList, bVar);
            this.f22174w0 = decryptAndCopyUIHelper;
            decryptAndCopyUIHelper.g();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a, androidx.fragment.app.Fragment
    public void P() {
        ArrayList arrayList;
        super.P();
        wk.b.b().k(this);
        TouchMonitorRecyclerView touchMonitorRecyclerView = this.f22162k0;
        if (touchMonitorRecyclerView != null && (arrayList = touchMonitorRecyclerView.f4233j0) != null) {
            arrayList.remove((Object) null);
        }
        B0();
    }

    public abstract void P0();

    public final void Q0() {
        if (r() == null) {
            return;
        }
        ea.a.p("W28mZVNpFmUfRkZhDm0zbjAgQWgpdwxyemkeZRZlK21aczhpHG4uYQtvQXQ=", "2zFY0Gt2");
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(r())) {
            ea.a.p("OW8gZXZpPGUlRhRhU20ybkwgOmktZRZlGXAFeXEzMw==", "WoQMVHJf");
            this.f22170s0.setVisibility(8);
            this.f22159h0.setVisibility(0);
            return;
        }
        ea.a.p("W28mZVNpFmUfRkZhDm0zbjAgQWgpd2NlXXAteWIzMw==", "0YBKEq9H");
        this.f22170s0.setVisibility(0);
        this.f22159h0.setVisibility(8);
    }

    @Override // xn.c
    public final void c(String str, boolean z10) {
        if (!z10) {
            String F0 = F0();
            if (!TextUtils.isEmpty(F0)) {
                tn.a.d(r(), ea.a.p("N2kjZRhtOHJl", "b8QOGW8q"), ea.a.p("VWknZR5vEGUtcllwGncyXyBvXGU=", "5jhYOo8J"), F0, false);
            }
        }
        w0.a().f28790a.execute(new e(str, z10));
    }

    @Override // xn.c
    public final void g() {
        String F0 = F0();
        if (!TextUtils.isEmpty(F0)) {
            tn.a.d(r(), ea.a.p("KWldZSZtWHJl", "jpfmec3M"), ea.a.p("VWknZR5vEGUtcllwGncyXyFyQG9y", "0Qqb5LIe"), F0, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void m0(boolean z10) {
        super.m0(z10);
        if (z10) {
            AppCompatTextView appCompatTextView = this.f22164m0;
            if (appCompatTextView != null && appCompatTextView.getVisibility() == 0) {
                EventCenter.f(ea.a.p("AG8BZTE=", "rqhlPGK8"));
            }
            ConstraintLayout constraintLayout = this.f22163l0;
            if (constraintLayout != null && constraintLayout.getVisibility() == 0) {
                EventCenter.f(ea.a.p("W28mZTI=", "vLiSclHq"));
            }
        }
    }

    @i(threadMode = ThreadMode.MAIN)
    public void onSearchEvent(m mVar) {
        ArrayList<PdfPreviewEntity> E0 = E0();
        if (mVar != null && E0 != null && E0.size() > 0) {
            t1.b(ea.a.p("UmwnUBdmLmkBdBRzAHozOg==", "Wjdq0eV3") + E0.size());
            PdfPreviewEntity pdfPreviewEntity = mVar.f29410g;
            if (pdfPreviewEntity != null) {
                t1.b(ea.a.p("H2RXUAtlQWk_dw9uAWkceRVwCmY6", "y2chobWi") + pdfPreviewEntity.getFavorite());
                long id2 = pdfPreviewEntity.getId();
                String path = pdfPreviewEntity.getPath();
                long date = pdfPreviewEntity.getDate();
                String name = pdfPreviewEntity.getName();
                int favorite = pdfPreviewEntity.getFavorite();
                long favoriteDate = pdfPreviewEntity.getFavoriteDate();
                Iterator<PdfPreviewEntity> it = E0.iterator();
                while (it.hasNext()) {
                    PdfPreviewEntity next = it.next();
                    if (id2 == next.getId() || TextUtils.equals(path, next.getPath())) {
                        t1.b(ea.a.p("H2RXUAtlQWk_dw9uAWkceRVwCmZlbAxzADo=", "reVhtw2K") + next.getPath());
                        pdfPreviewEntity = next;
                    }
                }
                if (pdfPreviewEntity != null) {
                    if (mVar.f29405a) {
                        E0.remove(pdfPreviewEntity);
                    } else if (mVar.f29406b) {
                        pdfPreviewEntity.setRecent(0);
                        pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
                    } else if (mVar.c) {
                        pdfPreviewEntity.setPath(path);
                        pdfPreviewEntity.setDate(date);
                        pdfPreviewEntity.setName(name);
                    } else if (mVar.f29407d) {
                        pdfPreviewEntity.setFavoriteDate(favoriteDate);
                        pdfPreviewEntity.setFavorite(favorite);
                    } else if (mVar.f29408e) {
                        pdfPreviewEntity.setRecent(1);
                        pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
                    } else if (mVar.f29409f) {
                        pdfPreviewEntity.setDate(date);
                    }
                    if (mVar.f29405a) {
                        FileRepository.f24155a.getClass();
                        FileRepository.k().execute(new androidx.activity.b(pdfPreviewEntity, 25));
                    } else {
                        FileRepository.I(pdfPreviewEntity);
                    }
                    if (r() != null) {
                        bm.c.b(r()).i(pdfPreviewEntity);
                    }
                    J0(pdfPreviewEntity);
                }
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void s0() {
        wk.b.b().i(this);
        this.f22158g0 = (FrameLayout) r0(R.id.container);
        this.f22160i0 = (Space) r0(R.id.top_space);
        this.f22159h0 = (RelativeLayout) r0(R.id.ll_content_wrapper);
        this.f22161j0 = (LinearLayout) r0(R.id.ll_empty_wrapper);
        this.f22165n0 = (TextView) r0(R.id.tv_empty_desc);
        this.f22166o0 = (AppCompatImageView) r0(R.id.iv_empty);
        this.f22164m0 = (AppCompatTextView) r0(R.id.tv_gotoset);
        this.f22167p0 = (TextView) r0(R.id.tv_no_permission_title);
        this.f22168q0 = (TextView) r0(R.id.tv_empty_title);
        this.f22169r0 = (ProgressBar) r0(R.id.center_progress);
        this.f22163l0 = (ConstraintLayout) r0(R.id.layout_request_permission);
        if (G0() == 201 || G0() == 202) {
            this.f22164m0.setVisibility(8);
        }
        TouchMonitorRecyclerView touchMonitorRecyclerView = (TouchMonitorRecyclerView) r0(R.id.pdf_act_main_rv2);
        this.f22162k0 = touchMonitorRecyclerView;
        boolean z10 = false;
        if (touchMonitorRecyclerView != null) {
            ((h0) touchMonitorRecyclerView.getItemAnimator()).f4455g = false;
            TouchMonitorRecyclerView.a aVar = this.f22171t0;
            if (aVar != null) {
                this.f22162k0.setScrollOnTouchListener(aVar);
            }
        }
        this.f22170s0 = (NestedScrollView) r0(R.id.scroll_view);
        this.f22164m0.setOnClickListener(new a());
        if (r() != null) {
            a0.a(g0(), false);
            Locale d10 = a0.d(r());
            int i10 = f.f30479a;
            if (f.a.a(d10) == 1) {
                z10 = true;
            }
            TextView textView = (TextView) r0(R.id.tips_message);
            if (ea.a.p("I3I=", "97E9p1oq").equals(a0.f(r()))) {
                textView.setLineSpacing(0.0f, 1.0f);
            }
            if (!z10) {
                textView.setText(b.b.E(r(), R.mipmap.ic_permission_arrows2, x(R.string.arg_res_0x7f13036e)));
            } else {
                textView.setText(b.b.E(r(), R.mipmap.ic_permission_arrows_rtl, x(R.string.arg_res_0x7f13036e)));
            }
        }
        r0(R.id.go_to_permission).setOnClickListener(new b());
        P0();
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final int u0() {
        return R.layout.fragment_history_list;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public void x0() {
        this.f22161j0.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0293c());
        if (this.f22157f0) {
            this.f22162k0.addOnLayoutChangeListener(new d());
        }
        if (this.f22168q0 != null && r() != null) {
            if (TextUtils.equals(this.f22155d0, ea.a.p("Y0RG", "we0L6CuI"))) {
                this.f22168q0.setText(y(R.string.arg_res_0x7f130321, ea.a.p("Y0RG", "S8mF6TYJ")));
            } else if (TextUtils.equals(this.f22155d0, ea.a.p("FE8XRA==", "IqCEJCoW"))) {
                this.f22168q0.setText(y(R.string.arg_res_0x7f130321, ea.a.p("GG9DZA==", "gpdTIGVW")));
            } else if (TextUtils.equals(this.f22155d0, ea.a.p("H1BU", "cTCLIDdV"))) {
                this.f22168q0.setText(y(R.string.arg_res_0x7f130321, ea.a.p("Y1BU", "V70MyEx7")));
            } else if (TextUtils.equals(this.f22155d0, ea.a.p("dlgIRUw=", "JO8CH5tG"))) {
                this.f22168q0.setText(y(R.string.arg_res_0x7f130321, ea.a.p("dngoZWw=", "GrSQj8yV")));
            } else {
                this.f22168q0.setText(x(R.string.arg_res_0x7f130320));
            }
        }
        if (!TextUtils.equals(this.f22155d0, ea.a.p("DkxM", "pglTzMuz"))) {
            fo.a.f17317b.e(this, new mo.b(this, 0));
        }
    }

    public final void y0() {
        TouchMonitorRecyclerView touchMonitorRecyclerView = this.f22162k0;
        if (touchMonitorRecyclerView == null) {
            return;
        }
        int dimensionPixelSize = touchMonitorRecyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.dp_78);
        if (f22154z0 > 0) {
            int measuredHeight = (this.f22162k0.getMeasuredHeight() - f22154z0) / dimensionPixelSize;
            int measuredHeight2 = this.f22162k0.getMeasuredHeight() / dimensionPixelSize;
            if (measuredHeight >= 0) {
                A0 = new Point(measuredHeight, measuredHeight2);
            } else {
                A0 = null;
            }
        }
    }

    public final void z0(boolean z10) {
        int i10;
        if (this.f22169r0 != null) {
            ea.a.p("PG8AZU1pTWUlRhRhU20ybkwgIGUtOhZjHGEfZzRDJ24gZR9QH29eci1zFVNVdDI6", "fHTmm9dt");
            ProgressBar progressBar = this.f22169r0;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            progressBar.setVisibility(i10);
        }
    }

    @Override // xn.c
    public final void R0() {
    }

    @Override // androidx.fragment.app.Fragment
    public final void U() {
    }

    @Override // xn.c
    public final void V(int i10) {
    }

    @Override // xn.c
    public final void w0(Throwable th2) {
    }
}
