package mj;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.text.editor.TextEditorState;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: TextEditorGestureDetector.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final PDFPageView f22089a;

    /* renamed from: b  reason: collision with root package name */
    public final lib.zj.pdfeditor.text.editor.a f22090b;
    public final a c = new a();

    /* renamed from: d  reason: collision with root package name */
    public int f22091d;

    /* renamed from: e  reason: collision with root package name */
    public float f22092e;

    /* renamed from: f  reason: collision with root package name */
    public float f22093f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22094g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22095h;

    /* renamed from: i  reason: collision with root package name */
    public MotionEvent f22096i;

    /* renamed from: j  reason: collision with root package name */
    public MotionEvent f22097j;

    /* renamed from: k  reason: collision with root package name */
    public MotionEvent f22098k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f22099l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f22100m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f22101n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f22102o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f22103p;

    /* compiled from: TextEditorGestureDetector.java */
    /* loaded from: classes3.dex */
    public class a extends Handler {
        public a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    i iVar = i.this;
                    iVar.c.removeMessages(1);
                    iVar.f22101n = false;
                    iVar.f22100m = true;
                    iVar.f22103p = true;
                    lib.zj.pdfeditor.text.editor.a aVar = iVar.f22090b;
                    MotionEvent motionEvent = iVar.f22096i;
                    androidx.appcompat.libconvert.a aVar2 = new androidx.appcompat.libconvert.a(iVar, 13);
                    if (aVar.f21680b == TextEditorState.EDIT_TEXT || aVar.f21680b == TextEditorState.SELECT_TEXT) {
                        float o10 = aVar.o();
                        float x4 = (motionEvent.getX() - aVar.f21687f.getLeft()) / o10;
                        float y10 = (motionEvent.getY() - aVar.f21687f.getTop()) / o10;
                        if (aVar.f21698p != null && aVar.f21698p.f22045b.contains(x4, y10)) {
                            aVar.u(new n(aVar, aVar.f21685e, aVar.f21700r, aVar.f21698p, new PointF(x4, y10), aVar2, aVar.M));
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new RuntimeException("Unknown message " + message);
            }
            i iVar2 = i.this;
            if (iVar2.f22094g) {
                iVar2.f22101n = true;
                return;
            }
            MotionEvent motionEvent2 = iVar2.f22097j;
            if (motionEvent2 != null) {
                iVar2.f22090b.y(motionEvent2);
            }
        }
    }

    public i(PDFPageView pDFPageView, lib.zj.pdfeditor.text.editor.a aVar) {
        this.f22089a = pDFPageView;
        this.f22090b = aVar;
        Context context = pDFPageView.getContext();
        kotlin.jvm.internal.g.e(context, "<this>");
        this.f22091d = t0.o0(context.getResources().getDisplayMetrics().density * 3.0f);
    }
}
