package pi;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import android.widget.Toast;
import lib.zj.office.system.f;
import lib.zj.office.system.i;

/* compiled from: AEventManage.java */
/* loaded from: classes3.dex */
public abstract class b implements View.OnTouchListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, View.OnClickListener {

    /* renamed from: s  reason: collision with root package name */
    public static boolean f28943s = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28946d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f28947e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f28949g;

    /* renamed from: h  reason: collision with root package name */
    public final int f28950h;

    /* renamed from: i  reason: collision with root package name */
    public final int f28951i;

    /* renamed from: j  reason: collision with root package name */
    public int f28952j;

    /* renamed from: k  reason: collision with root package name */
    public int f28953k;

    /* renamed from: n  reason: collision with root package name */
    public f f28956n;

    /* renamed from: o  reason: collision with root package name */
    public GestureDetector f28957o;

    /* renamed from: p  reason: collision with root package name */
    public VelocityTracker f28958p;

    /* renamed from: q  reason: collision with root package name */
    public Scroller f28959q;

    /* renamed from: r  reason: collision with root package name */
    public Toast f28960r;

    /* renamed from: a  reason: collision with root package name */
    public boolean f28944a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f28945b = false;
    public boolean c = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f28948f = false;

    /* renamed from: l  reason: collision with root package name */
    public int f28954l = -1;

    /* renamed from: m  reason: collision with root package name */
    public float f28955m = 0.0f;

    public b(Context context, f fVar) {
        this.f28960r = null;
        this.f28956n = fVar;
        this.f28957o = new GestureDetector(context, this, null, true);
        this.f28959q = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f28950h = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f28951i = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f28960r = Toast.makeText(context, "", 0);
    }

    public void b() {
        if (this.f28956n != null && this.f28946d && this.f28959q.isFinished()) {
            this.f28946d = false;
            this.f28956n.r(536870922, null);
            this.f28956n.r(20, null);
        }
    }

    public void c() {
        this.f28956n = null;
        this.f28957o = null;
        this.f28958p = null;
        this.f28960r = null;
        Scroller scroller = this.f28959q;
        if (scroller != null && !scroller.isFinished()) {
            this.f28959q.abortAnimation();
        }
        this.f28959q = null;
    }

    public abstract void d(int i10, int i11);

    public final void e() {
        Scroller scroller = this.f28959q;
        if (scroller != null && !scroller.isFinished()) {
            this.f28946d = true;
            this.f28959q.abortAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.b.f(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f fVar = this.f28956n;
        if (fVar != null && fVar.s() != null) {
            i s4 = this.f28956n.s();
            this.f28956n.getView();
            s4.c1((byte) 10);
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        f fVar = this.f28956n;
        if (fVar != null && fVar.s() != null) {
            i s4 = this.f28956n.s();
            this.f28956n.getView();
            s4.c1((byte) 8);
        }
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        f fVar = this.f28956n;
        if (fVar != null && fVar.s() != null) {
            i s4 = this.f28956n.s();
            this.f28956n.getView();
            s4.c1((byte) 9);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        f fVar = this.f28956n;
        if (fVar != null && fVar.s() != null) {
            i s4 = this.f28956n.s();
            this.f28956n.getView();
            s4.c1((byte) 1);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        f fVar = this.f28956n;
        if (fVar != null && fVar.s() != null) {
            i s4 = this.f28956n.s();
            this.f28956n.getView();
            s4.c1((byte) 6);
        }
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        f fVar = this.f28956n;
        if (fVar != null && fVar.s() != null) {
            i s4 = this.f28956n.s();
            this.f28956n.getView();
            s4.c1((byte) 5);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        f fVar = this.f28956n;
        if (fVar != null && fVar.s() != null) {
            this.f28947e = true;
            i s4 = this.f28956n.s();
            this.f28956n.getView();
            s4.c1((byte) 4);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        f fVar = this.f28956n;
        if (fVar != null && fVar.s() != null) {
            i s4 = this.f28956n.s();
            this.f28956n.getView();
            s4.c1((byte) 2);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        f fVar = this.f28956n;
        if (fVar != null && fVar.s() != null) {
            if (f28943s) {
                f28943s = false;
                return true;
            }
            i s4 = this.f28956n.s();
            this.f28956n.getView();
            s4.c1((byte) 7);
        }
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        f fVar = this.f28956n;
        if (fVar != null && fVar.s() != null) {
            if (!this.f28947e) {
                this.f28948f = true;
            }
            i s4 = this.f28956n.s();
            this.f28956n.getView();
            s4.c1((byte) 3);
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:32|33|(8:38|39|40|(1:42)|43|(2:45|(5:50|(1:54)|55|(2:57|(1:59))(1:61)|60)(3:47|48|49))|62|(1:64))|75|(3:77|(1:79)(1:81)|80)|82|(1:84)|39|40|(0)|43|(0)|62|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010a, code lost:
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0118, code lost:
        r1 = r7.f28956n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011a, code lost:
        if (r1 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012e, code lost:
        r7.f28956n.o().c().a(false, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:46:0x009f, B:48:0x00a9, B:49:0x00ae, B:51:0x00b7, B:54:0x00c1, B:56:0x00c9, B:58:0x00cd, B:59:0x00d6, B:61:0x00e1, B:63:0x00e9, B:65:0x00f4, B:64:0x00ef, B:66:0x00fb, B:68:0x0103, B:70:0x0107), top: B:87:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:46:0x009f, B:48:0x00a9, B:49:0x00ae, B:51:0x00b7, B:54:0x00c1, B:56:0x00c9, B:58:0x00cd, B:59:0x00d6, B:61:0x00e1, B:63:0x00e9, B:65:0x00f4, B:64:0x00ef, B:66:0x00fb, B:68:0x0103, B:70:0x0107), top: B:87:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:46:0x009f, B:48:0x00a9, B:49:0x00ae, B:51:0x00b7, B:54:0x00c1, B:56:0x00c9, B:58:0x00cd, B:59:0x00d6, B:61:0x00e1, B:63:0x00e9, B:65:0x00f4, B:64:0x00ef, B:66:0x00fb, B:68:0x0103, B:70:0x0107), top: B:87:0x009f }] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.b.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
