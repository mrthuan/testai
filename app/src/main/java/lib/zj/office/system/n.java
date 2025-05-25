package lib.zj.office.system;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: MainControl.java */
/* loaded from: classes3.dex */
public final class n extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f21040a;

    /* compiled from: MainControl.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Message f21041a;

        public a(Message message) {
            this.f21041a = message;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n nVar = n.this;
            try {
                boolean O = nVar.f21040a.f21053f.O();
                p pVar = nVar.f21040a;
                if (O) {
                    pVar.j();
                } else {
                    sg.b bVar = pVar.f21055h;
                    if (bVar != null) {
                        bVar.a();
                    }
                }
                p.i(pVar, this.f21041a.obj);
            } catch (Exception e10) {
                nVar.f21040a.f21062o.c().a(true, e10);
            }
        }
    }

    /* compiled from: MainControl.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Message f21043a;

        public b(Message message) {
            this.f21043a = message;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n nVar = n.this;
            nVar.f21040a.j();
            Message message = this.f21043a;
            if (message.obj instanceof Throwable) {
                nVar.f21040a.f21062o.c().a(true, (Throwable) message.obj);
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
            n nVar = n.this;
            Activity m10 = nVar.f21040a.m();
            p pVar = nVar.f21040a;
            pVar.f21058k = ProgressDialog.show(m10, pVar.f21053f.x0(), m10.getString(R.string.arg_res_0x7f1303a8), false, false, null);
            pVar.f21058k.setOnKeyListener(pVar.f21059l);
        }
    }

    /* compiled from: MainControl.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n.this.f21040a.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Looper looper) {
        super(looper);
        this.f21040a = pVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        p pVar = this.f21040a;
        if (pVar.f21050b) {
            return;
        }
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            pVar.f21056i = (j) message.obj;
                            return;
                        }
                        return;
                    }
                    post(new d());
                    return;
                } else if (pVar.f21053f.O()) {
                    post(new c());
                    return;
                } else {
                    sg.b bVar = pVar.f21055h;
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
            }
            post(new b(message));
            return;
        }
        post(new a(message));
    }
}
