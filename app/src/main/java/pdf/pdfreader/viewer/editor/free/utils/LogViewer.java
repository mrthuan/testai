package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.Thread;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class LogViewer extends FrameLayout implements Thread.UncaughtExceptionHandler, Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f28525b = 0;

    /* renamed from: a  reason: collision with root package name */
    public Activity f28526a;

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface a {
    }

    static {
        String str = n0.f28727a;
    }

    private String getTime() {
        return new SimpleDateFormat(ea.a.p("A00bZA8gJ0hybQs6R3N5U2tT", "1qN6ko8z"), Locale.getDefault()).format(new Date());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        SystemClock.uptimeMillis();
        String str = n0.f28727a;
        motionEvent.getY();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f28526a = null;
        if (activity.getClass().isAnnotationPresent(a.class)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f28526a = activity;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        th2.printStackTrace();
        if (this.f28526a != null) {
            new c0(this, th2, thread).start();
            return;
        }
        Uri parse = Uri.parse(ea.a.p("UXQ4cG4vWDF6N0gwGjB5MQI0ZzZ-OA==", "ie9LTw2X"));
        Intent intent = new Intent();
        intent.setFlags(16384);
        intent.setAction(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJCFc=", "J8joMWEJ"));
        intent.setData(parse);
        throw null;
    }

    public static void setTag(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
