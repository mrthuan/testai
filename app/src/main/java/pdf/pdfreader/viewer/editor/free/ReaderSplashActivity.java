package pdf.pdfreader.viewer.editor.free;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z0;
import cg.l;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.play.core.assetpacks.b1;
import com.lib.flutter.encrypt.NativeSplashApi;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.j;
import pdf.pdfreader.viewer.editor.free.ads.m;
import pdf.pdfreader.viewer.editor.free.ads.n;
import pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.i;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import qb.w;
import tf.d;
import ul.b;
import wn.e;
import yl.a;

/* compiled from: ReaderSplashActivity.kt */
/* loaded from: classes3.dex */
public final class ReaderSplashActivity extends c implements a.d, NativeSplashApi {

    /* renamed from: s  reason: collision with root package name */
    public static final a f23873s;

    /* renamed from: a  reason: collision with root package name */
    public LottieAnimationView f23874a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f23875b;
    public TextView c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23876d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23877e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23878f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23879g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23880h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23881i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f23882j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f23885m;

    /* renamed from: p  reason: collision with root package name */
    public boolean f23888p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f23889q;

    /* renamed from: r  reason: collision with root package name */
    public AnimatorSet f23890r;

    /* renamed from: k  reason: collision with root package name */
    public final tf.c f23883k = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.ReaderSplashActivity$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* renamed from: l  reason: collision with root package name */
    public boolean f23884l = true;

    /* renamed from: n  reason: collision with root package name */
    public final tf.c f23886n = kotlin.a.a(new cg.a<String[]>() { // from class: pdf.pdfreader.viewer.editor.free.ReaderSplashActivity$modelList$2
        @Override // cg.a
        public final String[] invoke() {
            return ReaderPdfApplication.m().getResources().getStringArray(R.array.arg_res_0x7f030004);
        }
    });

    /* renamed from: o  reason: collision with root package name */
    public final z0 f23887o = new z0(this, 20);

    /* compiled from: ReaderSplashActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(String message) {
            g.e(message, "message");
            ea.a.p("ZXANZRVUJnN0", "Ib6hqC1r");
            SystemClock.elapsedRealtime();
            a aVar = ReaderSplashActivity.f23873s;
        }

        public static void b(String str) {
            ea.a.p("HHBUZR1UUnN0", "ZDirInTM");
            SystemClock.elapsedRealtime();
            a aVar = ReaderSplashActivity.f23873s;
        }

        public static void c(String str) {
            SystemClock.elapsedRealtime();
            a aVar = ReaderSplashActivity.f23873s;
            ea.a.p("YHAuZRdUB3N0", "gnX18tab");
        }
    }

    static {
        ea.a.p("HWVQZBxyZHA2YTloNGMcaUNpGnk=", "1wwzkdgi");
        ea.a.p("JHBSbhFoPHIsLVcxOQ==", "N2K7EUuN");
        f23873s = new a();
    }

    public static void w1(ReaderSplashActivity readerSplashActivity) {
        g.e(readerSplashActivity, ea.a.p("IGhec2Uw", "FbT7ADgh"));
        try {
            a.C0421a c0421a = yl.a.c;
            boolean f10 = q0.f(ReaderPdfApplication.m(), "is_model_1209_copy_success_in_175", false);
            ReaderSplashActivity$copyModelToCache$1$1 readerSplashActivity$copyModelToCache$1$1 = new l<Boolean, d>() { // from class: pdf.pdfreader.viewer.editor.free.ReaderSplashActivity$copyModelToCache$1$1
                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return d.f30009a;
                }

                public final void invoke(boolean z10) {
                    q0.w(ReaderPdfApplication.m(), "is_model_1209_copy_success_in_175", z10);
                }
            };
            c0421a.getClass();
            a.C0421a.a(readerSplashActivity, f10, readerSplashActivity$copyModelToCache$1$1);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1() {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ReaderSplashActivity.A1():void");
    }

    public final void B1() {
        TextView textView;
        int length;
        this.f23875b = (TextView) findViewById(R.id.splash_name);
        this.c = (TextView) findViewById(R.id.splash_tips);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.logo);
        try {
            String string = getResources().getString(R.string.arg_res_0x7f13036c);
            g.d(string, ea.a.p("AmUCbzdyJGU7LgFlQFMjclFuNSgbLkV0BmkfZ39yJ2EUZQNfI3A3XyZhC2Up", "mdpqBGAj"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            String p10 = ea.a.p("YWUqZBZy", "JY3dSqWB");
            int i10 = 0;
            int V = k.V(string, p10, 0, false, 6);
            if (V != -1 && p10.length() + V <= spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(this, R.color.colorAccent)), V, p10.length() + V, 33);
                if (a0.d(this).equals(Locale.CHINA) || a0.d(this).equals(Locale.TRADITIONAL_CHINESE) || a0.d(this).equals(Locale.JAPANESE) || a0.d(this).equals(Locale.KOREAN)) {
                    if (V == 0) {
                        i10 = p10.length();
                        length = string.length();
                    } else {
                        length = string.length() - p10.length();
                    }
                    if (i10 != -1 && length <= spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new TextAppearanceSpan(this, R.style.style_splash_name_small), i10, length, 33);
                    }
                }
                TextView textView2 = this.f23875b;
                if (textView2 != null) {
                    textView2.setText(spannableStringBuilder);
                }
            }
        } catch (Exception e10) {
            dp.a.a().getClass();
            dp.a.e(e10);
        }
        try {
            this.f23890r = new AnimatorSet();
            TextView textView3 = this.f23875b;
            if (textView3 != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView3, ea.a.p("BWxCaGE=", "Pxd2hHQ6"), 0.0f, 1.0f);
                ofFloat.setDuration(870L);
                ofFloat.setStartDelay(280L);
                AnimatorSet animatorSet = this.f23890r;
                if (animatorSet != null) {
                    animatorSet.play(ofFloat);
                }
            }
            TextView textView4 = this.c;
            if (textView4 != null && !BillingConfigImpl.c.w()) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView4, ea.a.p("LmxBaGE=", "Ldtnct6s"), 0.0f, 1.0f);
                ofFloat2.setDuration(870L);
                ofFloat2.setStartDelay(280L);
                AnimatorSet animatorSet2 = this.f23890r;
                if (animatorSet2 != null) {
                    animatorSet2.play(ofFloat2);
                }
            }
            AnimatorSet animatorSet3 = this.f23890r;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        } catch (Exception e11) {
            dp.a.f16311a.getClass();
            dp.a.d(this, e11);
            TextView textView5 = this.f23875b;
            if (textView5 != null) {
                textView5.setAlpha(1.0f);
            }
            if (!BillingConfigImpl.c.w() && (textView = this.c) != null) {
                textView.setAlpha(1.0f);
            }
        }
    }

    public final void C1(ArrayList<Uri> arrayList) {
        ReaderPdfApplication.k().g(null);
        x1(false);
        ThirdOpenParseManager thirdOpenParseManager = ThirdOpenParseManager.f28760a;
        Intent intent = getIntent();
        l<ip.a, d> lVar = new l<ip.a, d>() { // from class: pdf.pdfreader.viewer.editor.free.ReaderSplashActivity$parseShareImage$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(ip.a aVar) {
                invoke2(aVar);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ip.a it) {
                g.e(it, "it");
                ImageConvertDataRepository.f26536a.getClass();
                ImageConvertDataRepository.f();
                Iterator<Activity> it2 = ReaderPdfApplication.f23858j.iterator();
                while (it2.hasNext()) {
                    Activity next = it2.next();
                    if (next instanceof ReaderImg2PDFConvertActivity) {
                        ((ReaderImg2PDFConvertActivity) next).t2();
                    } else if ((next instanceof ReaderImg2PDFChooseActivity) || (next instanceof ReaderSelectImagePreviewActivity) || (next instanceof ReaderImgPreviewActivity) || (next instanceof CameraActivity) || (next instanceof ImageAdjustActivity)) {
                        next.finish();
                    }
                }
                if (it.f18962a == ThirdOpenStatus.DONE) {
                    List<b> list = it.f18963b;
                    if (list != null) {
                        ImageConvertDataRepository imageConvertDataRepository = ImageConvertDataRepository.f26536a;
                        ArrayList<b> arrayList2 = list instanceof ArrayList ? (ArrayList) list : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        imageConvertDataRepository.getClass();
                        ImageConvertDataRepository.f26551q.j(arrayList2);
                        ImageConvertDataRepository.g();
                        if (h1.c()) {
                            FlutterEncryptConfig.f25878a.getClass();
                            if (FlutterEncryptConfig.c()) {
                                Intent intent2 = new Intent(ReaderSplashActivity.this, LanguageChooseActivity.class);
                                intent2.putExtra(ea.a.p("Q2EsZSx0bw==", "uahLb62H"), ea.a.p("P2FWZSZtVmk0XylvG3YNcnQ=", "gy8trQZ6"));
                                i.a aVar = i.f24934a;
                                ReaderSplashActivity readerSplashActivity = ReaderSplashActivity.this;
                                String p10 = ea.a.p("O2hYcmQ=", "rOCKEhWN");
                                aVar.getClass();
                                i.a.b(readerSplashActivity, intent2, p10, null);
                                ReaderSplashActivity.this.startActivity(intent2);
                            } else {
                                ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                                ReaderSplashActivity readerSplashActivity2 = ReaderSplashActivity.this;
                                String p11 = ea.a.p("RWgmcmU=", "kw6G7ytW");
                                String p12 = ea.a.p("G2gpcmU=", "oVhHP68V");
                                aVar2.getClass();
                                ImageAdjustActivity.a.b(readerSplashActivity2, p11, p12);
                            }
                        } else {
                            FlutterEncryptConfig.f25878a.getClass();
                            if (FlutterEncryptConfig.c()) {
                                Intent intent3 = new Intent(ReaderSplashActivity.this, LanguageChooseActivity.class);
                                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(ReaderSplashActivity.this)) {
                                    intent3.putExtra(ea.a.p("P2FWZSZ0bw==", "XIYjYUBF"), ea.a.p("HGEdZQttO2kmXwVvWnYycnQ=", "ZHlzTZvj"));
                                } else {
                                    intent3.putExtra(ea.a.p("M3MiaAZyL0klYQFl", "GTZqgJJI"), true);
                                    intent3.putExtra(ea.a.p("PmEDZTV0bw==", "GqNdjP14"), ea.a.p("Q2EsZSxtA2lu", "njOXk0UW"));
                                }
                                i.a aVar3 = i.f24934a;
                                ReaderSplashActivity readerSplashActivity3 = ReaderSplashActivity.this;
                                String p13 = ea.a.p("R2gicmQ=", "DyZD5Cwe");
                                aVar3.getClass();
                                i.a.b(readerSplashActivity3, intent3, p13, null);
                                ReaderSplashActivity.this.startActivity(intent3);
                            } else if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(ReaderSplashActivity.this)) {
                                ImageAdjustActivity.a aVar4 = ImageAdjustActivity.f25741u0;
                                ReaderSplashActivity readerSplashActivity4 = ReaderSplashActivity.this;
                                String p14 = ea.a.p("PGhQcmU=", "YdFgyGyy");
                                String p15 = ea.a.p("PGhQcmU=", "dUi4VkFb");
                                aVar4.getClass();
                                ImageAdjustActivity.a.b(readerSplashActivity4, p14, p15);
                            } else {
                                Intent intent4 = new Intent(ReaderSplashActivity.this, ReaderHomeActivity.class);
                                i.a aVar5 = i.f24934a;
                                ReaderSplashActivity readerSplashActivity5 = ReaderSplashActivity.this;
                                String p16 = ea.a.p("LmgocmQ=", "9vZAgmWv");
                                aVar5.getClass();
                                i.a.b(readerSplashActivity5, intent4, p16, SubscriptionDarkTestFActivity.class);
                                intent4.putExtra(ea.a.p("JnNiaBhyUkk3YS1l", "jgjXVCEL"), true);
                                ReaderSplashActivity.this.startActivity(intent4);
                            }
                        }
                    }
                } else {
                    ReaderSplashActivity.this.c0();
                }
                ReaderSplashActivity.this.x1(true);
            }
        };
        thirdOpenParseManager.getClass();
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty()) {
            ((ThreadPoolExecutor) ThirdOpenParseManager.c.getValue()).execute(new w(2, arrayList, arrayList2, this, intent, lVar));
            return;
        }
        j1.e(this, getString(R.string.arg_res_0x7f13040a), false, null, -1);
        String p10 = ea.a.p("Wm0qZxYgEmEAc1EgDHIkb3I=", "CCcaIrkb");
        f23873s.getClass();
        a.b(p10);
        lVar.invoke(new ip.a(ThirdOpenStatus.ERROR, arrayList2));
    }

    public final void D1() {
        if (!this.f23878f) {
            return;
        }
        this.f23878f = false;
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("OHIKbQR1PCA9cwNyGCAka1FwcnM5bFdzHEYEbD1BJiA7aAB3", "CsHomQcH");
            int i10 = zk.a.f32399a;
            t1.b(p10);
        } else if (pdf.pdfreader.viewer.editor.free.ads.l.m().d(this) && !pdf.pdfreader.viewer.editor.free.ads.l.m().g()) {
            tf.c cVar = FullScreenManage.f23914a;
            FullScreenManage.h(this, ea.a.p("KnAHYUto", "QXYk8Hww"), false);
            pdf.pdfreader.viewer.editor.free.ads.l m10 = pdf.pdfreader.viewer.editor.free.ads.l.m();
            m10.f23921e = this;
            m10.j(this, new m(m10));
            ea.a.p("RGkvZxZ0PXQTZw==", "j5YzBVls");
            ea.a.p("PWVQbFlzX28tQQ46IA==", "TOGrjtzs");
            fp.a.f17318a.getClass();
            if (fp.a.c == 0) {
                fp.a.c = System.nanoTime();
            }
        }
    }

    @Override // com.lib.flutter.encrypt.NativeSplashApi
    public final void c0() {
        if (this.f23880h && !this.f23879g) {
            this.f23881i = true;
        } else {
            A1();
        }
    }

    @Override // com.lib.flutter.encrypt.NativeSplashApi
    public final boolean e1() {
        FlutterEncryptConfig.f25878a.getClass();
        return FlutterEncryptConfig.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0566, code lost:
        if (r0 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x059b, code lost:
        if (r0 != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x059d, code lost:
        pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.d();
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0335 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227  */
    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 1619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ReaderSplashActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0.isRunning() == true) goto L5;
     */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            r3 = this;
            super.onDestroy()
            android.animation.AnimatorSet r0 = r3.f23890r
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r0.isRunning()
            r2 = 1
            if (r0 != r2) goto L10
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L1a
            android.animation.AnimatorSet r0 = r3.f23890r
            if (r0 == 0) goto L1a
            r0.cancel()
        L1a:
            com.lib.flutter.encrypt.NativeSplashApi$Companion r0 = com.lib.flutter.encrypt.NativeSplashApi.U0
            r0.getClass()
            r0 = 0
            com.lib.flutter.encrypt.NativeSplashApi.Companion.c = r0
            pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig r2 = pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig.f25878a
            r2.getClass()
            pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig.f25882f = r0
            pdf.pdfreader.viewer.editor.free.ads.l r2 = pdf.pdfreader.viewer.editor.free.ads.l.m()
            r2.f23921e = r0
            pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ReaderSplashActivity.onDestroy():void");
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = false;
        if (keyEvent != null && keyEvent.getKeyCode() == 4) {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        ArrayList<Uri> z12;
        Uri uri;
        super.onNewIntent(intent);
        AppCoreFilterEvent.c.clear();
        n.f23972a.a();
        ip.b.f18964a.getClass();
        int b10 = ip.b.b(intent);
        Integer num = null;
        if (b10 != 5) {
            uri = ThirdOpenParseManager.f(intent);
            z12 = null;
        } else {
            z12 = z1(b10, intent);
            uri = null;
        }
        z0 z0Var = this.f23887o;
        boolean z10 = false;
        if (uri == null && z12 == null) {
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra(ea.a.p("KXJebQ==", "mloDGJWr"), 0));
            }
            if (num != null && num.intValue() == 7) {
                AppCoreFilterEvent.i(AppOpenSource.Shortcuts);
                this.f23876d = false;
                this.f23877e = false;
                this.f23881i = false;
                String stringExtra = intent.getStringExtra(ea.a.p("JGVIXx9pW2UFcCt0aA==", "lUIQTEKZ"));
                if (stringExtra == null) {
                    stringExtra = "";
                }
                File file = new File(stringExtra);
                Uri parse = Uri.parse(stringExtra);
                y1().removeCallbacks(z0Var);
                intent.putExtra(ea.a.p("OnBVYQ1lcm4uaT55OWkeZXFhGmE=", "F4GtDljD"), true);
                ThirdOpenParseManager.f28760a.getClass();
                ThirdOpenParseManager.h(this, parse, file);
                ReaderPdfApplication.g();
                ReaderPdfApplication.h();
                if (j.c().f()) {
                    j.c().b(this);
                }
                ReaderPdfApplication.d();
                ReaderPdfApplication.e();
                pdf.pdfreader.viewer.editor.free.service.b.f26559a.getClass();
                pdf.pdfreader.viewer.editor.free.service.b.c(this);
                b1.J(this, true, false);
                int a10 = ip.b.a(file);
                g.d(parse, ea.a.p("OnJp", "JsT8OBiu"));
                k0.a(this, intent, new ThirdOpenBean(parse, a10), ip.b.c(this, a10));
                EventCenter.a(this, ea.a.p("BmgpcmU=", "fnuHweEL"));
                return;
            } else if (num != null && num.intValue() == 6) {
                AppCoreFilterEvent.i(AppOpenSource.Widget);
                ReaderHomeActivity.Y1 = ea.a.p("OGlVZxx0", "28AniAZ2");
                EventCenter.a(this, ea.a.p("RGkvZxZ0", "cNnBMRWa"));
                b1.J(this, true, false);
                intent.putExtra(ea.a.p("RnAvYQdlJ24GaUB5JWkgZQBhRmE=", "dslDPSe0"), true);
                ReaderPdfApplication.g();
                pdf.pdfreader.viewer.editor.free.service.b.f26559a.getClass();
                pdf.pdfreader.viewer.editor.free.service.b.c(this);
                if (j.c().f()) {
                    j.c().b(this);
                }
                ReaderPdfApplication.d();
                ReaderPdfApplication.i();
                k0.e(this, intent);
                finish();
                return;
            } else {
                AppCoreFilterEvent.i(AppOpenSource.Desk);
                return;
            }
        }
        this.f23876d = false;
        this.f23877e = false;
        this.f23881i = false;
        y1().removeCallbacks(z0Var);
        if (intent != null) {
            intent.putExtra(ea.a.p("OnBVYQ1lcm4uaT55OWkeZXFhGmE=", "FrPVUOd2"), true);
        }
        if (uri != null) {
            ThirdOpenParseManager.g(this, uri, intent);
        } else {
            C1(z12);
        }
        ReaderPdfApplication.g();
        ReaderPdfApplication.h();
        if (j.c().f()) {
            j.c().b(this);
        }
        ReaderPdfApplication.d();
        ReaderPdfApplication.e();
        pdf.pdfreader.viewer.editor.free.service.b.f26559a.getClass();
        pdf.pdfreader.viewer.editor.free.service.b.c(this);
        if (uri == null) {
            z10 = true;
        }
        b1.J(this, true, z10);
        if (uri != null) {
            ReaderHomeActivity.Y1 = ea.a.p("QQ==", "LUjkibvB");
            EventCenter.a(this, ea.a.p("PGhQcmU=", "QTswF1zn"));
            ThirdOpenBean thirdOpenBean = new ThirdOpenBean(uri, b10);
            String c = ip.b.c(this, b10);
            FlutterEncryptConfig.f25878a.getClass();
            k0.b(this, intent, thirdOpenBean, c, FlutterEncryptConfig.c());
        }
        AppCoreFilterEvent.i(AppOpenSource.Share);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f23884l = true;
        fp.a.f17318a.getClass();
        fp.a.f17321e = System.nanoTime();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        o9.d.r(ea.a.p("YWUqZBZyMXAeYUdoKGMiaTJpRnl4Pn1vXFJXcydtAyBWbj9lcg==", "22RfaTCn"));
        e.a(this);
        this.f23884l = false;
        if (this.f23882j) {
            return;
        }
        fp.a.f17318a.getClass();
        fp.a.b();
        if (this.f23876d) {
            this.f23876d = false;
            y1().postDelayed(new c6.d(1, SystemClock.elapsedRealtime(), this), 500L);
        } else if (this.f23877e) {
            this.f23877e = false;
            y1().postDelayed(new y0(this, 20), 300L);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f23879g = z10;
        z0 z0Var = this.f23887o;
        if (z10 && this.f23881i && this.f23880h) {
            y1().removeCallbacks(z0Var);
            if (kotlin.text.j.G(Build.MANUFACTURER, ea.a.p("RWk9bw==", "naIQLtXh"), true)) {
                y1().postDelayed(z0Var, 2500L);
                return;
            } else {
                y1().postDelayed(z0Var, 1000L);
                return;
            }
        }
        y1().removeCallbacks(z0Var);
    }

    @Override // com.lib.flutter.encrypt.NativeSplashApi
    public final void v() {
        if (this.f23880h && !this.f23879g) {
            this.f23881i = true;
        } else if (this.f23884l) {
            this.f23876d = true;
        } else {
            this.f23878f = true;
            A1();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void w(boolean z10) {
        o9.d.r("ReaderSplashActivity--- show = " + z10);
    }

    public final void x1(boolean z10) {
        String str = n0.f28727a;
        if (z10) {
            this.f23888p = true;
        } else {
            this.f23889q = true;
        }
        if (this.f23888p && this.f23889q) {
            finish();
            ea.a.p("FGUXZDVyFnAkYRVodWMjaU5pJnlpZl9uHXMZUzBmJ2w_IBBpPmk2aC1kIQ==", "NqFvPEgG");
        }
    }

    public final Handler y1() {
        return (Handler) this.f23883k.getValue();
    }

    public final ArrayList<Uri> z1(int i10, Intent intent) {
        String type;
        if (i10 != 5) {
            return null;
        }
        try {
            if (intent == null) {
                finish();
                return null;
            }
            String action = intent.getAction();
            ArrayList<Uri> arrayList = new ArrayList<>();
            if (g.a(action, ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJC1c=", "FYEeNBJi"))) {
                if (intent.getData() != null) {
                    Uri data = intent.getData();
                    g.b(data);
                    arrayList.add(data);
                    return arrayList;
                }
                finish();
                return null;
            }
            if (g.a(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhBFA0QpTQJMB0ljTEU=", "MvWSTDNn"), action) && intent.hasExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrUzFSIEFN", "b2NtejAU"))) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(ea.a.p("Bm5dcilpMS4hbhJlWnR5ZUB0IGFnU2JSMUFN", "Ayg9FUfI"));
                if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                    arrayList.addAll(parcelableArrayListExtra);
                }
                finish();
                return null;
            } else if (g.a(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhBFHUQ=", "Sh4MiKKe"), action) && (type = intent.getType()) != null) {
                Uri uri = (Uri) intent.getParcelableExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrUzFSFUFN", "ckw8PpkM"));
                if (uri == null) {
                    finish();
                    return null;
                } else if (kotlin.text.j.M(type, ea.a.p("Wm0qZxYv", "KJgyAakr"), false)) {
                    arrayList.add(uri);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void J() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void a0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void close() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void d() {
    }
}
