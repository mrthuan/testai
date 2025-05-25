package lib.zj.office.officereader;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.facebook.ads.AdError;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lib.zj.office.officereader.beans.AImageButton;
import lib.zj.office.officereader.beans.AImageCheckButton;
import lib.zj.office.officereader.beans.AToolsbar;
import lib.zj.office.officereader.beans.CalloutToolsbar;
import lib.zj.office.officereader.beans.PDFToolsbar;
import lib.zj.office.officereader.beans.PGToolsbar;
import lib.zj.office.officereader.beans.SSToolsbar;
import lib.zj.office.officereader.beans.WPToolsbar;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.system.i;
import lib.zj.office.system.j;
import lib.zj.office.system.p;
import lib.zj.office.wp.control.Word;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class AppActivity extends Activity implements i {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f20843v = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20844a;

    /* renamed from: b  reason: collision with root package name */
    public String f20845b;
    public p c;

    /* renamed from: d  reason: collision with root package name */
    public AppFrame f20846d;

    /* renamed from: e  reason: collision with root package name */
    public AToolsbar f20847e;

    /* renamed from: f  reason: collision with root package name */
    public FindToolBar f20848f;

    /* renamed from: g  reason: collision with root package name */
    public Toast f20849g;

    /* renamed from: h  reason: collision with root package name */
    public View f20850h;

    /* renamed from: k  reason: collision with root package name */
    public AImageButton f20853k;

    /* renamed from: l  reason: collision with root package name */
    public AImageButton f20854l;

    /* renamed from: m  reason: collision with root package name */
    public AImageCheckButton f20855m;

    /* renamed from: n  reason: collision with root package name */
    public AImageCheckButton f20856n;

    /* renamed from: o  reason: collision with root package name */
    public AImageButton f20857o;

    /* renamed from: q  reason: collision with root package name */
    public boolean f20859q;

    /* renamed from: s  reason: collision with root package name */
    public CalloutToolsbar f20861s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f20862t;

    /* renamed from: i  reason: collision with root package name */
    public WindowManager f20851i = null;

    /* renamed from: j  reason: collision with root package name */
    public WindowManager.LayoutParams f20852j = null;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f20858p = true;

    /* renamed from: r  reason: collision with root package name */
    public final Integer f20860r = -7829368;

    /* renamed from: u  reason: collision with root package name */
    public boolean f20863u = false;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = AppActivity.f20843v;
            AppActivity appActivity = AppActivity.this;
            appActivity.f20849g = Toast.makeText(appActivity.getApplicationContext(), "", 0);
            Intent intent = appActivity.getIntent();
            String stringExtra = intent.getStringExtra("filePath");
            appActivity.f20845b = stringExtra;
            if (stringExtra == null) {
                String dataString = intent.getDataString();
                appActivity.f20845b = dataString;
                int indexOf = dataString.indexOf(":");
                if (indexOf > 0) {
                    appActivity.f20845b = appActivity.f20845b.substring(indexOf + 3);
                }
                appActivity.f20845b = Uri.decode(appActivity.f20845b);
            }
            int lastIndexOf = appActivity.f20845b.lastIndexOf(File.separator);
            if (lastIndexOf > 0) {
                appActivity.setTitle(appActivity.f20845b.substring(lastIndexOf + 1));
            } else {
                appActivity.setTitle(appActivity.f20845b);
            }
            String lowerCase = appActivity.f20845b.toLowerCase();
            if (!lowerCase.endsWith("doc") && !lowerCase.endsWith("docx") && !lowerCase.endsWith("txt") && !lowerCase.endsWith("dot") && !lowerCase.endsWith("dotx") && !lowerCase.endsWith("dotm")) {
                if (!lowerCase.endsWith("xls") && !lowerCase.endsWith("xlsx") && !lowerCase.endsWith("xlt") && !lowerCase.endsWith("xltx") && !lowerCase.endsWith("xltm") && !lowerCase.endsWith("xlsm")) {
                    if (!lowerCase.endsWith("ppt") && !lowerCase.endsWith("pptx") && !lowerCase.endsWith("pot") && !lowerCase.endsWith("pptm") && !lowerCase.endsWith("potx") && !lowerCase.endsWith("potm")) {
                        if (lowerCase.endsWith("pdf")) {
                            appActivity.f20847e = new PDFToolsbar(appActivity.getApplicationContext(), appActivity.c);
                        } else {
                            appActivity.f20847e = new WPToolsbar(appActivity.getApplicationContext(), appActivity.c);
                        }
                    } else {
                        appActivity.f20847e = new PGToolsbar(appActivity.getApplicationContext(), appActivity.c);
                    }
                } else {
                    appActivity.f20847e = new SSToolsbar(appActivity.getApplicationContext(), appActivity.c);
                }
            } else {
                appActivity.f20847e = new WPToolsbar(appActivity.getApplicationContext(), appActivity.c);
            }
            appActivity.c.k(appActivity.f20845b);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppActivity.this.c.r(536870942, null);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppActivity.this.c.r(536870942, null);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements DialogInterface.OnDismissListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            AppActivity.this.d(true);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditText f20870a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f20871b;
        public final /* synthetic */ Word c;

        public f(EditText editText, int i10, Word word) {
            this.f20870a = editText;
            this.f20871b = i10;
            this.c = word;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            EditText editText = this.f20870a;
            boolean equals = editText.getText().toString().equals("");
            AppActivity appActivity = AppActivity.this;
            if (equals) {
                Toast.makeText(appActivity, "未输入", 0).show();
                return;
            }
            int parseInt = Integer.parseInt(editText.getText().toString());
            int i11 = this.f20871b;
            if (parseInt <= i11 && parseInt != 0) {
                Word word = this.c;
                int scrollY = word.getScrollY();
                word.scrollBy(0, ((int) ((parseInt - 0.5d) * (((int) (word.f21099g * word.f21100h)) / i11))) - ((word.getHeight() / 2) + scrollY));
                return;
            }
            Toast.makeText(appActivity, "输入超出范围", 0).show();
        }
    }

    /* loaded from: classes3.dex */
    public class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditText f20873a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f20874b;
        public final /* synthetic */ Presentation c;

        public g(EditText editText, int i10, Presentation presentation) {
            this.f20873a = editText;
            this.f20874b = i10;
            this.c = presentation;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            EditText editText = this.f20873a;
            boolean equals = editText.getText().toString().equals("");
            AppActivity appActivity = AppActivity.this;
            if (equals) {
                Toast.makeText(appActivity, "未输入", 0).show();
                return;
            }
            int parseInt = Integer.parseInt(editText.getText().toString());
            if (parseInt <= this.f20874b && parseInt != 0) {
                Presentation presentation = this.c;
                presentation.f20940t.f20913e.setCurrentPageNumber(parseInt);
                presentation.f20940t.f20913e.requestLayout();
                return;
            }
            Toast.makeText(appActivity, "输入超出范围", 0).show();
        }
    }

    public static String b(String str) {
        String str2 = (String) wh.a.f31215b.f31216a.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // lib.zj.office.system.i
    public final boolean B0() {
        return this.f20858p;
    }

    @Override // lib.zj.office.system.i
    public final byte C0() {
        return (byte) 0;
    }

    @Override // lib.zj.office.system.i
    public final File G0() {
        File externalFilesDir = getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return externalFilesDir;
        }
        return getFilesDir();
    }

    @Override // lib.zj.office.system.i
    public final boolean L() {
        return true;
    }

    @Override // lib.zj.office.system.i
    public final void M0(boolean z10) {
        if (c()) {
            this.f20848f.f(788529153, z10);
            this.f20848f.f(788529154, z10);
        }
    }

    @Override // lib.zj.office.system.i
    public final void N() {
        AppFrame appFrame = this.f20846d;
        if (appFrame != null && !this.f20844a) {
            int childCount = appFrame.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f20846d.getChildAt(i10);
                if (childAt instanceof AToolsbar) {
                    ((AToolsbar) childAt).g();
                }
            }
        }
    }

    @Override // lib.zj.office.system.i
    public final boolean O() {
        return true;
    }

    @Override // lib.zj.office.system.i
    public final boolean P() {
        return true;
    }

    @Override // lib.zj.office.system.i
    public final boolean P0() {
        return this.f20859q;
    }

    @Override // lib.zj.office.system.i
    public final void T(boolean z10) {
        this.f20862t = z10;
        if (z10) {
            if (this.f20851i == null || this.f20852j == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(getResources(), R.drawable.file_slideshow_left, options);
                Resources resources = getResources();
                AImageButton aImageButton = new AImageButton(this, this.c, resources.getString(R.string.arg_res_0x7f130346), -1, -1, 536870925);
                this.f20853k = aImageButton;
                aImageButton.setNormalBgResID(R.drawable.file_slideshow_left);
                this.f20853k.setPushBgResID(R.drawable.file_slideshow_left_push);
                this.f20853k.setLayoutParams(new LinearLayout.LayoutParams(options.outWidth, options.outHeight));
                AImageButton aImageButton2 = new AImageButton(this, this.c, resources.getString(R.string.arg_res_0x7f130345), -1, -1, 536870926);
                this.f20854l = aImageButton2;
                aImageButton2.setNormalBgResID(R.drawable.file_slideshow_right);
                this.f20854l.setPushBgResID(R.drawable.file_slideshow_right_push);
                this.f20854l.setLayoutParams(new LinearLayout.LayoutParams(options.outWidth, options.outHeight));
                BitmapFactory.decodeResource(getResources(), R.drawable.file_slideshow_pen_normal, options);
                AImageCheckButton aImageCheckButton = new AImageCheckButton(this, this.c, resources.getString(R.string.arg_res_0x7f13006e), resources.getString(R.string.arg_res_0x7f13006d), R.drawable.file_slideshow_pen_check, R.drawable.file_slideshow_pen_normal, R.drawable.file_slideshow_pen_normal, 536870939);
                this.f20855m = aImageCheckButton;
                aImageCheckButton.setNormalBgResID(R.drawable.file_slideshow_pen_normal);
                this.f20855m.setPushBgResID(R.drawable.file_slideshow_pen_push);
                this.f20855m.setLayoutParams(new LinearLayout.LayoutParams(options.outWidth, options.outHeight));
                AImageCheckButton aImageCheckButton2 = new AImageCheckButton(this, this.c, resources.getString(R.string.arg_res_0x7f130068), resources.getString(R.string.arg_res_0x7f130067), R.drawable.file_slideshow_eraser_check, R.drawable.file_slideshow_eraser_normal, R.drawable.file_slideshow_eraser_normal, 536870940);
                this.f20856n = aImageCheckButton2;
                aImageCheckButton2.setNormalBgResID(R.drawable.file_slideshow_eraser_normal);
                this.f20856n.setPushBgResID(R.drawable.file_slideshow_eraser_push);
                this.f20856n.setLayoutParams(new LinearLayout.LayoutParams(options.outWidth, options.outHeight));
                AImageButton aImageButton3 = new AImageButton(this, this.c, resources.getString(R.string.arg_res_0x7f130065), -1, -1, 536870941);
                this.f20857o = aImageButton3;
                aImageButton3.setNormalBgResID(R.drawable.file_slideshow_settings_normal);
                this.f20857o.setPushBgResID(R.drawable.file_slideshow_settings_push);
                this.f20857o.setLayoutParams(new LinearLayout.LayoutParams(options.outWidth, options.outHeight));
                this.f20851i = (WindowManager) getApplicationContext().getSystemService("window");
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                this.f20852j = layoutParams;
                layoutParams.type = AdError.CACHE_ERROR_CODE;
                layoutParams.format = 1;
                layoutParams.flags = 40;
                layoutParams.width = options.outWidth;
                layoutParams.height = options.outHeight;
            }
            WindowManager.LayoutParams layoutParams2 = this.f20852j;
            layoutParams2.gravity = 53;
            layoutParams2.x = 5;
            this.f20851i.addView(this.f20855m, layoutParams2);
            WindowManager.LayoutParams layoutParams3 = this.f20852j;
            layoutParams3.gravity = 53;
            layoutParams3.x = 5;
            layoutParams3.y = layoutParams3.height;
            this.f20851i.addView(this.f20856n, layoutParams3);
            WindowManager.LayoutParams layoutParams4 = this.f20852j;
            layoutParams4.gravity = 53;
            layoutParams4.x = 5;
            layoutParams4.y = layoutParams4.height * 2;
            this.f20851i.addView(this.f20857o, layoutParams4);
            WindowManager.LayoutParams layoutParams5 = this.f20852j;
            layoutParams5.gravity = 19;
            layoutParams5.x = 5;
            layoutParams5.y = 0;
            this.f20851i.addView(this.f20853k, layoutParams5);
            WindowManager.LayoutParams layoutParams6 = this.f20852j;
            layoutParams6.gravity = 21;
            this.f20851i.addView(this.f20854l, layoutParams6);
            ((View) getWindow().findViewById(16908310).getParent()).setVisibility(8);
            this.f20847e.setVisibility(8);
            this.f20850h.setVisibility(8);
            this.f20855m.setState((short) 2);
            this.f20856n.setState((short) 2);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 1024;
            getWindow().setAttributes(attributes);
            getWindow().addFlags(512);
            setRequestedOrientation(0);
            return;
        }
        this.f20851i.removeView(this.f20853k);
        this.f20851i.removeView(this.f20854l);
        this.f20851i.removeView(this.f20855m);
        this.f20851i.removeView(this.f20856n);
        this.f20851i.removeView(this.f20857o);
        ((View) getWindow().findViewById(16908310).getParent()).setVisibility(0);
        this.f20847e.setVisibility(0);
        this.f20850h.setVisibility(0);
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.flags &= -1025;
        getWindow().setAttributes(attributes2);
        getWindow().clearFlags(512);
        setRequestedOrientation(4);
    }

    @Override // lib.zj.office.system.i
    public final int V0() {
        return 0;
    }

    @Override // lib.zj.office.system.i
    public final Integer Y0() {
        return this.f20860r;
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Uri.fromFile(new File(this.f20845b)));
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.putExtra("android.intent.extra.STREAM", arrayList);
        intent.setType("application/octet-stream");
        startActivity(Intent.createChooser(intent, getResources().getText(R.string.arg_res_0x7f1304bf)));
    }

    @Override // lib.zj.office.system.i
    public final String a1() {
        return "GBK";
    }

    public final boolean c() {
        AppFrame appFrame = this.f20846d;
        if (appFrame != null && !this.f20844a) {
            int childCount = appFrame.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f20846d.getChildAt(i10);
                if (childAt instanceof FindToolBar) {
                    if (childAt.getVisibility() != 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        if (this.f20862t) {
            this.f20853k.setEnabled(z10);
            this.f20854l.setEnabled(z10);
            this.f20855m.setEnabled(z10);
            this.f20856n.setEnabled(z10);
            this.f20857o.setEnabled(z10);
        }
    }

    public final void e(boolean z10) {
        if (z10) {
            if (this.f20861s == null) {
                CalloutToolsbar calloutToolsbar = new CalloutToolsbar(getApplicationContext(), this.c);
                this.f20861s = calloutToolsbar;
                this.f20846d.addView(calloutToolsbar, 0);
            }
            this.f20861s.e(536870939, (short) 1);
            this.f20861s.e(536870940, (short) 2);
            this.f20861s.setVisibility(0);
            this.f20847e.setVisibility(8);
            return;
        }
        CalloutToolsbar calloutToolsbar2 = this.f20861s;
        if (calloutToolsbar2 != null) {
            calloutToolsbar2.setVisibility(8);
        }
        this.f20847e.setVisibility(0);
    }

    public final void f(int i10) {
        EditText editText = new EditText(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (i10 == 0) {
            Word word = (Word) this.c.getView();
            builder.setTitle("输入页码:").setView(editText);
            int pageCount = word.getPageCount();
            editText.setHint("(1 -- " + pageCount + ")");
            editText.setInputType(2);
            builder.setPositiveButton("确定", new f(editText, pageCount, word)).show();
        }
        if (i10 == 1) {
            Presentation presentation = (Presentation) this.c.getView();
            builder.setTitle("输入页码:").setView(editText);
            int pageCount2 = presentation.f20940t.getPageCount();
            editText.setHint("(1 -- " + pageCount2 + ")");
            editText.setInputType(2);
            builder.setPositiveButton("确定", new g(editText, pageCount2, presentation)).show();
        }
    }

    public final void g(boolean z10) {
        if (z10) {
            if (this.f20848f == null) {
                FindToolBar findToolBar = new FindToolBar(this, this.c);
                this.f20848f = findToolBar;
                this.f20846d.addView(findToolBar, 0);
            }
            this.f20848f.setVisibility(0);
            this.f20847e.setVisibility(8);
            return;
        }
        FindToolBar findToolBar2 = this.f20848f;
        if (findToolBar2 != null) {
            findToolBar2.setVisibility(8);
        }
        this.f20847e.setVisibility(0);
    }

    @Override // lib.zj.office.system.i
    public final byte getPageListViewMovingPosition() {
        return (byte) 0;
    }

    @Override // lib.zj.office.system.i
    public final void h1(boolean z10) {
        this.f20859q = z10;
    }

    @Override // lib.zj.office.system.i
    public final void l0(boolean z10) {
        setProgressBarIndeterminateVisibility(z10);
    }

    @Override // lib.zj.office.system.i
    public final void n1(int i10) {
        View view = new View(getApplicationContext());
        this.f20850h = view;
        view.setBackgroundColor(-7829368);
        this.f20846d.addView(this.f20850h, new LinearLayout.LayoutParams(-1, 1));
        View view2 = this.c.getView();
        Objects.toString(view2);
        this.f20846d.addView(view2, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (c()) {
            g(false);
            N();
            return;
        }
        Object w7 = this.c.w(1358954496);
        if (w7 != null && ((Boolean) w7).booleanValue()) {
            T(false);
            this.c.r(1358954498, null);
            return;
        }
        j jVar = this.c.f21056i;
        if (jVar != null) {
            jVar.abortReader();
        }
        p pVar = this.c;
        if (pVar != null && pVar.c) {
            System.exit(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (c()) {
            this.f20848f.onConfigurationChanged(configuration);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(5);
        this.c = new p(this);
        AppFrame appFrame = new AppFrame(getApplicationContext());
        this.f20846d = appFrame;
        appFrame.post(new a());
        this.c.f21054g = new b();
        setContentView(this.f20846d);
    }

    @Override // android.app.Activity
    public final Dialog onCreateDialog(int i10) {
        this.c.getClass();
        return null;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        this.f20844a = true;
        p pVar = this.c;
        if (pVar != null) {
            pVar.dispose();
            this.c = null;
        }
        this.f20847e = null;
        this.f20848f = null;
        AppFrame appFrame = this.f20846d;
        if (appFrame != null) {
            int childCount = appFrame.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f20846d.getChildAt(i10);
                if (childAt instanceof AToolsbar) {
                    ((AToolsbar) childAt).d();
                }
            }
            this.f20846d = null;
        }
        if (this.f20851i != null) {
            this.f20851i = null;
            this.f20852j = null;
            this.f20853k.a();
            this.f20854l.a();
            this.f20855m.a();
            this.f20856n.a();
            this.f20857o.a();
            this.f20853k = null;
            this.f20854l = null;
            this.f20855m = null;
            this.f20856n = null;
            this.f20857o = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.black_item) {
            if (!this.f20863u) {
                aj.b.f573u = -16777216;
                this.f20863u = true;
            } else {
                aj.b.f573u = -1;
                this.f20863u = false;
            }
            this.c.getView().toString();
            this.c.getView().postInvalidate();
        } else if (itemId == R.id.jump_item) {
            View view = this.c.getView();
            if (view instanceof Word) {
                f(0);
            } else if (view instanceof Presentation) {
                f(1);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        Object w7 = this.c.w(1358954496);
        if (w7 != null && ((Boolean) w7).booleanValue()) {
            this.f20851i.removeView(this.f20853k);
            this.f20851i.removeView(this.f20854l);
            this.f20851i.removeView(this.f20855m);
            this.f20851i.removeView(this.f20856n);
            this.f20851i.removeView(this.f20857o);
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        View view = this.c.getView();
        if (view != null) {
            view.toString();
            if (!(view instanceof Word)) {
                menu.getItem(0).setVisible(false);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        aj.b.f573u = -1;
        Object w7 = this.c.w(1358954496);
        if (w7 != null && ((Boolean) w7).booleanValue()) {
            WindowManager.LayoutParams layoutParams = this.f20852j;
            layoutParams.gravity = 53;
            layoutParams.x = 5;
            this.f20851i.addView(this.f20855m, layoutParams);
            WindowManager.LayoutParams layoutParams2 = this.f20852j;
            layoutParams2.gravity = 53;
            layoutParams2.x = 5;
            layoutParams2.y = layoutParams2.height;
            this.f20851i.addView(this.f20856n, layoutParams2);
            WindowManager.LayoutParams layoutParams3 = this.f20852j;
            layoutParams3.gravity = 53;
            layoutParams3.x = 5;
            layoutParams3.y = layoutParams3.height * 2;
            this.f20851i.addView(this.f20857o, layoutParams3);
            WindowManager.LayoutParams layoutParams4 = this.f20852j;
            layoutParams4.gravity = 19;
            layoutParams4.x = 5;
            layoutParams4.y = 0;
            this.f20851i.addView(this.f20853k, layoutParams4);
            WindowManager.LayoutParams layoutParams5 = this.f20852j;
            layoutParams5.gravity = 21;
            this.f20851i.addView(this.f20854l, layoutParams5);
        }
    }

    @Override // lib.zj.office.system.i
    public final boolean q() {
        return true;
    }

    @Override // lib.zj.office.system.i
    public final boolean t(int i10, Object obj) {
        try {
            if (i10 != 0) {
                if (i10 != 15) {
                    if (i10 != 20) {
                        if (i10 != 25) {
                            if (i10 != 268435464) {
                                if (i10 != 1073741828) {
                                    if (i10 != 536870912) {
                                        if (i10 != 536870913) {
                                            switch (i10) {
                                                case 536870937:
                                                    e(true);
                                                    this.c.f21062o.b().c(1);
                                                    this.f20846d.post(new c());
                                                    break;
                                                case 536870938:
                                                    e(false);
                                                    this.c.f21062o.b().c(0);
                                                    break;
                                                case 536870939:
                                                    if (((Boolean) obj).booleanValue()) {
                                                        this.c.f21062o.b().c(1);
                                                        if (this.f20862t) {
                                                            this.f20856n.setState((short) 2);
                                                            this.f20856n.postInvalidate();
                                                        } else {
                                                            this.f20861s.e(536870940, (short) 2);
                                                            this.f20861s.postInvalidate();
                                                        }
                                                        this.f20846d.post(new d());
                                                        break;
                                                    } else {
                                                        this.c.f21062o.b().c(0);
                                                        break;
                                                    }
                                                case 536870940:
                                                    if (((Boolean) obj).booleanValue()) {
                                                        this.c.f21062o.b().c(2);
                                                        if (this.f20862t) {
                                                            this.f20855m.setState((short) 2);
                                                            this.f20855m.postInvalidate();
                                                            break;
                                                        } else {
                                                            this.f20861s.e(536870939, (short) 2);
                                                            this.f20861s.postInvalidate();
                                                            break;
                                                        }
                                                    } else {
                                                        this.c.f21062o.b().c(0);
                                                        break;
                                                    }
                                                case 536870941:
                                                    si.a aVar = new si.a(this, this.c);
                                                    aVar.show();
                                                    aVar.setOnDismissListener(new e());
                                                    d(false);
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 788529152:
                                                            String trim = ((String) obj).trim();
                                                            if (trim.length() > 0 && this.c.t().d(trim)) {
                                                                M0(true);
                                                                break;
                                                            } else {
                                                                M0(false);
                                                                this.f20849g.setText(b("DIALOG_FIND_NOT_FOUND"));
                                                                this.f20849g.show();
                                                                break;
                                                            }
                                                            break;
                                                        case 788529153:
                                                            if (!this.c.t().e()) {
                                                                this.f20848f.f(788529153, false);
                                                                this.f20849g.setText(b("DIALOG_FIND_TO_BEGIN"));
                                                                this.f20849g.show();
                                                                break;
                                                            } else {
                                                                this.f20848f.f(788529154, true);
                                                                break;
                                                            }
                                                        case 788529154:
                                                            if (!this.c.t().f()) {
                                                                this.f20848f.f(788529154, false);
                                                                this.f20849g.setText(b("DIALOG_FIND_TO_END"));
                                                                this.f20849g.show();
                                                                break;
                                                            } else {
                                                                this.f20848f.f(788529153, true);
                                                                break;
                                                            }
                                                        default:
                                                            return false;
                                                    }
                                            }
                                        } else {
                                            a();
                                        }
                                    } else {
                                        g(true);
                                    }
                                } else {
                                    ((Integer) obj).intValue();
                                    throw null;
                                }
                            }
                        } else {
                            setTitle((String) obj);
                        }
                    } else {
                        N();
                    }
                } else {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getResources().getString(R.string.arg_res_0x7f1304c1))));
                }
            } else {
                onBackPressed();
            }
        } catch (Exception e10) {
            this.c.f21062o.c().a(false, e10);
        }
        return true;
    }

    @Override // lib.zj.office.system.i
    public final String x0() {
        return getString(R.string.arg_res_0x7f1304bb);
    }

    /* loaded from: classes3.dex */
    public class b implements sg.c {

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f20865a;

        public b() {
        }

        @Override // sg.c
        public final Bitmap a(int i10, int i11) {
            if (i10 != 0 && i11 != 0) {
                Bitmap bitmap = this.f20865a;
                if (bitmap == null || bitmap.getWidth() != i10 || this.f20865a.getHeight() != i11) {
                    Bitmap bitmap2 = this.f20865a;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    this.f20865a = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                }
                return this.f20865a;
            }
            return null;
        }

        @Override // sg.c
        public final void d() {
            int i10 = AppActivity.f20843v;
            AppActivity.this.getClass();
        }

        @Override // sg.c
        public final void b() {
        }

        @Override // sg.c
        public final void c() {
        }

        @Override // sg.c
        public final void dispose() {
        }
    }

    @Override // lib.zj.office.system.i
    public final void H0() {
    }

    @Override // lib.zj.office.system.i
    public final void K() {
    }

    @Override // lib.zj.office.system.i
    public final void S() {
    }

    @Override // lib.zj.office.system.i
    public final /* synthetic */ void X0() {
    }

    @Override // lib.zj.office.system.i
    public final void d1() {
    }

    @Override // lib.zj.office.system.i
    public final void i() {
    }

    @Override // lib.zj.office.system.i
    public final void j() {
    }

    @Override // lib.zj.office.system.i
    public final void k0() {
    }

    @Override // lib.zj.office.system.i
    public final void l() {
    }

    @Override // lib.zj.office.system.i
    public final Activity m() {
        return this;
    }

    @Override // lib.zj.office.system.i
    public final void o() {
    }

    @Override // lib.zj.office.system.i
    public final void A0(String str) {
    }

    @Override // lib.zj.office.system.i
    public final void c1(byte b10) {
    }

    @Override // lib.zj.office.system.i
    public final void n0(List<Integer> list) {
    }

    @Override // lib.zj.office.system.i
    public final void v0(int i10, Throwable th2) {
    }
}
