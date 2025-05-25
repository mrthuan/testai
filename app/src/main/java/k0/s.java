package k0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.Iterator;
import k0.x;

/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19518a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f19519b;
    public final p c;

    /* renamed from: d  reason: collision with root package name */
    public final RemoteViews f19520d;

    /* renamed from: e  reason: collision with root package name */
    public final RemoteViews f19521e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f19522f;

    /* renamed from: g  reason: collision with root package name */
    public final RemoteViews f19523g;

    public s(p pVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        Notification.Builder badgeIconType;
        Notification.Builder settingsText;
        Notification.Builder shortcutId;
        Notification.Builder timeoutAfter;
        Bundle bundle;
        Bundle[] bundleArr;
        CharSequence charSequence;
        Icon icon;
        Bundle bundle2;
        new ArrayList();
        this.f19522f = new Bundle();
        this.c = pVar;
        Context context = pVar.f19492a;
        this.f19518a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.view.menu.d.g();
            this.f19519b = c4.i.a(context, pVar.f19513w);
        } else {
            this.f19519b = new Notification.Builder(context);
        }
        Notification notification = pVar.f19515y;
        ArrayList<String> arrayList = null;
        Notification.Builder lights = this.f19519b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int i10 = 0;
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(pVar.f19495e).setContentText(pVar.f19496f).setContentInfo(pVar.f19500j).setContentIntent(pVar.f19497g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pVar.f19498h, (notification.flags & 128) != 0).setLargeIcon(pVar.f19499i).setNumber(pVar.f19501k).setProgress(0, 0, false);
        this.f19519b.setSubText(null).setUsesChronometer(false).setPriority(pVar.f19502l);
        Iterator<m> it = pVar.f19493b.iterator();
        while (it.hasNext()) {
            m next = it.next();
            IconCompat a10 = next.a();
            if (a10 != null) {
                icon = IconCompat.a.f(a10, null);
            } else {
                icon = null;
            }
            Notification.Action.Builder builder = new Notification.Action.Builder(icon, next.f19486i, next.f19487j);
            z[] zVarArr = next.c;
            if (zVarArr != null) {
                int length = zVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (zVarArr.length <= 0) {
                    for (int i11 = 0; i11 < length; i11++) {
                        builder.addRemoteInput(remoteInputArr[i11]);
                    }
                } else {
                    z zVar = zVarArr[0];
                    throw null;
                }
            }
            Bundle bundle3 = next.f19479a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z13 = next.f19481d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z13);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 24) {
                builder.setAllowGeneratedReplies(z13);
            }
            int i13 = next.f19483f;
            bundle2.putInt("android.support.action.semanticAction", i13);
            if (i12 >= 28) {
                builder.setSemanticAction(i13);
            }
            if (i12 >= 29) {
                builder.setContextual(next.f19484g);
            }
            if (i12 >= 31) {
                builder.setAuthenticationRequired(next.f19488k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f19482e);
            builder.addExtras(bundle2);
            this.f19519b.addAction(builder.build());
        }
        Bundle bundle4 = pVar.f19507q;
        if (bundle4 != null) {
            this.f19522f.putAll(bundle4);
        }
        int i14 = Build.VERSION.SDK_INT;
        this.f19520d = pVar.f19510t;
        this.f19521e = pVar.f19511u;
        this.f19519b.setShowWhen(pVar.f19503m);
        this.f19519b.setLocalOnly(pVar.f19506p).setGroup(pVar.f19505o).setGroupSummary(false).setSortKey(null);
        this.f19519b.setCategory(null).setColor(pVar.f19508r).setVisibility(pVar.f19509s).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        ArrayList<x> arrayList2 = pVar.c;
        ArrayList<String> arrayList3 = pVar.f19516z;
        if (i14 < 28) {
            if (arrayList2 != null) {
                arrayList = new ArrayList<>(arrayList2.size());
                Iterator<x> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    x next2 = it2.next();
                    String str = next2.c;
                    if (str == null) {
                        if (next2.f19543a != null) {
                            str = "name:" + ((Object) charSequence);
                        } else {
                            str = "";
                        }
                    }
                    arrayList.add(str);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    y.d dVar = new y.d(arrayList3.size() + arrayList.size());
                    dVar.addAll(arrayList);
                    dVar.addAll(arrayList3);
                    arrayList3 = new ArrayList<>(dVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            for (String str2 : arrayList3) {
                this.f19519b.addPerson(str2);
            }
        }
        this.f19523g = pVar.f19512v;
        ArrayList<m> arrayList4 = pVar.f19494d;
        if (arrayList4.size() > 0) {
            if (pVar.f19507q == null) {
                pVar.f19507q = new Bundle();
            }
            Bundle bundle5 = pVar.f19507q.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i15 = 0;
            while (i10 < arrayList4.size()) {
                String num = Integer.toString(i10);
                m mVar = arrayList4.get(i10);
                Object obj = t.f19524a;
                Bundle bundle8 = new Bundle();
                IconCompat a11 = mVar.a();
                bundle8.putInt(InMobiNetworkValues.ICON, a11 != null ? a11.d() : i15);
                bundle8.putCharSequence(InMobiNetworkValues.TITLE, mVar.f19486i);
                bundle8.putParcelable("actionIntent", mVar.f19487j);
                Bundle bundle9 = mVar.f19479a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", mVar.f19481d);
                bundle8.putBundle("extras", bundle);
                z[] zVarArr2 = mVar.c;
                if (zVarArr2 == null) {
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[zVarArr2.length];
                    if (zVarArr2.length <= 0) {
                        bundleArr = bundleArr2;
                    } else {
                        z zVar2 = zVarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", mVar.f19482e);
                bundle8.putInt("semanticAction", mVar.f19483f);
                bundle7.putBundle(num, bundle8);
                i10++;
                i15 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (pVar.f19507q == null) {
                pVar.f19507q = new Bundle();
            }
            pVar.f19507q.putBundle("android.car.EXTENSIONS", bundle5);
            this.f19522f.putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            this.f19519b.setExtras(pVar.f19507q).setRemoteInputHistory(null);
            RemoteViews remoteViews = pVar.f19510t;
            if (remoteViews != null) {
                this.f19519b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = pVar.f19511u;
            if (remoteViews2 != null) {
                this.f19519b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = pVar.f19512v;
            if (remoteViews3 != null) {
                this.f19519b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i16 >= 26) {
            badgeIconType = this.f19519b.setBadgeIconType(0);
            settingsText = badgeIconType.setSettingsText(null);
            shortcutId = settingsText.setShortcutId(null);
            timeoutAfter = shortcutId.setTimeoutAfter(0L);
            timeoutAfter.setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(pVar.f19513w)) {
                this.f19519b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator<x> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                x next3 = it3.next();
                Notification.Builder builder2 = this.f19519b;
                next3.getClass();
                builder2.addPerson(x.b.b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f19519b.setAllowSystemGeneratedContextualActions(pVar.f19514x);
            this.f19519b.setBubbleMetadata(null);
        }
    }
}
