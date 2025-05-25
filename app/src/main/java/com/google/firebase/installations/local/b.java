package com.google.firebase.installations.local;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.a;

/* compiled from: PersistedInstallationEntry.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f13617a = 0;

    /* compiled from: PersistedInstallationEntry.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
    }

    static {
        a.C0176a c0176a = new a.C0176a();
        c0176a.f13615f = 0L;
        c0176a.b(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION);
        c0176a.f13614e = 0L;
        c0176a.a();
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract PersistedInstallation.RegistrationStatus f();

    public abstract long g();
}
