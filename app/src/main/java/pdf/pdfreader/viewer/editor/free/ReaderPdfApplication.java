package pdf.pdfreader.viewer.editor.free;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.lifecycle.m0;
import androidx.lifecycle.w;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.lib.flutter.encrypt.EngineHelper;
import de.d;
import ig.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import no.f;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig$callback$1;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.PolicyOverloadActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingsActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.TermsUseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.VerifySoActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.d1;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.PDF2WordEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.j;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import qg.g;
import t5.i;

/* loaded from: classes3.dex */
public class ReaderPdfApplication extends Application implements g {

    /* renamed from: e  reason: collision with root package name */
    public static ReaderPdfApplication f23853e = null;

    /* renamed from: f  reason: collision with root package name */
    public static Context f23854f = null;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f23855g = false;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f23856h = false;

    /* renamed from: i  reason: collision with root package name */
    public static PdfPreviewEntity f23857i;

    /* renamed from: l  reason: collision with root package name */
    public static AppViewModel f23860l;

    /* renamed from: p  reason: collision with root package name */
    public static String f23864p;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<Activity> f23867a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23868b = false;
    public ap.a c;

    /* renamed from: d  reason: collision with root package name */
    public i5.a f23869d;

    /* renamed from: j  reason: collision with root package name */
    public static final Stack<Activity> f23858j = new Stack<>();

    /* renamed from: k  reason: collision with root package name */
    public static boolean f23859k = false;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f23861m = false;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f23862n = false;

    /* renamed from: o  reason: collision with root package name */
    public static int f23863o = 0;

    /* renamed from: q  reason: collision with root package name */
    public static int f23865q = -1;

    /* renamed from: r  reason: collision with root package name */
    public static NativeSoLoaderHelper.DownloadSource f23866r = NativeSoLoaderHelper.DownloadSource.FromApp;

    /* loaded from: classes3.dex */
    public class a implements pl.c {
    }

    /* loaded from: classes3.dex */
    public class b implements d.a {
        public b(ReaderPdfApplication readerPdfApplication) {
        }

        public final void a(boolean z10) {
            String p10 = ea.a.p("YWUmbwdlIW8cZl1nIWU6cCFy", "4I1Dukka");
            o9.d.s(p10, ea.a.p("P3VdbFlmXnI_YitzECALb1tmB2dlaRYg", "omGCY1Yr") + z10);
            String p11 = ea.a.p("YWUmbwdlIW8cZl1nIWU6cCFy", "GZg9ZBTS");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ea.a.p("KGEEbl1yGEEqVANzQCAlZUt1PnRpaUUg", "F1Jj88w7"));
            if (TextUtils.isEmpty(com.google.android.play.core.assetpacks.c.f13197a)) {
                String h10 = de.e.h(ea.a.p("O2VCdCZhU18qbCtuKnYJbEBl", "AZmFWcJh"), "");
                com.google.android.play.core.assetpacks.c.f13197a = h10;
                if (TextUtils.isEmpty(h10)) {
                    com.google.android.play.core.assetpacks.c.f13197a = ea.a.p("MA==", "6GJJdADE");
                }
            }
            sb2.append(com.google.android.play.core.assetpacks.c.f13197a);
            o9.d.s(p11, sb2.toString());
        }
    }

    /* loaded from: classes3.dex */
    public class d implements NativeSoLoaderHelper.a {
        public d() {
        }

        public final void a() {
            PDF2WordEventCenter pDF2WordEventCenter = PDF2WordEventCenter.f28672a;
            Context m10 = ReaderPdfApplication.m();
            pDF2WordEventCenter.getClass();
            tn.a.b(m10, PDF2WordEventCenter.c, ea.a.p("Q2QtMgRvEGQtZFFsDHQzXyVjRmkwaTd5", "4jm4SMFu"));
        }

        public final void b() {
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("ADIOX1BvPW4kbwdk", "7npy4Jxg"), ea.a.p("QzI8XxdvFW4tZlVpbA==", "2S9Tm0g8"), ReaderPdfApplication.a(ReaderPdfApplication.this), false);
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23872a;

        static {
            int[] iArr = new int[NativeSoLoaderHelper.DownloadSource.values().length];
            f23872a = iArr;
            try {
                iArr[NativeSoLoaderHelper.DownloadSource.FromHome.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23872a[NativeSoLoaderHelper.DownloadSource.FromTools.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23872a[NativeSoLoaderHelper.DownloadSource.FromMore.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23872a[NativeSoLoaderHelper.DownloadSource.FromPreview.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String a(ReaderPdfApplication readerPdfApplication) {
        readerPdfApplication.getClass();
        int i10 = e.f23872a[f23866r.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return ea.a.p("UnBw", "kQxsehSU");
                    }
                    return ea.a.p("RWkudw==", "zuy5TwLB");
                }
                return ea.a.p("VWknZQ==", "Yf8909fj");
            }
            return ea.a.p("R28kbHM=", "ZLSlT65K");
        }
        return ea.a.p("I28aZQ==", "EfKw9r2E");
    }

    public static Activity b() {
        Stack<Activity> stack = f23858j;
        if (stack != null && !stack.isEmpty()) {
            Iterator<Activity> it = stack.iterator();
            while (it.hasNext()) {
                Activity next = it.next();
                if (next.getClass().equals(ReaderHomeActivity.class)) {
                    return next;
                }
            }
            return null;
        }
        return null;
    }

    public static void c(Class<? extends Activity> cls) {
        Iterator<Activity> it = f23858j.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next.getClass() != cls && !next.isDestroyed() && !next.isFinishing()) {
                next.finish();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (kotlin.text.j.F(r3, ea.a.p("DmNFaQ9pQ3k=", "Nbt8FrIC"), false) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (kotlin.text.j.F(r3, ea.a.p("JHAcTB52DW4OdQpsR2MlZV1uBmgsbVNkNWMFaSdpNnk=", "UYelqdeN"), false) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d() {
        /*
            r0 = 0
            pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.f26652p2 = r0
            java.util.Stack<android.app.Activity> r0 = pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.f23858j
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb4
            java.lang.Object r1 = r0.next()
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = 0
            if (r1 != 0) goto L1a
            goto La9
        L1a:
            boolean r3 = r1 instanceof com.google.android.gms.ads.AdActivity
            r4 = 1
            if (r3 == 0) goto L22
        L1f:
            r2 = r4
            goto La9
        L22:
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r5 = "XWEmZQ=="
            java.lang.String r6 = "60gKVKr1"
            ea.a.p(r5, r6)
            java.lang.String r5 = "f3kyYUFnL3QJYxJpQmkjeQ=="
            java.lang.String r6 = "wV2f3J9b"
            java.lang.String r5 = ea.a.p(r5, r6)
            boolean r5 = kotlin.text.j.F(r3, r5, r2)
            if (r5 == 0) goto L41
            goto L1f
        L41:
            java.lang.String r5 = "G1Q="
            java.lang.String r6 = "NT1zyeEE"
            java.lang.String r5 = ea.a.p(r5, r6)
            boolean r5 = kotlin.text.j.M(r3, r5, r2)
            if (r5 == 0) goto L5e
            java.lang.String r5 = "DmNFaQ9pQ3k="
            java.lang.String r6 = "Nbt8FrIC"
            java.lang.String r5 = ea.a.p(r5, r6)
            boolean r5 = kotlin.text.j.F(r3, r5, r2)
            if (r5 == 0) goto L5e
            goto L1f
        L5e:
            java.lang.String r5 = "DnVVaRxuVGUUZT53GnIDQVZ0B3YsdHk="
            java.lang.String r6 = "JhIu2eVU"
            java.lang.String r5 = ea.a.p(r5, r6)
            boolean r5 = kotlin.text.j.F(r3, r5, r2)
            if (r5 == 0) goto L6d
            goto L1f
        L6d:
            java.lang.String r5 = "ZXUlZx9lI2MGaUJpHXk="
            java.lang.String r6 = "QlbOESza"
            java.lang.String r5 = ea.a.p(r5, r6)
            boolean r5 = kotlin.text.j.F(r3, r5, r2)
            if (r5 == 0) goto L7c
            goto L1f
        L7c:
            java.lang.String r5 = "K24mbyBpJGQJYxJpQmkjeQ=="
            java.lang.String r6 = "qEbkBeRG"
            java.lang.String r5 = ea.a.p(r5, r6)
            boolean r5 = kotlin.text.j.F(r3, r5, r2)
            if (r5 == 0) goto L8b
            goto L1f
        L8b:
            java.lang.String r5 = "cnA7TBx2C240dVhsGmMkZSFuc2MyaTVpRHk="
            java.lang.String r6 = "0qktyCkJ"
            java.lang.String r5 = ea.a.p(r5, r6)
            boolean r5 = kotlin.text.j.F(r3, r5, r2)
            if (r5 != 0) goto L1f
            java.lang.String r5 = "JHAcTB52DW4OdQpsR2MlZV1uBmgsbVNkNWMFaSdpNnk="
            java.lang.String r6 = "UYelqdeN"
            java.lang.String r5 = ea.a.p(r5, r6)
            boolean r3 = kotlin.text.j.F(r3, r5, r2)
            if (r3 == 0) goto La9
            goto L1f
        La9:
            if (r2 != 0) goto Laf
            boolean r2 = r1 instanceof pdf.pdfreader.viewer.editor.free.ui.act.PreInstallOpenAdActivity
            if (r2 == 0) goto L9
        Laf:
            r1.finish()
            goto L9
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.d():void");
    }

    public static void e() {
        Iterator<Activity> it = f23858j.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next instanceof LanguageChooseActivity) {
                next.finish();
            }
        }
    }

    public static void f() {
        Iterator<Activity> it = f23858j.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next instanceof LanguageChooseActivity) {
                next.finish();
            }
        }
        FlutterEncryptConfig.f25878a.getClass();
        FlutterEncryptConfig.f25882f = null;
        q0.y(true);
    }

    public static void g() {
        Iterator<Activity> it = f23858j.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next instanceof ReaderImg2PDFConvertActivity) {
                ((ReaderImg2PDFConvertActivity) next).t2();
            } else if (!(next instanceof ReaderImg2PDFChooseActivity) && !(next instanceof ReaderSelectImagePreviewActivity) && !(next instanceof ReaderImgPreviewActivity) && !(next instanceof CameraActivity) && !(next instanceof ImageAdjustActivity)) {
                if (!(next instanceof Pdf2ImagePicPreviewActivity) && !(next instanceof Pdf2ImageBigPicPreviewActivity) && !(next instanceof Pdf2ImageLongPicPreviewActivity)) {
                    if (!(next instanceof ReaderPreviewActivity) && !(next instanceof OfficeReaderActivity) && !(next instanceof Word2PDFConvertActivity) && !(next instanceof ReaderConvertPreviewActivity)) {
                        if (!(next instanceof LanguageChooseActivity) && !(next instanceof UserGuideActivity)) {
                            if (next instanceof SubscriptionDarkTestFActivity) {
                                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) next;
                                subscriptionDarkTestFActivity.Z = true;
                                subscriptionDarkTestFActivity.finish();
                            } else if (next instanceof SubscriptionAIActivity) {
                                SubscriptionAIActivity subscriptionAIActivity = (SubscriptionAIActivity) next;
                                subscriptionAIActivity.T = true;
                                subscriptionAIActivity.finish();
                            } else if (next instanceof SubscriptionAIJ1Activity) {
                                SubscriptionAIJ1Activity subscriptionAIJ1Activity = (SubscriptionAIJ1Activity) next;
                                subscriptionAIJ1Activity.T = true;
                                subscriptionAIJ1Activity.finish();
                            } else if (next instanceof SubscriptionDarkTestJActivity) {
                                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) next;
                                subscriptionDarkTestJActivity.X = true;
                                subscriptionDarkTestJActivity.finish();
                            } else if (next instanceof SubscriptionBlackFridayActivity) {
                                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) next;
                                subscriptionBlackFridayActivity.Z = true;
                                subscriptionBlackFridayActivity.finish();
                            } else if (!(next instanceof ReaderMergeChooserActivity) && !(next instanceof ReaderMergePdfActivity) && !(next instanceof ReaderSplitPdfActivity)) {
                                if (next instanceof ReaderSearchActivity) {
                                    next.finish();
                                } else if ((next instanceof TermsUseActivity) || (next instanceof PolicyOverloadActivity)) {
                                    next.finish();
                                }
                            } else {
                                next.finish();
                            }
                        } else {
                            next.finish();
                        }
                    } else {
                        next.finish();
                    }
                } else {
                    next.finish();
                }
            } else {
                next.finish();
            }
        }
    }

    public static void h() {
        Iterator<Activity> it = f23858j.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if ((next instanceof ReaderPreviewActivity) || (next instanceof OfficeReaderActivity)) {
                next.finish();
            }
        }
    }

    public static void i() {
        ReaderHomeActivity.f26652p2 = null;
        Iterator<Activity> it = f23858j.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next instanceof SettingsActivity) {
                w<ArrayList<PdfPreviewEntity>> wVar = wn.b.f31386a;
                wn.b.f31393i = false;
                next.finish();
            }
        }
    }

    public static void j() {
        Iterator<Activity> it = f23858j.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next instanceof ReaderSplashActivity) {
                ((ReaderSplashActivity) next).x1(true);
            }
        }
    }

    public static AppViewModel k() {
        if (f23860l == null) {
            ReaderPdfApplication application = f23853e;
            kotlin.jvm.internal.g.e(application, "application");
            if (m0.a.c == null) {
                m0.a.c = new m0.a(application);
            }
            m0.a aVar = m0.a.c;
            kotlin.jvm.internal.g.b(aVar);
            f23860l = (AppViewModel) aVar.a(AppViewModel.class);
        }
        return f23860l;
    }

    public static Activity l() {
        Stack<Activity> stack = f23858j;
        if (stack != null && !stack.isEmpty()) {
            return stack.lastElement();
        }
        return null;
    }

    public static Context m() {
        if (f23854f == null) {
            ReaderPdfApplication readerPdfApplication = f23853e;
            if (readerPdfApplication == null) {
                Process.killProcess(Process.myPid());
            } else {
                f23854f = readerPdfApplication.getApplicationContext();
            }
        }
        return f23854f;
    }

    public static boolean n(Activity activity) {
        Iterator<Activity> it = f23858j.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next.getClass().getName().startsWith(next.getPackageName()) && next != activity && !(next instanceof ReaderSplashActivity) && !(next instanceof ReaderLauncherBridgeActivity)) {
                return true;
            }
        }
        return false;
    }

    public static void o(Context context) {
        f23861m = true;
        if (!f23862n) {
            Intent intent = new Intent(context, VerifySoActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        f23862n = true;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        if (!r1.a.f29432b) {
            try {
                try {
                    applicationInfo = context.getApplicationInfo();
                } catch (RuntimeException unused) {
                    applicationInfo = null;
                }
                if (applicationInfo != null) {
                    r1.a.b(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                }
            } catch (Exception e10) {
                throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
            }
        }
    }

    @Keep
    public int mzNightModeUseOf() {
        return 0;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0.a(this, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b5, code lost:
        if (mb.e.c().b().f22436b == 0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.onCreate():void");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        com.bumptech.glide.b.b(this).onTrimMemory(i10);
    }

    /* loaded from: classes3.dex */
    public class c implements Application.ActivityLifecycleCallbacks {
        public c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity firstActivity, Bundle bundle) {
            String str;
            pdf.pdfreader.viewer.editor.free.utils.init.b.f28709a.getClass();
            ReaderPdfApplication application = ReaderPdfApplication.this;
            kotlin.jvm.internal.g.e(application, "application");
            kotlin.jvm.internal.g.e(firstActivity, "firstActivity");
            if (!pdf.pdfreader.viewer.editor.free.utils.init.b.f28710b) {
                pdf.pdfreader.viewer.editor.free.utils.init.b.f28710b = true;
                ea.a.p("Wm4idCRoB240aUZzHUE1dC12W3Q_QzFlAHRl", "aoZ1Vcka");
                f.b(firstActivity).getClass();
                d1 b10 = d1.b(firstActivity);
                String str2 = f.f22618i;
                boolean a10 = b10.a(str2, true);
                if (a10) {
                    d1.b(firstActivity).c(f.f22619j, true);
                    d1.b(firstActivity).c(ea.a.p("OnNUciZwRWUsaS93KnAJZ1BfCGk3c3Q=", "AWlw66nc"), true);
                    d1.b(firstActivity).c(str2, false);
                    q0.y(false);
                    wn.b.f31389e = true;
                } else {
                    pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                    if (pdf.pdfreader.viewer.editor.free.utils.c.f28559b.getBoolean(ea.a.p("JnNubhx3aHUpZXI=", "zRgB1VDP"), true)) {
                        q0.y(false);
                        wn.b.f31389e = true;
                    } else {
                        wn.b.f31389e = false;
                    }
                }
                ReaderPdfApplication.f23855g = a10;
                wn.b.f31388d = a10;
                if (ReaderPdfApplication.f23855g) {
                    f.b(firstActivity).getClass();
                    d1 b11 = d1.b(firstActivity);
                    String p10 = ea.a.p("OnNUciZzX28tXz5oEG0NX0F5HmUaMVE1", "1NznTrwB");
                    SharedPreferences sharedPreferences = b11.f28619a;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putInt(p10, 0).apply();
                    }
                } else {
                    f.b(firstActivity).getClass();
                    boolean a11 = d1.b(firstActivity).a(ea.a.p("OnNUciZpWWkuXz5oEG0NXwQ0NQ==", "8M4pNwWm"), false);
                    if (!a11) {
                        d1.b(firstActivity).c(ea.a.p("OnNUciZpWWkuXz5oEG0NXwQ0NQ==", "lYscvF6M"), true);
                    }
                    if (!a11 && q0.j(firstActivity) < 51) {
                        f.b(firstActivity).getClass();
                        d1.b(firstActivity).c(ea.a.p("RnMucixzCm8FX0BoDG0zXyN1W2QjX3I0NQ==", "cp0ifJ7N"), true);
                        f b12 = f.b(firstActivity);
                        int i10 = f.f22627r;
                        b12.getClass();
                        d1 b13 = d1.b(firstActivity);
                        String p11 = ea.a.p("OnNUciZzX28tXz5oEG0NX0F5HmUaMVE1", "1NznTrwB");
                        SharedPreferences sharedPreferences2 = b13.f28619a;
                        if (sharedPreferences2 != null) {
                            sharedPreferences2.edit().putInt(p11, i10).apply();
                        }
                    }
                }
                f.b(firstActivity).getClass();
                int a12 = f.a(firstActivity);
                if (a12 != 0) {
                    if (a12 != 1) {
                        if (a12 == 2) {
                            l.e.B(1);
                        }
                    } else {
                        l.e.B(2);
                    }
                } else {
                    l.e.B(-1);
                }
                try {
                    EngineHelper engineHelper = EngineHelper.f15726a;
                    List<String> list = FlutterEncryptConfig.f25879b;
                    String p12 = ea.a.p("TTZXMHU3RDN9N1UyBzA5", "z7tcCwjJ");
                    FlutterEncryptConfig$callback$1 flutterEncryptConfig$callback$1 = FlutterEncryptConfig.f25881e;
                    engineHelper.getClass();
                    EngineHelper.d(application, list, p12, flutterEncryptConfig$callback$1);
                } catch (Exception unused) {
                    ReaderPdfApplication.o(application);
                }
                wn.b.f(false);
                new cl.a(application).f5711b = new i(12);
                long l10 = q0.l(firstActivity, -1, "last_used_ver_code");
                if (l10 <= 0) {
                    q0.x(firstActivity, 98, "last_used_ver_code");
                    l10 = q0.j(firstActivity);
                }
                if (l10 > 0 && l10 != 98) {
                    ea.a.p("BHAtcldkVixodA5pRyA2cEggPmE6dGBlBnMYbz89", "UAqJ63be");
                    ea.a.p("HyAodQFyB24GVlFyGmk5bj0=", "9FJ2SaLX");
                    String str3 = n0.f28727a;
                    if (98 > l10) {
                        q0.w(firstActivity, "is_can_show_update_red_dot", true);
                        try {
                            str = q0.h(firstActivity).getString("update_done_event", "");
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            String[] split = str.split(ea.a.p("Og==", "9ltGviNE"));
                            if (split.length == 3 && (TextUtils.equals(ea.a.p("RnAvYQdlPW4dcllhbA==", "XPyWaa4D"), split[0]) || TextUtils.equals(ea.a.p("RnAvYQdlPW0Talty", "dD5FXPws"), split[0]) || TextUtils.equals(ea.a.p("RHAWYU1l", "1t1r9rOp"), split[0]))) {
                                tn.a.d(firstActivity, split[0], split[1], split[2], false);
                            }
                            q0.B(firstActivity, "");
                        }
                    }
                    q0.x(firstActivity, 98, "last_used_ver_code");
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(firstActivity)) {
                        bl.a.J(firstActivity).f5469h = true;
                        bl.a.J(firstActivity).f5470i = true;
                        bl.a.J(firstActivity).K(firstActivity);
                    }
                }
                zl.a.c.getClass();
                h<Object>[] hVarArr = zl.a.f32400d;
                h<Object> hVar = hVarArr[4];
                pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = zl.a.f32405i;
                if (((Number) aVar.b(hVar)).longValue() == 0) {
                    aVar.c(hVarArr[4], Long.valueOf(System.currentTimeMillis()));
                }
                int i11 = j.f28711a;
                Calendar calendar = Calendar.getInstance();
                q0.z(((calendar.get(2) + 1) * 100) + (calendar.get(1) * 10000) + calendar.get(5), firstActivity, "last_used_date");
                wn.b.c();
            }
            ea.a.p("I2lXZRp5VGxl", "kGIGPJNt");
            ea.a.p("XG4KYwdpFGkGeXdyDGEiZSA6", "KHyCraR7");
            firstActivity.toString();
            t1.b(ea.a.p("XG4KYwdpFGkGeXdyDGEiZSA6", "aswLpDHx") + firstActivity);
            Stack<Activity> stack = ReaderPdfApplication.f23858j;
            if (stack != null) {
                stack.add(firstActivity);
            }
            if (firstActivity instanceof PlayCoreDialogWrapperActivity) {
                eo.d.f16828a = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            ea.a.p("X2ktZRB5AWxl", "DwSNh1pW");
            ea.a.p("XG4KYwdpFGkGeXBlGnQkbz1lVjo=", "cX2J180z");
            Objects.toString(activity);
            t1.b(ea.a.p("XW4wY0ZpOGk8eSJlR3Qlb0FlNjo=", "di2q2NFT") + activity);
            Stack<Activity> stack = ReaderPdfApplication.f23858j;
            if (stack != null) {
                stack.remove(activity);
                if (stack.isEmpty()) {
                    EventCenter.f28667n = false;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            ReaderPdfApplication.f23863o--;
            ea.a.p("X2ktZRB5AWxl", "arrr3fRw");
            ea.a.p("H24NYw1pEGk8eTZhQXMyZDo=", "F3pLyfr7");
            Objects.toString(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            ReaderPdfApplication.f23863o++;
            ea.a.p("X2ktZRB5AWxl", "mH70qrL8");
            ea.a.p("DW4qYw5pMWk8eTRlR3U6ZVw6", "7rbkzGWn");
            Objects.toString(activity);
            t1.b(ea.a.p("IG5wYw1pQWkueRhlBnUFZVE6", "pAdQXgoW") + activity);
            activity.getClass();
            wn.b.c();
            ReaderPdfApplication readerPdfApplication = ReaderPdfApplication.this;
            if (readerPdfApplication.f23869d != null && activity.getClass().getName().startsWith(activity.getPackageName())) {
                readerPdfApplication.f23869d.e(activity);
                readerPdfApplication.f23869d = null;
            }
            if (!TextUtils.isEmpty(ReaderPdfApplication.f23864p)) {
                j1.e(ReaderPdfApplication.f23854f, ReaderPdfApplication.f23864p, true, null, -1);
                ReaderPdfApplication.f23864p = "";
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            ea.a.p("I2lXZRp5VGxl", "FnAZUuig");
            ea.a.p("IG5wYw1pQWkueRl0FHIcZVE6", "oVriQgki");
            Objects.toString(activity);
            ReaderPdfApplication readerPdfApplication = ReaderPdfApplication.this;
            HashSet<Activity> hashSet = readerPdfApplication.f23867a;
            if (hashSet == null) {
                readerPdfApplication.f23867a = new HashSet<>();
            } else if (hashSet.isEmpty() && readerPdfApplication.f23868b) {
                readerPdfApplication.f23868b = false;
                qo.d dVar = new qo.d();
                dVar.f29396a = ea.a.p("CVJ-TSZCdkMRXx5PKkYnUnBHPE8QTkQ=", "zgJCGZc3");
                wk.b.b().e(dVar);
            }
            readerPdfApplication.f23867a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            ea.a.p("I2lXZRp5VGxl", "K1MVumrx");
            ea.a.p("IG5wYw1pQWkueRl0GnAYZVE6", "dERLc2Kk");
            Objects.toString(activity);
            t1.b(ea.a.p("XG4KYwdpFGkGeWd0BnAmZSA6", "SN7eWWxv") + activity);
            ReaderPdfApplication readerPdfApplication = ReaderPdfApplication.this;
            HashSet<Activity> hashSet = readerPdfApplication.f23867a;
            if (hashSet != null) {
                hashSet.remove(activity);
            }
            HashSet<Activity> hashSet2 = readerPdfApplication.f23867a;
            if (hashSet2 != null && hashSet2.isEmpty()) {
                ea.a.p("X2ktZRB5AWxl", "Bx2nE4Da");
                ea.a.p("UGElYxZsI2weTFthZA==", "lTpKil51");
                ((Handler) FullScreenManage.c.getValue()).removeCallbacksAndMessages(null);
                FullScreenManage.f23916d = 0;
                readerPdfApplication.f23868b = false;
                Stack<Activity> stack = ReaderPdfApplication.f23858j;
                if (stack != null) {
                    Iterator<Activity> it = stack.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof ReaderHomeActivity) {
                            readerPdfApplication.f23868b = true;
                            return;
                        }
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
