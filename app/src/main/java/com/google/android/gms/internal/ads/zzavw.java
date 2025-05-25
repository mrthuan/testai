package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzavw implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final Handler zza = new Handler(Looper.getMainLooper());
    private final Context zzb;
    private Application zzc;
    private final PowerManager zzd;
    private final KeyguardManager zze;
    private BroadcastReceiver zzf;
    private final zzavi zzg;
    private WeakReference zzh;
    private WeakReference zzi;
    private zzave zzj;
    private byte zzk = -1;
    private int zzl = -1;
    private long zzm = -3;

    public zzavw(Context context, zzavi zzaviVar) {
        Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zzg = zzaviVar;
        this.zzd = (PowerManager) applicationContext.getSystemService("power");
        this.zze = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.zzc = application;
            this.zzj = new zzave(application, this);
        }
        zzd(null);
    }

    private final void zze(Activity activity, int i10) {
        Window window;
        if (this.zzi != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View zzb = zzb();
            if (zzb != null && peekDecorView != null && zzb.getRootView() == peekDecorView.getRootView()) {
                this.zzl = i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0080, code lost:
        if ((r8.flags & 524288) != 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf() {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.zzi
            if (r0 != 0) goto L6
            goto Lbe
        L6:
            android.view.View r0 = r9.zzb()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L14
            r9.zzm = r2
            r9.zzk = r1
            return
        L14:
            int r4 = r0.getVisibility()
            r5 = 0
            if (r4 == 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = r5
        L1e:
            boolean r6 = r0.isShown()
            if (r6 != 0) goto L26
            r4 = r4 | 2
        L26:
            android.os.PowerManager r6 = r9.zzd
            if (r6 == 0) goto L32
            boolean r6 = r6.isScreenOn()
            if (r6 != 0) goto L32
            r4 = r4 | 4
        L32:
            com.google.android.gms.internal.ads.zzavi r6 = r9.zzg
            boolean r6 = r6.zza()
            if (r6 != 0) goto L84
            android.app.KeyguardManager r6 = r9.zze
            if (r6 == 0) goto L82
            boolean r6 = r6.inKeyguardRestrictedInputMode()
            if (r6 == 0) goto L82
            int r6 = com.google.android.gms.internal.ads.zzavs.zza
            android.view.View r6 = r0.getRootView()
            if (r6 != 0) goto L4d
            r6 = r0
        L4d:
            android.content.Context r6 = r6.getContext()
        L51:
            boolean r7 = r6 instanceof android.content.ContextWrapper
            r8 = 0
            if (r7 == 0) goto L6a
            r7 = 10
            if (r5 >= r7) goto L6a
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L61
            android.app.Activity r6 = (android.app.Activity) r6
            goto L6b
        L61:
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            int r5 = r5 + 1
            goto L51
        L6a:
            r6 = r8
        L6b:
            if (r6 != 0) goto L6e
            goto L82
        L6e:
            android.view.Window r5 = r6.getWindow()
            if (r5 != 0) goto L75
            goto L79
        L75:
            android.view.WindowManager$LayoutParams r8 = r5.getAttributes()
        L79:
            if (r8 == 0) goto L82
            int r5 = r8.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L84
        L82:
            r4 = r4 | 8
        L84:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L91
            r4 = r4 | 16
        L91:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L9e
            r4 = r4 | 32
        L9e:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.zzl
            if (r5 == r1) goto La7
            r0 = r5
        La7:
            if (r0 == 0) goto Lab
            r4 = r4 | 64
        Lab:
            byte r0 = r9.zzk
            if (r0 == r4) goto Lbe
            byte r0 = (byte) r4
            r9.zzk = r0
            if (r4 != 0) goto Lb9
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lbc
        Lb9:
            long r0 = (long) r4
            long r0 = r2 - r0
        Lbc:
            r9.zzm = r0
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavw.zzf():void");
    }

    private final void zzg() {
        zza.post(new zzavu(this));
    }

    private final void zzh(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzh = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzf == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzavv zzavvVar = new zzavv(this);
            this.zzf = zzavvVar;
            this.zzb.registerReceiver(zzavvVar, intentFilter);
        }
        Application application = this.zzc;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception unused) {
            }
        }
    }

    private final void zzi(View view) {
        try {
            WeakReference weakReference = this.zzh;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzh = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.zzf;
        if (broadcastReceiver != null) {
            try {
                this.zzb.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.zzf = null;
        }
        Application application = this.zzc;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zze(activity, 0);
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zze(activity, 4);
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zze(activity, 0);
        zzf();
        zzg();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zze(activity, 0);
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzf();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzf();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzf();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzl = -1;
        zzh(view);
        zzf();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzl = -1;
        zzf();
        zzg();
        zzi(view);
    }

    public final long zza() {
        if (this.zzm <= -2 && zzb() == null) {
            this.zzm = -3L;
        }
        return this.zzm;
    }

    public final View zzb() {
        WeakReference weakReference = this.zzi;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void zzd(View view) {
        long j10;
        View zzb = zzb();
        if (zzb != null) {
            zzb.removeOnAttachStateChangeListener(this);
            zzi(zzb);
        }
        this.zzi = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                zzh(view);
            }
            view.addOnAttachStateChangeListener(this);
            j10 = -2;
        } else {
            j10 = -3;
        }
        this.zzm = j10;
    }
}
