package com.google.android.gms.measurement.internal;

import a8.g0;
import a8.l1;
import a8.n1;
import a8.s;
import a8.u0;
import a8.z1;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzjy extends s {
    public final zzjx c;

    /* renamed from: d  reason: collision with root package name */
    public zzek f11858d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Boolean f11859e;

    /* renamed from: f  reason: collision with root package name */
    public final l1 f11860f;

    /* renamed from: g  reason: collision with root package name */
    public final z1 f11861g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f11862h;

    /* renamed from: i  reason: collision with root package name */
    public final n1 f11863i;

    public zzjy(zzge zzgeVar) {
        super(zzgeVar);
        this.f11862h = new ArrayList();
        this.f11861g = new z1(zzgeVar.f11785n);
        this.c = new zzjx(this);
        this.f11860f = new l1(this, zzgeVar);
        this.f11863i = new n1(this, zzgeVar);
    }

    public static void A(zzjy zzjyVar, ComponentName componentName) {
        zzjyVar.m();
        if (zzjyVar.f11858d != null) {
            zzjyVar.f11858d = null;
            zzeu zzeuVar = ((zzge) zzjyVar.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11720n.b(componentName, "Disconnected from device MeasurementService");
            zzjyVar.m();
            zzjyVar.B();
        }
    }

    public final void B() {
        m();
        n();
        if (s()) {
            return;
        }
        if (!u()) {
            if (!((zzge) this.f3529a).f11778g.z()) {
                ((zzge) this.f3529a).getClass();
                List<ResolveInfo> queryIntentServices = ((zzge) this.f3529a).f11773a.getPackageManager().queryIntentServices(new Intent().setClassName(((zzge) this.f3529a).f11773a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    zzge zzgeVar = (zzge) this.f3529a;
                    Context context = zzgeVar.f11773a;
                    zzgeVar.getClass();
                    intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.c.a(intent);
                    return;
                }
                zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            return;
        }
        zzjx zzjxVar = this.c;
        zzjxVar.c.m();
        Context context2 = ((zzge) zzjxVar.c.f3529a).f11773a;
        synchronized (zzjxVar) {
            if (zzjxVar.f11856a) {
                zzeu zzeuVar2 = ((zzge) zzjxVar.c.f3529a).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11720n.a("Connection attempt already in progress");
            } else if (zzjxVar.f11857b != null && (zzjxVar.f11857b.isConnecting() || zzjxVar.f11857b.isConnected())) {
                zzeu zzeuVar3 = ((zzge) zzjxVar.c.f3529a).f11780i;
                zzge.f(zzeuVar3);
                zzeuVar3.f11720n.a("Already awaiting connection attempt");
            } else {
                zzjxVar.f11857b = new zzeq(context2, Looper.getMainLooper(), zzjxVar, zzjxVar);
                zzeu zzeuVar4 = ((zzge) zzjxVar.c.f3529a).f11780i;
                zzge.f(zzeuVar4);
                zzeuVar4.f11720n.a("Connecting to remote service");
                zzjxVar.f11856a = true;
                Preconditions.j(zzjxVar.f11857b);
                zzjxVar.f11857b.checkAvailabilityAndConnect();
            }
        }
    }

    public final void C() {
        m();
        n();
        zzjx zzjxVar = this.c;
        if (zzjxVar.f11857b != null && (zzjxVar.f11857b.isConnected() || zzjxVar.f11857b.isConnecting())) {
            zzjxVar.f11857b.disconnect();
        }
        zzjxVar.f11857b = null;
        try {
            ConnectionTracker.b().c(((zzge) this.f3529a).f11773a, this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f11858d = null;
    }

    public final void D(AtomicReference atomicReference) {
        m();
        n();
        y(new g0(1, this, atomicReference, v(false)));
    }

    @Override // a8.s
    public final boolean p() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02a6 A[Catch: all -> 0x0319, TRY_ENTER, TryCatch #38 {all -> 0x0319, blocks: (B:34:0x00ea, B:36:0x00f0, B:38:0x00fd, B:40:0x0103, B:44:0x0119, B:46:0x011e, B:150:0x02a6, B:152:0x02ac, B:153:0x02af, B:169:0x02ed, B:161:0x02d5, B:55:0x013f, B:56:0x0142, B:54:0x013a, B:59:0x0148, B:61:0x015c, B:68:0x0177, B:69:0x017b, B:70:0x017e, B:66:0x0171, B:73:0x0182, B:75:0x0196, B:82:0x01b1, B:84:0x01b6, B:85:0x01b9, B:80:0x01ab, B:88:0x01bd, B:89:0x01cd, B:96:0x01ee, B:98:0x01ff, B:100:0x020b, B:101:0x021a), top: B:247:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0350 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x030c A[SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(com.google.android.gms.measurement.internal.zzek r30, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r31, com.google.android.gms.measurement.internal.zzq r32) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjy.q(com.google.android.gms.measurement.internal.zzek, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzq):void");
    }

    public final void r(zzac zzacVar) {
        boolean t4;
        m();
        n();
        zzge zzgeVar = (zzge) this.f3529a;
        zzgeVar.getClass();
        zzen l10 = zzgeVar.l();
        zzge zzgeVar2 = (zzge) l10.f3529a;
        zzlo zzloVar = zzgeVar2.f11783l;
        zzge.d(zzloVar);
        zzloVar.getClass();
        byte[] f02 = zzlo.f0(zzacVar);
        if (f02.length > 131072) {
            zzeu zzeuVar = zzgeVar2.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11713g.a("Conditional user property too long for local database. Sending directly to service");
            t4 = false;
        } else {
            t4 = l10.t(2, f02);
        }
        zzac zzacVar2 = new zzac(zzacVar);
        y(new u0(this, v(true), t4, zzacVar2, zzacVar));
    }

    public final boolean s() {
        m();
        n();
        if (this.f11858d != null) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        m();
        n();
        if (!u()) {
            return true;
        }
        zzlo zzloVar = ((zzge) this.f3529a).f11783l;
        zzge.d(zzloVar);
        if (zzloVar.p0() >= ((Integer) zzeh.f11652g0.a(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjy.u():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:69:0x01fb
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final com.google.android.gms.measurement.internal.zzq v(boolean r38) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjy.v(boolean):com.google.android.gms.measurement.internal.zzq");
    }

    public final void w() {
        m();
        zzge zzgeVar = (zzge) this.f3529a;
        zzeu zzeuVar = zzgeVar.f11780i;
        zzge.f(zzeuVar);
        ArrayList arrayList = this.f11862h;
        zzeuVar.f11720n.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                zzeu zzeuVar2 = zzgeVar.f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11712f.b(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f11863i.a();
    }

    public final void x() {
        m();
        z1 z1Var = this.f11861g;
        z1Var.f396b = z1Var.f395a.b();
        ((zzge) this.f3529a).getClass();
        this.f11860f.c(((Long) zzeh.K.a(null)).longValue());
    }

    public final void y(Runnable runnable) {
        m();
        if (s()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f11862h;
        zzge zzgeVar = (zzge) this.f3529a;
        zzgeVar.getClass();
        if (arrayList.size() >= 1000) {
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f11863i.c(60000L);
        B();
    }

    public final Boolean z() {
        return this.f11859e;
    }
}
