package yn;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.support.v4.media.session.h;
import android.text.TextUtils;
import de.e;
import java.util.Locale;
import java.util.Random;
import k0.p;
import k0.q;
import k0.u;
import kotlin.jvm.internal.g;
import no.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import qb.f1;

/* compiled from: NewlyAddFileNotificationUtils.kt */
/* loaded from: classes3.dex */
public final class a extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public static final a f32189o;

    /* renamed from: p  reason: collision with root package name */
    public static final String f32190p;

    /* renamed from: q  reason: collision with root package name */
    public static final String f32191q;

    /* renamed from: r  reason: collision with root package name */
    public static final String f32192r;

    /* renamed from: s  reason: collision with root package name */
    public static final String f32193s;

    static {
        ea.a.p("AWVGbABBU2QcaSZlO28caVNpDWExaQpuPHQ7bHM=", "BsegiRRE");
        f32190p = ea.a.p("DEhwTjdFe18dUgVVJV8hRGpOK1cJWTpBBUQGRgxMRQ==", "cQilAYED");
        f32191q = ea.a.p("cEgKTj1FLl81UntVOV8fRBtOd1cKWRxBF0QPRhxMcF9gSQdFPVQ=", "SPU5lpDM");
        f32192r = ea.a.p("XWU8bApfA2QWX1JpBWU=", "STKmQS3I");
        f32193s = ea.a.p("XWU8bApfA2QWX1JpBWUJcy1sV250", "1fGYpASH");
        ea.a.p("IWVGbABfVmQ-XyxpGWU=", "IkznChQ6");
        ea.a.p("XWU8bApfA2QWX1JpBWUJcy1sV250", "zZrj05Wq");
        f32189o = new a();
    }

    public a() {
        super(7);
    }

    public static final void h0(Context context, int i10) {
        u uVar;
        g.e(context, "context");
        try {
            f32189o.getClass();
            try {
                uVar = new u(context);
            } catch (Exception e10) {
                e10.printStackTrace();
                uVar = null;
            }
            if (uVar == null) {
                return;
            }
            uVar.b(i10);
            EventCenter.a(context, ea.a.p("KWldZQ==", "sefRwILp"));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void i0(Context context, int i10, String str, nl.b bVar) {
        boolean z10;
        int i11;
        boolean z11;
        Activity activity;
        boolean z12;
        u uVar;
        p pVar;
        int i12;
        int i13;
        String str2;
        int i14;
        String str3;
        String str4;
        int i15;
        if (f.b(context).f22629b) {
            c1 c1Var = c1.f28564a;
            String p10 = ea.a.p("MA==", "qFCW9Okv");
            String h10 = e.h(c1.f28605v, "");
            if (h.b("LG9fZhBn", "F8NAtl22", h10) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                p10 = h10;
            }
            if (TextUtils.equals(ea.a.p("MQ==", "7h6q2oWN"), p10) && ((i11 = Build.VERSION.SDK_INT) < 33 || androidx.core.content.a.checkSelfPermission(context, ea.a.p("LG5cch9pKi44ZRRtXXMkaVdufFAGU2JfOk8lSRdJAUEZSXdOUw==", "CIM8pN9R")) == 0)) {
                String p11 = ea.a.p("MQ==", "QmF3GeYq");
                String h11 = e.h(c1.f28607w, "");
                if (h.b("LG9fZhBn", "4epLeVFz", h11) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    p11 = h11;
                }
                boolean equals = TextUtils.equals(ea.a.p("MQ==", "VppNUKxv"), p11);
                Activity l10 = ReaderPdfApplication.l();
                if (l10 != null) {
                    activity = l10;
                    z12 = false;
                } else {
                    activity = context;
                    z12 = true;
                }
                try {
                    uVar = new u(activity);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    uVar = null;
                }
                if (uVar == null) {
                    return;
                }
                if (i11 >= 26) {
                    if (equals) {
                        str4 = f32193s;
                        i15 = 2;
                    } else {
                        str4 = f32192r;
                        i15 = 4;
                    }
                    c4.h.y();
                    NotificationChannel c = bb.g.c(str4, str4, i15);
                    c.setShowBadge(true);
                    if (i11 >= 29) {
                        c.setAllowBubbles(true);
                    }
                    c.enableVibration(true);
                    uVar.c(c);
                    pVar = new p(activity, str4);
                } else {
                    pVar = new p(activity, null);
                }
                if (i11 >= 31) {
                    i12 = 1275068416;
                } else {
                    i12 = 1207959552;
                }
                Intent intent = new Intent(activity, ReaderHomeActivity.class);
                intent.setPackage(ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpBm85LghyN2U=", "rKnRlne0"));
                int nextInt = new Random().nextInt(8999) + 1000;
                if (z12) {
                    intent.addFlags(268435456);
                }
                if (bVar != null && bVar.f22581a != 0) {
                    bVar.f22593n = nextInt;
                    PdfPreviewEntity U = com.google.android.play.core.assetpacks.c.U(bVar);
                    intent.setAction(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJElc=", "phMtW6vV"));
                    intent.setData(Uri.fromFile(U.getFile()));
                    if (i10 == 1) {
                        intent.setClass(activity, ReaderPreviewActivity.class);
                    } else {
                        intent.setClass(activity, OfficeReaderActivity.class);
                    }
                    intent.putExtra(ea.a.p("PGhedyZwU2Y=", "kuhX4dbm"), U);
                    intent.putExtra(ea.a.p("KmRYdA==", "tnlfd42V"), false);
                    intent.putExtra(ea.a.p("CXIibQ==", "DGoMN7iX"), ea.a.p("CVJ-TSZUf0kIRA==", "iU88zxBK"));
                    intent.putExtra(ea.a.p("IW9FaR9pVGEuaSVuKnQRcGU=", "ls3PTgfz"), 1);
                    bm.c.b(context).i(U);
                    pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
                    String path = bVar.f22582b;
                    g.e(path, "path");
                    ((Handler) StorageFileObserver.c.getValue()).postDelayed(new f1(context, path, i10, 4), 2000L);
                    i13 = 0;
                } else {
                    i13 = 0;
                }
                PendingIntent activity2 = PendingIntent.getActivity(activity, i13, intent, i12);
                int color = androidx.core.content.a.getColor(activity, R.color.colorAccent);
                String p12 = ea.a.p("w5_TiiA=", "8Sn9ed7v");
                Context m10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.m(activity);
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                str2 = ((Object) p12) + m10.getString(R.string.arg_res_0x7f1302d5, ea.a.p("H0RG", "dUUGAmoL"));
                                i14 = R.drawable.ic_notice_logo;
                            } else {
                                color = androidx.core.content.a.getColor(activity, R.color.colorPPT);
                                str2 = ((Object) p12) + m10.getString(R.string.arg_res_0x7f1302d5, ea.a.p("GFBU", "fwH4ojed"));
                                i14 = R.drawable.ic_notice_ppt;
                            }
                        } else {
                            color = androidx.core.content.a.getColor(activity, R.color.colorExcel);
                            str2 = ((Object) p12) + m10.getString(R.string.arg_res_0x7f1302d5, ea.a.p("EkxT", "JJJgUj27"));
                            i14 = R.drawable.ic_notice_xls;
                        }
                    } else {
                        color = androidx.core.content.a.getColor(activity, R.color.colorWord);
                        str2 = ((Object) p12) + m10.getString(R.string.arg_res_0x7f1302d5, ea.a.p("d09D", "QFDEZp0v"));
                        i14 = R.drawable.ic_notice_doc;
                    }
                } else {
                    color = androidx.core.content.a.getColor(activity, R.color.colorAccent);
                    str2 = ((Object) p12) + m10.getString(R.string.arg_res_0x7f1302d5, ea.a.p("H0RG", "83sfOGCs"));
                    i14 = R.drawable.ic_notice_pdf;
                }
                if (equals) {
                    str3 = f32191q;
                } else {
                    str3 = f32190p;
                }
                pVar.f19515y.icon = i14;
                pVar.f19508r = color;
                int i16 = 1;
                pVar.c(true);
                pVar.f19500j = null;
                pVar.k(3);
                pVar.l(2, false);
                pVar.g(str2);
                pVar.f19496f = p.b(str);
                if (equals) {
                    i16 = -1;
                }
                pVar.f19502l = i16;
                pVar.q(new q());
                pVar.f19497g = activity2;
                pVar.m();
                pVar.f19505o = str3;
                try {
                    Notification a10 = pVar.a();
                    g.d(a10, ea.a.p("XW8_aRVpAWEGaVtuK3U_bCBlQC4kdSpsXSgp", "9dI5TqlY"));
                    uVar.e(nextInt, a10);
                    if (bVar != null) {
                        String p13 = ea.a.p("IW9FaRpl", "GKXbgRcC");
                        String p14 = ea.a.p("Wm9GaStlK24tdwBpWGUIc1Bvdw==", "Iq42Ht6N");
                        String lowerCase = bVar.f22586g.toLowerCase(Locale.ROOT);
                        g.d(lowerCase, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nai5Mb3hvFmVBQypzFigubxFhWGVHUhlPECk=", "C84aZwEm"));
                        tn.a.d(activity, p13, p14, lowerCase, false);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
        }
        if (bVar != null) {
            pdf.pdfreader.viewer.editor.free.observer.a aVar2 = StorageFileObserver.f25899a;
            String path2 = bVar.f22582b;
            g.e(path2, "path");
            ((Handler) StorageFileObserver.c.getValue()).postDelayed(new f1(context, path2, i10, 4), 2000L);
        }
    }
}
