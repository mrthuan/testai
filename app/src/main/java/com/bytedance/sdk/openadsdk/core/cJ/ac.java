package com.bytedance.sdk.openadsdk.core.cJ;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.settings.ABk;

/* compiled from: InteractionListener.java */
/* loaded from: classes.dex */
public abstract class ac implements View.OnClickListener, View.OnTouchListener {
    private static float CJ = 0.0f;
    private static float Qhi = 0.0f;

    /* renamed from: ac  reason: collision with root package name */
    private static float f9025ac = 0.0f;
    private static float cJ = 0.0f;

    /* renamed from: fl  reason: collision with root package name */
    private static long f9026fl = 0;
    protected static int sDy = 8;
    protected View lG;
    protected float qMt = -1.0f;
    protected float EBS = -1.0f;
    protected float bxS = -1.0f;
    protected float Dww = -1.0f;
    protected long CQU = -1;
    protected long pM = -1;
    protected int Eh = -1;
    protected int aP = -1024;
    protected int NFd = -1;
    protected boolean lB = true;
    public SparseArray<Qhi> Jma = new SparseArray<>();
    private int Tgh = 0;
    private int ROR = 0;

    /* compiled from: InteractionListener.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        public long CJ;
        public int Qhi;

        /* renamed from: ac  reason: collision with root package name */
        public double f9027ac;
        public double cJ;

        public Qhi(int i10, double d10, double d11, long j10) {
            this.Qhi = i10;
            this.cJ = d10;
            this.f9027ac = d11;
            this.CJ = j10;
        }
    }

    static {
        if (HzH.Qhi() != null) {
            sDy = HzH.cJ();
        }
        Qhi = 0.0f;
        cJ = 0.0f;
        f9025ac = 0.0f;
        CJ = 0.0f;
        f9026fl = 0L;
    }

    private boolean Qhi(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (cJ.ac(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= childAt.getWidth() + i11 && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= childAt.getHeight() + i13;
                } else if (Qhi(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<Qhi> sparseArray, boolean z10);

    public boolean ROR() {
        return this.lB;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!ABk.Qhi()) {
            return;
        }
        Qhi(view, this.qMt, this.EBS, this.bxS, this.Dww, this.Jma, this.lB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (com.bytedance.sdk.openadsdk.core.cJ.ac.CJ <= r3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cJ.ac.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
