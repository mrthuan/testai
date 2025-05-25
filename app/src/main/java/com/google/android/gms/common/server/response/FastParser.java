package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class FastParser<T extends FastJsonResponse> {

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th2) {
            super("Error instantiating inner object", th2);
        }

        public ParseException(Throwable th2) {
            super(th2);
        }
    }

    public FastParser() {
        new Stack();
    }
}
