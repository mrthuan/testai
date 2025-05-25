package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C1878y6;

/* renamed from: com.inmobi.media.y6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1878y6 {

    /* renamed from: a  reason: collision with root package name */
    public final S9 f15678a;

    /* renamed from: b  reason: collision with root package name */
    public final A4 f15679b;
    public C1723m6 c;

    /* renamed from: d  reason: collision with root package name */
    public C1681j6 f15680d;

    /* renamed from: e  reason: collision with root package name */
    public C1681j6 f15681e;

    /* renamed from: f  reason: collision with root package name */
    public C1681j6 f15682f;

    public C1878y6(S9 s92, A4 a42) {
        this.f15678a = s92;
        this.f15679b = a42;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        AudioManager audioManager;
        Context d10 = Ha.d();
        if (d10 == null) {
            return false;
        }
        Object systemService = d10.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            audioManager = (AudioManager) systemService;
        } else {
            audioManager = null;
        }
        if (audioManager == null || !audioManager.isWiredHeadsetOn()) {
            return false;
        }
        return true;
    }

    public final void a(String url, Activity activity) {
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(activity, "activity");
        A4 a42 = this.f15679b;
        if (a42 != null) {
            ((B4) a42).c("MraidMediaProcessor", "doPlayMedia");
        }
        C1723m6 c1723m6 = new C1723m6(activity, this.f15679b);
        this.c = c1723m6;
        c1723m6.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        C1723m6 c1723m62 = this.c;
        if (c1723m62 != null) {
            c1723m62.setLayoutParams(layoutParams);
        }
        C1736n6 c1736n6 = new C1736n6(activity);
        c1736n6.setOnTouchListener(new qb.k1());
        c1736n6.setBackgroundColor(-16777216);
        c1736n6.addView(this.c);
        A4 a43 = this.f15679b;
        if (a43 != null) {
            ((B4) a43).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c1736n6, new ViewGroup.LayoutParams(-1, -1));
        C1723m6 c1723m63 = this.c;
        if (c1723m63 != null) {
            c1723m63.setViewContainer(c1736n6);
        }
        C1723m6 c1723m64 = this.c;
        if (c1723m64 != null) {
            c1723m64.requestFocus();
        }
        C1723m6 c1723m65 = this.c;
        if (c1723m65 != null) {
            c1723m65.setOnKeyListener(new View.OnKeyListener() { // from class: qb.l1
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    return C1878y6.a(C1878y6.this, view, i10, keyEvent);
                }
            });
        }
        C1723m6 c1723m66 = this.c;
        if (c1723m66 != null) {
            c1723m66.setListener(new C1865x6(this));
        }
        C1723m6 c1723m67 = this.c;
        if (c1723m67 != null) {
            c1723m67.a();
        }
    }

    public static final boolean a(C1878y6 this$0, View view, int i10, KeyEvent keyEvent) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (4 == i10 && keyEvent.getAction() == 0) {
            C1723m6 c1723m6 = this$0.c;
            if (c1723m6 != null) {
                c1723m6.b();
                return true;
            }
            return true;
        }
        return false;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        A4 a42 = this.f15679b;
        if (a42 != null) {
            ((B4) a42).c("MraidMediaProcessor", "deviceVolume");
        }
        Context d10 = Ha.d();
        if (d10 == null) {
            return -1;
        }
        S9 s92 = this.f15678a;
        if (((s92 == null || (renderingConfig = s92.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && Ha.o()) {
            return 0;
        }
        Object systemService = d10.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }
}
