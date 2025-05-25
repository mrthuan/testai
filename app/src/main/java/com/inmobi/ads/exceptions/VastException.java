package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

@Keep
/* loaded from: classes2.dex */
public final class VastException extends Exception {
    private final int mVastErrorCode;
    private short telemetryErrorCode;

    public VastException(int i10) {
        this.mVastErrorCode = i10;
    }

    private final void convertVastErrorToTelemetryErrorCode() {
        short s4;
        int i10 = this.mVastErrorCode;
        if (i10 != 100) {
            if (i10 != 101) {
                if (i10 != 201) {
                    if (i10 != 405) {
                        if (i10 != 900) {
                            if (i10 != 600) {
                                if (i10 != 601) {
                                    if (i10 != 603) {
                                        if (i10 != 604) {
                                            switch (i10) {
                                                case OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT /* 300 */:
                                                    s4 = 63;
                                                    break;
                                                case 301:
                                                    s4 = 72;
                                                    break;
                                                case 302:
                                                    s4 = 73;
                                                    break;
                                                case 303:
                                                    s4 = 74;
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 400:
                                                            s4 = 62;
                                                            break;
                                                        case TTAdConstant.MATE_IS_NULL_CODE /* 401 */:
                                                            s4 = 64;
                                                            break;
                                                        case TTAdConstant.AD_ID_IS_NULL_CODE /* 402 */:
                                                            s4 = 65;
                                                            break;
                                                        case TTAdConstant.DEEPLINK_UNAVAILABLE_CODE /* 403 */:
                                                            s4 = 68;
                                                            break;
                                                        default:
                                                            s4 = 0;
                                                            break;
                                                    }
                                            }
                                        } else {
                                            s4 = 67;
                                        }
                                    } else {
                                        s4 = 60;
                                    }
                                } else {
                                    s4 = 23;
                                }
                            } else {
                                s4 = 61;
                            }
                        } else {
                            s4 = 70;
                        }
                    } else {
                        s4 = 66;
                    }
                } else {
                    s4 = 71;
                }
            } else {
                s4 = 69;
            }
        } else {
            s4 = 59;
        }
        this.telemetryErrorCode = s4;
    }

    public final short getTelemetryErrorCode() {
        convertVastErrorToTelemetryErrorCode();
        return this.telemetryErrorCode;
    }

    public static /* synthetic */ void getTelemetryErrorCode$annotations() {
    }
}
