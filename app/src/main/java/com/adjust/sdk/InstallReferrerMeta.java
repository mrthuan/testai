package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class InstallReferrerMeta {
    private static final String COLUMN_ACTUAL_TIMESTAMP = "actual_timestamp";
    private static final String COLUMN_INSTALL_REFERRER = "install_referrer";
    private static final String COLUMN_IS_CT = "is_ct";
    private static final String FACEBOOK_REFERRER_PROVIDER_AUTHORITY = "com.facebook.katana.provider.InstallReferrerProvider";
    private static final String INSTAGRAM_REFERRER_PROVIDER_AUTHORITY = "com.instagram.contentprovider.InstallReferrerProvider";
    private Context context;
    private String fbAppId;
    private final InstallReferrerReadListener referrerCallback;
    private ILogger logger = AdjustFactory.getLogger();
    private final AtomicBoolean shouldTryToRead = new AtomicBoolean(true);

    public InstallReferrerMeta(Context context, String str, InstallReferrerReadListener installReferrerReadListener) {
        this.context = context;
        this.fbAppId = str;
        this.referrerCallback = installReferrerReadListener;
    }

    private boolean isValidReferrer(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
        if (0 == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void readReferrer() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.InstallReferrerMeta.readReferrer():void");
    }
}
