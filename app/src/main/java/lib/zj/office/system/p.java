package lib.zj.office.system;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Toast;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l.t;
import lib.zj.office.fc.doc.TXTKit;
import lib.zj.office.fc.pdf.PDFLib;
import qb.f1;

/* compiled from: MainControl.java */
/* loaded from: classes3.dex */
public final class p extends androidx.privacysandbox.ads.adservices.topics.d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21049a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21050b;
    public boolean c;

    /* renamed from: e  reason: collision with root package name */
    public String f21052e;

    /* renamed from: f  reason: collision with root package name */
    public final i f21053f;

    /* renamed from: g  reason: collision with root package name */
    public sg.c f21054g;

    /* renamed from: h  reason: collision with root package name */
    public sg.b f21055h;

    /* renamed from: i  reason: collision with root package name */
    public j f21056i;

    /* renamed from: j  reason: collision with root package name */
    public Toast f21057j;

    /* renamed from: k  reason: collision with root package name */
    public ProgressDialog f21058k;

    /* renamed from: l  reason: collision with root package name */
    public m f21059l;

    /* renamed from: m  reason: collision with root package name */
    public n f21060m;

    /* renamed from: n  reason: collision with root package name */
    public androidx.privacysandbox.ads.adservices.topics.d f21061n;

    /* renamed from: o  reason: collision with root package name */
    public final r f21062o;

    /* renamed from: d  reason: collision with root package name */
    public byte f21051d = -1;

    /* renamed from: p  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f21063p = Thread.getDefaultUncaughtExceptionHandler();

    /* compiled from: MainControl.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f21064a;

        public a(Object obj) {
            this.f21064a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p pVar = p.this;
            if (!pVar.f21049a) {
                pVar.f21053f.l0(((Boolean) this.f21064a).booleanValue());
            }
        }
    }

    /* compiled from: MainControl.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            p pVar = p.this;
            if (!pVar.f21049a) {
                pVar.f21053f.l0(true);
            }
        }
    }

    /* compiled from: MainControl.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            p pVar = p.this;
            if (!pVar.f21049a) {
                pVar.f21053f.l0(false);
                pVar.f21053f.K();
            }
        }
    }

    public p(i iVar) {
        this.f21053f = iVar;
        Thread.setDefaultUncaughtExceptionHandler(new lib.zj.office.system.a(this));
        this.f21062o = new r(this);
        this.f21059l = new m(this);
        this.f21060m = new n(this, Looper.getMainLooper());
        boolean z10 = false;
        this.f21057j = Toast.makeText(m().getApplicationContext(), "", 0);
        String stringExtra = m().getIntent().getStringExtra("autoTest");
        if (stringExtra != null && stringExtra.equals("true")) {
            z10 = true;
        }
        this.c = z10;
    }

    public static void i(p pVar, Object obj) {
        boolean z10;
        Integer Y0;
        if (obj != null) {
            byte b10 = pVar.f21051d;
            if (b10 == 0) {
                pVar.f21061n = new dj.b(pVar, (zh.g) obj);
            } else if (b10 == 1) {
                pVar.f21061n = new bi.a(pVar, (ei.d) obj, pVar.f21052e);
            } else if (b10 == 2) {
                pVar.f21061n = new rh.a(pVar, (th.c) obj);
            }
            View view = pVar.f21061n.getView();
            i iVar = pVar.f21053f;
            if (view != null && (Y0 = iVar.Y0()) != null) {
                view.setBackgroundColor(Y0.intValue());
            }
            if (pVar.f21051d == 3 && ((PDFLib) obj).hasPasswordSync()) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte b11 = pVar.f21051d;
            if (b11 == 3) {
                if (!z10) {
                    if (b11 == 0) {
                        iVar.n1(1);
                    } else {
                        iVar.n1(0);
                    }
                }
            } else if (b11 == 0) {
                iVar.n1(1);
            } else {
                iVar.n1(0);
            }
            jh.c.f19238d.c = true;
            pVar.f21060m.post(new o(pVar, z10));
            return;
        }
        pVar.getClass();
        throw new Exception("Document with password");
    }

    @Override // lib.zj.office.system.f
    public final void dispose() {
        this.f21049a = true;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f21063p;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        h t4 = t();
        if (t4 != null) {
            t4.c();
        }
        androidx.privacysandbox.ads.adservices.topics.d dVar = this.f21061n;
        if (dVar != null) {
            dVar.dispose();
        }
        j jVar = this.f21056i;
        if (jVar != null) {
            jVar.dispose();
        }
        sg.c cVar = this.f21054g;
        if (cVar != null) {
            cVar.dispose();
        }
        ProgressDialog progressDialog = this.f21058k;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        n nVar = this.f21060m;
        if (nVar != null) {
            nVar.removeCallbacksAndMessages(null);
        }
        System.gc();
        r rVar = this.f21062o;
        if (rVar != null) {
            rVar.f21076i = null;
            d dVar2 = rVar.f21069a;
            if (dVar2 != null) {
                dVar2.f21023a = null;
                rVar.f21069a = null;
            }
            jh.e eVar = rVar.f21070b;
            if (eVar != null) {
                eVar.g();
                ArrayList arrayList = eVar.f19249d;
                if (arrayList != null) {
                    arrayList.clear();
                }
                eVar.c.clear();
                eVar.f19247a = 0L;
                File file = new File(eVar.f19248b);
                try {
                    jh.b bVar = eVar.f19251f;
                    if (bVar != null) {
                        bVar.b();
                    }
                    new jh.d(eVar, file).start();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                rVar.f21070b = null;
            }
            o7.a aVar = rVar.c;
            if (aVar != null) {
                ((AtomicBoolean) aVar.c).set(true);
                List<ih.a> list = (List) aVar.f22743a;
                for (ih.a aVar2 : list) {
                    aVar2.getClass();
                }
                list.clear();
                ((Map) aVar.f22744b).clear();
                rVar.c = null;
            }
            a2.a aVar3 = rVar.f21071d;
            if (aVar3 != null) {
                aVar3.e();
                rVar.f21071d = null;
            }
            m7.g gVar = rVar.f21072e;
            if (gVar != null) {
                List list2 = (List) gVar.f21833a;
                if (list2 != null) {
                    list2.clear();
                }
                rVar.f21072e = null;
            }
            t tVar = rVar.f21073f;
            if (tVar != null) {
                List list3 = (List) tVar.f20374a;
                if (list3 != null) {
                    list3.clear();
                }
                rVar.f21073f = null;
            }
            a2.a aVar4 = rVar.f21074g;
            if (aVar4 != null) {
                aVar4.e();
                rVar.f21074g = null;
            }
            jf.o oVar = rVar.f21075h;
            if (oVar != null) {
                HashMap hashMap = oVar.f19201a;
                if (hashMap != null) {
                    hashMap.clear();
                }
                rVar.f21075h = null;
            }
            lib.zj.office.java.awt.geom.d dVar3 = rVar.f21077j;
            if (dVar3 != null) {
                pi.c cVar2 = (pi.c) dVar3.c;
                if (cVar2 != null) {
                    if (cVar2.f28961a) {
                        cVar2.c.cancel();
                        cVar2.c.purge();
                        cVar2.f28961a = false;
                    }
                    cVar2.c = null;
                    cVar2.f28963d = null;
                }
                rVar.f21077j = null;
            }
            qi.a aVar5 = rVar.f21078k;
            if (aVar5 != null) {
                aVar5.f29351e.clear();
                rVar.f21078k = null;
            }
        }
    }

    @Override // lib.zj.office.system.f
    public final View getView() {
        androidx.privacysandbox.ads.adservices.topics.d dVar = this.f21061n;
        if (dVar == null) {
            return null;
        }
        return dVar.getView();
    }

    public final void j() {
        ProgressDialog progressDialog = this.f21058k;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f21058k = null;
        }
        n nVar = this.f21060m;
        if (nVar != null) {
            nVar.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.system.p.k(java.lang.String):void");
    }

    @Override // lib.zj.office.system.f
    public final Activity m() {
        return this.f21053f.m();
    }

    @Override // lib.zj.office.system.f
    public final sg.c n() {
        return this.f21054g;
    }

    @Override // lib.zj.office.system.f
    public final r o() {
        return this.f21062o;
    }

    @Override // lib.zj.office.system.f
    public final boolean p() {
        return this.c;
    }

    @Override // lib.zj.office.system.f
    public final byte q() {
        return this.f21051d;
    }

    @Override // lib.zj.office.system.f
    public final void r(int i10, Object obj) {
        boolean z10;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f21060m.post(new f1(this, i10, obj, 1));
            return;
        }
        if (i10 == 23 && this.f21056i != null) {
            androidx.privacysandbox.ads.adservices.topics.d dVar = this.f21061n;
            if (dVar != null) {
                dVar.r(i10, obj);
            }
            this.f21056i.dispose();
            this.f21056i = null;
        }
        i iVar = this.f21053f;
        if (iVar != null && !iVar.t(i10, obj)) {
            if (i10 != -268435456) {
                if (i10 != 0) {
                    if (i10 != 26) {
                        if (i10 != 536870919) {
                            if (i10 != 536870921) {
                                if (i10 != 17) {
                                    if (i10 != 18) {
                                        if (i10 != 23) {
                                            if (i10 != 24) {
                                                if (i10 != 117440512) {
                                                    if (i10 != 117440513) {
                                                        androidx.privacysandbox.ads.adservices.topics.d dVar2 = this.f21061n;
                                                        if (dVar2 != null) {
                                                            dVar2.r(i10, obj);
                                                            return;
                                                        } else if (i10 == 805306376) {
                                                            this.f21060m.postDelayed(new l(this, i10, obj, 0), 300L);
                                                            return;
                                                        } else {
                                                            return;
                                                        }
                                                    }
                                                    String[] strArr = (String[]) obj;
                                                    if (strArr.length == 2) {
                                                        this.f21052e = strArr[0];
                                                        this.f21051d = (byte) 0;
                                                        TXTKit.instance().reopenFile(this, this.f21060m, this.f21052e, strArr[1]);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                TXTKit.instance().reopenFile(this, this.f21060m, this.f21052e, (String) obj);
                                                return;
                                            }
                                            n nVar = this.f21060m;
                                            if (nVar != null) {
                                                nVar.post(new b());
                                                return;
                                            }
                                            return;
                                        }
                                        n nVar2 = this.f21060m;
                                        if (nVar2 != null) {
                                            nVar2.post(new c());
                                            return;
                                        }
                                        return;
                                    }
                                    this.f21057j.cancel();
                                    return;
                                } else if (obj != null && (obj instanceof String)) {
                                    this.f21057j.setText((String) obj);
                                    this.f21057j.setGravity(17, 0, 0);
                                    this.f21057j.show();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            j jVar = this.f21056i;
                            if (jVar != null) {
                                jVar.abortReader();
                                return;
                            }
                            return;
                        }
                        this.f21061n.r(i10, obj);
                        iVar.N();
                        return;
                    }
                    n nVar3 = this.f21060m;
                    if (nVar3 != null) {
                        nVar3.post(new a(obj));
                        return;
                    }
                    return;
                }
                try {
                    Message message = new Message();
                    message.obj = obj;
                    this.f21056i.dispose();
                    message.what = 0;
                    this.f21060m.handleMessage(message);
                    return;
                } catch (Throwable th2) {
                    this.f21062o.c().a(false, th2);
                    return;
                }
            }
            getView().postInvalidate();
        }
    }

    @Override // lib.zj.office.system.f
    public final i s() {
        return this.f21053f;
    }

    @Override // lib.zj.office.system.f
    public final h t() {
        androidx.privacysandbox.ads.adservices.topics.d dVar = this.f21061n;
        if (dVar != null) {
            return dVar.t();
        }
        return null;
    }

    @Override // lib.zj.office.system.f
    public final sg.b u() {
        return this.f21055h;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d, lib.zj.office.system.f
    public final j v() {
        return this.f21056i;
    }

    @Override // lib.zj.office.system.f
    public final Object w(int i10) {
        if (i10 != 1) {
            androidx.privacysandbox.ads.adservices.topics.d dVar = this.f21061n;
            if (dVar == null) {
                return null;
            }
            if (i10 != 536870928 && i10 != 805306371 && i10 != 536870931 && i10 != 1342177283 && i10 != 1358954506) {
                return dVar.w(i10);
            }
            jh.c cVar = jh.c.f19238d;
            boolean h10 = cVar.h();
            i iVar = this.f21053f;
            boolean P0 = iVar.P0();
            cVar.c = true;
            if (i10 == 536870928) {
                iVar.h1(true);
            }
            Object w7 = this.f21061n.w(i10);
            if (i10 == 536870928) {
                iVar.h1(P0);
            }
            cVar.c = h10;
            return w7;
        }
        return this.f21052e;
    }

    @Override // lib.zj.office.system.f
    public final boolean x() {
        return this.f21049a;
    }

    @Override // lib.zj.office.system.f
    public final int z() {
        return this.f21061n.z();
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d, lib.zj.office.system.f
    public final void getSlideShow() {
    }
}
