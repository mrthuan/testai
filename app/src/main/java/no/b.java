package no;

import android.content.Context;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ui.data.HomeToolsType;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: HomeToolsUnitFactory.kt */
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: HomeToolsUnitFactory.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22611a;

        static {
            int[] iArr = new int[HomeToolsType.values().length];
            try {
                iArr[HomeToolsType.img2pdf.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeToolsType.importFiles.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeToolsType.scan2pdf.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeToolsType.word2pdf.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeToolsType.pdf2word.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeToolsType.pdf2img.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeToolsType.pdf2longImg.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeToolsType.createPDF.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f22611a = iArr;
        }
    }

    public static void a(Context context, HomeToolsType homeToolsType) {
        g.e(homeToolsType, "homeToolsType");
        switch (a.f22611a[homeToolsType.ordinal()]) {
            case 1:
                q0.w(context, "img2pdf_red_dot_show_in_154", false);
                return;
            case 2:
            default:
                return;
            case 3:
                jn.a.c.getClass();
                jn.a.f19330k.c(jn.a.f19323d[6], Boolean.TRUE);
                return;
            case 4:
                q0.w(context, "docx2pdf_red_dot_show_in_159", false);
                return;
            case 5:
                q0.w(context, "pdf2word_red_dot_show_in_167", false);
                return;
            case 6:
                q0.w(context, "pdf2img_red_dot_show_in_167", false);
                return;
            case 7:
                q0.w(context, "pdf2img_red_dot_show_in_167", false);
                return;
            case 8:
                wm.a.c.getClass();
                q0.w(context, ea.a.p("LXMLcy1vIl88bwlsR18nZF5fMXIsYUJvBl8fZSZfK24bMWMz", "HFDTEUzg"), false);
                return;
        }
    }
}
