package com.bykv.vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.renderview.cJ;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SSRenderSurfaceView extends SSSurfaceView implements SurfaceHolder.Callback, cJ {

    /* renamed from: ac  reason: collision with root package name */
    private static final ArrayList<ac> f7184ac = new ArrayList<>();
    private cJ.Qhi CJ;
    private WeakReference<Qhi> Qhi;
    private ac cJ;

    public SSRenderSurfaceView(Context context) {
        super(context);
        Qhi();
    }

    private void Qhi() {
        ac acVar = new ac(this);
        this.cJ = acVar;
        f7184ac.add(acVar);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setWindowVisibilityChangedListener(cJ.Qhi qhi) {
        this.CJ = qhi;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        WeakReference<Qhi> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().Qhi(surfaceHolder, i10, i11, i12);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<Qhi> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().Qhi(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<Qhi> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().cJ(surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.cJ
    public void Qhi(Qhi qhi) {
        this.Qhi = new WeakReference<>(qhi);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<ac> it = f7184ac.iterator();
        while (it.hasNext()) {
            ac next = it.next();
            if (next != null && next.Qhi() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.cJ);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.cJ
    public void Qhi(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.cJ
    public View getView() {
        return this;
    }
}
