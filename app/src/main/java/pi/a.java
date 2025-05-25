package pi;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Vector;
import lib.zj.office.system.beans.ADialogFrame;
import lib.zj.office.system.f;
import lib.zj.office.system.g;

/* compiled from: ADialog.java */
/* loaded from: classes3.dex */
public class a extends Dialog implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f28938a;

    /* renamed from: b  reason: collision with root package name */
    public Vector<Object> f28939b;
    public g c;

    /* renamed from: d  reason: collision with root package name */
    public ADialogFrame f28940d;

    /* renamed from: e  reason: collision with root package name */
    public Button f28941e;

    /* compiled from: ADialog.java */
    /* renamed from: pi.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0361a implements Runnable {
        public RunnableC0361a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.b();
        }
    }

    public a(f fVar, Activity activity, g gVar, Vector vector, int i10, String str) {
        super(activity);
        this.f28938a = i10;
        this.f28939b = vector;
        this.c = gVar;
        this.f28940d = new ADialogFrame(activity, this);
        setTitle(str);
    }

    public void a() {
        throw null;
    }

    public void b() {
        throw null;
    }

    public void c() {
        throw null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        a();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f28940d);
        this.f28940d.post(new RunnableC0361a());
    }
}
