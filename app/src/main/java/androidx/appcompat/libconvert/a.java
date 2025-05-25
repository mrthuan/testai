package androidx.appcompat.libconvert;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.libconvert.ConvertCore;
import androidx.core.content.e;
import androidx.fragment.app.SpecialEffectsController;
import androidx.lifecycle.w;
import b7.h;
import c7.p;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.lib.flutter.encrypt.NativeAppGlobalApi;
import d7.a;
import db.a;
import gf.b;
import h5.m;
import io.flutter.plugins.pathprovider.Messages;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import k9.n;
import lib.zj.office.wp.control.Word;
import m7.g;
import ma.j0;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import s0.d;
import v6.s;
import x0.f0;
import x0.s0;
import x0.u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ConvertCore.OnProgressHandler, d.a, d5.a, a.InterfaceC0194a, p.a, y0.d, a.InterfaceC0196a, Continuation, b.c, cj.a, u, androidx.activity.result.b, ro.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1923a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1924b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f1923a = i10;
        this.f1924b = obj;
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        Map map = (Map) this.f1924b;
        Cursor cursor = (Cursor) obj;
        s6.b bVar = p.f5653f;
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new p.b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    @Override // d5.a
    public final void b(boolean z10) {
        m mVar = (m) this.f1924b;
        if (z10) {
            mVar.g(mVar.f18044j);
        }
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        ReaderConvertPreviewActivity.O2((ReaderConvertPreviewActivity) this.f1924b, (Map) obj);
    }

    @Override // db.a.InterfaceC0196a
    public final void g(db.b bVar) {
        ia.a aVar = (ia.a) this.f1924b;
        aVar.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        da.a aVar2 = (da.a) bVar.get();
        e eVar = new e(aVar2);
        ia.b bVar2 = new ia.b();
        da.b d10 = aVar2.d("clx", bVar2);
        if (d10 == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            d10 = aVar2.d("crash", bVar2);
        }
        if (d10 != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            g gVar = new g(3);
            ka.c cVar = new ka.c(eVar, TimeUnit.MILLISECONDS);
            synchronized (aVar) {
                Iterator it = aVar.c.iterator();
                while (it.hasNext()) {
                    gVar.b((la.a) it.next());
                }
                bVar2.f18479b = gVar;
                bVar2.f18478a = cVar;
                aVar.f18477b = gVar;
                aVar.f18476a = cVar;
            }
        }
    }

    @Override // cj.a
    public final int j() {
        return ((Word) this.f1924b).getPageCount();
    }

    @Override // d7.a.InterfaceC0194a
    public final Object l() {
        h hVar = (h) this.f1924b;
        for (s sVar : hVar.f5371b.G()) {
            hVar.c.a(sVar, 1);
        }
        return null;
    }

    @Override // x0.u
    public final s0 m(View view, s0 s0Var) {
        int i10;
        UserGuideActivity userGuideActivity = (UserGuideActivity) this.f1924b;
        UserGuideActivity.a aVar = UserGuideActivity.f24980y;
        kotlin.jvm.internal.g.e(userGuideActivity, ea.a.p("R2gic1cw", "QGS2c85a"));
        kotlin.jvm.internal.g.e(view, ea.a.p("dg==", "bf81PHvm"));
        ea.a.p("Wm44ZQdz", "Z1ZaH2gS");
        if (userGuideActivity.hasWindowFocus() || view.getPaddingBottom() == 0) {
            o0.b a10 = s0Var.a(7);
            kotlin.jvm.internal.g.d(a10, ea.a.p("Jm5CZQ1zGWc_dANuBmUccx1XB24hbxJJo4CUQzptBGE7LmV5CWUZcyNzPmUYQglyRihHKQ==", "xUkMA2Ut"));
            if (userGuideActivity.f19294h) {
                i10 = 0;
            } else {
                i10 = a10.f22641d;
            }
            view.setPadding(a10.f22639a, 0, a10.c, i10);
        }
        return s0Var;
    }

    @Override // gf.b.c
    public final void n(Object obj, gf.a aVar) {
        Object h10;
        int i10 = this.f1923a;
        Object obj2 = this.f1924b;
        switch (i10) {
            case 10:
                NativeAppGlobalApi nativeAppGlobalApi = (NativeAppGlobalApi) obj2;
                NativeAppGlobalApi.Companion companion = NativeAppGlobalApi.Companion.f15737a;
                ea.a.p("KmU8bHk=", "6qXL1fyI");
                kotlin.jvm.internal.g.c(obj, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuH25XbgZsGSA7eUFlWWtYdDZpJC4WbwRsUGMaaSpuFi48aQl0T2sadCNpXy44bk4_Pg==", "WK1fpzsu"));
                Object obj3 = ((List) obj).get(0);
                kotlin.jvm.internal.g.c(obj3, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuFW5pbhhsXSBHeTtlU2sNdB5pWi46dCRpKmc=", "zDm1OQ4a"));
                try {
                    h10 = ge.a.H(nativeAppGlobalApi.a((String) obj3));
                } catch (Throwable th2) {
                    h10 = b.b.h(th2);
                }
                aVar.i(h10);
                return;
            default:
                Messages.a aVar2 = (Messages.a) obj2;
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, ((io.flutter.plugins.pathprovider.a) aVar2).f18831a.getCacheDir().getPath());
                } catch (Throwable th3) {
                    arrayList = Messages.a(th3);
                }
                aVar.i(arrayList);
                return;
        }
    }

    @Override // ro.a
    public final void o(Object obj) {
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.e eVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.e) this.f1924b;
        int i10 = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.e.f27680f;
        kotlin.jvm.internal.g.e(eVar, ea.a.p("BWhec3Ew", "6bq7Uel8"));
        eVar.f27681d = false;
        eVar.c = null;
        if (!((Boolean) obj).booleanValue()) {
            ea.a.p("J28PZVBvAWUmVw90XEM2bltlPiAqaFNjHyAQZzBpbg==", "i3ObpqFc");
            String str = n0.f28727a;
            w<po.b> wVar = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c.f27668m;
            c.a.a(eVar);
        }
    }

    @Override // s0.d.a
    public final void onCancel() {
        SpecialEffectsController.Operation this$0 = (SpecialEffectsController.Operation) this.f1924b;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.a();
    }

    @Override // androidx.appcompat.libconvert.ConvertCore.OnProgressHandler
    public final void onProgress(int i10, int i11) {
        ((ConvertCore.ConvertCallback) this.f1924b).onProgress(i10, i11);
    }

    @Override // y0.d
    public final void onTouchExplorationStateChanged(boolean z10) {
        boolean z11;
        n nVar = (n) this.f1924b;
        AutoCompleteTextView autoCompleteTextView = nVar.f19671h;
        if (autoCompleteTextView != null) {
            int i10 = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (z10) {
                    i10 = 2;
                }
                WeakHashMap<View, x0.n0> weakHashMap = f0.f31435a;
                f0.d.s(nVar.f19684d, i10);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i10 = this.f1923a;
        Object obj = this.f1924b;
        switch (i10) {
            case 8:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                ExecutorService executorService = j0.f21911a;
                if (task.o()) {
                    taskCompletionSource.b(task.k());
                    return null;
                } else if (task.j() != null) {
                    taskCompletionSource.a(task.j());
                    return null;
                } else {
                    return null;
                }
            default:
                ((jb.m) obj).getClass();
                Bundle bundle = (Bundle) task.l();
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if (!"RST".equals(string2)) {
                        if (string2 != null) {
                            throw new IOException(string2);
                        }
                        bundle.toString();
                        new Throwable();
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    throw new IOException("INSTANCE_ID_RESET");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
