package sp;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.s;
import com.google.android.play.core.assetpacks.b1;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.m;
import kotlin.text.k;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.system.j;
import lib.zj.office.system.p;
import lib.zj.office.viewer.data.ViewFileType;
import lib.zj.office.viewer.model.FileModel;
import lib.zj.office.wp.control.Word;

/* compiled from: WPSExporter.java */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final f f29852a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f29853b;
    public final ViewGroup c;

    /* renamed from: d  reason: collision with root package name */
    public final String f29854d;

    /* renamed from: e  reason: collision with root package name */
    public final b f29855e;

    /* renamed from: f  reason: collision with root package name */
    public final e f29856f;

    /* renamed from: g  reason: collision with root package name */
    public final DisplayMetrics f29857g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f29858h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f29859i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f29860j;

    /* renamed from: k  reason: collision with root package name */
    public float f29861k;

    /* renamed from: l  reason: collision with root package name */
    public String f29862l;

    /* renamed from: m  reason: collision with root package name */
    public String f29863m;

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f29864n;

    /* renamed from: o  reason: collision with root package name */
    public Thread f29865o;

    /* renamed from: p  reason: collision with root package name */
    public final byte[] f29866p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f29867q;

    /* renamed from: r  reason: collision with root package name */
    public int f29868r;

    public h(Activity activity, String str, boolean z10, b bVar) {
        ea.a.p("GFBiRQFwWHIuZTg-Sz4=", "XUboCjTK");
        this.f29860j = false;
        this.f29864n = false;
        this.f29865o = null;
        this.f29866p = new byte[0];
        this.f29856f = new e(this, Looper.getMainLooper(), bVar);
        this.f29853b = activity;
        this.f29867q = z10;
        this.c = null;
        this.f29854d = str;
        this.f29855e = bVar;
        this.f29857g = activity.getResources().getDisplayMetrics();
        f fVar = new f(this);
        this.f29852a = fVar;
        pdf.pdfreader.viewer.editor.free.ui.widget.act.a aVar = new pdf.pdfreader.viewer.editor.free.ui.widget.act.a(this, 4);
        pdf.pdfreader.viewer.editor.free.feature.scan.ui.f fVar2 = new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(this, 12);
        pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b bVar2 = new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(this, 14);
        fVar.f29838d = aVar;
        fVar.f29839e = fVar2;
        fVar.f29840f = bVar2;
        if (fVar.f29841g) {
            aVar.run();
        }
        if (fVar.f29842h) {
            fVar2.run();
        }
    }

    public static String d(String str) {
        ea.a.p("VGU_ThZ3MmEGaA4gGWQwUCV0WiB7IA==", "DAKl5He4");
        Matcher matcher = Pattern.compile(ea.a.p("bygQMF45PysuKRpwDWYk", "XS9UNAEi")).matcher(str);
        if (matcher.find()) {
            String group = matcher.group();
            Matcher matcher2 = Pattern.compile(ea.a.p("aDBmOS4r", "mC4t0gjb")).matcher(group);
            if (matcher2.find()) {
                return str.replace(group, ea.a.p("KA==", "YD61aDcI") + (Integer.parseInt(matcher2.group()) + 1) + ea.a.p("Gi47ZGY=", "u7WaXvbo"));
            }
            return str;
        }
        return str.replace(ea.a.p("HXAvZg==", "SkwSXl6I"), ea.a.p("ZzEYLglkZg==", "ZlDOjfmx"));
    }

    public final void a(boolean z10) {
        ea.a.p("LGhUYxJEXnMqbzllSz5WbVRyBUQscxVvAWU6", "JDBWryUQ");
        ea.a.p("YyBSbwxsU0QzczpvBmU6", "h3YRElLv");
        boolean z11 = this.f29859i;
        if (this.f29858h && !z11) {
            this.f29856f.removeCallbacksAndMessages(null);
        }
        if (this.f29859i && this.f29858h) {
            b bVar = this.f29855e;
            if (bVar != null && z10) {
                bVar.D();
            }
            f fVar = this.f29852a;
            p pVar = fVar.f29542a;
            if (pVar != null) {
                j jVar = pVar.f21056i;
                if (jVar != null) {
                    jVar.abortReader();
                }
                fVar.f29542a.dispose();
            }
        }
    }

    public final synchronized void b() {
        if (this.f29865o == null) {
            Thread thread = new Thread(new d(this, 1));
            this.f29865o = thread;
            thread.start();
        }
    }

    public final int c(int i10, cj.a aVar) {
        if (this.f29858h) {
            return -1;
        }
        if (this.f29864n && i10 == aVar.j()) {
            return 2;
        }
        if (i10 == aVar.j()) {
            byte[] bArr = this.f29866p;
            synchronized (bArr) {
                try {
                    bArr.wait();
                } catch (InterruptedException unused) {
                }
            }
            return 0;
        }
        int i11 = i10 + 1;
        int j10 = aVar.j();
        if (!this.f29864n) {
            ea.a.p("DG42cgZnA2U7c1g-Cmw2eVd1JiAnb0IgEG8fZQ==", "YXcfiqye");
        } else {
            float f10 = i11 / j10;
            if (f10 > this.f29861k) {
                this.f29860j = true;
                this.f29861k = f10;
                Message obtainMessage = this.f29856f.obtainMessage(4098);
                obtainMessage.obj = Float.valueOf(this.f29861k);
                this.f29856f.sendMessage(obtainMessage);
            }
        }
        return 1;
    }

    public final void e(boolean z10) {
        this.f29858h = true;
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        f();
        a(z10);
        e eVar = this.f29856f;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages(null);
        }
    }

    public final void f() {
        byte[] bArr = this.f29866p;
        synchronized (bArr) {
            bArr.notifyAll();
        }
    }

    public final void g() {
        if (this.f29858h) {
            return;
        }
        View view = this.f29852a.f29542a.getView();
        if (view instanceof Presentation) {
            view = ((Presentation) view).getView().getView();
        } else if (view instanceof Word) {
            view = ((Word) view).getPrintWord().getListView();
        } else if (!(view instanceof View)) {
            view = null;
        }
        ea.a.p("V28HYQpvF3Qg", "PAOOet0S");
        Objects.toString(view);
        if (view != null) {
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
                return;
            }
            DisplayMetrics displayMetrics = this.f29857g;
            view.measure(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, SlideAtom.USES_MASTER_SLIDE_ID), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, SlideAtom.USES_MASTER_SLIDE_ID));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void h(String fileName) {
        String str;
        char c;
        ViewFileType viewFileType;
        ea.a.p("KHBcbldlFnQtcg==", "yOG9wxUc");
        boolean isEmpty = TextUtils.isEmpty(fileName);
        e eVar = this.f29856f;
        if (isEmpty) {
            if (eVar != null) {
                eVar.post(new d(this, 0));
                return;
            }
            return;
        }
        this.f29862l = new File(fileName).getName();
        kotlin.jvm.internal.g.e(fileName, "fileName");
        FileModel.Companion.getClass();
        Locale locale = Locale.ROOT;
        List h02 = k.h0(a0.d.e(locale, "ROOT", fileName, locale, "this as java.lang.String).toLowerCase(locale)"), new String[]{"."}, 0, 6);
        if (h02.size() > 1) {
            str = "." + m.x0(h02);
        } else {
            str = "";
        }
        if (b1.r(str, aj.b.f555b)) {
            c = 5;
        } else if (b1.r(str, aj.b.f554a)) {
            c = 1;
        } else if (b1.r(str, aj.b.f556d)) {
            c = 4;
        } else if (b1.r(str, aj.b.f557e)) {
            c = 3;
        } else if (b1.r(str, aj.b.c)) {
            c = 2;
        } else {
            c = 65535;
        }
        if (c != 1) {
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            viewFileType = ViewFileType.WORD;
                        } else {
                            viewFileType = ViewFileType.TXT;
                        }
                    } else {
                        viewFileType = ViewFileType.PPT;
                    }
                } else {
                    viewFileType = ViewFileType.EXCEL;
                }
            } else {
                viewFileType = ViewFileType.WORD;
            }
        } else {
            viewFileType = ViewFileType.PDF;
        }
        ea.a.p("dng7bwF0C24VIA==", "OxCe80wp");
        ea.a.p("E2E4IAd5EmUg", "u5b4omSI");
        Objects.toString(viewFileType);
        ViewGroup viewGroup = this.c;
        f fVar = this.f29852a;
        if (viewGroup != null) {
            int measuredWidth = viewGroup.getMeasuredWidth();
            viewGroup.getMeasuredHeight();
            fVar.getClass();
            s.f1866u = measuredWidth;
        } else {
            int i10 = this.f29857g.widthPixels;
            fVar.getClass();
            s.f1866u = i10;
        }
        if (eVar != null) {
            eVar.sendEmptyMessage(4097);
        }
        fVar.f29542a.k(fileName);
        ea.a.p("XHAubjVpDmU=", "mujc72O5");
    }
}
