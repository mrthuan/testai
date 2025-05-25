package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class SendException extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int errorCode;

    public SendException(String str) {
        super(str);
        int i10 = 0;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            lowerCase.getClass();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -1743242157:
                    if (lowerCase.equals("service_not_available")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1290953729:
                    if (lowerCase.equals("toomanymessages")) {
                        c = 1;
                        break;
                    }
                    break;
                case -920906446:
                    if (lowerCase.equals("invalid_parameters")) {
                        c = 2;
                        break;
                    }
                    break;
                case -617027085:
                    if (lowerCase.equals("messagetoobig")) {
                        c = 3;
                        break;
                    }
                    break;
                case -95047692:
                    if (lowerCase.equals("missing_to")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i10 = 3;
                    break;
                case 1:
                    i10 = 4;
                    break;
                case 2:
                case 4:
                    i10 = 1;
                    break;
                case 3:
                    i10 = 2;
                    break;
            }
        }
        this.errorCode = i10;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
