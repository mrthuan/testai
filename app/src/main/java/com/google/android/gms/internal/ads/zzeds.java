package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeds extends zzbsf {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsk zzc;
    private final com.google.android.gms.ads.internal.util.client.zzr zzd;
    private final zzedh zze;
    private String zzf;
    private String zzg;

    public zzeds(Context context, zzedh zzedhVar, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzdsk zzdskVar) {
        this.zzb = context;
        this.zzc = zzdskVar;
        this.zzd = zzrVar;
        this.zze = zzedhVar;
    }

    public static void zzc(Context context, zzdsk zzdskVar, zzedh zzedhVar, String str, String str2) {
        zzd(context, zzdskVar, zzedhVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdsk zzdskVar, zzedh zzedhVar, String str, String str2, Map map) {
        String str3;
        String str4;
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        if (true != zzuVar.f10557g.zzA(context)) {
            str3 = "offline";
        } else {
            str3 = u.b.ONLINE_EXTRAS_KEY;
        }
        if (zzdskVar != null) {
            zzdsj zza = zzdskVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", str3);
            zzuVar.f10560j.getClass();
            zza.zzb("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str4 = zza.zze();
        } else {
            str4 = "";
        }
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        zzedhVar.zzd(new zzedj(System.currentTimeMillis(), str, str4, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
            return zzfsg.zza(context, 0, intent, 201326592);
        }
        intent.setClassName(context, "com.google.android.gms.ads.AdService");
        return zzfsg.zzb(context, 0, intent, zzfsg.zza | 1073741824, 0);
    }

    private final String zzs() {
        zzecz zzeczVar = (zzecz) this.zza.get(this.zzf);
        if (zzeczVar == null) {
            return "";
        }
        return zzeczVar.zzb();
    }

    private static String zzt(int i10, String str) {
        Resources zze = com.google.android.gms.ads.internal.zzu.B.f10557g.zze();
        if (zze == null) {
            return str;
        }
        return zze.getString(i10);
    }

    private final void zzu(String str, String str2, Map map) {
        zzd(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzv() {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B     // Catch: android.os.RemoteException -> L41
            com.google.android.gms.ads.internal.util.zzt r0 = r0.c     // Catch: android.os.RemoteException -> L41
            android.content.Context r0 = r6.zzb     // Catch: android.os.RemoteException -> L41
            com.google.android.gms.ads.internal.util.zzbr r0 = com.google.android.gms.ads.internal.util.zzt.I(r0)     // Catch: android.os.RemoteException -> L41
            android.content.Context r1 = r6.zzb     // Catch: android.os.RemoteException -> L41
            com.google.android.gms.dynamic.ObjectWrapper r2 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch: android.os.RemoteException -> L41
            r2.<init>(r1)     // Catch: android.os.RemoteException -> L41
            com.google.android.gms.ads.internal.offline.buffering.zza r1 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L41
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L41
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L41
            java.util.Map r5 = r6.zza     // Catch: android.os.RemoteException -> L41
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L41
            com.google.android.gms.internal.ads.zzecz r5 = (com.google.android.gms.internal.ads.zzecz) r5     // Catch: android.os.RemoteException -> L41
            if (r5 != 0) goto L24
            java.lang.String r5 = ""
            goto L28
        L24:
            java.lang.String r5 = r5.zzc()     // Catch: android.os.RemoteException -> L41
        L28:
            r1.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L41
            boolean r1 = r0.zzg(r2, r1)     // Catch: android.os.RemoteException -> L41
            if (r1 != 0) goto L46
            android.content.Context r2 = r6.zzb     // Catch: android.os.RemoteException -> L42
            com.google.android.gms.dynamic.ObjectWrapper r3 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch: android.os.RemoteException -> L42
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L42
            java.lang.String r2 = r6.zzg     // Catch: android.os.RemoteException -> L42
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L42
            boolean r1 = r0.zzf(r3, r2, r4)     // Catch: android.os.RemoteException -> L42
            goto L46
        L41:
            r1 = 0
        L42:
            r0 = 6
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
        L46:
            if (r1 != 0) goto L5a
            com.google.android.gms.internal.ads.zzedh r0 = r6.zze
            java.lang.String r1 = r6.zzf
            r0.zzc(r1)
            java.lang.String r0 = r6.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzfxu r2 = com.google.android.gms.internal.ads.zzfxu.zzd()
            r6.zzu(r0, r1, r2)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeds.zzv():void");
    }

    private final void zzw(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
        if (!new k0.u(activity).a()) {
            if (Build.VERSION.SDK_INT < 33) {
                com.google.android.gms.ads.internal.util.zzt zztVar2 = zzuVar.c;
                AlertDialog.Builder i10 = com.google.android.gms.ads.internal.util.zzt.i(activity);
                i10.setTitle(zzt(R.string.arg_res_0x7f1302db, "Allow app to send you notifications?")).setPositiveButton(zzt(R.string.arg_res_0x7f1302d9, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedl
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        zzeds.this.zzk(activity, zzmVar, dialogInterface, i11);
                    }
                }).setNegativeButton(zzt(R.string.arg_res_0x7f1302da, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedm
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        zzeds.this.zzl(zzmVar, dialogInterface, i11);
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedn
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        zzeds.this.zzm(zzmVar, dialogInterface);
                    }
                });
                i10.create().show();
                zzu(this.zzf, "rtsdi", zzfxu.zzd());
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzu(this.zzf, "asnpdi", zzfxu.zzd());
            return;
        }
        zzv();
        zzx(activity, zzmVar);
    }

    private final void zzx(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        XmlResourceParser layout;
        AlertDialog create;
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzt.i(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        Resources zze = zzuVar.f10557g.zze();
        Drawable drawable = null;
        if (zze == null) {
            layout = null;
        } else {
            layout = zze.getLayout(R.layout.offline_ads_dialog);
        }
        if (layout == null) {
            onCancelListener.setMessage(zzt(R.string.arg_res_0x7f1302df, "Thanks for your interest.\nWe will share more once you're back online."));
            create = onCancelListener.create();
        } else {
            View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzs = zzs();
            if (!zzs.isEmpty()) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzs);
            }
            zzecz zzeczVar = (zzecz) this.zza.get(this.zzf);
            if (zzeczVar != null) {
                drawable = zzeczVar.zza();
            }
            if (drawable != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
            }
            create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzedr(this, create, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (!stringExtra.equals("offline_notification_clicked") && !stringExtra.equals("offline_notification_dismissed")) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("gws_query_id");
        String stringExtra3 = intent.getStringExtra("uri");
        boolean zzA = com.google.android.gms.ads.internal.zzu.B.f10557g.zzA(this.zzb);
        HashMap hashMap = new HashMap();
        char c = 2;
        if (stringExtra.equals("offline_notification_clicked")) {
            hashMap.put("offline_notification_action", "offline_notification_clicked");
            if (true == zzA) {
                c = 1;
            }
            hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
            try {
                Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setData(Uri.parse(stringExtra3));
                }
                launchIntentForPackage.addFlags(268435456);
                this.zzb.startActivity(launchIntentForPackage);
                hashMap.put("olaa", "olas");
            } catch (ActivityNotFoundException unused) {
                hashMap.put("olaa", "olaf");
            }
        } else {
            hashMap.put("offline_notification_action", "offline_notification_dismissed");
        }
        zzu(stringExtra2, "offline_notification_action", hashMap);
        try {
            SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
            if (c == 1) {
                this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
            } else {
                zzedh.zzi(writableDatabase, stringExtra2);
            }
        } catch (SQLiteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Failed to get writable offline buffering database: ".concat(e10.toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                zzedu zzeduVar = (zzedu) ObjectWrapper.L0(iObjectWrapper);
                Activity zza = zzeduVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzeduVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i10] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzv();
                    zzx(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzu(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzedu zzeduVar = (zzedu) ObjectWrapper.L0(iObjectWrapper);
        final Activity zza = zzeduVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzeduVar.zzb();
        this.zzf = zzeduVar.zzc();
        this.zzg = zzeduVar.zzd();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhF)).booleanValue()) {
            zzu(this.zzf, "dialog_impression", zzfxu.zzd());
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            AlertDialog.Builder i10 = com.google.android.gms.ads.internal.util.zzt.i(zza);
            i10.setTitle(zzt(R.string.arg_res_0x7f1302e6, "Open ad when you're back online.")).setMessage(zzt(R.string.arg_res_0x7f1302e5, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzt(R.string.arg_res_0x7f1302e3, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedo
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    zzeds.this.zzn(zza, zzb, dialogInterface, i11);
                }
            }).setNegativeButton(zzt(R.string.arg_res_0x7f1302e4, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    zzeds.this.zzo(zzb, dialogInterface, i11);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedq
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzeds.this.zzp(zzb, dialogInterface);
                }
            });
            i10.create().show();
            return;
        }
        zzw(zza, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzr zzrVar = this.zzd;
        this.zze.zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                zzedh.zzb(com.google.android.gms.ads.internal.util.client.zzr.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(1:28)|4|(2:6|(9:8|9|(2:21|22)|11|12|13|14|15|16))|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d6, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d7, code lost:
        r11.put("notification_not_shown_reason", r10.getMessage());
        r10 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r10, com.google.android.gms.ads.internal.offline.buffering.zza r11) {
        /*
            r9 = this;
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.L0(r10)
            android.content.Context r10 = (android.content.Context) r10
            java.lang.String r0 = r11.f10267a
            java.lang.String r1 = r9.zzs()
            com.google.android.gms.ads.internal.zzu r2 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.ads.internal.util.zzu r2 = r2.f10555e
            r2.d(r10)
            java.lang.String r2 = "offline_notification_clicked"
            java.lang.String r3 = r11.f10268b
            android.app.PendingIntent r2 = zzr(r10, r2, r3, r0)
            java.lang.String r4 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzr(r10, r4, r3, r0)
            k0.p r4 = new k0.p
            java.lang.String r5 = "offline_notification_channel"
            r4.<init>(r10, r5)
            boolean r5 = r1.isEmpty()
            r6 = 1
            if (r5 != 0) goto L45
            r5 = 2131952354(0x7f1302e2, float:1.9541148E38)
            java.lang.String r7 = "You are back online! Continue learning about %s"
            java.lang.String r5 = zzt(r5, r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r1
            java.lang.String r1 = java.lang.String.format(r5, r7)
            r4.g(r1)
            goto L51
        L45:
            r1 = 2131952353(0x7f1302e1, float:1.9541146E38)
            java.lang.String r5 = "You are back online! Let's pick up where we left off"
            java.lang.String r1 = zzt(r1, r5)
            r4.g(r1)
        L51:
            r1 = 16
            r4.l(r1, r6)
            android.app.Notification r1 = r4.f19515y
            r1.deleteIntent = r0
            r4.f19497g = r2
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()
            int r0 = r0.icon
            r1.icon = r0
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzhG
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r2 = r1.c
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.f19502l = r0
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzhI
            com.google.android.gms.internal.ads.zzbbu r1 = r1.c
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto La1
            java.lang.String r11 = r11.c
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto La1
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> La1
            r0.<init>(r11)     // Catch: java.io.IOException -> La1
            java.net.URLConnection r11 = r0.openConnection()     // Catch: java.io.IOException -> La1
            java.io.InputStream r11 = r11.getInputStream()     // Catch: java.io.IOException -> La1
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r11)     // Catch: java.io.IOException -> La1
            goto La2
        La1:
            r11 = r1
        La2:
            if (r11 == 0) goto Lbc
            r4.o(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbc
            k0.n r0 = new k0.n     // Catch: android.content.res.Resources.NotFoundException -> Lbc
            r0.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lbc
            androidx.core.graphics.drawable.IconCompat r2 = new androidx.core.graphics.drawable.IconCompat     // Catch: android.content.res.Resources.NotFoundException -> Lbc
            r2.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> Lbc
            r2.f3532b = r11     // Catch: android.content.res.Resources.NotFoundException -> Lbc
            r0.f19489b = r2     // Catch: android.content.res.Resources.NotFoundException -> Lbc
            r0.c = r1     // Catch: android.content.res.Resources.NotFoundException -> Lbc
            r0.f19490d = r6     // Catch: android.content.res.Resources.NotFoundException -> Lbc
            r4.q(r0)     // Catch: android.content.res.Resources.NotFoundException -> Lbc
        Lbc:
            java.lang.String r11 = "notification"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.app.NotificationManager r10 = (android.app.NotificationManager) r10
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            android.app.Notification r0 = r4.a()     // Catch: java.lang.IllegalArgumentException -> Ld6
            r1 = 54321(0xd431, float:7.612E-41)
            r10.notify(r3, r1, r0)     // Catch: java.lang.IllegalArgumentException -> Ld6
            java.lang.String r10 = "offline_notification_impression"
            goto Le2
        Ld6:
            r10 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r10 = r10.getMessage()
            r11.put(r0, r10)
            java.lang.String r10 = "offline_notification_failed"
        Le2:
            r9.zzu(r3, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeds.zzj(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza):void");
    }

    public final void zzk(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        zzu(this.zzf, "rtsdc", a6.h.h("dialog_action", "confirm"));
        activity.startActivity(com.google.android.gms.ads.internal.zzu.B.f10555e.b(activity));
        zzv();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        zzu(this.zzf, "dialog_click", a6.h.h("dialog_action", "confirm"));
        zzw(activity, zzmVar);
    }

    public final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzq(String str, zzdjb zzdjbVar) {
        String str2;
        String str3 = "";
        if (!TextUtils.isEmpty(zzdjbVar.zzx())) {
            str2 = zzdjbVar.zzx();
        } else if (zzdjbVar.zzB() == null) {
            str2 = "";
        } else {
            str2 = zzdjbVar.zzB();
        }
        zzbfd zzm = zzdjbVar.zzm();
        if (zzm != null) {
            try {
                str3 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbfd zzn = zzdjbVar.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                IObjectWrapper zzf = zzn.zzf();
                if (zzf != null) {
                    drawable = (Drawable) ObjectWrapper.L0(zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzecv(str2, str3, drawable));
    }
}
