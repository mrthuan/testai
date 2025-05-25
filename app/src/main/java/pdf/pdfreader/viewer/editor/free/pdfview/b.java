package pdf.pdfreader.viewer.editor.free.pdfview;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.PdfReaderViewContainer;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignatureImageView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class b implements zn.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26413a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SignPathActionInfo f26414b;
    public final /* synthetic */ ReaderPreviewActivity c;

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a extends m4.c<Bitmap> {
        public a() {
        }

        @Override // m4.g
        public final void c(Object obj, n4.d dVar) {
            int width;
            int i10;
            RelativeLayout.LayoutParams layoutParams;
            Bitmap bitmap = (Bitmap) obj;
            ea.a.p("HGVWZDJyJ3Itdg9lQ0E0dFF2O3R5", "chN7Www8");
            ea.a.p("ImQQU1BnGWE8dRRlFG85Ul1zPXU7Y1NSEWEVeQ==", "PeCt9wWZ");
            b bVar = b.this;
            ReaderPreviewActivity readerPreviewActivity = bVar.c;
            ReaderPreviewActivity readerPreviewActivity2 = bVar.c;
            readerPreviewActivity.f26209k5 = new SignatureImageView(readerPreviewActivity2);
            s.f1866u = readerPreviewActivity2.getResources().getDisplayMetrics().widthPixels;
            SignPathActionInfo signPathActionInfo = bVar.f26414b;
            if (signPathActionInfo != null) {
                readerPreviewActivity2.f26209k5.setSignPathInfo(signPathActionInfo);
                if (signPathActionInfo.getWidth() > s.f1866u / 2.0d) {
                    width = signPathActionInfo.getWidth() / 2;
                    i10 = signPathActionInfo.getHeight() / 2;
                } else {
                    width = signPathActionInfo.getWidth();
                    i10 = signPathActionInfo.getHeight();
                }
            } else {
                Matrix matrix = new Matrix();
                matrix.preScale(0.5f, 0.5f);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                width = createBitmap.getWidth();
                int height = createBitmap.getHeight();
                readerPreviewActivity2.f26209k5.setImageBitmap(createBitmap);
                i10 = height;
            }
            PdfReaderViewContainer pdfReaderViewContainer = readerPreviewActivity2.f26254t;
            View view = null;
            if (pdfReaderViewContainer != null) {
                int height2 = pdfReaderViewContainer.getHeight();
                while (true) {
                    if (width >= s.f1866u || (height2 != 0 && i10 >= height2)) {
                        width /= 2;
                        i10 /= 2;
                    }
                }
                float min = Math.min(readerPreviewActivity2.f26276w1.getScale(), 1.0f);
                layoutParams = readerPreviewActivity2.f26209k5.c((int) (width * min), (int) (i10 * min));
            } else {
                layoutParams = null;
            }
            readerPreviewActivity2.f26209k5.setSelected(true);
            readerPreviewActivity2.f26209k5.setOnTouchListener(readerPreviewActivity2.f26233o5);
            ReaderPreviewActivity.b0 b0Var = readerPreviewActivity2.f26276w1;
            if (b0Var != null) {
                View displayedView = b0Var.getDisplayedView();
                Rect rect = new Rect();
                displayedView.getGlobalVisibleRect(rect);
                if (rect.height() < displayedView.getHeight() / 2 && rect.height() < (readerPreviewActivity2.f26276w1.getHeight() * 2) / 3) {
                    HashMap<ij.d, View> allCacheViews = readerPreviewActivity2.f26276w1.getAllCacheViews();
                    int displayedViewIndex = readerPreviewActivity2.f26276w1.getDisplayedViewIndex() - 1;
                    int displayedViewIndex2 = readerPreviewActivity2.f26276w1.getDisplayedViewIndex() + 1;
                    Set<Map.Entry<ij.d, View>> entrySet = allCacheViews.entrySet();
                    Rect rect2 = new Rect();
                    Iterator<Map.Entry<ij.d, View>> it = entrySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<ij.d, View> next = it.next();
                        if (next.getKey().f18534b == displayedViewIndex) {
                            view = next.getValue();
                            break;
                        }
                    }
                    if (view != null) {
                        view.getGlobalVisibleRect(rect2);
                    }
                    if (rect2.height() > 0 && rect2.bottom > 0) {
                        rect.set(rect2);
                        readerPreviewActivity2.f26215l5 = displayedViewIndex;
                    } else {
                        for (Map.Entry<ij.d, View> entry : entrySet) {
                            if (entry.getKey().f18534b == displayedViewIndex2) {
                                view = entry.getValue();
                            }
                        }
                        if (view != null) {
                            view.getGlobalVisibleRect(rect2);
                        }
                        if (rect2.height() > 0 && rect2.top < readerPreviewActivity2.f26276w1.getBottom()) {
                            rect.set(rect2);
                            readerPreviewActivity2.f26215l5 = displayedViewIndex2;
                        }
                    }
                } else {
                    readerPreviewActivity2.f26215l5 = readerPreviewActivity2.f26276w1.getDisplayedViewIndex();
                }
                ea.a.p("PmU4ZFxyOHItdg9lQ0E0dFF2O3R5", "golY9hwt");
                ea.a.p("DHYqZRN0Og==", "psoxpg7Q");
                rect.toString();
                int[] iArr = new int[2];
                readerPreviewActivity2.f26254t.getLocationInWindow(iArr);
                ArrayList<kj.b> arrayList = ReaderPDFCore.getPageStampAnnotMap().get(Integer.valueOf(readerPreviewActivity2.f26215l5));
                SignatureImageView signatureImageView = readerPreviewActivity2.f26209k5;
                if (signatureImageView != null && (signatureImageView.isAttachedToWindow() || (arrayList != null && !arrayList.isEmpty()))) {
                    if (layoutParams != null) {
                        int i11 = rect.right;
                        int i12 = iArr[0];
                        int i13 = (i11 - i12) - layoutParams.width;
                        int i14 = rect.bottom;
                        int i15 = iArr[1];
                        int i16 = (i14 - i15) - layoutParams.height;
                        int i17 = rect.left - i12;
                        int i18 = rect.top - i15;
                        Random random = new Random();
                        layoutParams.leftMargin = random.nextInt(Math.max(1, (i13 - i17) + 1)) + i17;
                        layoutParams.topMargin = random.nextInt(Math.max(1, (i16 - i18) + 1)) + i18;
                    }
                } else {
                    ea.a.p("FWVTZCpyOXItdg9lQ0E0dFF2O3R5", "CcG2OiHA");
                    ea.a.p("QGksbjBvDHQTaVplG1M1ciFlXEwpYyJ0IG8gOg==", "INSe80CY");
                    Arrays.toString(iArr);
                    int[] iArr2 = {rect.centerX() - iArr[0], rect.centerY() - iArr[1]};
                    ea.a.p("PWUpZA9yFnItdg9lQ0E0dFF2O3R5", "QnoHjFtX");
                    ea.a.p("QGksbjBlDHQXcndvB3Q3aSplQEwpYyJ0AW9fOg==", "h1mJoria");
                    Arrays.toString(iArr2);
                    if (layoutParams != null) {
                        layoutParams.leftMargin = iArr2[0] - (layoutParams.width / 2);
                        layoutParams.topMargin = iArr2[1] - (layoutParams.height / 2);
                    }
                }
                readerPreviewActivity2.f26254t.addView(readerPreviewActivity2.f26209k5, layoutParams);
                readerPreviewActivity2.P4(readerPreviewActivity2.f26209k5);
                readerPreviewActivity2.f26276w1.post(new pdf.pdfreader.viewer.editor.free.pdfview.a(this));
            }
            readerPreviewActivity2.f26203j5.set(false);
        }

        @Override // m4.c, m4.g
        public final void f(Drawable drawable) {
            ea.a.p("NWUQZC1yN3Itdg9lQ0E0dFF2O3R5", "sygqHgAy");
            ea.a.p("LmRVUxBnWWEudThlVW8GTFphCkYkaQllZA==", "zzmdjNVs");
            b.this.c.f26203j5.set(false);
        }

        @Override // m4.g
        public final void i(Drawable drawable) {
            ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "BTzraTXG");
            ea.a.p("LmRVUxBnWWEudThlVW8GTFphCkMpZQRyNGQ=", "4RV6QjZN");
            b.this.c.f26203j5.set(false);
        }
    }

    public b(ReaderPreviewActivity readerPreviewActivity, String str, SignPathActionInfo signPathActionInfo) {
        this.c = readerPreviewActivity;
        this.f26413a = str;
        this.f26414b = signPathActionInfo;
    }

    @Override // zn.d
    public final void a() {
        ReaderPreviewActivity readerPreviewActivity = this.c;
        if (!readerPreviewActivity.isFinishing() && !readerPreviewActivity.isDestroyed()) {
            com.bumptech.glide.e<Bitmap> a10 = com.bumptech.glide.b.c(readerPreviewActivity).h(readerPreviewActivity).a();
            a10.F = this.f26413a;
            a10.I = true;
            a10.F(new a());
        }
    }
}
