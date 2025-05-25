package mj;

import am.e2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f22106b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f22107d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f22108e;

    public /* synthetic */ k(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f22105a = i10;
        this.f22106b = obj;
        this.c = obj2;
        this.f22107d = obj3;
        this.f22108e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22105a;
        Object obj = this.f22108e;
        Object obj2 = this.f22107d;
        Object obj3 = this.c;
        Object obj4 = this.f22106b;
        switch (i10) {
            case 0:
                lib.zj.pdfeditor.text.editor.a aVar = (lib.zj.pdfeditor.text.editor.a) obj4;
                RectF rectF = (RectF) obj2;
                RectF rectF2 = (RectF) obj;
                ArrayList<RectF> arrayList = aVar.V;
                arrayList.clear();
                Collections.addAll(arrayList, (RectF[]) obj3);
                Collections.sort(arrayList, new j6.a(2));
                float o10 = aVar.o();
                if (rectF != null) {
                    aVar.f21682c0.set(rectF);
                    aVar.f21686e0.setEmpty();
                    aVar.O(o10, rectF);
                }
                if (rectF2 != null) {
                    aVar.f21684d0.set(rectF2);
                    aVar.f21688f0.setEmpty();
                    aVar.N(o10, rectF2);
                }
                aVar.f21687f.invalidate();
                aVar.n();
                return;
            case 1:
                cg.a aVar2 = (cg.a) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                cg.a aVar3 = (cg.a) obj2;
                Context context = (Context) obj;
                kotlin.jvm.internal.g.e(bitmap, ea.a.p("F3Iucxx1EGNl", "C5GbZde2"));
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                if (!externalStoragePublicDirectory.exists()) {
                    externalStoragePublicDirectory.mkdirs();
                }
                ea.a.p("VW8nZBZy", "AeCD0LPi");
                String h10 = a0.a.h("PDFReader_AI_", new SimpleDateFormat(ea.a.p("NnlIeTRNU2QFSAJtGHNz", "yCfVw1CU"), Locale.US).format(Long.valueOf(System.currentTimeMillis())));
                String p10 = ea.a.p("YWpBZw==", "jMFyeDcJ");
                File file = new File(externalStoragePublicDirectory, a6.h.c(h10, p10));
                int i11 = 1;
                while (file.exists()) {
                    i11++;
                    file = new File(externalStoragePublicDirectory, h10 + "_" + i11 + p10);
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    if (aVar3 != null) {
                        aVar3.invoke();
                    }
                    MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{ea.a.p("Jm1QZxwvXXBn", "4TbT8UbZ")}, null);
                    tf.d dVar = tf.d.f30009a;
                    o9.d.l(fileOutputStream, null);
                    return;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    if (aVar2 != null) {
                        aVar2.invoke();
                        return;
                    }
                    return;
                }
            default:
                e2 e2Var = (e2) obj4;
                int[] iArr = (int[]) obj3;
                View view = (View) obj2;
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj;
                PDFPageManagerActivity.a aVar4 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(e2Var, ea.a.p("a3BecDtpWWQzbmc=", "PzD4VNIA"));
                kotlin.jvm.internal.g.e(iArr, ea.a.p("a2NEcgtlWXQMaS93OW8LYUFpAW4=", "t6pVruzi"));
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "awvyae9D"));
                LinearLayout linearLayout = (LinearLayout) e2Var.f868h;
                kotlin.jvm.internal.g.d(linearLayout, ea.a.p("Q287QhpuBmkcZxp2Km84dCFuRkJn", "HvXNhC05"));
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    int dimensionPixelSize = (pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_9) + (pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_42) + (((view.getWidth() / 2) + iArr[0]) - linearLayout.getMeasuredWidth()))) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_28);
                    ((ViewGroup.MarginLayoutParams) bVar).leftMargin = dimensionPixelSize;
                    if (dimensionPixelSize < 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = linearLayout.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = 0;
                    }
                    linearLayout.setLayoutParams(bVar);
                    return;
                }
                throw new NullPointerException(ea.a.p("FnUqbGpjN24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAMeTZlamE4ZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdxFkIWU-LhVvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyGW1z", "9hxFJVGw"));
        }
    }
}
