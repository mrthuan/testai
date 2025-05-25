package com.inmobi.ads;

import com.inmobi.ads.InMobiAdRequestStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f14085a;

    static {
        int[] iArr = new int[InMobiAdRequestStatus.StatusCode.values().length];
        try {
            iArr[InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.REQUEST_INVALID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.REQUEST_PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.SERVER_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.NO_FILL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.AD_ACTIVE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.GET_SIGNALS_CALLED_WHILE_LOADING.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.LOW_MEMORY.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        f14085a = iArr;
    }
}
