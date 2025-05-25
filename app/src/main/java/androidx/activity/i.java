package androidx.activity;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.RectF;
import android.text.Editable;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.libconvert.ConvertCore;
import androidx.fragment.app.a1;
import androidx.room.RoomDatabase;
import com.facebook.internal.FetchedAppSettingsManager;
import com.inmobi.media.AbstractC1846w0;
import com.inmobi.media.C1575bc;
import com.inmobi.media.C1627f8;
import com.inmobi.media.C1694k5;
import com.inmobi.media.C1756p0;
import com.inmobi.media.C1770q1;
import com.inmobi.media.C1829u9;
import com.inmobi.media.C1877y5;
import com.inmobi.media.C9;
import com.inmobi.media.Kb;
import com.inmobi.media.N;
import com.inmobi.media.Q7;
import com.inmobi.media.S1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import jb.x;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.EditorView;
import lib.zj.reflow.ReflowLoadingView;
import mj.v;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderDecryptAndCopyExecutor;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderEncryptionAndDecryptionHelper;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIFileEntity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qb.g1;
import we.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1810a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1811b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f1810a = i10;
        this.f1811b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        DecryptContainer decryptContainer;
        File file;
        String password;
        ReaderPDFCore readerPDFCore;
        w1.h hVar;
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        int N6;
        int N7;
        int N8;
        int N9;
        int N10;
        int N11;
        int N12;
        int N13;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f1810a) {
            case 0:
                ComponentActivity.f fVar = (ComponentActivity.f) this.f1811b;
                Runnable runnable = fVar.f1782b;
                if (runnable != null) {
                    runnable.run();
                    fVar.f1782b = null;
                    return;
                }
                return;
            case 1:
                ConvertCore.a((ConvertCore) this.f1811b);
                return;
            case 2:
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f9737a;
                ((FetchedAppSettingsManager.a) this.f1811b).a();
                return;
            case 3:
                k9.n nVar = (k9.n) this.f1811b;
                boolean isPopupShowing = nVar.f19671h.isPopupShowing();
                nVar.t(isPopupShowing);
                nVar.f19676m = isPopupShowing;
                return;
            case 4:
                x xVar = (x) this.f1811b;
                synchronized (xVar.f19164d) {
                    SharedPreferences.Editor edit = xVar.f19162a.edit();
                    String str = xVar.f19163b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = xVar.f19164d.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next());
                        sb2.append(xVar.c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 5:
                C9.b((C9) this.f1811b);
                return;
            case 6:
                Kb.c((Kb) this.f1811b);
                return;
            case 7:
                N.a((N) this.f1811b);
                return;
            case 8:
                Q7.C((Q7) this.f1811b);
                return;
            case 9:
                S1.a((WebView) this.f1811b);
                return;
            case 10:
                C1575bc.a((C1575bc) this.f1811b);
                return;
            case 11:
                C1627f8.b((C1627f8) this.f1811b);
                return;
            case 12:
                C1694k5.x((C1694k5) this.f1811b);
                return;
            case 13:
                C1756p0.b((AbstractC1846w0) this.f1811b);
                return;
            case 14:
                C1770q1.g((C1770q1) this.f1811b);
                return;
            case 15:
                C1829u9.b((JSONObject) this.f1811b);
                return;
            case 16:
                C1877y5.b((C1877y5) this.f1811b);
                return;
            case 17:
                ((c.f) this.f1811b).b();
                return;
            case 18:
                ((ReaderPDFCore) this.f1811b).lambda$doStateCallback$0();
                return;
            case 19:
                ((RectF) this.f1811b).setEmpty();
                return;
            case 20:
                EditorView editorView = (EditorView) this.f1811b;
                int i10 = EditorView.f21667o;
                int selectionEnd = editorView.getSelectionEnd();
                Editable text = editorView.getText();
                if (text != null && text.length() > 0 && selectionEnd >= 0 && selectionEnd != text.length()) {
                    editorView.setSelection(text.length());
                    return;
                }
                return;
            case 21:
                mj.o oVar = (mj.o) this.f1811b;
                oVar.f22124d.f21697o = null;
                oVar.f22124d.f21687f.invalidate();
                return;
            case 22:
                lib.zj.pdfeditor.text.editor.a.c(((v) this.f1811b).f22136d);
                return;
            case 23:
                mj.x xVar2 = (mj.x) this.f1811b;
                xVar2.c.f21695m = null;
                xVar2.c.f21687f.invalidate();
                return;
            case 24:
                ImageView imageView = ((ReflowLoadingView) this.f1811b).f21746a;
                if (imageView != null) {
                    imageView.animate().cancel();
                    imageView.setRotation(0.0f);
                    return;
                }
                return;
            case 25:
                ReaderSplashActivity.w1((ReaderSplashActivity) this.f1811b);
                return;
            case 26:
                ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor = (ReaderDecryptAndCopyExecutor) this.f1811b;
                kotlin.jvm.internal.g.e(readerDecryptAndCopyExecutor, ea.a.p("R2gic1cw", "6klWyn0P"));
                while (!readerDecryptAndCopyExecutor.f24231f) {
                    int size = readerDecryptAndCopyExecutor.f24230e.size();
                    int i11 = readerDecryptAndCopyExecutor.f24232g;
                    if (i11 >= 0 && i11 < size) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (!readerDecryptAndCopyExecutor.f24233h) {
                            try {
                                readerDecryptAndCopyExecutor.c.post(new b1.e(readerDecryptAndCopyExecutor, 16));
                                decryptContainer = (DecryptContainer) readerDecryptAndCopyExecutor.f24230e.get(readerDecryptAndCopyExecutor.f24232g);
                                String E = pdf.pdfreader.viewer.editor.free.utils.v.E();
                                String str2 = File.separator;
                                String name = decryptContainer.getPdfPreviewEntity().getName();
                                file = new File(E + str2 + name + ".pdf");
                                if (file.exists()) {
                                    file.delete();
                                }
                                file.createNewFile();
                                password = decryptContainer.getPassword();
                                try {
                                    readerPDFCore = new ReaderPDFCore(readerDecryptAndCopyExecutor.f24227a, decryptContainer.getPdfPreviewEntity().getPath());
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            } catch (Exception e11) {
                                e = e11;
                                e.printStackTrace();
                                readerDecryptAndCopyExecutor.c.post(new n0.g(25, readerDecryptAndCopyExecutor, e));
                                Thread.sleep(50L);
                            }
                            if (!readerPDFCore.authenticatePassword(password)) {
                                readerDecryptAndCopyExecutor.f24233h = true;
                                readerDecryptAndCopyExecutor.c.post(new k(readerDecryptAndCopyExecutor, 21));
                            } else {
                                String formatPassword = readerPDFCore.getFormatPassword(password);
                                kotlin.jvm.internal.g.d(formatPassword, ea.a.p("UG85ZV1nB3Q0b0ZtCHQGYTdzRW80ZGtmVnJVYS5QFXNAdyRyFyk=", "98Ztamrc"));
                                password = formatPassword;
                                try {
                                    int createPdf = ReaderPDFCore.createPdf(decryptContainer.getPdfPreviewEntity().getPath(), file.getAbsolutePath(), password, false, readerDecryptAndCopyExecutor);
                                    if (createPdf > 0) {
                                        readerDecryptAndCopyExecutor.c.post(new a1(12, readerDecryptAndCopyExecutor, file));
                                    } else {
                                        try {
                                            readerDecryptAndCopyExecutor.c.post(new g1(readerDecryptAndCopyExecutor, createPdf, 1));
                                        } catch (Exception e12) {
                                            e = e12;
                                            e.printStackTrace();
                                            readerDecryptAndCopyExecutor.c.post(new n0.g(25, readerDecryptAndCopyExecutor, e));
                                            Thread.sleep(50L);
                                        }
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                }
                            }
                        }
                        Thread.sleep(50L);
                    } else {
                        ea.a.p("MWUbcjxwMkEmZCVvRHkfZVRwN3JpZl9uHXMZID5yYmMabQhsIHRl", "onuxEF7w");
                        String str3 = n0.f28727a;
                        return;
                    }
                }
                ea.a.p("MWUbcjxwMkEmZCVvRHkfZVRwN3JpZl9uHXMZID5yYmMabQhsIHRl", "onuxEF7w");
                String str32 = n0.f28727a;
                return;
            case 27:
                ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper = (ReaderEncryptionAndDecryptionHelper) this.f1811b;
                readerEncryptionAndDecryptionHelper.f24235a.V(readerEncryptionAndDecryptionHelper.f24241h);
                return;
            case 28:
                cg.l lVar = (cg.l) this.f1811b;
                AIDataBase aIDataBase = km.e.f19907a;
                kotlin.jvm.internal.g.e(lVar, ea.a.p("F28lRxZ0JGkcaUdoDGQ=", "ekO6110D"));
                km.c cVar = (km.c) km.e.f19907a.k();
                cVar.getClass();
                ea.a.p("HEV9RTpUFyp6RhhPOCAJaWpmB2wgc0V3MWVEZWRjL24caF53MWlEdDVyMyBIIFkgWnIKZTcgB3l5dUZsK2EqVCZtVCAdZURj", "2eXMY6DN");
                w1.h b10 = w1.h.b(0, ea.a.p("YEUHRTBUQipSRmZPJCA3aRtmW2wjc2N3IWUAZWRjA25gaCR3O2kRdB1yTSBUIGcgK3JWZTQgIXlpdQJsK2EGVFptLiAXZRFj", "IrDblKJ0"));
                RoomDatabase roomDatabase = cVar.f19897a;
                roomDatabase.b();
                Cursor i12 = roomDatabase.i(b10);
                try {
                    N = t0.N(i12, ea.a.p("JmQ=", "fPMOgNIM"));
                    N2 = t0.N(i12, ea.a.p("PWVcbw1lcWk2ZRphAWg=", "8IiQj22G"));
                    N3 = t0.N(i12, ea.a.p("F2kWZWZhJWg=", "QNqz6Q2Y"));
                    N4 = t0.N(i12, ea.a.p("KWldZTdhWmU=", "uxQj3vfz"));
                    N5 = t0.N(i12, ea.a.p("VWknZSd5EmU=", "JoiW3SyG"));
                    N6 = t0.N(i12, ea.a.p("LGFfUxFvQEgzcz5vB3k=", "IwfhgTEj"));
                    N7 = t0.N(i12, ea.a.p("MGk8ZSFpDWU=", "HGVPrwLw"));
                    N8 = t0.N(i12, ea.a.p("OnBdbxhkY2k3ZQ==", "1zKvKYDI"));
                    N9 = t0.N(i12, ea.a.p("KnhFZRdkUmQcaS9sEXMnbmU=", "DLryJ4EK"));
                    N10 = t0.N(i12, ea.a.p("Vng_ZR1kB2Q0aVFsDXMCd28=", "5ZQtRTSV"));
                    N11 = t0.N(i12, ea.a.p("Vng_ZR1kB2Q0aVFsDXMCaDZlZQ==", "or006JP3"));
                    N12 = t0.N(i12, ea.a.p("XHgyZRtkMGQBbhJGXWU7ZEtPPGU=", "MN9FuUIJ"));
                    N13 = t0.N(i12, ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZUGW8=", "riZygXxx"));
                    hVar = b10;
                } catch (Throwable th2) {
                    th = th2;
                    hVar = b10;
                }
                try {
                    int N14 = t0.N(i12, ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZUBnIgZQ==", "in8VjpmX"));
                    int N15 = t0.N(i12, ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2Twtl", "txOYcVvj"));
                    int N16 = t0.N(i12, ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2VBJv", "CmbL8Ntv"));
                    int N17 = t0.N(i12, ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2VA1yEmU=", "PmREwUFz"));
                    ArrayList arrayList = new ArrayList(i12.getCount());
                    while (i12.moveToNext()) {
                        AIFileEntity aIFileEntity = new AIFileEntity();
                        int i13 = N13;
                        int i14 = N12;
                        aIFileEntity.setId(i12.getLong(N));
                        aIFileEntity.setRemoteFilePath(i12.getString(N2));
                        aIFileEntity.setFilePath(i12.getString(N3));
                        aIFileEntity.setFileName(i12.getString(N4));
                        aIFileEntity.setFileType(i12.getInt(N5));
                        aIFileEntity.setCanShowHistory(i12.getInt(N6));
                        aIFileEntity.setFileSize(i12.getLong(N7));
                        aIFileEntity.setUploadTime(i12.getLong(N8));
                        aIFileEntity.setExtendedFieldsOne(i12.getString(N9));
                        aIFileEntity.setExtendedFieldsTwo(i12.getString(N10));
                        aIFileEntity.setExtendedFieldsThree(i12.getString(N11));
                        aIFileEntity.setExtendedIntFieldsOne(i12.getInt(i14));
                        aIFileEntity.setExtendedIntFieldsTwo(i12.getInt(i13));
                        int i15 = N14;
                        aIFileEntity.setExtendedIntFieldsThree(i12.getInt(i15));
                        int i16 = N15;
                        if (i12.getInt(i16) != 0) {
                            N14 = i15;
                            z11 = true;
                        } else {
                            N14 = i15;
                            z11 = false;
                        }
                        aIFileEntity.setExtendedBooleanFieldsOne(z11);
                        int i17 = N16;
                        N16 = i17;
                        if (i12.getInt(i17) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        aIFileEntity.setExtendedBooleanFieldsTwo(z12);
                        int i18 = N17;
                        N17 = i18;
                        if (i12.getInt(i18) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        aIFileEntity.setExtendedBooleanFieldsThree(z13);
                        arrayList.add(aIFileEntity);
                        N15 = i16;
                        N12 = i14;
                        N13 = i13;
                    }
                    i12.close();
                    hVar.i();
                    ea.a.p("PWlBdA==", "wbQ2K2d9");
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        AIFileEntity aIFileEntity2 = (AIFileEntity) it2.next();
                        File file2 = new File(aIFileEntity2.getFilePath());
                        if (file2.exists() && file2.canRead() && file2.length() > 0) {
                            aIFileEntity2.setFileSize(file2.length());
                        }
                    }
                    w0.a().f28791b.execute(new f0.s(19, lVar, arrayList));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    i12.close();
                    hVar.i();
                    throw th;
                }
            default:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) this.f1811b;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "LsYMIEJ8"));
                pDFPageManagerActivity.o2().I.setVisibility(8);
                return;
        }
    }
}
