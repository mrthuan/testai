package qb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.webkit.WebView;
import com.inmobi.media.N1;
import com.inmobi.media.S1;
import com.inmobi.media.T1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29274a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29275b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f29276d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f29277e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f29278f;

    public /* synthetic */ w(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f29274a = i10;
        this.f29275b = obj;
        this.c = obj2;
        this.f29276d = obj3;
        this.f29277e = obj4;
        this.f29278f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        int i10 = this.f29274a;
        Object obj = this.f29278f;
        Object obj2 = this.f29277e;
        Object obj3 = this.f29276d;
        Object obj4 = this.c;
        Object obj5 = this.f29275b;
        switch (i10) {
            case 0:
                S1.a((S1) obj5, (N1) obj4, (Handler) obj3, (T1) obj2, (WebView) obj);
                return;
            case 1:
                lib.zj.pdfeditor.text.editor.a aVar = ((mj.n) obj5).f22122h;
                aVar.x((RectF) obj4, (RectF) obj3, (RectF) obj2);
                mj.i iVar = (mj.i) ((androidx.appcompat.libconvert.a) obj).f1924b;
                if (iVar.f22103p) {
                    iVar.f22102o = true;
                }
                aVar.f21687f.invalidate();
                return;
            default:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                Activity activity = (Activity) obj3;
                Intent intent = (Intent) obj2;
                cg.l lVar = (cg.l) obj;
                ThirdOpenParseManager thirdOpenParseManager = ThirdOpenParseManager.f28760a;
                kotlin.jvm.internal.g.e(arrayList2, ea.a.p("a3RZaQtkfm07Z2U=", "rorN6I3j"));
                kotlin.jvm.internal.g.e(activity, ea.a.p("F2EodBp2C3R5", "zXpLvDSL"));
                ReaderSplashActivity.a aVar2 = ReaderSplashActivity.f23873s;
                String p10 = ea.a.p("Wm0qZxYgEmEAc1EgGnQ3cnQ=", "SfLRoRGa");
                aVar2.getClass();
                ReaderSplashActivity.a.c(p10);
                Iterator it = arrayList.iterator();
                int i11 = 1;
                while (true) {
                    boolean hasNext = it.hasNext();
                    String str = ThirdOpenParseManager.f28761b;
                    ThirdOpenParseManager thirdOpenParseManager2 = ThirdOpenParseManager.f28760a;
                    if (hasNext) {
                        Uri uri = (Uri) it.next();
                        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(activity)) {
                            thirdOpenParseManager2.getClass();
                            ((Handler) ThirdOpenParseManager.f28762d.getValue()).post(new androidx.fragment.app.d(8, activity, lVar, arrayList2));
                            return;
                        }
                        pdf.pdfreader.viewer.editor.free.utils.v.z(activity, uri);
                        try {
                            file = pdf.pdfreader.viewer.editor.free.utils.v.v(activity, uri, intent);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            file = null;
                        }
                        if (file != null) {
                            o9.d.s(str, "parseImage success file path: " + file.getAbsolutePath() + " uri is: " + uri);
                            ul.b bVar = new ul.b();
                            bVar.f30405b = SystemClock.elapsedRealtimeNanos();
                            bVar.b(true);
                            bVar.c(i11);
                            bVar.f30406d = file.length();
                            bVar.c = file.getName();
                            bVar.f30404a = file.getAbsolutePath();
                            bVar.f30410h = file.getAbsolutePath();
                            try {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                bVar.f30421s = options.outWidth;
                                bVar.f30422t = options.outHeight;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                bVar.f30421s = 1;
                                bVar.f30422t = 1;
                            }
                            arrayList2.add(bVar);
                            i11++;
                        }
                    } else {
                        o9.d.s(str, "parseImage thirdImage size = " + arrayList2.size() + ", uri.size = " + arrayList.size());
                        if (!arrayList2.isEmpty()) {
                            ReaderSplashActivity.a aVar3 = ReaderSplashActivity.f23873s;
                            String p11 = ea.a.p("Jm1QZxwgR2Eocy8gBnULY1Bzcw==", "VjiDKGFI");
                            aVar3.getClass();
                            ReaderSplashActivity.a.a(p11);
                            thirdOpenParseManager2.getClass();
                            ((Handler) ThirdOpenParseManager.f28762d.getValue()).post(new a6.f(1, arrayList2, arrayList, activity, lVar));
                            return;
                        }
                        thirdOpenParseManager2.getClass();
                        ((Handler) ThirdOpenParseManager.f28762d.getValue()).post(new androidx.fragment.app.f(10, activity, lVar, arrayList2));
                        return;
                    }
                }
        }
    }
}
