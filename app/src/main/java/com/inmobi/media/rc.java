package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class rc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f15422a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15423b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f15424d;

    public rc(wc visibilityTracker, AtomicBoolean isPaused) {
        kotlin.jvm.internal.g.e(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.g.e(isPaused, "isPaused");
        this.f15422a = isPaused;
        this.f15423b = new ArrayList();
        this.c = new ArrayList();
        this.f15424d = new WeakReference(visibilityTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc scVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Bitmap bitmap;
        if (this.f15422a.get()) {
            return;
        }
        wc wcVar = (wc) this.f15424d.get();
        if (wcVar != null) {
            wcVar.f15613m = false;
            for (Map.Entry entry : wcVar.f15602a.entrySet()) {
                View view = (View) entry.getKey();
                tc tcVar = (tc) entry.getValue();
                int i18 = tcVar.f15480a;
                View view2 = tcVar.c;
                Object obj = tcVar.f15482d;
                byte b10 = wcVar.f15604d;
                boolean z10 = true;
                if (b10 == 1) {
                    qc qcVar = wcVar.f15603b;
                    if (qcVar.a(view2, view, i18, obj) && qcVar.a(view, view, i18)) {
                        this.f15423b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else if (b10 == 2) {
                    qc qcVar2 = wcVar.f15603b;
                    kotlin.jvm.internal.g.c(qcVar2, "null cannot be cast to non-null type com.inmobi.ads.viewability.inmobi.HtmlPollingVisibilityTracker.HtmlVisibilityChecker");
                    T3 t32 = (T3) ((Y3) qcVar2);
                    boolean a10 = t32.a(view2, view, i18, obj);
                    boolean a11 = t32.a(view, view, i18);
                    kotlin.jvm.internal.g.e(view, "view");
                    if (view instanceof S9) {
                        Rect rect = new Rect();
                        if (view.getGlobalVisibleRect(rect)) {
                            S9 s92 = (S9) view;
                            int[] iArr = new int[2];
                            s92.getLocationInWindow(iArr);
                            int[] viewableFrameArray = s92.getViewableFrameArray();
                            int i19 = iArr[0];
                            if (viewableFrameArray != null) {
                                i10 = viewableFrameArray[0];
                            } else {
                                i10 = 0;
                            }
                            int i20 = i19 + i10;
                            int i21 = iArr[1];
                            if (viewableFrameArray != null) {
                                i11 = viewableFrameArray[1];
                            } else {
                                i11 = 0;
                            }
                            int i22 = i21 + i11;
                            if (viewableFrameArray != null) {
                                i12 = viewableFrameArray[2];
                            } else {
                                i12 = 0;
                            }
                            int i23 = i20 + i12;
                            if (viewableFrameArray != null) {
                                i13 = viewableFrameArray[3];
                            } else {
                                i13 = 0;
                            }
                            if (rect.intersect(new Rect(i20, i22, i23, i13 + i22))) {
                                Bitmap createBitmap = Bitmap.createBitmap(s92.getWidth(), s92.getHeight(), Bitmap.Config.ARGB_8888);
                                kotlin.jvm.internal.g.d(createBitmap, "createBitmap(...)");
                                Canvas canvas = new Canvas(createBitmap);
                                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, new Paint());
                                s92.draw(canvas);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, AbstractC1692k3.a(s92.getWidth()), AbstractC1692k3.a(s92.getHeight()), true);
                                kotlin.jvm.internal.g.d(createScaledBitmap, "createScaledBitmap(...)");
                                int[] viewableFrameArray2 = s92.getViewableFrameArray();
                                int width = createScaledBitmap.getWidth();
                                if (viewableFrameArray2 != null) {
                                    i14 = viewableFrameArray2[0];
                                } else {
                                    i14 = 0;
                                }
                                int min = Math.min(width, i14);
                                int height = createScaledBitmap.getHeight();
                                if (viewableFrameArray2 != null) {
                                    i15 = viewableFrameArray2[1];
                                } else {
                                    i15 = 0;
                                }
                                int min2 = Math.min(height, i15);
                                if (viewableFrameArray2 != null) {
                                    i16 = viewableFrameArray2[2];
                                } else {
                                    i16 = 0;
                                }
                                int min3 = Math.min(i16, createScaledBitmap.getWidth() - min);
                                if (viewableFrameArray2 != null) {
                                    i17 = viewableFrameArray2[3];
                                } else {
                                    i17 = 0;
                                }
                                int min4 = Math.min(i17, createScaledBitmap.getHeight() - min2);
                                if (min3 > 0 && min4 > 0) {
                                    bitmap = Bitmap.createBitmap(createScaledBitmap, min, min2, min3, min4);
                                } else {
                                    bitmap = null;
                                }
                                if (bitmap != null) {
                                    int height2 = bitmap.getHeight() * bitmap.getWidth();
                                    int[] iArr2 = new int[height2];
                                    bitmap.getPixels(iArr2, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                                    int i24 = 0;
                                    for (int i25 = 0; i25 < height2; i25++) {
                                        int i26 = iArr2[i25];
                                        if (i26 > -16777216 && i26 < 0 && (i24 = i24 + 1) >= s92.getMinimumPixelsPainted()) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                    if (a10 && a11 && z10) {
                        this.f15423b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else {
                    qc qcVar3 = wcVar.f15603b;
                    if (qcVar3.a(view2, view, i18, obj) && qcVar3.a(view, view, i18)) {
                        this.f15423b.add(view);
                    } else {
                        this.c.add(view);
                    }
                }
            }
        }
        if (wcVar != null) {
            scVar = wcVar.f15610j;
        } else {
            scVar = null;
        }
        this.f15423b.size();
        this.c.size();
        if (scVar != null) {
            scVar.a(this.f15423b, this.c);
        }
        this.f15423b.clear();
        this.c.clear();
        if (wcVar != null) {
            wcVar.d();
        }
    }
}
