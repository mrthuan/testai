package industries.deepthought.core.activity;

import a0.d;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class PolicyActivity extends c {
    private l.a action_bar = null;
    private String policy_email;
    private ProgressBar progressBar;
    private WebView webView;

    /* loaded from: classes.dex */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            PolicyActivity.this.progressBar.setVisibility(8);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            PolicyActivity.this.progressBar.setVisibility(0);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* loaded from: classes.dex */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            PolicyActivity policyActivity = PolicyActivity.this;
            if (i10 == 100) {
                policyActivity.progressBar.setVisibility(8);
                return;
            }
            policyActivity.progressBar.setVisibility(0);
            policyActivity.progressBar.setProgress(i10);
        }
    }

    private void initView(String str) {
        this.progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        WebView webView = (WebView) findViewById(R.id.ad_consent_webview);
        this.webView = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.webView.setWebViewClient(new a());
        this.webView.setWebChromeClient(new b());
        this.webView.loadUrl(str);
    }

    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        try {
            if (this.action_bar == null) {
                this.action_bar = getSupportActionBar();
            }
            this.action_bar.n(true);
            this.action_bar.l(new ColorDrawable(getIntent().getIntExtra("color", -16777216)));
            this.action_bar.q();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        setContentView(R.layout.ad_policy_activity);
        this.policy_email = getIntent().getStringExtra("email");
        boolean booleanExtra = getIntent().getBooleanExtra("dark", false);
        StringBuilder g10 = d.g(getIntent().getStringExtra(InMobiNetworkValues.URL) + "&pkg=" + getPackageName(), "&color=");
        if (booleanExtra) {
            str = "1";
        } else {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        g10.append(str);
        String sb2 = g10.toString();
        try {
            setTitle(getIntent().getStringExtra(InMobiNetworkValues.TITLE));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        initView(sb2);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onDestroy() {
        try {
            WebView webView = this.webView;
            if (webView != null) {
                webView.removeAllViews();
                this.webView.setTag(null);
                this.webView.clearCache(true);
                this.webView.clearHistory();
                this.webView.destroy();
                this.webView = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public void onPause() {
        super.onPause();
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public void onResume() {
        super.onResume();
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
    }
}
