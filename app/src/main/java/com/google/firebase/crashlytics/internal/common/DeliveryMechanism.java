// Auto-fixed: added missing class declaration
public class DeliveryMechanism {
package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f13514id;

    DeliveryMechanism(int i10) {
        this.f13514id = i10;
    }

    public static DeliveryMechanism determineFrom(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int getId() {
        return this.f13514id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f13514id);
    }
}

}
