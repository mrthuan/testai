package com.adjust.sdk;

import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class AdjustLinkResolution {
    private static volatile ExecutorService executor = null;
    private static final String[] expectedUrlHostSuffixArray = {"adjust.com", "adj.st", "go.link"};
    private static final int maxRecursions = 10;

    /* loaded from: classes.dex */
    public interface AdjustLinkResolutionCallback {
        void resolvedLinkCallback(Uri uri);
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ URL f5856a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdjustLinkResolutionCallback f5857b;

        public a(URL url, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
            this.f5856a = url;
            this.f5857b = adjustLinkResolutionCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdjustLinkResolution.requestAndResolve(this.f5856a, 0, this.f5857b);
        }
    }

    private AdjustLinkResolution() {
    }

    private static URL convertToHttps(URL url) {
        if (url == null) {
            return url;
        }
        String externalForm = url.toExternalForm();
        if (externalForm == null) {
            return url;
        }
        if (!externalForm.startsWith("http:")) {
            return url;
        }
        try {
            return new URL("https:" + externalForm.substring(5));
        } catch (MalformedURLException unused) {
            return url;
        }
    }

    private static Uri convertToUri(URL url) {
        if (url == null) {
            return null;
        }
        return Uri.parse(url.toString());
    }

    private static boolean isTerminalUrl(String str) {
        return urlMatchesSuffix(str, expectedUrlHostSuffixArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r1 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void requestAndResolve(java.net.URL r4, int r5, com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback r6) {
        /*
            java.net.URL r4 = convertToHttps(r4)
            r0 = 0
            java.net.URLConnection r1 = r4.openConnection()     // Catch: java.lang.Throwable -> L24
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r1.setInstanceFollowRedirects(r2)     // Catch: java.lang.Throwable -> L25
            r1.connect()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "Location"
            java.lang.String r2 = r1.getHeaderField(r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L20
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L25
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L25
            r0 = r3
        L20:
            r1.disconnect()
            goto L28
        L24:
            r1 = r0
        L25:
            if (r1 == 0) goto L28
            goto L20
        L28:
            int r5 = r5 + 1
            resolveLink(r0, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.AdjustLinkResolution.requestAndResolve(java.net.URL, int, com.adjust.sdk.AdjustLinkResolution$AdjustLinkResolutionCallback):void");
    }

    public static void resolveLink(String str, String[] strArr, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        URL url;
        if (adjustLinkResolutionCallback == null) {
            return;
        }
        if (str == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
            url = null;
        }
        if (url == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
        } else if (!urlMatchesSuffix(url.getHost(), strArr)) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
        } else {
            if (executor == null) {
                synchronized (expectedUrlHostSuffixArray) {
                    if (executor == null) {
                        executor = Executors.newSingleThreadExecutor();
                    }
                }
            }
            executor.execute(new a(url, adjustLinkResolutionCallback));
        }
    }

    private static boolean urlMatchesSuffix(String str, String[] strArr) {
        if (str == null || strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static void resolveLink(URL url, URL url2, int i10, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        Uri convertToUri;
        if (url == null) {
            convertToUri = convertToUri(url2);
        } else if (!isTerminalUrl(url.getHost()) && i10 <= 10) {
            requestAndResolve(url, i10, adjustLinkResolutionCallback);
            return;
        } else {
            convertToUri = convertToUri(url);
        }
        adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri);
    }
}
