package androidx.emoji2.text;

import am.t2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.g;
import androidx.emoji2.text.m;
import com.inmobi.media.C1666i5;
import com.inmobi.media.C1866x7;
import com.inmobi.media.D7;
import com.inmobi.media.N1;
import com.inmobi.media.S9;
import com.inmobi.media.T1;
import ha.h;
import io.flutter.embedding.android.KeyboardMap;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.pdfeditor.PDFListener;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.office.b0;
import pdf.pdfreader.viewer.editor.free.office.c0;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.u0;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3632a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3633b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3634d;

    public /* synthetic */ h(int i10, Object obj, Object obj2, Object obj3) {
        this.f3632a = i10;
        this.f3633b = obj;
        this.c = obj2;
        this.f3634d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i10 = 2;
        switch (this.f3632a) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f3633b;
                g.h hVar = (g.h) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f3634d;
                bVar.getClass();
                try {
                    m a10 = d.a(bVar.f3612a);
                    if (a10 != null) {
                        m.b bVar2 = (m.b) a10.f3628a;
                        synchronized (bVar2.f3652d) {
                            bVar2.f3654f = threadPoolExecutor;
                        }
                        a10.f3628a.a(new i(hVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    hVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ha.g gVar = (ha.g) this.f3633b;
                gVar.getClass();
                gVar.f18134a.execute(new n0.g(7, (Runnable) this.c, (h.b) this.f3634d));
                return;
            case 2:
                T1.a((N1) this.f3633b, (T1) this.c, (Handler) this.f3634d);
                return;
            case 3:
                C1666i5.a((C1666i5) this.f3633b, (S9) this.c, (Context) this.f3634d);
                return;
            case 4:
                C1866x7.a((C1866x7) this.f3633b, (D7) this.c, (ViewGroup) this.f3634d);
                return;
            case 5:
                io.flutter.embedding.android.e eVar = (io.flutter.embedding.android.e) this.f3633b;
                KeyboardMap.a aVar = (KeyboardMap.a) this.c;
                eVar.getClass();
                eVar.c(false, Long.valueOf(aVar.f18604b), Long.valueOf(aVar.f18603a), ((KeyEvent) this.f3634d).getEventTime());
                return;
            case 6:
                RectF rectF = (RectF) this.c;
                lib.zj.pdfeditor.text.editor.a aVar2 = ((mj.n) this.f3633b).f22122h;
                aVar2.x(rectF, rectF, rectF);
                mj.i iVar = (mj.i) ((androidx.appcompat.libconvert.a) this.f3634d).f1924b;
                if (iVar.f22103p) {
                    iVar.f22102o = true;
                }
                aVar2.f21687f.invalidate();
                return;
            case 7:
                View[] viewArr = (View[]) this.f3633b;
                BasePdfConvertCompletedView basePdfConvertCompletedView = (BasePdfConvertCompletedView) this.c;
                t2 t2Var = (t2) this.f3634d;
                int i11 = BasePdfConvertCompletedView.f25599d;
                kotlin.jvm.internal.g.e(viewArr, ea.a.p("a3ZYZQ5z", "NDhTolor"));
                kotlin.jvm.internal.g.e(basePdfConvertCompletedView, ea.a.p("O2hYc10w", "RnDNLNYB"));
                kotlin.jvm.internal.g.e(t2Var, ea.a.p("F3QjaQBfEHVu", "Su2sTp07"));
                ArrayList arrayList = new ArrayList();
                int i12 = 0;
                for (View view : viewArr) {
                    if (view != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        Animator[] animatorArr = new Animator[i10];
                        String p10 = ea.a.p("O3JQbgpsVnQzbyRZ", "FBRwk3po");
                        float[] fArr = new float[i10];
                        fArr[0] = basePdfConvertCompletedView.c;
                        fArr[1] = 0.0f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, p10, fArr);
                        kotlin.jvm.internal.g.d(ofFloat, ea.a.p("JGZwbDVhJig-aQN3GCB1dEphPHMlYUJpG24oIn0gJnB_MBh0NUY-byl0TikYIGdmKQ==", "3EK6ZRqL"));
                        animatorArr[0] = ofFloat;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, ea.a.p("Umw7aGE=", "7rleARb0"), 0.0f, 1.0f);
                        kotlin.jvm.internal.g.d(ofFloat2, ea.a.p("ImYAbD5hLCg-aQN3GCB1YVRwOmFrLBYwEixRMTcp", "YhMFQX7l"));
                        animatorArr[1] = ofFloat2;
                        animatorSet.playTogether(animatorArr);
                        animatorSet.setDuration(300L);
                        animatorSet.setStartDelay(Math.max(0, i12 - 1) * ShapeTypes.FLOW_CHART_PREPARATION);
                        i10 = 2;
                        if (i12 == 2) {
                            animatorSet.addListener(new BasePdfConvertCompletedView.b(t2Var));
                        }
                        arrayList.add(animatorSet);
                        i12++;
                    }
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(arrayList);
                animatorSet2.start();
                return;
            case 8:
                c0 c0Var = (c0) this.f3633b;
                cg.a aVar3 = (cg.a) this.c;
                b0 b0Var = (b0) this.f3634d;
                kotlin.jvm.internal.g.e(c0Var, ea.a.p("R2gic1cw", "MYr0iV0O"));
                kotlin.jvm.internal.g.e(aVar3, ea.a.p("a3RQc2s=", "FWOELJy1"));
                kotlin.jvm.internal.g.e(b0Var, ea.a.p("F2MqbB9iA2Nr", "WW8V9BOa"));
                System.currentTimeMillis();
                boolean booleanValue = ((Boolean) aVar3.invoke()).booleanValue();
                long currentTimeMillis = System.currentTimeMillis();
                ((Handler) c0Var.c.getValue()).removeCallbacksAndMessages(null);
                AtomicLong atomicLong = c0Var.f26083l;
                long j11 = c0Var.f26082k;
                if (currentTimeMillis - atomicLong.get() > j11) {
                    j10 = 0;
                } else {
                    j10 = j11 - (currentTimeMillis - atomicLong.get());
                }
                ((Handler) c0Var.c.getValue()).postDelayed(new u.h(c0Var, 1, b0Var, booleanValue), j10);
                return;
            case 9:
                ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) this.f3633b;
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.getClass();
                pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerHomeActivity);
                int i13 = ReaderMergePdfActivity.f26780f0;
                ReaderMergePdfActivity.a.a((Context) ((WeakReference) this.c).get(), (ArrayList) this.f3634d);
                return;
            case 10:
                File file = (File) this.f3633b;
                String str2 = (String) this.c;
                final u0 u0Var = (u0) this.f3634d;
                kotlin.jvm.internal.g.e(file, ea.a.p("a29DaR5pWVAeRgxpGWU=", "mM42JivL"));
                kotlin.jvm.internal.g.e(u0Var, ea.a.p("E2wec0JlCWVy", "pO7w6gpP"));
                File file2 = new File(v.E(), a6.h.c(v.A(file.getAbsolutePath()), ".pdf"));
                if (file2.exists()) {
                    file2.delete();
                }
                try {
                    file2.createNewFile();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                try {
                    dp.a a11 = dp.a.a();
                    String p11 = ea.a.p("R3ITbhMgF24fcg90USA0cl1hJmVpY1lyZQ==", "MY7zgxpl");
                    a11.getClass();
                    dp.a.c(p11);
                    ReaderPDFCore readerPDFCore = new ReaderPDFCore(ReaderPdfApplication.m(), file.getAbsolutePath());
                    String formatPassword = readerPDFCore.getFormatPassword(str2);
                    kotlin.jvm.internal.g.d(formatPassword, ea.a.p("LG9DZVdnUnQcbzhtFHQ4YUZzGW83ZE1wEXNLdzpyFyk=", "GrILp8Us"));
                    readerPDFCore.onDestroy();
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    if (ReaderPDFCore.createPdf(file.getAbsolutePath(), file2.getAbsolutePath(), formatPassword, false, new PDFListener() { // from class: pdf.pdfreader.viewer.editor.free.utils.PrintUtil$encryptPDF$1$pdfListener$1
                        @Override // lib.zj.pdfeditor.PDFListener
                        public void onPdfEvent(final int i14, final int i15, Object obj) {
                            final AtomicBoolean atomicBoolean2 = atomicBoolean;
                            if (!atomicBoolean2.get()) {
                                atomicBoolean2.set(true);
                                w0.c cVar = w0.a().f28791b;
                                final u0 u0Var2 = u0Var;
                                cVar.f28792a.postDelayed(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.utils.v0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String p12 = ea.a.p("a2hQbh1sUlAoby1yEHNz", "BthrNIFA");
                                        AtomicBoolean atomicBoolean3 = atomicBoolean2;
                                        kotlin.jvm.internal.g.e(atomicBoolean3, p12);
                                        String p13 = ea.a.p("a2xYcw1lWWVy", "vEFhUpce");
                                        u0 u0Var3 = u0Var2;
                                        kotlin.jvm.internal.g.e(u0Var3, p13);
                                        atomicBoolean3.set(false);
                                        u0Var3.onProgress(i14, i15);
                                    }
                                }, 100L);
                            }
                        }
                    }) > 0) {
                        w0.a().f28791b.execute(new com.facebook.appevents.g(28, u0Var, file2));
                        return;
                    }
                    dp.a a12 = dp.a.a();
                    String p12 = ea.a.p("P3JYbg0gWG4NciN0ECANeFBjG3QgIANhUWw=", "3JQz8yyQ");
                    a12.getClass();
                    dp.a.c(p12);
                    w0.a().f28791b.execute(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(u0Var, 13));
                    return;
                } catch (Exception e11) {
                    dp.a a13 = dp.a.a();
                    String p13 = ea.a.p("Q3IibgcgDW4lcl10DCA1ciFhRmVmYyxyASAtYQds", "dKnEBZaD");
                    a13.getClass();
                    dp.a.c(p13);
                    e11.printStackTrace();
                    w0.a().f28791b.execute(new pdf.pdfreader.viewer.editor.free.ui.widget.act.a(u0Var, 2));
                    return;
                }
            default:
                File file3 = (File) this.f3633b;
                Activity activity = (Activity) this.f3634d;
                ThirdOpenParseManager thirdOpenParseManager = ThirdOpenParseManager.f28760a;
                kotlin.jvm.internal.g.e(file3, ea.a.p("a2ZYbGU=", "v8sdAcbZ"));
                kotlin.jvm.internal.g.e(activity, ea.a.p("F2EodBp2C3R5", "CKJqRP0Y"));
                ThirdOpenParseManager.f28760a.getClass();
                ThirdOpenParseManager.a(file3, (Uri) this.c);
                ((Handler) ThirdOpenParseManager.f28762d.getValue()).post(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(activity, 16));
                return;
        }
    }
}
