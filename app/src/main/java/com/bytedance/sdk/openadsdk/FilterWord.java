package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FilterWord {
    private List<FilterWord> CJ;
    private String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8475ac;
    private String cJ;

    public FilterWord(String str, String str2) {
        this.Qhi = str;
        this.cJ = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.CJ == null) {
            this.CJ = new ArrayList();
        }
        this.CJ.add(filterWord);
    }

    public String getId() {
        return this.Qhi;
    }

    public boolean getIsSelected() {
        return this.f8475ac;
    }

    public String getName() {
        return this.cJ;
    }

    public List<FilterWord> getOptions() {
        return this.CJ;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.CJ;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.Qhi) && !TextUtils.isEmpty(this.cJ)) {
            return true;
        }
        return false;
    }

    public void setId(String str) {
        this.Qhi = str;
    }

    public void setIsSelected(boolean z10) {
        this.f8475ac = z10;
    }

    public void setName(String str) {
        this.cJ = str;
    }

    public FilterWord() {
    }
}
