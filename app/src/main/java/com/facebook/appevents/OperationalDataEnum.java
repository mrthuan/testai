package com.facebook.appevents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OperationalData.kt */
/* loaded from: classes.dex */
public final class OperationalDataEnum {
    public static final OperationalDataEnum IAPParameters;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ OperationalDataEnum[] f9467a;
    private final String value = "iap_parameters";

    static {
        OperationalDataEnum operationalDataEnum = new OperationalDataEnum();
        IAPParameters = operationalDataEnum;
        f9467a = new OperationalDataEnum[]{operationalDataEnum};
    }

    public static OperationalDataEnum valueOf(String str) {
        return (OperationalDataEnum) Enum.valueOf(OperationalDataEnum.class, str);
    }

    public static OperationalDataEnum[] values() {
        return (OperationalDataEnum[]) f9467a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
