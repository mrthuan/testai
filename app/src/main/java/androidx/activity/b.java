package androidx.activity;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.z;
import com.facebook.internal.e;
import com.google.android.material.search.SearchView;
import com.google.firebase.messaging.FirebaseMessaging;
import com.inmobi.media.A2;
import com.inmobi.media.C1662i1;
import com.inmobi.media.C1666i5;
import com.inmobi.media.C1688k;
import com.inmobi.media.C1761p5;
import com.inmobi.media.C1770q1;
import com.inmobi.media.C1813t6;
import com.inmobi.media.C1866x7;
import com.inmobi.media.Q3;
import com.inmobi.media.X0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import lib.zj.pdfeditor.ReaderPDFCore;
import mj.d0;
import mj.u;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner;
import pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderEncryptionAndDecryptionHelper;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import v5.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1800b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f1799a = i10;
        this.f1800b = obj;
    }

    private final void a() {
        mj.g gVar = (mj.g) this.f1800b;
        while (mj.g.f22080f) {
            d0 poll = gVar.f22082b.poll();
            if (poll != null) {
                poll.run();
            } else {
                Object obj = mj.g.f22079e;
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        gVar.getClass();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void b() {
        List list;
        Pair pair;
        PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) this.f1800b;
        FileRepository fileRepository = FileRepository.f24155a;
        kotlin.jvm.internal.g.e(pdfPreviewEntity, ea.a.p("a2VfdBB0eQ==", "enGuzhAu"));
        FileRepository.f24155a.getClass();
        PdfPreviewEntity E = t0.E(FileRepository.r(), pdfPreviewEntity);
        if (E != null) {
            FileRepository.r().remove(E);
            FileRepository.q().setValue(kotlin.collections.m.E0(FileRepository.r()));
            synchronized (FileRepository.j()) {
                ((List) FileRepository.E.getValue()).add(pdfPreviewEntity);
            }
            PdfPreviewEntity E2 = t0.E(RecentAddRepository.b(), pdfPreviewEntity);
            if (E2 != null && RecentAddRepository.b().remove(E2)) {
                RecentAddRepository.c().setValue(kotlin.collections.m.E0(RecentAddRepository.b()));
                RecentAddRepository.d().setValue(Integer.valueOf(((Number) RecentAddRepository.d().b()).intValue() - 1));
                String otherStrOne = pdfPreviewEntity.getOtherStrOne();
                if (otherStrOne != null) {
                    switch (otherStrOne.hashCode()) {
                        case 79058:
                            if (otherStrOne.equals(ea.a.p("H0RG", "KQxzdg6A"))) {
                                list = RecentAddRepository.h();
                                pair = new Pair(RecentAddRepository.i(), RecentAddRepository.j());
                                break;
                            }
                            break;
                        case 79444:
                            if (otherStrOne.equals(ea.a.p("Y1BU", "mwWGgY5o"))) {
                                list = RecentAddRepository.k();
                                pair = new Pair(RecentAddRepository.l(), RecentAddRepository.m());
                                break;
                            }
                            break;
                        case 2670346:
                            if (otherStrOne.equals(ea.a.p("ZE8ZRA==", "eTLKdV0x"))) {
                                list = RecentAddRepository.n();
                                pair = new Pair(RecentAddRepository.o(), RecentAddRepository.p());
                                break;
                            }
                            break;
                        case 66411159:
                            if (otherStrOne.equals(ea.a.p("ClhyRUw=", "nigUC4nx"))) {
                                list = RecentAddRepository.e();
                                pair = new Pair(RecentAddRepository.f(), RecentAddRepository.g());
                                break;
                            }
                            break;
                    }
                    if (list != null && pair != null && list.remove(pdfPreviewEntity)) {
                        ((kotlinx.coroutines.flow.r) pair.getSecond()).setValue(Integer.valueOf(((Number) ((kotlinx.coroutines.flow.r) pair.getSecond()).b()).intValue() - 1));
                        ((kotlinx.coroutines.flow.r) pair.getFirst()).setValue(kotlin.collections.m.E0(list));
                    }
                }
                list = null;
                pair = null;
                if (list != null) {
                    ((kotlinx.coroutines.flow.r) pair.getSecond()).setValue(Integer.valueOf(((Number) ((kotlinx.coroutines.flow.r) pair.getSecond()).b()).intValue() - 1));
                    ((kotlinx.coroutines.flow.r) pair.getFirst()).setValue(kotlin.collections.m.E0(list));
                }
            }
            String otherStrOne2 = E.getOtherStrOne();
            if (otherStrOne2 != null) {
                switch (otherStrOne2.hashCode()) {
                    case 79058:
                        if (otherStrOne2.equals(ea.a.p("Y0RG", "p5sGsdJD"))) {
                            FileRepository.v().remove(E);
                            FileRepository.u().setValue(kotlin.collections.m.E0(FileRepository.v()));
                            break;
                        }
                        break;
                    case 79444:
                        if (otherStrOne2.equals(ea.a.p("Y1BU", "2V2151ZB"))) {
                            FileRepository.x().remove(E);
                            FileRepository.w().setValue(kotlin.collections.m.E0(FileRepository.x()));
                            break;
                        }
                        break;
                    case 2670346:
                        if (otherStrOne2.equals(ea.a.p("ZE8ZRA==", "S5Dszeqo"))) {
                            FileRepository.z().remove(E);
                            FileRepository.y().setValue(kotlin.collections.m.E0(FileRepository.z()));
                            break;
                        }
                        break;
                    case 66411159:
                        if (otherStrOne2.equals(ea.a.p("dlgIRUw=", "7ahL5qCV"))) {
                            FileRepository.t().remove(E);
                            FileRepository.s().setValue(kotlin.collections.m.E0(FileRepository.t()));
                            break;
                        }
                        break;
                }
            }
            if (!FileRepository.i().get()) {
                FileRepository.o().execute(new c6.b(3));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.view.menu.j jVar = null;
        switch (this.f1799a) {
            case 0:
                ((ComponentActivity) this.f1800b).invalidateMenu();
                return;
            case 1:
            case 3:
            default:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) this.f1800b;
                int i10 = SubscriptionDarkTestFActivity.f24900a0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, ea.a.p("R2gic1cw", "9Vm0smHc"));
                if (!subscriptionDarkTestFActivity.isFinishing()) {
                    subscriptionDarkTestFActivity.C2().f1512b.setVisibility(0);
                    return;
                }
                return;
            case 2:
                Toolbar.f fVar = ((Toolbar) this.f1800b).M;
                if (fVar != null) {
                    jVar = fVar.f2473b;
                }
                if (jVar != null) {
                    jVar.collapseActionView();
                    return;
                }
                return;
            case 4:
                Fragment fragment = (Fragment) this.f1800b;
                x0 x0Var = fragment.Q;
                x0Var.f3959f.b(fragment.f3671d);
                fragment.f3671d = null;
                return;
            case 5:
                z this$0 = (z) this.f1800b;
                z zVar = z.f4083i;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                if (this$0.f4085b == 0) {
                    this$0.c = true;
                    this$0.f4088f.f(Lifecycle.Event.ON_PAUSE);
                }
                if (this$0.f4084a == 0 && this$0.c) {
                    this$0.f4088f.f(Lifecycle.Event.ON_STOP);
                    this$0.f4086d = true;
                    return;
                }
                return;
            case 6:
                v5.c this$02 = (v5.c) this.f1800b;
                c.a aVar = v5.c.f30658f;
                if (!k6.a.b(v5.c.class)) {
                    try {
                        kotlin.jvm.internal.g.e(this$02, "this$0");
                        this$02.b();
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(v5.c.class, th2);
                        return;
                    }
                }
                return;
            case 7:
                com.facebook.internal.e eVar = com.facebook.internal.e.f9761a;
                ((e.a) this.f1800b).a();
                return;
            case 8:
                ((SearchView) this.f1800b).d();
                return;
            case 9:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1800b;
                com.google.firebase.messaging.a aVar2 = FirebaseMessaging.f13641n;
                if (firebaseMessaging.e()) {
                    firebaseMessaging.g();
                    return;
                }
                return;
            case 10:
                A2.a((A2) this.f1800b);
                return;
            case 11:
                Q3.a((Q3) this.f1800b);
                return;
            case 12:
                X0.b((C1688k) this.f1800b);
                return;
            case 13:
                C1662i1.a((C1662i1) this.f1800b);
                return;
            case 14:
                C1666i5.b((C1666i5) this.f1800b);
                return;
            case 15:
                C1761p5.c((C1761p5) this.f1800b);
                return;
            case 16:
                C1770q1.c((C1770q1) this.f1800b);
                return;
            case 17:
                C1813t6.a((C1813t6) this.f1800b);
                return;
            case 18:
                C1866x7.a((WeakReference) this.f1800b);
                return;
            case 19:
                a();
                return;
            case 20:
                mj.p pVar = (mj.p) this.f1800b;
                pVar.f22126d.f21697o = null;
                pVar.f22126d.f21687f.invalidate();
                return;
            case 21:
                lib.zj.pdfeditor.text.editor.a.c(((u) this.f1800b).c);
                return;
            case 22:
                ((AppOpenManager) this.f1800b).f23908h = false;
                return;
            case 23:
                FlutterBanner flutterBanner = (FlutterBanner) this.f1800b;
                kotlin.jvm.internal.g.e(flutterBanner, ea.a.p("O2hYc10w", "RMLmoXzc"));
                if (flutterBanner.c != BannerType.None) {
                    flutterBanner.o();
                    return;
                }
                return;
            case 24:
                CameraHelper.g((CameraHelper) this.f1800b);
                return;
            case 25:
                b();
                return;
            case 26:
                DecryptAndCopyUIHelper decryptAndCopyUIHelper = (DecryptAndCopyUIHelper) this.f1800b;
                kotlin.jvm.internal.g.e(decryptAndCopyUIHelper, ea.a.p("TGgac1Aw", "zM8styZH"));
                HashMap<String, ReaderPDFCore> hashMap = decryptAndCopyUIHelper.f24221f;
                for (Map.Entry<String, ReaderPDFCore> entry : hashMap.entrySet()) {
                    try {
                        o9.d.r(ea.a.p("DGUacjxwAkEmZCVvRHkCSXBlPnAschZkEXMFcj55YmMncmU=", "1yHyEvx3"));
                        entry.getValue().onDestroy();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        f.q("d2UocgpwFkEcZHdvGXkDSQxlXnAjcmNkEnMzcg55UGNcci4gFngBZQJ0XW9u", "wGapcpxf", dp.a.a());
                    }
                }
                hashMap.clear();
                return;
            case 27:
                ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper = (ReaderEncryptionAndDecryptionHelper) this.f1800b;
                readerEncryptionAndDecryptionHelper.c(readerEncryptionAndDecryptionHelper.f24237d.getAbsolutePath(), true);
                return;
            case 28:
                AIChatRecyclerView aIChatRecyclerView = (AIChatRecyclerView) this.f1800b;
                int i11 = AIChatRecyclerView.L0;
                kotlin.jvm.internal.g.e(aIChatRecyclerView, ea.a.p("R2gic1cw", "mvaUh6UR"));
                boolean canScrollVertically = aIChatRecyclerView.canScrollVertically(1);
                pdf.pdfreader.viewer.editor.free.feature.ai.widget.g gVar = aIChatRecyclerView.G0;
                if (gVar != null) {
                    gVar.a(canScrollVertically);
                    return;
                }
                return;
        }
    }
}
