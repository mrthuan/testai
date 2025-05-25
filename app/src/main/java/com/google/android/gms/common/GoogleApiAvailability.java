package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.g0;
import androidx.fragment.app.u;
import bb.j;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import k0.m;
import k0.o;
import k0.p;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final GoogleApiAvailability f10882d = new GoogleApiAvailability();

    public static AlertDialog f(Context context, int i10, zag zagVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(zac.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = resources.getString(17039370);
                } else {
                    string = resources.getString(pdf.pdfreader.viewer.editor.free.R.string.arg_res_0x7f1300b6);
                }
            } else {
                string = resources.getString(pdf.pdfreader.viewer.editor.free.R.string.arg_res_0x7f1300c0);
            }
        } else {
            string = resources.getString(pdf.pdfreader.viewer.editor.free.R.string.arg_res_0x7f1300b9);
        }
        if (string != null) {
            builder.setPositiveButton(string, zagVar);
        }
        String c10 = zac.c(context, i10);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10));
        new IllegalArgumentException();
        return builder.create();
    }

    @ResultIgnorabilityUnspecified
    public static zabx g(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        zao.zaa(context, zabxVar, intentFilter);
        zabxVar.f11122a = context;
        if (!GooglePlayServicesUtilLight.b(context)) {
            zabwVar.a();
            synchronized (zabxVar) {
                Context context2 = zabxVar.f11122a;
                if (context2 != null) {
                    context2.unregisterReceiver(zabxVar);
                }
                zabxVar.f11122a = null;
            }
            return null;
        }
        return zabxVar;
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof u) {
                g0 supportFragmentManager = ((u) activity).getSupportFragmentManager();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener(null);
                    alertDialog.setOnDismissListener(null);
                    supportErrorDialogFragment.f10894o0 = alertDialog;
                    if (onCancelListener != null) {
                        supportErrorDialogFragment.f10895p0 = onCancelListener;
                    }
                    supportErrorDialogFragment.s0(supportFragmentManager, str);
                    return;
                }
                throw new NullPointerException("Cannot display null dialog");
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(null);
            alertDialog.setOnDismissListener(null);
            errorDialogFragment.f10878a = alertDialog;
            if (onCancelListener != null) {
                errorDialogFragment.f10879b = onCancelListener;
            }
            errorDialogFragment.show(fragmentManager, str);
            return;
        }
        throw new NullPointerException("Cannot display null dialog");
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public final Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public final int c(Context context, int i10) {
        return super.c(context, i10);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    public final int d(Context context) {
        return c(context, GoogleApiAvailabilityLight.f10883a);
    }

    @ResultIgnorabilityUnspecified
    public final void e(Activity activity, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f10 = f(activity, i10, new a(activity, super.b(activity, i10, "d")), onCancelListener);
        if (f10 == null) {
            return;
        }
        h(activity, f10, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    @TargetApi(20)
    public final void i(Context context, int i10, PendingIntent pendingIntent) {
        String c10;
        String d10;
        int i11;
        NotificationChannel notificationChannel;
        CharSequence name;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null);
        new IllegalArgumentException();
        if (i10 == 18) {
            new r7.a(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
        } else {
            if (i10 == 6) {
                c10 = zac.e(context, "common_google_play_services_resolution_required_title");
            } else {
                c10 = zac.c(context, i10);
            }
            if (c10 == null) {
                c10 = context.getResources().getString(pdf.pdfreader.viewer.editor.free.R.string.arg_res_0x7f1300bd);
            }
            if (i10 != 6 && i10 != 19) {
                d10 = zac.b(context, i10);
            } else {
                d10 = zac.d(context, "common_google_play_services_resolution_required_text", zac.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            Preconditions.j(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            p pVar = new p(context, null);
            pVar.f19506p = true;
            pVar.l(16, true);
            pVar.g(c10);
            o oVar = new o();
            oVar.f19491b = p.b(d10);
            pVar.q(oVar);
            if (DeviceProperties.b(context)) {
                pVar.f19515y.icon = context.getApplicationInfo().icon;
                pVar.f19502l = 2;
                if (DeviceProperties.c(context)) {
                    pVar.f19493b.add(new m(resources.getString(pdf.pdfreader.viewer.editor.free.R.string.arg_res_0x7f1300c5), pendingIntent));
                } else {
                    pVar.f19497g = pendingIntent;
                }
            } else {
                pVar.f19515y.icon = 17301642;
                pVar.f19515y.tickerText = p.b(resources.getString(pdf.pdfreader.viewer.editor.free.R.string.arg_res_0x7f1300bd));
                pVar.f19515y.when = System.currentTimeMillis();
                pVar.f19497g = pendingIntent;
                pVar.f19496f = p.b(d10);
            }
            if (PlatformVersion.a()) {
                Preconditions.m(PlatformVersion.a());
                synchronized (c) {
                }
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(pdf.pdfreader.viewer.editor.free.R.string.arg_res_0x7f1300bc);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(j.y(string));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                pVar.f19513w = "com.google.android.gms.availability";
            }
            Notification a10 = pVar.a();
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                i11 = 39789;
            } else {
                GooglePlayServicesUtilLight.f10886a.set(false);
                i11 = 10436;
            }
            notificationManager.notify(i11, a10);
        }
    }

    @ResultIgnorabilityUnspecified
    public final void j(Activity activity, LifecycleFragment lifecycleFragment, int i10, zap zapVar) {
        AlertDialog f10 = f(activity, i10, new b(super.b(activity, i10, "d"), lifecycleFragment), zapVar);
        if (f10 == null) {
            return;
        }
        h(activity, f10, "GooglePlayServicesErrorDialog", zapVar);
    }
}
